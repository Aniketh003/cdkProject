package com.eisdemo.Sampleeis.Repository;

import com.eisdemo.Sampleeis.models.StoreDepartmentMappingModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StoreDepartmentRepo extends JpaRepository<StoreDepartmentMappingModel,Long> {
    Optional<StoreDepartmentMappingModel> findByStoreId(String storeId);
    Optional<StoreDepartmentMappingModel> findByDepartmentId(String departmentId);
}
