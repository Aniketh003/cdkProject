package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.Batch_Report;
//import com.eisdemo.Sampleeis.models.Execution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchReportRepository extends JpaRepository<Batch_Report, Long> {
}
