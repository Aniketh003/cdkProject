package com.eisdemo.Sampleeis.Controller;

import com.eisdemo.Sampleeis.Services.DMSMappingService;
import com.eisdemo.Sampleeis.Services.StoreDepartmentService;
import com.eisdemo.Sampleeis.models.DepartmentRequest;
import com.eisdemo.Sampleeis.models.DmsMappingModel;
import com.eisdemo.Sampleeis.models.StoreDepartmentMappingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dms")
public class DMSMappingController {

    @Autowired
    private DMSMappingService dmsMappingService;

    @Autowired
    private StoreDepartmentService storeDepartmentService;

    @PostMapping("/entityValue")
    public Boolean DMSMapping(@RequestBody DmsMappingModel dmsMappingModel){
        return dmsMappingService.setEntityToTrue(dmsMappingModel.getEntityValue(),dmsMappingModel.getCdkClientFlag());
    }

    @PutMapping("/{storeId}/storeDepartmentMapping")
    public String storeDepartmentMapping(@RequestBody DepartmentRequest departmentRequest, @PathVariable String storeId){
        storeDepartmentService.storeDepartmentMapping(departmentRequest.getDepartmentIds(),storeId);
        return "OK";
    }
}
