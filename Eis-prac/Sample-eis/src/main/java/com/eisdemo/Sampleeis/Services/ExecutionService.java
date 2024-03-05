package com.eisdemo.Sampleeis.Services;
import com.eisdemo.Sampleeis.Repository.BatchJobExecutionRepository;
import com.eisdemo.Sampleeis.models.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

import java.util.List;

@Service
public class ExecutionService {
    private final BatchJobExecutionRepository batchJobExecutionRepository;

    @Autowired
    public ExecutionService(BatchJobExecutionRepository batchJobExecutionRepository) {
        this.batchJobExecutionRepository = batchJobExecutionRepository;
    }
    public List<ResponseModel> getBatchJobData(String jobName) {
        return batchJobExecutionRepository.getBatchJobData(jobName);
    }

    public List<ResponseModel> getImportJobs() {
        LocalDate date = LocalDate.parse("2024-01-23");
        return batchJobExecutionRepository.getImportBatchJobData(date);
    }

    public List<ResponseModel> getCoreJobs() {
        LocalDate date = LocalDate.parse("2024-01-23");
        return batchJobExecutionRepository.getCoreBatchJobData(date);
    }
}
