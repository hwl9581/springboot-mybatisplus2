package com.han.springbootmybatisplus2.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @ClassName SexEnum
 * @Description TODO
 * @Author HanWL
 * @Since 2020/5/9 0009 15:14
 */
public enum  SexEnum {

    OTHER("其他"),
    FEMALE("女"),
    MALE("男");

    //@EnumValue 存储指定字段

    @JsonValue
    public String desc;

    SexEnum(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
