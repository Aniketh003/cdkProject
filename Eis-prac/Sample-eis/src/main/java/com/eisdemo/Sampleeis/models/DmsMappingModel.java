package com.eisdemo.Sampleeis.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "dms_mapping")
public class DmsMappingModel {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "Id", columnDefinition = "BINARY(16)")
    private UUID id;

    @Column(name = "enitity_value")
    private String entityValue;

    @Column(name = "cdk_client_flag")
    private Character cdkClientFlag;
}
