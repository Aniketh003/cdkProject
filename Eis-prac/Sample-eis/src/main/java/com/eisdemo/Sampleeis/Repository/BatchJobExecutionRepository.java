package com.eisdemo.Sampleeis.Repository;


import com.eisdemo.Sampleeis.models.BatchJobExecution;
import com.eisdemo.Sampleeis.models.ResponseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface BatchJobExecutionRepository extends JpaRepository<BatchJobExecution, Long> {

    @Query("SELECT new com.eisdemo.Sampleeis.models.ResponseModel(i.JOB_INSTANCE_ID, i.JOB_NAME, e.Start_Time, e.End_Time, e.Status, e.Exit_Code, e.Exit_Message) " +
            "FROM BatchJobExecution e " +
            "INNER JOIN BatchJobInstance i ON e.Job_Instance_Id = i.JOB_INSTANCE_ID " +
            "WHERE i.JOB_NAME = :jobName " +
            "ORDER BY e.Start_Time DESC")
    List<ResponseModel> getBatchJobData(@Param("jobName") String jobName);

    @Query("SELECT new com.eisdemo.Sampleeis.models.ResponseModel(i.JOB_INSTANCE_ID, i.JOB_NAME, e.Start_Time, e.End_Time, e.Status, e.Exit_Code, e.Exit_Message) " +
            "FROM BatchJobExecution e " +
            "INNER JOIN BatchJobInstance i ON e.Job_Instance_Id = i.JOB_INSTANCE_ID " +
            "WHERE i.JOB_NAME IN ('financeImportJob', 'otherImportJob') " +
            "AND DATE(e.Start_Time) = :yesterday " +
            "ORDER BY e.Start_Time DESC")
    List<ResponseModel> getImportBatchJobData(@Param("yesterday") LocalDate yesterday);


    @Query("SELECT new com.eisdemo.Sampleeis.models.ResponseModel(i.JOB_INSTANCE_ID, i.JOB_NAME, e.Start_Time, e.End_Time, e.Status, e.Exit_Code, e.Exit_Message) " +
            "FROM BatchJobExecution e " +
            "INNER JOIN BatchJobInstance i ON e.Job_Instance_Id = i.JOB_INSTANCE_ID " +
            "WHERE i.JOB_NAME IN ('updateCdkClientFlagJob', 'storeUpdateJob','visionJob','dmsStageJob','visionCmfNumberJob','eisDmsServerJob') " +
            "AND DATE(e.Start_Time) = :yesterday " +
            "ORDER BY e.Start_Time DESC")
    List<ResponseModel> getCoreBatchJobData(@Param("yesterday") LocalDate yesterday);

}