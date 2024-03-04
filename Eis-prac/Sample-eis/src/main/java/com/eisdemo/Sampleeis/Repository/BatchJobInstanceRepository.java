package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.Instance;
import org.springframework.data.jpa.repository.JpaRepository;
public interface InstanceRepository  extends JpaRepository<Instance, Long>{
}
