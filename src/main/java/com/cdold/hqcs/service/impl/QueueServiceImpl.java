package com.cdold.hqcs.service.impl;

import com.cdold.hqcs.dao.QueueDao;
import com.cdold.hqcs.entity.Patient;
import com.cdold.hqcs.service.QueueService;
import com.cdold.hqcs.utils.QueueTableNames;
import com.cdold.hqcs.vo.InitInfoVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;

/**
 * 类名：队列业务类
 * 属性：队列dao
 * 功能：完成队列业务
 * */
@Service
public class QueueServiceImpl implements QueueService {

    @Resource
    private QueueDao queueDao;

    @Resource
    private QueueTableNames queueTableNames;

    @Override
    public List<Patient> getPatients(InitInfoVo initInfoVo, String patientType) {
        List<Patient> patientList = queueDao.getQueue(initInfoVo.getQueueNo(),queueTableNames.getTableNames(),patientType);
        if("候诊".equals(patientType)) {
            patientList.sort(new Comparator<Patient>() {
                @Override
                public int compare(Patient o1, Patient o2) {
                    return o1.getPatientNo().compareTo(o2.getPatientNo());
                }
            });
        }
        for(Patient patient : patientList) {
            System.out.println(patient);
        }
        return patientList;
    }
}