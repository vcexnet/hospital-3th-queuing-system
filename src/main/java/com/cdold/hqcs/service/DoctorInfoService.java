package com.cdold.hqcs.service;

import com.cdold.hqcs.entity.DoctorInfo;
import com.cdold.hqcs.vo.InitInfoVo;

public interface DoctorInfoService {
    DoctorInfo getDoctorInfo(InitInfoVo initInfoVo);

    Byte[] getDefaultQRCode();
}
