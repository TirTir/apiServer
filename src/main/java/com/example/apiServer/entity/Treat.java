package com.example.apiServer.entity;

import jakarta.persistence.*;
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
    @OneToOne(mappedBy = "medication")
    private Medication medication;
    private LocalDateTime treatStartDate; // 진료개시일
    private int treatSubject; //진료과목
    private String hospitalName;
    private String visitDays; //방문일수
    private String userName;
    private String userIdentity; //주민번호
    private int prescribeCnt; //복용기간
    private int deductibleAmt; //본인부담금
    private int publicCharge; //공단부담금
}