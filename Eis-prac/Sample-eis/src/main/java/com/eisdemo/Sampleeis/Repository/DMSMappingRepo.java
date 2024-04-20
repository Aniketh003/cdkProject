package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.DmsMappingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DMSMappingRepo extends JpaRepository<DmsMappingModel,Long> {
    Optional<DmsMappingModel> findByEntityValue(String entityName);
}
