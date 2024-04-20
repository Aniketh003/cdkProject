package com.eisdemo.Sampleeis.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentRequest {
    private List<String> departmentIds;
}
