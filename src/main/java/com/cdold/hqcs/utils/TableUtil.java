package com.cdold.hqcs.utils;


import com.cdold.hqcs.entity.Patient;
import java.util.Comparator;
import java.util.List;

public class TableUtil {

    /**
     * @description:  对Patient（患者）对象中的patientID（患者号）进行升序排序
     * @param: patients
     * @return: void
     * @date: 2021/12/23 16:49
     */
    public static void setPatientSort(List<Patient> patients) {

        patients.sort(Comparator.comparing(Patient::getPatientNo));
    }

    public static String getTableName(String areaId) {
        String tableHeader = "dbo.TBPDXX";
        System.out.println(areaId);
        int i= Integer.parseInt(areaId);
        if (i < 10) {
           return tableHeader + '0' + i;
        } else {
            return tableHeader  + i;
        }
    }
}
