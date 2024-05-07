package com.example.apiServer.dto.medication;

import com.example.apiServer.entity.Drug;

import java.time.LocalDateTime;
import java.util.List;

public class MedicationResponse {
    Long medicationId;
    Long id;
    String diseaseId; //질병분류
    int prescribeCnt; //복용기간
    List<String> drugCode; //약품코드
    LocalDateTime treatDate; //진료,처방일자
}
