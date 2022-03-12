package com.cdold.hqcs.service;

import com.cdold.hqcs.entity.Patient;
import com.cdold.hqcs.vo.InitInfoVo;

import java.util.List;

public interface QueueService {
    List<Patient> getPatients(InitInfoVo initInfoVo,String patientType);
}
