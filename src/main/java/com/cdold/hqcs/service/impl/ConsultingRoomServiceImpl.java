package com.cdold.hqcs.service.impl;

import com.cdold.hqcs.dao.ConsultingRoomDao;
import com.cdold.hqcs.entity.map.HospitalTitleMap;
import com.cdold.hqcs.service.ConsultingRoomService;
import com.cdold.hqcs.vo.InitInfoVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * 类名：诊室业务类
 * 属性：诊室dao
 * 功能：完成诊室业务
 * */
@Service
public class ConsultingRoomServiceImpl implements ConsultingRoomService {
    @Resource
    private ConsultingRoomDao consultingRoomDao;

    @Override
    public HospitalTitleMap getConsultingRoomName(InitInfoVo initInfo) {
        return consultingRoomDao.getConsultingRoomName(initInfo);
    }

    @Override
    public HospitalTitleMap getDepartmentsName(InitInfoVo initInfo) {
        return consultingRoomDao.getDepartmentsName(initInfo);
    }
}
