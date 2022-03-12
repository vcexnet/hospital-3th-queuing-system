package com.cdold.hqcs.controller;

import com.cdold.hqcs.entity.DoctorInfo;
import com.cdold.hqcs.entity.Hint;
import com.cdold.hqcs.entity.Patient;
import com.cdold.hqcs.entity.map.HospitalTitleMap;
import com.cdold.hqcs.service.ConsultingRoomService;
import com.cdold.hqcs.service.DoctorInfoService;
import com.cdold.hqcs.service.HintService;
import com.cdold.hqcs.service.QueueService;
import com.cdold.hqcs.vo.InitInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 叶贵川
 * @version 1.0
 * @description: TODO 主要控制器负责主页面所有请求的管控
 * @date 2021/11/4 11:19
 */
@Controller
public class IndexController {
    @Autowired
    private ConsultingRoomService consultingRoomService;

    @Autowired
    private DoctorInfoService doctorInfoService;

    @Autowired
    private QueueService queueService;

    @Autowired
    private HintService hintService;

    //返回主页面
    // http://localhost:8801/?queueNo=702&outpatientServiceNo=1&diagnosticalArea=07
    @GetMapping("/")
    public String getIndex(InitInfoVo initInfo,Model model) {
        model.addAttribute("initInfo",initInfo);
        return "ziGong";
    }

    //返回医院标题
    @GetMapping("/hospitalTitle")
    @ResponseBody
    public HospitalTitleMap getHospitalTitle(InitInfoVo initInfo) {
        HospitalTitleMap hospitalTitleMap = new HospitalTitleMap();
        hospitalTitleMap.setConsultingRoomName(consultingRoomService.getConsultingRoomName(initInfo).getConsultingRoomName());
        hospitalTitleMap.setDepartmentsName(consultingRoomService.getDepartmentsName(initInfo).getDepartmentsName());
        return hospitalTitleMap;
    }

    //返回医生信息
    @GetMapping("/doctorInfo")
    @ResponseBody
    public DoctorInfo getDoctorInfo(InitInfoVo initInfoVo) {
        DoctorInfo doctorInfo = doctorInfoService.getDoctorInfo(initInfoVo);
        return doctorInfo;
    }

    //返回队列中对应状态德病人信息
    @GetMapping("/patientList")
    @ResponseBody
    public List<Patient> getPatientList(InitInfoVo initInfoVo,@RequestParam("type") String type) {
        System.out.println(type);
        List<Patient> patientList = queueService.getPatients(initInfoVo,type);
        return patientList;
    }

    //返回提示信息
    @GetMapping("/hint")
    @ResponseBody
    public Hint getHint(InitInfoVo initInfoVo) {
        Hint hint = hintService.getHint(initInfoVo);
        return hint;
    }

    //返回默认二维码
    @GetMapping("/defaultQRCode")
    @ResponseBody
    public Byte[] getDefaultQRCode() {
        Byte[] defaultQRCode = doctorInfoService.getDefaultQRCode();
        return defaultQRCode;
    }
}