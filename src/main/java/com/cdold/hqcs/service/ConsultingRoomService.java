package com.cdold.hqcs.service;

import com.cdold.hqcs.entity.map.HospitalTitleMap;
import com.cdold.hqcs.vo.InitInfoVo;


public interface ConsultingRoomService {
    HospitalTitleMap getConsultingRoomName(InitInfoVo initInfo);

    HospitalTitleMap getDepartmentsName(InitInfoVo initInfo);
}
