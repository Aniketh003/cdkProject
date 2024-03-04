package com.eisdemo.Sampleeis.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter //lombok
@Getter
@Entity
@Table(name="ENT_FEED_APP_BATCH_REPORT")
public class Batch_Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //for setting primary key
    @Column(name = "ID")
    private Integer Id;

    @Column(name = "ORG_UNIT_TYPE")
    private String Org_Unit_Type;

    @Column(name = "OPERATION_TYPE")
    private String Operation_Type;

    @Column(name = "IDENTIFIER_TYPE")
    private String Identifier_Type;

    @Column(name = "IDENTIFIER_VALUE")
    private String Identifier_Value;

    @Column(name = "STATUS")
    private String Status;

    @Column(name = "COMMENTS")
    private String Comments;

    @Column(name = "CREATED_BY")
    private String Created_By;

    @Column(name = "CREATED_DATE")
    //private String Created_Date;
    private LocalDateTime timestamp;

    @Column(name = "BATCH_NAME")
    private String Batch_Name;

}
