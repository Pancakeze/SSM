package com.pancake.pojo;

import java.util.ArrayList;
import java.util.List;

public class TraLinksExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TraLinksExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNull() {
            addCriterion("process_id is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("process_id is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(Long value) {
            addCriterion("process_id =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(Long value) {
            addCriterion("process_id <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(Long value) {
            addCriterion("process_id >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(Long value) {
            addCriterion("process_id >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(Long value) {
            addCriterion("process_id <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(Long value) {
            addCriterion("process_id <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<Long> values) {
            addCriterion("process_id in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<Long> values) {
            addCriterion("process_id not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(Long value1, Long value2) {
            addCriterion("process_id between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(Long value1, Long value2) {
            addCriterion("process_id not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("form_id is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("form_id is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(Long value) {
            addCriterion("form_id =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(Long value) {
            addCriterion("form_id <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(Long value) {
            addCriterion("form_id >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(Long value) {
            addCriterion("form_id >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(Long value) {
            addCriterion("form_id <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(Long value) {
            addCriterion("form_id <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<Long> values) {
            addCriterion("form_id in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<Long> values) {
            addCriterion("form_id not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(Long value1, Long value2) {
            addCriterion("form_id between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(Long value1, Long value2) {
            addCriterion("form_id not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andCodeRelIsNull() {
            addCriterion("code_rel is null");
            return (Criteria) this;
        }

        public Criteria andCodeRelIsNotNull() {
            addCriterion("code_rel is not null");
            return (Criteria) this;
        }

        public Criteria andCodeRelEqualTo(Integer value) {
            addCriterion("code_rel =", value, "codeRel");
            return (Criteria) this;
        }

        public Criteria andCodeRelNotEqualTo(Integer value) {
            addCriterion("code_rel <>", value, "codeRel");
            return (Criteria) this;
        }

        public Criteria andCodeRelGreaterThan(Integer value) {
            addCriterion("code_rel >", value, "codeRel");
            return (Criteria) this;
        }

        public Criteria andCodeRelGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_rel >=", value, "codeRel");
            return (Criteria) this;
        }

        public Criteria andCodeRelLessThan(Integer value) {
            addCriterion("code_rel <", value, "codeRel");
            return (Criteria) this;
        }

        public Criteria andCodeRelLessThanOrEqualTo(Integer value) {
            addCriterion("code_rel <=", value, "codeRel");
            return (Criteria) this;
        }

        public Criteria andCodeRelIn(List<Integer> values) {
            addCriterion("code_rel in", values, "codeRel");
            return (Criteria) this;
        }

        public Criteria andCodeRelNotIn(List<Integer> values) {
            addCriterion("code_rel not in", values, "codeRel");
            return (Criteria) this;
        }

        public Criteria andCodeRelBetween(Integer value1, Integer value2) {
            addCriterion("code_rel between", value1, value2, "codeRel");
            return (Criteria) this;
        }

        public Criteria andCodeRelNotBetween(Integer value1, Integer value2) {
            addCriterion("code_rel not between", value1, value2, "codeRel");
            return (Criteria) this;
        }

        public Criteria andScanModeIsNull() {
            addCriterion("scan_mode is null");
            return (Criteria) this;
        }

        public Criteria andScanModeIsNotNull() {
            addCriterion("scan_mode is not null");
            return (Criteria) this;
        }

        public Criteria andScanModeEqualTo(Integer value) {
            addCriterion("scan_mode =", value, "scanMode");
            return (Criteria) this;
        }

        public Criteria andScanModeNotEqualTo(Integer value) {
            addCriterion("scan_mode <>", value, "scanMode");
            return (Criteria) this;
        }

        public Criteria andScanModeGreaterThan(Integer value) {
            addCriterion("scan_mode >", value, "scanMode");
            return (Criteria) this;
        }

        public Criteria andScanModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("scan_mode >=", value, "scanMode");
            return (Criteria) this;
        }

        public Criteria andScanModeLessThan(Integer value) {
            addCriterion("scan_mode <", value, "scanMode");
            return (Criteria) this;
        }

        public Criteria andScanModeLessThanOrEqualTo(Integer value) {
            addCriterion("scan_mode <=", value, "scanMode");
            return (Criteria) this;
        }

        public Criteria andScanModeIn(List<Integer> values) {
            addCriterion("scan_mode in", values, "scanMode");
            return (Criteria) this;
        }

        public Criteria andScanModeNotIn(List<Integer> values) {
            addCriterion("scan_mode not in", values, "scanMode");
            return (Criteria) this;
        }

        public Criteria andScanModeBetween(Integer value1, Integer value2) {
            addCriterion("scan_mode between", value1, value2, "scanMode");
            return (Criteria) this;
        }

        public Criteria andScanModeNotBetween(Integer value1, Integer value2) {
            addCriterion("scan_mode not between", value1, value2, "scanMode");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusIsNull() {
            addCriterion("locations_status is null");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusIsNotNull() {
            addCriterion("locations_status is not null");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusEqualTo(Integer value) {
            addCriterion("locations_status =", value, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusNotEqualTo(Integer value) {
            addCriterion("locations_status <>", value, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusGreaterThan(Integer value) {
            addCriterion("locations_status >", value, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("locations_status >=", value, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusLessThan(Integer value) {
            addCriterion("locations_status <", value, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusLessThanOrEqualTo(Integer value) {
            addCriterion("locations_status <=", value, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusIn(List<Integer> values) {
            addCriterion("locations_status in", values, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusNotIn(List<Integer> values) {
            addCriterion("locations_status not in", values, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusBetween(Integer value1, Integer value2) {
            addCriterion("locations_status between", value1, value2, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andLocationsStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("locations_status not between", value1, value2, "locationsStatus");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNull() {
            addCriterion("create_user_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIsNotNull() {
            addCriterion("create_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdEqualTo(Long value) {
            addCriterion("create_user_id =", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotEqualTo(Long value) {
            addCriterion("create_user_id <>", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThan(Long value) {
            addCriterion("create_user_id >", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user_id >=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThan(Long value) {
            addCriterion("create_user_id <", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("create_user_id <=", value, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdIn(List<Long> values) {
            addCriterion("create_user_id in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotIn(List<Long> values) {
            addCriterion("create_user_id not in", values, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdBetween(Long value1, Long value2) {
            addCriterion("create_user_id between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("create_user_id not between", value1, value2, "createUserId");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNull() {
            addCriterion("create_user_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIsNotNull() {
            addCriterion("create_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameEqualTo(String value) {
            addCriterion("create_user_name =", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotEqualTo(String value) {
            addCriterion("create_user_name <>", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThan(String value) {
            addCriterion("create_user_name >", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_user_name >=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThan(String value) {
            addCriterion("create_user_name <", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLessThanOrEqualTo(String value) {
            addCriterion("create_user_name <=", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameLike(String value) {
            addCriterion("create_user_name like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotLike(String value) {
            addCriterion("create_user_name not like", value, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameIn(List<String> values) {
            addCriterion("create_user_name in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotIn(List<String> values) {
            addCriterion("create_user_name not in", values, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameBetween(String value1, String value2) {
            addCriterion("create_user_name between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateUserNameNotBetween(String value1, String value2) {
            addCriterion("create_user_name not between", value1, value2, "createUserName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(String value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(String value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(String value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(String value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(String value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLike(String value) {
            addCriterion("create_time like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotLike(String value) {
            addCriterion("create_time not like", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<String> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<String> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(String value1, String value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(String value1, String value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNull() {
            addCriterion("update_user_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIsNotNull() {
            addCriterion("update_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdEqualTo(Long value) {
            addCriterion("update_user_id =", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotEqualTo(Long value) {
            addCriterion("update_user_id <>", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThan(Long value) {
            addCriterion("update_user_id >", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("update_user_id >=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThan(Long value) {
            addCriterion("update_user_id <", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdLessThanOrEqualTo(Long value) {
            addCriterion("update_user_id <=", value, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdIn(List<Long> values) {
            addCriterion("update_user_id in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotIn(List<Long> values) {
            addCriterion("update_user_id not in", values, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdBetween(Long value1, Long value2) {
            addCriterion("update_user_id between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIdNotBetween(Long value1, Long value2) {
            addCriterion("update_user_id not between", value1, value2, "updateUserId");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNull() {
            addCriterion("update_user_name is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIsNotNull() {
            addCriterion("update_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameEqualTo(String value) {
            addCriterion("update_user_name =", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotEqualTo(String value) {
            addCriterion("update_user_name <>", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThan(String value) {
            addCriterion("update_user_name >", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("update_user_name >=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThan(String value) {
            addCriterion("update_user_name <", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLessThanOrEqualTo(String value) {
            addCriterion("update_user_name <=", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameLike(String value) {
            addCriterion("update_user_name like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotLike(String value) {
            addCriterion("update_user_name not like", value, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameIn(List<String> values) {
            addCriterion("update_user_name in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotIn(List<String> values) {
            addCriterion("update_user_name not in", values, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameBetween(String value1, String value2) {
            addCriterion("update_user_name between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNameNotBetween(String value1, String value2) {
            addCriterion("update_user_name not between", value1, value2, "updateUserName");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(String value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(String value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(String value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(String value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(String value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(String value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLike(String value) {
            addCriterion("update_time like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotLike(String value) {
            addCriterion("update_time not like", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<String> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<String> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(String value1, String value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(String value1, String value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andCodeRelationIsNull() {
            addCriterion("code_relation is null");
            return (Criteria) this;
        }

        public Criteria andCodeRelationIsNotNull() {
            addCriterion("code_relation is not null");
            return (Criteria) this;
        }

        public Criteria andCodeRelationEqualTo(Integer value) {
            addCriterion("code_relation =", value, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andCodeRelationNotEqualTo(Integer value) {
            addCriterion("code_relation <>", value, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andCodeRelationGreaterThan(Integer value) {
            addCriterion("code_relation >", value, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andCodeRelationGreaterThanOrEqualTo(Integer value) {
            addCriterion("code_relation >=", value, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andCodeRelationLessThan(Integer value) {
            addCriterion("code_relation <", value, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andCodeRelationLessThanOrEqualTo(Integer value) {
            addCriterion("code_relation <=", value, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andCodeRelationIn(List<Integer> values) {
            addCriterion("code_relation in", values, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andCodeRelationNotIn(List<Integer> values) {
            addCriterion("code_relation not in", values, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andCodeRelationBetween(Integer value1, Integer value2) {
            addCriterion("code_relation between", value1, value2, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andCodeRelationNotBetween(Integer value1, Integer value2) {
            addCriterion("code_relation not between", value1, value2, "codeRelation");
            return (Criteria) this;
        }

        public Criteria andScanModelIsNull() {
            addCriterion("scan_model is null");
            return (Criteria) this;
        }

        public Criteria andScanModelIsNotNull() {
            addCriterion("scan_model is not null");
            return (Criteria) this;
        }

        public Criteria andScanModelEqualTo(Integer value) {
            addCriterion("scan_model =", value, "scanModel");
            return (Criteria) this;
        }

        public Criteria andScanModelNotEqualTo(Integer value) {
            addCriterion("scan_model <>", value, "scanModel");
            return (Criteria) this;
        }

        public Criteria andScanModelGreaterThan(Integer value) {
            addCriterion("scan_model >", value, "scanModel");
            return (Criteria) this;
        }

        public Criteria andScanModelGreaterThanOrEqualTo(Integer value) {
            addCriterion("scan_model >=", value, "scanModel");
            return (Criteria) this;
        }

        public Criteria andScanModelLessThan(Integer value) {
            addCriterion("scan_model <", value, "scanModel");
            return (Criteria) this;
        }

        public Criteria andScanModelLessThanOrEqualTo(Integer value) {
            addCriterion("scan_model <=", value, "scanModel");
            return (Criteria) this;
        }

        public Criteria andScanModelIn(List<Integer> values) {
            addCriterion("scan_model in", values, "scanModel");
            return (Criteria) this;
        }

        public Criteria andScanModelNotIn(List<Integer> values) {
            addCriterion("scan_model not in", values, "scanModel");
            return (Criteria) this;
        }

        public Criteria andScanModelBetween(Integer value1, Integer value2) {
            addCriterion("scan_model between", value1, value2, "scanModel");
            return (Criteria) this;
        }

        public Criteria andScanModelNotBetween(Integer value1, Integer value2) {
            addCriterion("scan_model not between", value1, value2, "scanModel");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNull() {
            addCriterion("radius is null");
            return (Criteria) this;
        }

        public Criteria andRadiusIsNotNull() {
            addCriterion("radius is not null");
            return (Criteria) this;
        }

        public Criteria andRadiusEqualTo(Double value) {
            addCriterion("radius =", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotEqualTo(Double value) {
            addCriterion("radius <>", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThan(Double value) {
            addCriterion("radius >", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusGreaterThanOrEqualTo(Double value) {
            addCriterion("radius >=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThan(Double value) {
            addCriterion("radius <", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusLessThanOrEqualTo(Double value) {
            addCriterion("radius <=", value, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusIn(List<Double> values) {
            addCriterion("radius in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotIn(List<Double> values) {
            addCriterion("radius not in", values, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusBetween(Double value1, Double value2) {
            addCriterion("radius between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRadiusNotBetween(Double value1, Double value2) {
            addCriterion("radius not between", value1, value2, "radius");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumIsNull() {
            addCriterion("sub_code_num is null");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumIsNotNull() {
            addCriterion("sub_code_num is not null");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumEqualTo(Integer value) {
            addCriterion("sub_code_num =", value, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumNotEqualTo(Integer value) {
            addCriterion("sub_code_num <>", value, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumGreaterThan(Integer value) {
            addCriterion("sub_code_num >", value, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("sub_code_num >=", value, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumLessThan(Integer value) {
            addCriterion("sub_code_num <", value, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumLessThanOrEqualTo(Integer value) {
            addCriterion("sub_code_num <=", value, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumIn(List<Integer> values) {
            addCriterion("sub_code_num in", values, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumNotIn(List<Integer> values) {
            addCriterion("sub_code_num not in", values, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumBetween(Integer value1, Integer value2) {
            addCriterion("sub_code_num between", value1, value2, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andSubCodeNumNotBetween(Integer value1, Integer value2) {
            addCriterion("sub_code_num not between", value1, value2, "subCodeNum");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagIsNull() {
            addCriterion("customer_show_flag is null");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagIsNotNull() {
            addCriterion("customer_show_flag is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagEqualTo(Integer value) {
            addCriterion("customer_show_flag =", value, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagNotEqualTo(Integer value) {
            addCriterion("customer_show_flag <>", value, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagGreaterThan(Integer value) {
            addCriterion("customer_show_flag >", value, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_show_flag >=", value, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagLessThan(Integer value) {
            addCriterion("customer_show_flag <", value, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagLessThanOrEqualTo(Integer value) {
            addCriterion("customer_show_flag <=", value, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagIn(List<Integer> values) {
            addCriterion("customer_show_flag in", values, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagNotIn(List<Integer> values) {
            addCriterion("customer_show_flag not in", values, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagBetween(Integer value1, Integer value2) {
            addCriterion("customer_show_flag between", value1, value2, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andCustomerShowFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_show_flag not between", value1, value2, "customerShowFlag");
            return (Criteria) this;
        }

        public Criteria andQualityIdIsNull() {
            addCriterion("quality_id is null");
            return (Criteria) this;
        }

        public Criteria andQualityIdIsNotNull() {
            addCriterion("quality_id is not null");
            return (Criteria) this;
        }

        public Criteria andQualityIdEqualTo(Long value) {
            addCriterion("quality_id =", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdNotEqualTo(Long value) {
            addCriterion("quality_id <>", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdGreaterThan(Long value) {
            addCriterion("quality_id >", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("quality_id >=", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdLessThan(Long value) {
            addCriterion("quality_id <", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdLessThanOrEqualTo(Long value) {
            addCriterion("quality_id <=", value, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdIn(List<Long> values) {
            addCriterion("quality_id in", values, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdNotIn(List<Long> values) {
            addCriterion("quality_id not in", values, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdBetween(Long value1, Long value2) {
            addCriterion("quality_id between", value1, value2, "qualityId");
            return (Criteria) this;
        }

        public Criteria andQualityIdNotBetween(Long value1, Long value2) {
            addCriterion("quality_id not between", value1, value2, "qualityId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}