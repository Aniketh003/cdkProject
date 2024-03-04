package com.eisdemo.Sampleeis.Repository;


import com.eisdemo.Sampleeis.models.BatchJobExecution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BatchJobExecutionRepository extends JpaRepository<BatchJobExecution, Long> {

    @Query("SELECT i.JOB_INSTANCE_ID, i.JOB_NAME, e.Start_Time, e.End_Time, e.Status, e.Exit_Code, e.Exit_Message " +
            "FROM BatchJobExecution e " +
            "INNER JOIN BatchJobInstance i ON e.Job_Instance_Id = i.JOB_INSTANCE_ID " +
            "WHERE i.JOB_NAME = :jobName " +
            "ORDER BY e.Start_Time DESC")
    List<Object[]> getBatchJobData(@Param("jobName") String jobName);
}