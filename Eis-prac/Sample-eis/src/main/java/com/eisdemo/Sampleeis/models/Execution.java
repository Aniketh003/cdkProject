package com.eisdemo.Sampleeis.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "execution")
public class Execution{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sid")
    private String sid;

    @Column(name = "EID")
    private String eid;

    @Column(name = "Statuss")
    private String status;

    @Column(name = "Timee")
    private String time;

    @Column(name = "Datee")
    private String date;

    @Column(name = "Reason")
    private String reason;

    @Column(name = "Triger")
    private String trigger;

}
