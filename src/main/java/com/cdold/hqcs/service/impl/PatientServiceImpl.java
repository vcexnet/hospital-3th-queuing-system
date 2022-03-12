package com.cdold.hqcs.service.impl;

import com.cdold.hqcs.dao.PatientDao;
import com.cdold.hqcs.entity.Patient;
import com.cdold.hqcs.service.PatientService;
import com.cdold.hqcs.utils.QueueTableNames;
import com.cdold.hqcs.utils.TableUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @className: PatientServiceImpl
 * @description: 描述
 * @author: LBF
 * @date: 2022/2/27
 **/
@Service
public class PatientServiceImpl implements PatientService {
    @Resource
    PatientDao patientDao;


    @Override
    public List<Patient> getPatientList(String windowNo, String clinicAreaNo, String type) {
        String tableName = TableUtil.getTableName(clinicAreaNo);
        List<Patient> patientList = patientDao.getPatientList(windowNo, tableName,type);
        TableUtil.setPatientSort(patientList);
        return patientList;
    }
}
