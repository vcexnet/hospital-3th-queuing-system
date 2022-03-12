package com.cdold.hqcs.dao;

import com.cdold.hqcs.entity.Patient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @className: PatientDao
 * @description: 患者信息
 * @author: LBF
 * @date: 2022/2/27
 **/
public interface PatientDao {
    //    List<Patient> getPatientList(@Param("windowNo") String windowNo,@Param("tableNames") List<String> tableNames,@Param("patientType") String patientType);

    List<Patient> getPatientList(@Param("windowNo")String windowNo,@Param("tableName") String tableName,@Param("patientType") String patientType);
}
