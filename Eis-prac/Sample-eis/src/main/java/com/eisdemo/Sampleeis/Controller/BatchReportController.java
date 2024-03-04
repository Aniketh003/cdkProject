package com.eisdemo.Sampleeis.Controller;


import com.eisdemo.Sampleeis.Services.BatchReportService;
import com.eisdemo.Sampleeis.models.Batch_Report;
import com.eisdemo.Sampleeis.models.Instance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BatchReportController {
    private final BatchReportService batchReportService;

    @Autowired
    public BatchReportController(BatchReportService batchReportService) {
        this.batchReportService = batchReportService;
    }
    @GetMapping("/batches")
    public List<Batch_Report> getAllBatches() {
        return batchReportService.getAllBatches();
    }

}
