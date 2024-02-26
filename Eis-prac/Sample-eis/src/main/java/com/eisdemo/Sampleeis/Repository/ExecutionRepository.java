package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.Execution;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ExecutionRepository  extends JpaRepository<Execution, Long>{

}
