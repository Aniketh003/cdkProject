package com.eisdemo.Sampleeis.Controller;


import com.eisdemo.Sampleeis.Services.InstanceService;
import com.eisdemo.Sampleeis.models.Instance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class InstanceController {
    private final InstanceService instanceService;

    @Autowired
    public InstanceController(InstanceService instanceService) {
        this.instanceService = instanceService;
    }

    @GetMapping("/ins")
    public List<Instance> getAllInstances() {
        return instanceService.getAllInstances();
    }
}
