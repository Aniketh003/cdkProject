package com.eisdemo.Sampleeis.Controller;


import com.eisdemo.Sampleeis.Services.ExecutionService;
import com.eisdemo.Sampleeis.models.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ExecutionController {
    private final ExecutionService executionService;

    @Autowired
    public ExecutionController(ExecutionService executionService) {
        this.executionService = executionService;
    }

    @GetMapping("/exe")
    public List<Execution> getAllExecutions() {
        return executionService.getAllExecutions();
    }
}
