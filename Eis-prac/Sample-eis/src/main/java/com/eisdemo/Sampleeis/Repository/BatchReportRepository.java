package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.BatchReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BatchReportRepository extends JpaRepository<BatchReport, Long> {
    @Query("SELECT new com.eisdemo.Sampleeis.models.BatchReport(b.Id,b.OrgUnitType,b.IdentifierType,b.IdentifierValue,b.Status,b.COMMENTS,b.CreatedBy,b.CreatedDate,b.BatchName) FROM BatchReport b " +
            "WHERE b.IdentifierValue = :identifier " +
            "ORDER BY b.CreatedDate DESC")
    List<BatchReport> getBatchReports(@Param("identifier") String identifier);

}