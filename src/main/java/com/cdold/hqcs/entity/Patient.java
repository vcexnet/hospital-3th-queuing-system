package com.cdold.hqcs.entity;


/**
 * 类名：病人信息实体类
 * 功能：映射病人信息实体
 * */

public class Patient implements Comparable<Patient> {
    //病人排队号
    private Integer patientNo;
    //病人名称
    private String patientName;
    //病人排队类型
    private String patientType;
    private Character codeText;

    public Patient() {
    }

    public Patient(Integer patientNo, String patientName, String patientType, Character codeText) {
        this.patientNo = patientNo;
        this.patientName = patientName;
        this.patientType = patientType;
        this.codeText = codeText;
    }

    public Integer getPatientNo() {
        return patientNo;
    }

    public void setPatientNo(Integer patientNo) {
        this.patientNo = patientNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public Character getCodeText() {
        return codeText;
    }

    public void setCodeText(Character codeText) {
        this.codeText = codeText;
    }

    @Override
    public int compareTo(Patient o) {
        return this.patientNo.compareTo(o.getPatientNo());
    }


    @Override
    public String toString() {
        return "Patient{" +
                "patientNo=" + patientNo +
                ", patientName='" + patientName + '\'' +
                ", patientType='" + patientType + '\'' +
                ", codeText=" + codeText +
                '}';
    }
}
