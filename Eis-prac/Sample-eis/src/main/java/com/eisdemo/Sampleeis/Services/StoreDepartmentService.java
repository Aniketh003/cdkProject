package com.eisdemo.Sampleeis.Services;

import com.eisdemo.Sampleeis.Repository.StoreDepartmentRepo;
import com.eisdemo.Sampleeis.models.StoreDepartmentMappingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StoreDepartmentService {

    @Autowired
    private StoreDepartmentRepo storeDepartmentRepo;

    public void storeDepartmentMapping(List<String> departmentIds,String storeId){
        for (String departmentId : departmentIds) {
            StoreDepartmentMappingModel departmentMappingModel = new StoreDepartmentMappingModel();
            if (storeDepartmentRepo.findByDepartmentId(departmentId).isPresent()) {
                continue;
            }
            departmentMappingModel.setStoreId(storeId);
            departmentMappingModel.setDepartmentId(departmentId);
            storeDepartmentRepo.save(departmentMappingModel);
        }
    }
}
