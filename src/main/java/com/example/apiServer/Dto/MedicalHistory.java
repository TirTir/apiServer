package com.example.apiServer.Dto;

public class MedicalHistory {
    private int number;
    private String hospitalName;
    private String treatStartDate;
    private String treatType;
    private String prescribeCnt;
    private String visitDays;
    private String userName;
    private String prescribeDays;
    private String deductibleAmt;
    private String publicCharge;

    public MedicalHistory(String hospitalName, String treatStartDate, String treatType, String prescribeCnt, String visitDays, String userName, String prescribeDays, String deductibleAmt, String publicCharge) {
        this.hospitalName = hospitalName;
        this.treatStartDate = treatStartDate;
        this.treatType = treatType;
        this.prescribeCnt = prescribeCnt;
        this.visitDays = visitDays;
        this.userName = userName;
        this.prescribeDays = prescribeDays;
        this.deductibleAmt = deductibleAmt;
        this.publicCharge = publicCharge;
    }

    public int getNumber() {
        return number;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getTreatStartDate() {
        return treatStartDate;
    }

    public void setTreatStartDate(String treatStartDate) {
        this.treatStartDate = treatStartDate;
    }

    public String getTreatType() {
        return treatType;
    }

    public void setTreatType(String treatType) {
        this.treatType = treatType;
    }

    public String getPrescribeCnt() {
        return prescribeCnt;
    }

    public void setPrescribeCnt(String prescribeCnt) {
        this.prescribeCnt = prescribeCnt;
    }

    public String getVisitDays() {
        return visitDays;
    }

    public void setVisitDays(String visitDays) {
        this.visitDays = visitDays;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPrescribeDays() {
        return prescribeDays;
    }

    public void setPrescribeDays(String prescribeDays) {
        this.prescribeDays = prescribeDays;
    }

    public String getDeductibleAmt() {
        return deductibleAmt;
    }

    public void setDeductibleAmt(String deductibleAmt) {
        this.deductibleAmt = deductibleAmt;
    }

    public String getPublicCharge() {
        return publicCharge;
    }

    public void setPublicCharge(String publicCharge) {
        this.publicCharge = publicCharge;
    }

    @Override
    public String toString() {
        return "MedicalHistory{" +
                "hospitalName='" + hospitalName + '\'' +
                ", treatStartDate='" + treatStartDate + '\'' +
                ", treatType='" + treatType + '\'' +
                ", prescribeCnt='" + prescribeCnt + '\'' +
                ", visitDays='" + visitDays + '\'' +
                ", userName='" + userName + '\'' +
                ", prescribeDays='" + prescribeDays + '\'' +
                ", deductibleAmt='" + deductibleAmt + '\'' +
                ", publicCharge='" + publicCharge + '\'' +
                '}';
    }
}
