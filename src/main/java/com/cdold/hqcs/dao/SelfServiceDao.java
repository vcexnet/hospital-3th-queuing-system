package com.cdold.hqcs.dao;

import com.cdold.hqcs.entity.SelfServiceWindow;

/**
 * @className: SelfServiceDao
 * @description: 自助服务窗口
 * @author: LBF
 * @date: 2022/2/22
 **/
public interface SelfServiceDao {

    /**
     * 查询窗口名称
     * @param windowNo 窗口编码
     * @return 返回窗口信息
     */
    SelfServiceWindow getSelfServiceWindow(String windowNo);

}
