package com.cdold.hqcs.dao;


import com.cdold.hqcs.entity.DoctorInfo;
import com.cdold.hqcs.vo.InitInfoVo;

public interface DoctorInfoDao {
    DoctorInfo getDoctorInfo(InitInfoVo initInfoVo);

    //获取默认二维码
    DoctorInfo getDefaultQRCode();
}
