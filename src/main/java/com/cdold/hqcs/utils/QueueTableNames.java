package com.cdold.hqcs.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


/**
 * 类名：对列表名字
 * 属性：需要循环打印的对列表的名字的次数
 * 功能：将对列表按照配置好的次数创建出一个list集合
 * */
@Component
public class QueueTableNames {
    private int tableNum;

    private List<String> tableNames;

    public List<String> getTableNames() {
        this.tableNames = new ArrayList();
        for(int i = 1; i <= tableNum; i++) {
            String tableName = "TBPDXX";
            if(i < 10) {
                tableName += "0" + i;
            }else {
                tableName += i;
            }
            this.tableNames.add(tableName);
        }
        return this.tableNames;
    }


}
