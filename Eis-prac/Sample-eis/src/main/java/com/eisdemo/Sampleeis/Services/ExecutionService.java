package com.eisdemo.Sampleeis.Services;
import com.eisdemo.Sampleeis.Repository.BatchJobExecutionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutionService {
    private final BatchJobExecutionRepository batchJobExecutionRepository;

    @Autowired
    public ExecutionService(BatchJobExecutionRepository batchJobExecutionRepository) {
        this.batchJobExecutionRepository = batchJobExecutionRepository;
    }

    public List<Object[]> getBatchJobData() {
        return batchJobExecutionRepository.getBatchJobData("financeImportJob");
    }



}
