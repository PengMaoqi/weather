package com.hunau.weather.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Yesterday implements Serializable {



    /**
     * 日期
     */
    private String date;

    /**
     * 高温
     */
    private String high;

    /**
     * 风向
     */
    private String fx;

    /**
     * 低温
     */
    private String low;

    /**
     * 风力
     */
    private String fl;

    /**
     * 类型：大雨、多云、晴...
     */
    private String type;
}
