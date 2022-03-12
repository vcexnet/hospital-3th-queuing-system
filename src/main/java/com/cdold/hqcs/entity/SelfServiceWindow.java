package com.cdold.hqcs.entity;

/**
 * @className: SelfServiceWindow
 * @description: 自助服务窗口类
 * @author: LBF
 * @date: 2022/2/26
 **/
public class SelfServiceWindow {
    //窗口号
    private String windowNo;
    //窗口名称
    private String windowName;
    // 所在诊区
    private String clinicAreaName;

    public SelfServiceWindow() {
    }

    public SelfServiceWindow(String windowNo, String windowName, String clinicAreaName) {
        this.windowNo = windowNo;
        this.windowName = windowName;
        this.clinicAreaName = clinicAreaName;
    }

    public String getWindowNo() {
        return windowNo;
    }

    public void setWindowNo(String windowNo) {
        this.windowNo = windowNo;
    }

    public String getWindowName() {
        return windowName;
    }

    public void setWindowName(String windowName) {
        this.windowName = windowName;
    }

    public String getClinicAreaName() {
        return clinicAreaName;
    }

    public void setClinicAreaName(String clinicAreaName) {
        this.clinicAreaName = clinicAreaName;
    }

    @Override
    public String toString() {
        return "SelfServiceWindow{" +
                "windowNo='" + windowNo + '\'' +
                ", windowName='" + windowName + '\'' +
                ", clinicAreaName='" + clinicAreaName + '\'' +
                '}';
    }
}
