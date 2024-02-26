package com.eisdemo.Sampleeis.Services;


import com.eisdemo.Sampleeis.Repository.InstanceRepository;
import com.eisdemo.Sampleeis.models.Instance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstanceService {
    private final InstanceRepository instanceRepository;

    @Autowired
    public InstanceService(InstanceRepository instanceRepository) {
        this.instanceRepository = instanceRepository;
    }

    public List<Instance> getAllInstances() {
        return instanceRepository.findAll();
    }
}
