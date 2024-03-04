package com.eisdemo.Sampleeis.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter //lombok
@Getter
@Entity
@Table(name = "ENT_FEED_APP_BATCH_JOB_EXECUTION")
public class Execution{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for setting primary key
    @Column(name = "JOB_EXECUTION_ID")
    private Integer Job_Execution_Id;

    @Column(name = "VERSION")
    private Integer Version;

    @Column(name = "JOB_INSTANCE_ID")
    private Integer Job_Instance_Id;

    @Column(name = "CREATE_TIME")
    private String Create_Time;

    @Column(name = "START_TIME")
    private String Start_Time;

    @Column(name = "END_TIME")
    private String End_Time;

    @Column(name = "STATUS")
    private String Status;

    @Column(name = "EXIT_CODE")
    private String Exit_Code;

    @Column(name = "EXIT_MESSAGE")
    private String Exit_Message;

    @Column(name = "LAST_UPDATED")
    private String Last_Updated;

    @Column(name = "JOB_CONFIGURATION_LOCATION")
    private String Job_Configuration_Location;



}
