package com.cdold.hqcs.service.impl;

import com.cdold.hqcs.dao.HintDao;
import com.cdold.hqcs.entity.Hint;
import com.cdold.hqcs.service.HintService;
import com.cdold.hqcs.vo.InitInfoVo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;



/**
 * 类名：提示信息业务类
 * 属性：提示信息dao
 * 功能：完成提示信息业务
 * */
@Service
public class HintServiceImpl implements HintService {
    @Resource
    private HintDao hintDao;


    @Override
    public Hint getHint(InitInfoVo initInfoVo) {
        Hint hint = new Hint();
        hint.setFixedInformation(hintDao.getFixedInformation(initInfoVo));
        hint.setScrollingMessage(hintDao.getScrollingMessage(initInfoVo));
        return hint;
    }
}
