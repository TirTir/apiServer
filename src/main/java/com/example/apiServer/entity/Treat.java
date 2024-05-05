package com.example.apiServer.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "treat")
@Getter @Setter
public class Treat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키를 자동으로 1씩 증가
    @Column(name = "treat_id")
    private Long id;
    private LocalDateTime treatStartDate; // 진료개시일
    private int treatType; //진료형태
    private String hospitalName;
    private String userName;
    private String userIdentity; // 주민번호
    private int prescribeDays; //복용기간
    private int deductibleAmt; //본인부담금
    private int publicCharge; // 공단부담금

    @Builder
    public Treat(LocalDateTime treatStartDate, int treatType, String hospitalName, String userName, String userIdentity, int prescribeDays, int deductibleAmt, int publicCharge) {
        this.treatStartDate = treatStartDate;
        this.treatType = treatType;
        this.hospitalName = hospitalName;
        this.userName = userName;
        this.userIdentity = userIdentity;
        this.prescribeDays = prescribeDays;
        this.deductibleAmt = deductibleAmt;
        this.publicCharge = publicCharge;
    }
}