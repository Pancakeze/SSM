package com.pancake.pojo;

import java.io.Serializable;

public class TraLinks implements Serializable{
    private Long id;

    private Long processId;

    private Long formId;

    private Long companyId;

    private String name;

    private Integer type;

    private Integer codeRel;

    private Integer scanMode;

    private Integer locationsStatus;

    private Long createUserId;

    private String createUserName;

    private String createTime;

    private Long updateUserId;

    private String updateUserName;

    private String updateTime;

    private Integer codeRelation;

    private Integer scanModel;

    private Double radius;

    private String remark;

    private Integer subCodeNum;

    private Integer customerShowFlag;

    private Long qualityId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCodeRel() {
        return codeRel;
    }

    public void setCodeRel(Integer codeRel) {
        this.codeRel = codeRel;
    }

    public Integer getScanMode() {
        return scanMode;
    }

    public void setScanMode(Integer scanMode) {
        this.scanMode = scanMode;
    }

    public Integer getLocationsStatus() {
        return locationsStatus;
    }

    public void setLocationsStatus(Integer locationsStatus) {
        this.locationsStatus = locationsStatus;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getCodeRelation() {
        return codeRelation;
    }

    public void setCodeRelation(Integer codeRelation) {
        this.codeRelation = codeRelation;
    }

    public Integer getScanModel() {
        return scanModel;
    }

    public void setScanModel(Integer scanModel) {
        this.scanModel = scanModel;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getSubCodeNum() {
        return subCodeNum;
    }

    public void setSubCodeNum(Integer subCodeNum) {
        this.subCodeNum = subCodeNum;
    }

    public Integer getCustomerShowFlag() {
        return customerShowFlag;
    }

    public void setCustomerShowFlag(Integer customerShowFlag) {
        this.customerShowFlag = customerShowFlag;
    }

    public Long getQualityId() {
        return qualityId;
    }

    public void setQualityId(Long qualityId) {
        this.qualityId = qualityId;
    }
}