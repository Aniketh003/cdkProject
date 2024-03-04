package com.eisdemo.Sampleeis.Services;

import com.eisdemo.Sampleeis.Repository.BatchReportRepository;
import com.eisdemo.Sampleeis.models.Batch_Report;
import com.eisdemo.Sampleeis.models.Execution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BatchReportService {
    private final BatchReportRepository batchReportRepository;

    @Autowired

    public BatchReportService(BatchReportRepository batchReportRepository) {
        this.batchReportRepository = batchReportRepository;
    }

    public List<Batch_Report> getAllBatches() {
        return batchReportRepository.findAll();
    }
}
