package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.BatchJobExecution;
import com.eisdemo.Sampleeis.models.ResponseModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface BatchJobExecutionRepository extends JpaRepository<BatchJobExecution, Long> {

    @Query("SELECT new com.eisdemo.Sampleeis.models.ResponseModel(i.JOB_NAME, e.Start_Time, e.End_Time, e.Status, e.Exit_Code, e.Exit_Message) " +
            "FROM BatchJobExecution e " +
            "INNER JOIN BatchJobInstance i ON e.Job_Instance_Id = i.JOB_INSTANCE_ID " +
            "WHERE i.JOB_NAME = :jobName " +
            "ORDER BY e.Start_Time DESC")
    List<ResponseModel> getBatchJobData(@Param("jobName") String jobName);

    @Query("SELECT new com.eisdemo.Sampleeis.models.ResponseModel(i.JOB_NAME, e.Start_Time, e.End_Time, e.Status, e.Exit_Code, e.Exit_Message) " +
            "FROM BatchJobExecution e " +
            "INNER JOIN BatchJobInstance i ON e.Job_Instance_Id = i.JOB_INSTANCE_ID " +
            "WHERE i.JOB_NAME = :jobName " +
            "AND DATE(e.Start_Time) = :date")
    Optional<ResponseModel> getBatchJobDataByDate(@Param("jobName") String jobName, @Param("date") LocalDate date);

    @Query("SELECT new com.eisdemo.Sampleeis.models.ResponseModel(i.JOB_NAME, e.Start_Time, e.End_Time, e.Status, e.Exit_Code, e.Exit_Message) " +
            "FROM BatchJobExecution e " +
            "INNER JOIN BatchJobInstance i ON e.Job_Instance_Id = i.JOB_INSTANCE_ID " +
            "WHERE i.JOB_NAME IN ('financeImportJob', 'dmsStageJob','visionJob') " +
            "AND DATE(e.Start_Time) = :today " +
            "ORDER BY e.Start_Time DESC")
    List<ResponseModel> getImportBatchJobData(@Param("today") LocalDate yesterday);

    @Query("SELECT new com.eisdemo.Sampleeis.models.ResponseModel(i.JOB_NAME, e.Start_Time, e.End_Time, e.Status, e.Exit_Code, e.Exit_Message) " +
            "FROM BatchJobExecution e " +
            "INNER JOIN BatchJobInstance i ON e.Job_Instance_Id = i.JOB_INSTANCE_ID " +
            "WHERE i.JOB_NAME IN ('updateCdkClientFlagJob','visionCmfNumberJob', 'storeUpdateJob','eisDmsServerJob','eisDmsServerJob') " +
            "AND DATE(e.Start_Time) = :today " +
            "ORDER BY e.Start_Time DESC")
    List<ResponseModel> getCoreBatchJobData(@Param("today") LocalDate yesterday);
}