package com.beibeiMajor.web.service.dto;

import lombok.Data;

import java.util.Date;

/**
 * 我的战绩列表
 */
@Data
public class MyMatchDetailBean {

  private String heroName;

  private String result;

  private Date playDate;

  private String isDouble;

  private String kda;

  private String integral;

}
