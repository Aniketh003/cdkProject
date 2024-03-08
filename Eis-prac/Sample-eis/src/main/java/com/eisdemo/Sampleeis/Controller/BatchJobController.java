package com.eisdemo.Sampleeis.Controller;

import com.eisdemo.Sampleeis.Services.ExecutionService;
import com.eisdemo.Sampleeis.models.ResponseModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://localhost:5173/")
@RequestMapping("/batch-jobs")
public class BatchJobController {
    private final ExecutionService executionService;

    public BatchJobController(ExecutionService executionService) {
        this.executionService = executionService;
    }

    @GetMapping("/data")
    public ResponseEntity<List<ResponseModel>> getBatchJobData(@RequestParam String jobName) {
        List<ResponseModel> data = executionService.getBatchJobData(jobName);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/getJob")
    public ResponseEntity<Optional<ResponseModel>> getBatchJobData(@RequestParam String jobName, @RequestParam String date) {
        Optional<ResponseModel> data = executionService.getBatchByDate(jobName,date);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/import-jobs")
    public ResponseEntity<List<ResponseModel>> getImportJObs(){
        List<ResponseModel> data = executionService.getImportJobs();
        return ResponseEntity.ok(data);
    }

    @GetMapping("/core-jobs")
    public ResponseEntity<List<ResponseModel>> getCoreJObs(){
        List<ResponseModel> data = executionService.getCoreJobs();
        return ResponseEntity.ok(data);
    }
}
