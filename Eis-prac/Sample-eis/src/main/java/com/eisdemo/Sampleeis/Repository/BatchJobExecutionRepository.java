package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.Execution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExecutionRepository  extends JpaRepository<Execution, Long>{

    @Query("SELECT i.jobName, e.startTime, e.endTime, e.status, e.exitCode, e.exitMessage " +
            "FROM BatchJobExecution e " +
            "INNER JOIN BatchJobInstance i ON e.jobInstanceId = i.jobInstanceId " +
            "WHERE i.jobName = :jobName " +
            "ORDER BY e.startTime DESC")
    List<Object[]> getBatchJobData(@Param("jobName") String jobName);

}
