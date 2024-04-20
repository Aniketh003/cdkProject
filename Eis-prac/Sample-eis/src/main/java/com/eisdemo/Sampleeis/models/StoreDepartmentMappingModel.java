package com.eisdemo.Sampleeis.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "store_department_mapping")
public class StoreDepartmentMappingModel {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "Id", columnDefinition = "BINARY(16)")
    private UUID id;
    @Column(name = "store_id")
    private String storeId;
    @Column(name = "department_id")
    private  String departmentId;
}
