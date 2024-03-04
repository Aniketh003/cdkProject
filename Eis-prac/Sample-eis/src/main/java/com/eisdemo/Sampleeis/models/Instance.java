package com.eisdemo.Sampleeis.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "ENT_FEED_APP_BATCH_JOB_INSTANCE")
public class Instance{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_INSTANCE_ID")
    private Integer JOB_INSTANCE_ID;

    @Column(name = "VERSION")
    private Integer VERSION;


    @Column(name = "JOB_NAME")
    private String JOB_NAME;

    @Column(name = "JOB_KEY")
    private String JOB_KEY;

}


