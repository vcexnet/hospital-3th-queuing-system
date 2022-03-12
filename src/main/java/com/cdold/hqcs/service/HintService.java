package com.cdold.hqcs.service;

import com.cdold.hqcs.entity.Hint;
import com.cdold.hqcs.vo.InitInfoVo;

public interface HintService {
    Hint getHint(InitInfoVo initInfoVo);
}
