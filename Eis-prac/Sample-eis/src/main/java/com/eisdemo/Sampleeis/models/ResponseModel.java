package com.eisdemo.Sampleeis.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseModel {
    private Integer JOB_INSTANCE_ID;
    private String JOB_NAME;
    private String Start_Time;
    private String End_Time;
    private String Status;
    private String Exit_Code;
    private String Exit_Message;
}
