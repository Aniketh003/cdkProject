package com.eisdemo.Sampleeis.Services;
import com.eisdemo.Sampleeis.Repository.BatchJobExecutionRepository;
import com.eisdemo.Sampleeis.models.ResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

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

    public Optional<List<ResponseModel>> getBatchByDate(String jobName, String date){
        LocalDate localDate = LocalDate.parse(date);
        return batchJobExecutionRepository.getBatchJobDataByDate(jobName,localDate);
    }

    public List<ResponseModel> getImportJobs() {
        LocalDate date = LocalDate.parse("2024-01-23");
        LocalDate today = LocalDate.now();
        return batchJobExecutionRepository.getLatestImportBatchJobData(date);
    }

    public List<ResponseModel> getCoreJobs() {
        LocalDate date = LocalDate.parse("2024-01-23");
        LocalDate today = LocalDate.now();
        return batchJobExecutionRepository.getLatestCoreBatchJobData(date);
    }
}
