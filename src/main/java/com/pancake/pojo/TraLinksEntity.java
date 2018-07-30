package com.pancake.pojo;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by zhibingze on 2018/7/9.
 */
@Entity
@javax.persistence.Table(name = "tra_links", schema = "tracing_process", catalog = "")
public class TraLinksEntity {
    private long id;

    @Id
    @javax.persistence.Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private Long processId;

    @Basic
    @javax.persistence.Column(name = "process_id")
    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    private Long formId;

    @Basic
    @javax.persistence.Column(name = "form_id")
    public Long getFormId() {
        return formId;
    }

    public void setFormId(Long formId) {
        this.formId = formId;
    }

    private Long companyId;

    @Basic
    @javax.persistence.Column(name = "company_id")
    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    private String name;

    @Basic
    @javax.persistence.Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Integer type;

    @Basic
    @javax.persistence.Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    private Integer codeRel;

    @Basic
    @javax.persistence.Column(name = "code_rel")
    public Integer getCodeRel() {
        return codeRel;
    }

    public void setCodeRel(Integer codeRel) {
        this.codeRel = codeRel;
    }

    private Integer scanMode;

    @Basic
    @javax.persistence.Column(name = "scan_mode")
    public Integer getScanMode() {
        return scanMode;
    }

    public void setScanMode(Integer scanMode) {
        this.scanMode = scanMode;
    }

    private Integer locationsStatus;

    @Basic
    @javax.persistence.Column(name = "locations_status")
    public Integer getLocationsStatus() {
        return locationsStatus;
    }

    public void setLocationsStatus(Integer locationsStatus) {
        this.locationsStatus = locationsStatus;
    }

    private Long createUserId;

    @Basic
    @javax.persistence.Column(name = "create_user_id")
    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    private String createUserName;

    @Basic
    @javax.persistence.Column(name = "create_user_name")
    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    private String createTime;

    @Basic
    @javax.persistence.Column(name = "create_time")
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    private Long updateUserId;

    @Basic
    @javax.persistence.Column(name = "update_user_id")
    public Long getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(Long updateUserId) {
        this.updateUserId = updateUserId;
    }

    private String updateUserName;

    @Basic
    @javax.persistence.Column(name = "update_user_name")
    public String getUpdateUserName() {
        return updateUserName;
    }

    public void setUpdateUserName(String updateUserName) {
        this.updateUserName = updateUserName;
    }

    private String updateTime;

    @Basic
    @javax.persistence.Column(name = "update_time")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    private Integer codeRelation;

    @Basic
    @javax.persistence.Column(name = "code_relation")
    public Integer getCodeRelation() {
        return codeRelation;
    }

    public void setCodeRelation(Integer codeRelation) {
        this.codeRelation = codeRelation;
    }

    private Integer scanModel;

    @Basic
    @javax.persistence.Column(name = "scan_model")
    public Integer getScanModel() {
        return scanModel;
    }

    public void setScanModel(Integer scanModel) {
        this.scanModel = scanModel;
    }

    private Double radius;

    @Basic
    @javax.persistence.Column(name = "radius")
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    private String remark;

    @Basic
    @javax.persistence.Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    private Integer subCodeNum;

    @Basic
    @javax.persistence.Column(name = "sub_code_num")
    public Integer getSubCodeNum() {
        return subCodeNum;
    }

    public void setSubCodeNum(Integer subCodeNum) {
        this.subCodeNum = subCodeNum;
    }

    private Integer customerShowFlag;

    @Basic
    @javax.persistence.Column(name = "customer_show_flag")
    public Integer getCustomerShowFlag() {
        return customerShowFlag;
    }

    public void setCustomerShowFlag(Integer customerShowFlag) {
        this.customerShowFlag = customerShowFlag;
    }

    private Long qualityId;

    @Basic
    @javax.persistence.Column(name = "quality_id")
    public Long getQualityId() {
        return qualityId;
    }

    public void setQualityId(Long qualityId) {
        this.qualityId = qualityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TraLinksEntity that = (TraLinksEntity) o;

        if (id != that.id) return false;
        if (processId != null ? !processId.equals(that.processId) : that.processId != null) return false;
        if (formId != null ? !formId.equals(that.formId) : that.formId != null) return false;
        if (companyId != null ? !companyId.equals(that.companyId) : that.companyId != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (codeRel != null ? !codeRel.equals(that.codeRel) : that.codeRel != null) return false;
        if (scanMode != null ? !scanMode.equals(that.scanMode) : that.scanMode != null) return false;
        if (locationsStatus != null ? !locationsStatus.equals(that.locationsStatus) : that.locationsStatus != null)
            return false;
        if (createUserId != null ? !createUserId.equals(that.createUserId) : that.createUserId != null) return false;
        if (createUserName != null ? !createUserName.equals(that.createUserName) : that.createUserName != null)
            return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateUserId != null ? !updateUserId.equals(that.updateUserId) : that.updateUserId != null) return false;
        if (updateUserName != null ? !updateUserName.equals(that.updateUserName) : that.updateUserName != null)
            return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (codeRelation != null ? !codeRelation.equals(that.codeRelation) : that.codeRelation != null) return false;
        if (scanModel != null ? !scanModel.equals(that.scanModel) : that.scanModel != null) return false;
        if (radius != null ? !radius.equals(that.radius) : that.radius != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;
        if (subCodeNum != null ? !subCodeNum.equals(that.subCodeNum) : that.subCodeNum != null) return false;
        if (customerShowFlag != null ? !customerShowFlag.equals(that.customerShowFlag) : that.customerShowFlag != null)
            return false;
        if (qualityId != null ? !qualityId.equals(that.qualityId) : that.qualityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (processId != null ? processId.hashCode() : 0);
        result = 31 * result + (formId != null ? formId.hashCode() : 0);
        result = 31 * result + (companyId != null ? companyId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (codeRel != null ? codeRel.hashCode() : 0);
        result = 31 * result + (scanMode != null ? scanMode.hashCode() : 0);
        result = 31 * result + (locationsStatus != null ? locationsStatus.hashCode() : 0);
        result = 31 * result + (createUserId != null ? createUserId.hashCode() : 0);
        result = 31 * result + (createUserName != null ? createUserName.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateUserId != null ? updateUserId.hashCode() : 0);
        result = 31 * result + (updateUserName != null ? updateUserName.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (codeRelation != null ? codeRelation.hashCode() : 0);
        result = 31 * result + (scanModel != null ? scanModel.hashCode() : 0);
        result = 31 * result + (radius != null ? radius.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        result = 31 * result + (subCodeNum != null ? subCodeNum.hashCode() : 0);
        result = 31 * result + (customerShowFlag != null ? customerShowFlag.hashCode() : 0);
        result = 31 * result + (qualityId != null ? qualityId.hashCode() : 0);
        return result;
    }
}
