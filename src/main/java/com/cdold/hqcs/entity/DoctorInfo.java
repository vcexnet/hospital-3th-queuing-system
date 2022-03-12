package com.cdold.hqcs.entity;



/**
 * 类名：医生信息实体类
 * 功能：映射医生信息实体
 * */
public class DoctorInfo {
    //医生照片二进制流
    private Byte[] doctorImage;
    //医生名称
    private String doctorName;
    //医生职称
    private String doctorJobTitle;
    //医生工作时间
    private String doctorWorkTime;
    //医生简介
    private String doctorIntroduction;
    //医生二维码图片二进制流
    private Byte[] doctorQRCode;


    public Byte[] getDoctorImage() {
        return doctorImage;
    }

    public void setDoctorImage(Byte[] doctorImage) {
        this.doctorImage = doctorImage;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorJobTitle() {
        return doctorJobTitle;
    }

    public void setDoctorJobTitle(String doctorJobTitle) {
        this.doctorJobTitle = doctorJobTitle;
    }

    public String getDoctorWorkTime() {
        return doctorWorkTime;
    }

    public void setDoctorWorkTime(String doctorWorkTime) {
        this.doctorWorkTime = doctorWorkTime;
    }

    public String getDoctorIntroduction() {
        return doctorIntroduction;
    }

    public void setDoctorIntroduction(String doctorIntroduction) {
        this.doctorIntroduction = doctorIntroduction;
    }

    public Byte[] getDoctorQRCode() {
        return doctorQRCode;
    }

    public void setDoctorQRCode(Byte[] doctorQRCode) {
        this.doctorQRCode = doctorQRCode;
    }
}
