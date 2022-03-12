package com.cdold.hqcs.vo;

import org.springframework.beans.factory.annotation.Value;

/**
 * 类名：初始信息vo
 * 属性：门诊编码、队列编码
 * 功能：获取配置文件中的信息查询数据库中相关字段
* */
public class InitInfoVo {
    @Value("901")
     // 诊室号
    String outpatientServiceNo;
    // 诊区号
    @Value("09")
    String queueNo;

    public InitInfoVo() {
    }

    public InitInfoVo(String outpatientServiceNo, String queueNo) {
        this.outpatientServiceNo = outpatientServiceNo;
        this.queueNo = queueNo;
    }

    public String getOutpatientServiceNo() {
        return outpatientServiceNo;
    }

    public void setOutpatientServiceNo(String outpatientServiceNo) {
        this.outpatientServiceNo = outpatientServiceNo;
    }

    public String getQueueNo() {
        return queueNo;
    }

    public void setQueueNo(String queueNo) {
        this.queueNo = queueNo;
    }
}
