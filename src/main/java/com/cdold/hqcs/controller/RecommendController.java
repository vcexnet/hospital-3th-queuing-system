package com.cdold.hqcs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;

/**
 * @className: RecommendController
 * @description: 描述
 * @author: LBF
 * @date: 2022/3/11
 **/
@Controller
public class RecommendController {

   // http://localhost:8801/getRecommendIndex
    @GetMapping("/getRecommendIndex")
    public String getRecommendIndex(){
        return "SelfService";
    }
}
