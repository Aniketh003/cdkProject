package com.eisdemo.Sampleeis.Controller;

import com.eisdemo.Sampleeis.Services.ExecutionService;
import com.eisdemo.Sampleeis.models.BatchJobExecution;
import com.eisdemo.Sampleeis.models.PageResponseModel;
import com.eisdemo.Sampleeis.models.ResponseModel;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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

    @GetMapping("/getJob")
    public ResponseEntity<Optional<List<ResponseModel>>> getBatchJobData(@RequestParam String jobName, @RequestParam String date) {
        Optional<List<ResponseModel>> data = executionService.getBatchByDate(jobName,date);
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

    @PostMapping("/rerun")
    public String rerunJobs(@RequestParam String exeId) {
        String res = executionService.getJobByExecution(exeId);
        return res;
    }


    @GetMapping("pagination/{status}")
    public ResponseEntity<PageResponseModel> getBatchJobDataByPagination(@RequestParam String jobName,
                                                                         @PathVariable String status,
                                                                         @RequestParam(defaultValue = "0") int page,
                                                                         @RequestParam(defaultValue = "7") int size) {
        PageResponseModel pageResponse = executionService.getBatchJobDataByPagination(jobName, status,page, size);
        return ResponseEntity.ok(pageResponse);
    }
}
