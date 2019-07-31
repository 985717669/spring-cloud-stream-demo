package com.example.demo.entity;

import org.apache.kafka.common.protocol.types.Field;

/**
 * Author fengjf
 * Desc
 */

public class Stu {
    private String name;
    private String sex;
    private String desc;

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getDesc() {
        return desc;
    }
}
