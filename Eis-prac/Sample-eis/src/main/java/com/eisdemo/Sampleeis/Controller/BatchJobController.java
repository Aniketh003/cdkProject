package com.eisdemo.Sampleeis.Controller;

import com.eisdemo.Sampleeis.Services.ExecutionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/batch-jobs")
public class BatchJobController {
    private final ExecutionService executionService;

    public BatchJobController(ExecutionService executionService) {
        this.executionService = executionService;
    }

    @GetMapping("/data")
    public ResponseEntity<List<Object[]>> getBatchJobData() {
        List<Object[]> data = executionService.getBatchJobData();
        return ResponseEntity.ok(data);
    }
}
