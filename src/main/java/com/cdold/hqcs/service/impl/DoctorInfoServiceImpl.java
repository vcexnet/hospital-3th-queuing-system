package com.cdold.hqcs.service.impl;

import com.cdold.hqcs.dao.DoctorInfoDao;
import com.cdold.hqcs.entity.DoctorInfo;
import com.cdold.hqcs.service.DoctorInfoService;
import com.cdold.hqcs.vo.InitInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 类名：医生信息业务类
 * 属性：医生dao
 * 功能：完成医生信息业务
 * */
@Service
public class DoctorInfoServiceImpl implements DoctorInfoService {
    @Resource
    private DoctorInfoDao doctorInfoDao;

    @Override
    public DoctorInfo getDoctorInfo(InitInfoVo initInfoVo) {
        return doctorInfoDao.getDoctorInfo(initInfoVo);
    }

    @Override
    public Byte[] getDefaultQRCode() {
        Byte[] defaultQRCode = doctorInfoDao.getDefaultQRCode().getDoctorQRCode();
        return defaultQRCode;
    }
}
