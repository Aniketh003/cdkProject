package com.eisdemo.Sampleeis.Services;


import com.eisdemo.Sampleeis.Repository.ExecutionRepository;
import com.eisdemo.Sampleeis.models.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExecutionService {
    private final ExecutionRepository executionRepository;

    @Autowired
    public ExecutionService(ExecutionRepository executionRepository) {
        this.executionRepository = executionRepository;
    }

    public List<Execution> getAllExecutions() {
        return executionRepository.findAll();
    }
}
