package com.cdold.hqcs.entity.map;

/**
 * 类名：标题映射信息map
 * 功能：标题信息映射查询的map类
 * */
public class HospitalTitleMap {
    //诊室名称
    private String consultingRoomName;
    //科室名称
    private String departmentsName;

    public HospitalTitleMap() {
    }
//==========================================getAndSet=============================================================
    public String getConsultingRoomName() {
        return consultingRoomName;
    }

    public void setConsultingRoomName(String consultingRoomName) {
        this.consultingRoomName = consultingRoomName;
    }

    public String getDepartmentsName() {
        return departmentsName;
    }

    public void setDepartmentsName(String departmentsName) {
        this.departmentsName = departmentsName;
    }
//=====================================================================================================================

    public HospitalTitleMap(String consultingRoomName, String departmentsName) {
        this.consultingRoomName = consultingRoomName;
        this.departmentsName = departmentsName;
    }
}
