package com.eisdemo.Sampleeis.Controller;

import com.eisdemo.Sampleeis.Services.BatchReportService;
import com.eisdemo.Sampleeis.models.BatchReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173/")
@RequestMapping("/batch-reports")
public class BatchReportController {

    private final BatchReportService batchReportService;
    @Autowired
    public BatchReportController(BatchReportService batchReportService) {
        this.batchReportService = batchReportService;
    }

    @GetMapping("/")
    public ResponseEntity<List<BatchReport>> getBatchReportsByIdentifier(@RequestParam("identifier") String identifier) {
        List<BatchReport> data = batchReportService.getBatchReports(identifier);
        return ResponseEntity.ok(data);
    }
}