package com.eisdemo.Sampleeis.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ent_feed_app_batch_job_instance")
public class BatchJobInstance {
    @Id
    @Column(name = "JOB_INSTANCE_ID")
    private Integer JOB_INSTANCE_ID;

    @Column(name = "VERSION")
    private Integer VERSION;

    @Column(name = "JOB_NAME")
    private String JOB_NAME;

    @Column(name = "JOB_KEY")
    private String JOB_KEY;
}