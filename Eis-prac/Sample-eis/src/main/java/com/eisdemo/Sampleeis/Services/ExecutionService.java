package com.eisdemo.Sampleeis.Services;
import com.eisdemo.Sampleeis.Repository.BatchJobExecutionRepository;
import com.eisdemo.Sampleeis.models.BatchJobExecution;
import com.eisdemo.Sampleeis.models.PageResponseModel;
import com.eisdemo.Sampleeis.models.ResponseModel;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ExecutionService {
    private final BatchJobExecutionRepository batchJobExecutionRepository;

    @Autowired
    public ExecutionService(BatchJobExecutionRepository batchJobExecutionRepository) {
        this.batchJobExecutionRepository = batchJobExecutionRepository;
    }

    public Page<ResponseModel> getBatchJobData( String jobName, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        return batchJobExecutionRepository.getBatchJobData(jobName, pageable);
    }

    public Optional<List<ResponseModel>> getBatchByDate(String jobName, String date) {
        LocalDate localDate = LocalDate.parse(date);
        return batchJobExecutionRepository.getBatchJobDataByDate(jobName, localDate);
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



    @Transactional
    public String getJobByExecution(String exeId) {
        BatchJobExecution responseModel = batchJobExecutionRepository.findJobByExecutionId(exeId);
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        if (Objects.equals(responseModel.getStatus(), "FAILED")) {
            responseModel.setCreate_Time(date.format(dateTimeFormatter));
            responseModel.setEnd_Time("");
            responseModel.setStart_Time("");
            responseModel.setExit_Code("RUNNING");
            responseModel.setStatus("RUNNING");
            return "Running";
        } else if (Objects.equals(responseModel.getStatus(), "UNKNOWN")) {
            responseModel.setCreate_Time(date.format(dateTimeFormatter));
            responseModel.setEnd_Time("");
            responseModel.setStart_Time("");
            responseModel.setExit_Code("RUNNING");
            responseModel.setStatus("RUNNING");
            return "Running";
        }
        return "Already Running";
    }

    public PageResponseModel getBatchJobDataByPagination(String jobName, int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<ResponseModel> pageResponse = batchJobExecutionRepository.getBatchJobData(jobName, pageable);
        return new PageResponseModel(pageResponse.getContent(), pageResponse.getNumber(), pageResponse.getSize(),
                pageResponse.getTotalPages(), pageResponse.getTotalElements());
    }


}