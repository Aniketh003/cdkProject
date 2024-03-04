package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.BatchJobInstance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BatchJobInstanceRepository extends JpaRepository<BatchJobInstance, Long> {
}
