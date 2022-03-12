package com.cdold.hqcs.entity;


/**
 * 类名：提示信息实体类
 * 功能：映射提示信息实体
 * */
public class Hint {
    //固定提示信息
    private String fixedInformation;
    //底部滚动提示信息
    private String scrollingMessage;

    public String getFixedInformation() {
        return fixedInformation;
    }

    public void setFixedInformation(String fixedInformation) {
        this.fixedInformation = fixedInformation;
    }

    public String getScrollingMessage() {
        return scrollingMessage;
    }

    public void setScrollingMessage(String scrollingMessage) {
        this.scrollingMessage = scrollingMessage;
    }

    @Override
    public String toString() {
        return "Hint{" +
                "fixedInformation='" + fixedInformation + '\'' +
                ", scrollingMessage='" + scrollingMessage + '\'' +
                '}';
    }
}
