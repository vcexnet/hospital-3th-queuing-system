package com.cdold.hqcs.controller;

import com.cdold.hqcs.dao.SelfServiceDao;
import com.cdold.hqcs.entity.Patient;
import com.cdold.hqcs.entity.SelfServiceWindow;
import com.cdold.hqcs.service.PatientService;
import com.cdold.hqcs.service.QueueService;
import com.cdold.hqcs.service.SelfServiceService;
import com.cdold.hqcs.vo.InitInfoVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @className: SelfServiceController
 * @description: 自助页面
 * @author: lbf
 * @date: 2022/2/22
 **/
@Controller
public class SelfServiceController {
    @Resource
    SelfServiceService selfServiceService;
    @Resource
    PatientService patientService;



    // http://localhost:8801/getWindow
    @GetMapping("/getWindow")
    public  String getWindow(String windowNo,String clinicAreaNo,Model model){
        model.addAttribute("windowNo",windowNo);
        model.addAttribute("clinicAreaNo",clinicAreaNo);
        return "SelfService";
    }
    //    http://localhost:8801/getWindow?windowNo=24
    @GetMapping("/getSelfServiceWindow")
    @ResponseBody
    public  SelfServiceWindow getSelfServiceWindow(String windowNo) {
        SelfServiceWindow serviceWindow = selfServiceService.getSelfServiceWindow(windowNo);
        System.out.println("窗口号："+windowNo);
        return serviceWindow;
    }

    //返回队列中对应状态德病人信息

    /**
     *
     * @param windowNo 窗口号
     * @param clinicAreaNo  诊区号
     * @param type 病人状态
     * @return 返回病人数组
     */
    //    http://localhost:8801/getWindow?windowNo=302&clinicAreaNo=3
    @GetMapping("/getPatientList")
    @ResponseBody
    public List<Patient> getPatientList(String windowNo,String clinicAreaNo,@RequestParam("type") String type,Model model) {
        List<Patient> patientList;
        patientList = patientService.getPatientList(windowNo,clinicAreaNo,type);
        System.out.println(patientList);
        model.addAttribute("patientList",patientList);
        return patientList;
    }

}
