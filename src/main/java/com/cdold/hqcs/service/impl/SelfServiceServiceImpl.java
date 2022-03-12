package com.cdold.hqcs.service.impl;

import com.cdold.hqcs.dao.SelfServiceDao;
import com.cdold.hqcs.entity.SelfServiceWindow;
import com.cdold.hqcs.service.SelfServiceService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @className: SelfServiceServiceImpl
 * @description: 描述
 * @author: LBF
 * @date: 2022/2/22
 **/
@Service
public class SelfServiceServiceImpl implements SelfServiceService {
    @Resource
    public SelfServiceDao selfServiceDao;


    /**
     * @param windowNo 窗口编码
     * @return 返回窗口信息
     */
    @Override
    public SelfServiceWindow getSelfServiceWindow(String windowNo) {
        return selfServiceDao.getSelfServiceWindow(windowNo);
    }
}
