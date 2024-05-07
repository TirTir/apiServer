package com.example.apiServer.dto.treat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TreatResponse {
    Long id;
    Long medicationId;
    LocalDateTime treatStartDate;
    int treatSubject;
    String hospitalName;
    String visitDays;
    int prescribeCnt;
    int deductibleAmt;
    int publicCharge;
}
