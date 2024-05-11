package com.example.apiServer.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "drug")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "DTYPE")
@Getter @Setter
public class Drug {
    @Id
    @GeneratedValue
    @Column(name = "drug_id")
    private int drugCode; //약품코드
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "medication_id")
    private Medication medication;
    private String prescribeDrugName; //처방약품명
    private String prescribeDrugEffect; //처방약품효능
}