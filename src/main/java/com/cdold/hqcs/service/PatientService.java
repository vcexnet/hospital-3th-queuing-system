package com.cdold.hqcs.service;

import com.cdold.hqcs.entity.Patient;

import java.util.List;

/**
 * @className: PatientService
 * @description: 描述
 * @author: LBF
 * @date: 2022/2/27
 **/
public interface PatientService {

    List<Patient> getPatientList(String windowNo, String clinicAreaNo, String type);
}
