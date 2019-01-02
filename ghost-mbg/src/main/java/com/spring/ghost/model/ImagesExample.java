package com.spring.ghost.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ImagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImagesExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNull() {
            addCriterion("image_name is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("image_name is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("image_name =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("image_name <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("image_name >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("image_name >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("image_name <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("image_name <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("image_name like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("image_name not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("image_name in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("image_name not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("image_name between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("image_name not between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageTagIsNull() {
            addCriterion("image_tag is null");
            return (Criteria) this;
        }

        public Criteria andImageTagIsNotNull() {
            addCriterion("image_tag is not null");
            return (Criteria) this;
        }

        public Criteria andImageTagEqualTo(String value) {
            addCriterion("image_tag =", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagNotEqualTo(String value) {
            addCriterion("image_tag <>", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagGreaterThan(String value) {
            addCriterion("image_tag >", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagGreaterThanOrEqualTo(String value) {
            addCriterion("image_tag >=", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagLessThan(String value) {
            addCriterion("image_tag <", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagLessThanOrEqualTo(String value) {
            addCriterion("image_tag <=", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagLike(String value) {
            addCriterion("image_tag like", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagNotLike(String value) {
            addCriterion("image_tag not like", value, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagIn(List<String> values) {
            addCriterion("image_tag in", values, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagNotIn(List<String> values) {
            addCriterion("image_tag not in", values, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagBetween(String value1, String value2) {
            addCriterion("image_tag between", value1, value2, "imageTag");
            return (Criteria) this;
        }

        public Criteria andImageTagNotBetween(String value1, String value2) {
            addCriterion("image_tag not between", value1, value2, "imageTag");
            return (Criteria) this;
        }

        public Criteria andGitBranchIsNull() {
            addCriterion("git_branch is null");
            return (Criteria) this;
        }

        public Criteria andGitBranchIsNotNull() {
            addCriterion("git_branch is not null");
            return (Criteria) this;
        }

        public Criteria andGitBranchEqualTo(String value) {
            addCriterion("git_branch =", value, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchNotEqualTo(String value) {
            addCriterion("git_branch <>", value, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchGreaterThan(String value) {
            addCriterion("git_branch >", value, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchGreaterThanOrEqualTo(String value) {
            addCriterion("git_branch >=", value, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchLessThan(String value) {
            addCriterion("git_branch <", value, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchLessThanOrEqualTo(String value) {
            addCriterion("git_branch <=", value, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchLike(String value) {
            addCriterion("git_branch like", value, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchNotLike(String value) {
            addCriterion("git_branch not like", value, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchIn(List<String> values) {
            addCriterion("git_branch in", values, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchNotIn(List<String> values) {
            addCriterion("git_branch not in", values, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchBetween(String value1, String value2) {
            addCriterion("git_branch between", value1, value2, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitBranchNotBetween(String value1, String value2) {
            addCriterion("git_branch not between", value1, value2, "gitBranch");
            return (Criteria) this;
        }

        public Criteria andGitMessageIsNull() {
            addCriterion("git_message is null");
            return (Criteria) this;
        }

        public Criteria andGitMessageIsNotNull() {
            addCriterion("git_message is not null");
            return (Criteria) this;
        }

        public Criteria andGitMessageEqualTo(String value) {
            addCriterion("git_message =", value, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageNotEqualTo(String value) {
            addCriterion("git_message <>", value, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageGreaterThan(String value) {
            addCriterion("git_message >", value, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageGreaterThanOrEqualTo(String value) {
            addCriterion("git_message >=", value, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageLessThan(String value) {
            addCriterion("git_message <", value, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageLessThanOrEqualTo(String value) {
            addCriterion("git_message <=", value, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageLike(String value) {
            addCriterion("git_message like", value, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageNotLike(String value) {
            addCriterion("git_message not like", value, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageIn(List<String> values) {
            addCriterion("git_message in", values, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageNotIn(List<String> values) {
            addCriterion("git_message not in", values, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageBetween(String value1, String value2) {
            addCriterion("git_message between", value1, value2, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andGitMessageNotBetween(String value1, String value2) {
            addCriterion("git_message not between", value1, value2, "gitMessage");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("host is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("host is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("host =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("host <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("host >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("host >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("host <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("host <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("host like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("host not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("host in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("host not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("host between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("host not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(String value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(String value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(String value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(String value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(String value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(String value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLike(String value) {
            addCriterion("port like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotLike(String value) {
            addCriterion("port not like", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<String> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<String> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(String value1, String value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(String value1, String value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryIsNull() {
            addCriterion("code_registry is null");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryIsNotNull() {
            addCriterion("code_registry is not null");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryEqualTo(String value) {
            addCriterion("code_registry =", value, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryNotEqualTo(String value) {
            addCriterion("code_registry <>", value, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryGreaterThan(String value) {
            addCriterion("code_registry >", value, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryGreaterThanOrEqualTo(String value) {
            addCriterion("code_registry >=", value, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryLessThan(String value) {
            addCriterion("code_registry <", value, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryLessThanOrEqualTo(String value) {
            addCriterion("code_registry <=", value, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryLike(String value) {
            addCriterion("code_registry like", value, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryNotLike(String value) {
            addCriterion("code_registry not like", value, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryIn(List<String> values) {
            addCriterion("code_registry in", values, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryNotIn(List<String> values) {
            addCriterion("code_registry not in", values, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryBetween(String value1, String value2) {
            addCriterion("code_registry between", value1, value2, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andCodeRegistryNotBetween(String value1, String value2) {
            addCriterion("code_registry not between", value1, value2, "codeRegistry");
            return (Criteria) this;
        }

        public Criteria andPullAddressIsNull() {
            addCriterion("pull_address is null");
            return (Criteria) this;
        }

        public Criteria andPullAddressIsNotNull() {
            addCriterion("pull_address is not null");
            return (Criteria) this;
        }

        public Criteria andPullAddressEqualTo(String value) {
            addCriterion("pull_address =", value, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressNotEqualTo(String value) {
            addCriterion("pull_address <>", value, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressGreaterThan(String value) {
            addCriterion("pull_address >", value, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pull_address >=", value, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressLessThan(String value) {
            addCriterion("pull_address <", value, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressLessThanOrEqualTo(String value) {
            addCriterion("pull_address <=", value, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressLike(String value) {
            addCriterion("pull_address like", value, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressNotLike(String value) {
            addCriterion("pull_address not like", value, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressIn(List<String> values) {
            addCriterion("pull_address in", values, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressNotIn(List<String> values) {
            addCriterion("pull_address not in", values, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressBetween(String value1, String value2) {
            addCriterion("pull_address between", value1, value2, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andPullAddressNotBetween(String value1, String value2) {
            addCriterion("pull_address not between", value1, value2, "pullAddress");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(Date value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(Date value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(Date value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(Date value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(Date value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<Date> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<Date> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(Date value1, Date value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(Date value1, Date value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updated_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updated_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(Date value) {
            addCriterion("updated_at =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(Date value) {
            addCriterion("updated_at <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(Date value) {
            addCriterion("updated_at >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_at >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(Date value) {
            addCriterion("updated_at <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(Date value) {
            addCriterion("updated_at <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<Date> values) {
            addCriterion("updated_at in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<Date> values) {
            addCriterion("updated_at not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(Date value1, Date value2) {
            addCriterion("updated_at between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(Date value1, Date value2) {
            addCriterion("updated_at not between", value1, value2, "updatedAt");
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