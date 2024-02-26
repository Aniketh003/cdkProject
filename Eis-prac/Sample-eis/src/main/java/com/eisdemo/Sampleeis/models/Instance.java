package com.eisdemo.Sampleeis.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "instance")
public class Instance{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Sid")
    private String sid;

    @Column(name = "EID")
    private String eid;



    @Column(name = "SName")
    private String sName;

    @Column(name = "No_Of_Stores")
    private String noOfStores;

    @Column(name = "Phy_Add")
    private String physicalAddress;

    @Column(name = "CNF_Num")
    private String cnfNum;

    @Column(name = "Last_Update")
    private String lastUpdate;


}


