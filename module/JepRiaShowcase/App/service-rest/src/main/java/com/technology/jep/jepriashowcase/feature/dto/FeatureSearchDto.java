package com.technology.jep.jepriashowcase.feature.dto;

import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

public class FeatureSearchDto {
  private Integer featureId;
  @Pattern(regexp = "[^%]*", message = "template must not contain percent sign")
  private String featureNameTemplate;
  @Pattern(regexp = "[^\u0400-\u04FF]*", message = "must not contain cyrillic symbols")
  private String featureNameEnTemplate;
  private List<String> statusCodeList;
  private Integer authorId;
  private Integer responsibleId;
  private Date dateInsFrom;
  private Date dateInsTo;
  private Integer maxRowCount;

  public Integer getFeatureId() {
    return featureId;
  }

  public void setFeatureId(Integer featureId) {
    this.featureId = featureId;
  }

  public String getFeatureNameTemplate() {
    return featureNameTemplate;
  }

  public void setFeatureNameTemplate(String featureNameTemplate) {
    this.featureNameTemplate = featureNameTemplate;
  }

  public String getFeatureNameEnTemplate() {
    return featureNameEnTemplate;
  }

  public void setFeatureNameEnTemplate(String featureNameEnTemplate) {
    this.featureNameEnTemplate = featureNameEnTemplate;
  }

  public List<String> getStatusCodeList() {
    return statusCodeList;
  }

  public void setStatusCodeList(List<String> statusCodeList) {
    this.statusCodeList = statusCodeList;
  }

  public Integer getAuthorId() {
    return authorId;
  }

  public void setAuthorId(Integer authorId) {
    this.authorId = authorId;
  }

  public Integer getResponsibleId() {
    return responsibleId;
  }

  public void setResponsibleId(Integer responsibleId) {
    this.responsibleId = responsibleId;
  }

  public Date getDateInsFrom() {
    return dateInsFrom;
  }

  public void setDateInsFrom(Date dateInsFrom) {
    this.dateInsFrom = dateInsFrom;
  }

  public Date getDateInsTo() {
    return dateInsTo;
  }

  public void setDateInsTo(Date dateInsTo) {
    this.dateInsTo = dateInsTo;
  }

  public Integer getMaxRowCount() {
    return maxRowCount;
  }

  public void setMaxRowCount(Integer maxRowCount) {
    this.maxRowCount = maxRowCount;
  }
}