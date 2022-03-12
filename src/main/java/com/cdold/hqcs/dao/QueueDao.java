package com.cdold.hqcs.dao;

import com.cdold.hqcs.entity.Patient;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface QueueDao {
    List<Patient> getQueue(@Param("queueNo") String queueNo, @Param("tableNames") List<String> tableNames, @Param("type") String type);
}
