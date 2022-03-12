package com.cdold.hqcs.dao;

import com.cdold.hqcs.entity.map.HospitalTitleMap;
import com.cdold.hqcs.vo.InitInfoVo;


public interface ConsultingRoomDao {
    HospitalTitleMap getConsultingRoomName(InitInfoVo initInfo);

    HospitalTitleMap getDepartmentsName(InitInfoVo initInfo);
}
