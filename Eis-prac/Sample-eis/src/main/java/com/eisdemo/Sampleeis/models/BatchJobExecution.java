package com.eisdemo.Sampleeis.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "ent_feed_app_batch_job_execution")
public class BatchJobExecution {

    @Id

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

    // Getters and setters
}