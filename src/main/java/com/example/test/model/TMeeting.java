package com.example.test.model;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;

public class TMeeting implements Serializable {
  @TableId(value = "id",type = IdType.AUTO)
  private Integer id;
  @TableField("code")
  private Integer code;
  @TableField("name")
  private String name;
  @TableField("startTime")
  private String startTime;
  @TableField("endTime")
  private String endTime;
  @TableField("city")
  private String city;
  @TableField("statue")
  private String statue;


  public long getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public long getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getStartTime() {
    return startTime;
  }

  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }

  public String getEndTime() {
    return endTime;
  }

  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }


  public String getStatue() {
    return statue;
  }

  public void setStatue(String statue) {
    this.statue = statue;
  }

  public TMeeting() {
  }

  public TMeeting(Integer id, Integer code, String name, String startTime, String endTime, String city, String statue) {
    this.id = id;
    this.code = code;
    this.name = name;
    this.startTime = startTime;
    this.endTime = endTime;
    this.city = city;
    this.statue = statue;
  }

  @Override
  public String toString() {
    return "TMeeting{" +
            "id=" + id +
            ", code=" + code +
            ", name='" + name + '\'' +
            ", startTime='" + startTime + '\'' +
            ", endTime='" + endTime + '\'' +
            ", city='" + city + '\'' +
            ", statue='" + statue + '\'' +
            '}';
  }
}
