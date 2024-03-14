package com.eisdemo.Sampleeis.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;


@Table(name = "ent_feed_app_batch_report")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class BatchReport {
    @Id
    @Column(name = "ID")
    private String Id;

    @Column(name = "ORG_UNIT_TYPE")
    private String OrgUnitType;

    @Column(name = "IDENTIFIER_TYPE")
    private String IdentifierType;

    @Column(name = "IDENTIFIER_VALUE")
    private String IdentifierValue;

    @Column(name = "STATUS")
    private String Status;

    @Column(name = "COMMENTS")
    private String COMMENTS;

    @Column(name = "CREATED_BY")
    private String CreatedBy;

    @Column(name = "CREATED_DATE")
    private String CreatedDate;

    @Column(name = "BATCH_NAME")
    private String BatchName;

}