package com.cdold.hqcs;

import com.cdold.hqcs.dao.QueueDao;
import com.cdold.hqcs.entity.Patient;
import com.cdold.hqcs.service.*;
import com.cdold.hqcs.utils.QueueTableNames;
import com.cdold.hqcs.vo.InitInfoVo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class HospitalQueuingCallSystemApplicationTests {

    @Autowired
    private ConsultingRoomService consultingRoomService;

    @Autowired
    private DoctorInfoService doctorInfoService;

    @Autowired
    private HintService hintService;

    @Autowired
    private QueueService queueService;

    @Resource
    private QueueTableNames queueTableNames;
    @Resource
    PatientService patientService;

    @Test
    void utilTest() {
        List<String> tableNames = new ArrayList();
        for(int i = 1; i <= 42; i++) {
            String tableName = "TBPDXX";
            if(i < 10) {
                tableName += "0" + i;
            }else {
                tableName += i;
            }
            tableNames.add(tableName);
        }
        // for(String tableName: tableNames) {
        //     System.out.println(tableName);
        // }
    }


    @Test
    void testConsultingRoom() {
        InitInfoVo initInfoVo = new InitInfoVo("010","102");
        System.out.println(consultingRoomService.getConsultingRoomName(initInfoVo).getConsultingRoomName() +
                consultingRoomService.getDepartmentsName(initInfoVo).getDepartmentsName());
    }

    @Test
    void testDoctorInfo() {
        InitInfoVo initInfoVo = new InitInfoVo("","702");
        System.out.println(doctorInfoService.getDoctorInfo(initInfoVo).getDoctorName());
        System.out.println(doctorInfoService.getDoctorInfo(initInfoVo).getDoctorJobTitle());
        System.out.println(doctorInfoService.getDoctorInfo(initInfoVo).getDoctorWorkTime());
        System.out.println(doctorInfoService.getDoctorInfo(initInfoVo).getDoctorIntroduction());
    }

    @Test
    void testHint() {
        InitInfoVo initInfoVo = new InitInfoVo("","702");
        // System.out.println(hintService.getHint(initInfoVo));
    }

    @Test
    void testQueueService() {
        InitInfoVo initInfoVo = new InitInfoVo("","1023");
        List<Patient> patientList = queueService.getPatients(initInfoVo,"待诊");
        // for (Patient item : patientList) {
        //     System.out.println(item.getPatientNo() +  item.getPatientName() +  item.getPatientType());
        // }
    }

    @Test
    void testQueueDao() {
        List<String> qList = queueTableNames.getTableNames();
        // for (String item:qList) {
        //     System.out.println(item);
        // }
    }

    @Test
    void  testGetDefaultQRCode() {
        // for (Byte QRCode : doctorInfoService.getDefaultQRCode()) {
        //     System.out.println(QRCode);
        // }
    }
    @Test
    void getPatientList(){
        List<Patient> patientList;
        patientList = patientService.getPatientList("901","9","2");
        for (Patient patient : patientList) {
            System.out.println(patient);
        }
    }


}
