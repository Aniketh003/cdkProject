package com.eisdemo.Sampleeis.Services;

import com.eisdemo.Sampleeis.Repository.DMSMappingRepo;
import com.eisdemo.Sampleeis.models.DmsMappingModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DMSMappingService {
    @Autowired
    private DMSMappingRepo dmsMappingRepo;

    public Boolean setEntityToTrue(String entityValue,Character cdkFlag){
        Optional<DmsMappingModel> entity = dmsMappingRepo.findByEntityValue(entityValue);
        if(entity.isPresent()){
            DmsMappingModel instance = entity.get();
            instance.setCdkClientFlag(cdkFlag);
            dmsMappingRepo.save(instance);
        }else{
            DmsMappingModel instance = new DmsMappingModel();
            instance.setEntityValue(entityValue);
            instance.setCdkClientFlag(cdkFlag);
            dmsMappingRepo.save(instance);
            return true;
        }

        return true;
    }
}
