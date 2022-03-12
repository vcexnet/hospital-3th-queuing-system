package com.cdold.hqcs.dao;

import com.cdold.hqcs.vo.InitInfoVo;

public interface HintDao {
    String getScrollingMessage(InitInfoVo initInfoVo);

    String getFixedInformation(InitInfoVo initInfoVo);
}
