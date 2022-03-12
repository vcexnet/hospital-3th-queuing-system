package com.cdold.hqcs.service;

import com.cdold.hqcs.entity.SelfServiceWindow;

/**
 * @className: SelfServiceService
 * @description: 描述
 * @author: LBF
 * @date: 2022/2/22
 **/
public interface SelfServiceService {

    /**
     *
     * @param windowNo 窗口编码
     * @return 返回窗口信息
     */
    SelfServiceWindow getSelfServiceWindow(String windowNo);
}
