package com.jsu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbBlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbBlogExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNull() {
            addCriterion("blog_content is null");
            return (Criteria) this;
        }

        public Criteria andBlogContentIsNotNull() {
            addCriterion("blog_content is not null");
            return (Criteria) this;
        }

        public Criteria andBlogContentEqualTo(String value) {
            addCriterion("blog_content =", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotEqualTo(String value) {
            addCriterion("blog_content <>", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThan(String value) {
            addCriterion("blog_content >", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentGreaterThanOrEqualTo(String value) {
            addCriterion("blog_content >=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThan(String value) {
            addCriterion("blog_content <", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLessThanOrEqualTo(String value) {
            addCriterion("blog_content <=", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentLike(String value) {
            addCriterion("blog_content like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotLike(String value) {
            addCriterion("blog_content not like", value, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentIn(List<String> values) {
            addCriterion("blog_content in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotIn(List<String> values) {
            addCriterion("blog_content not in", values, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentBetween(String value1, String value2) {
            addCriterion("blog_content between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogContentNotBetween(String value1, String value2) {
            addCriterion("blog_content not between", value1, value2, "blogContent");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIsNull() {
            addCriterion("blog_type is null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIsNotNull() {
            addCriterion("blog_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeEqualTo(Integer value) {
            addCriterion("blog_type =", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotEqualTo(Integer value) {
            addCriterion("blog_type <>", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeGreaterThan(Integer value) {
            addCriterion("blog_type >", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_type >=", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLessThan(Integer value) {
            addCriterion("blog_type <", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("blog_type <=", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIn(List<Integer> values) {
            addCriterion("blog_type in", values, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotIn(List<Integer> values) {
            addCriterion("blog_type not in", values, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeBetween(Integer value1, Integer value2) {
            addCriterion("blog_type between", value1, value2, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_type not between", value1, value2, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeIsNull() {
            addCriterion("blog_create_time is null");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeIsNotNull() {
            addCriterion("blog_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeEqualTo(Date value) {
            addCriterion("blog_create_time =", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeNotEqualTo(Date value) {
            addCriterion("blog_create_time <>", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeGreaterThan(Date value) {
            addCriterion("blog_create_time >", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_create_time >=", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeLessThan(Date value) {
            addCriterion("blog_create_time <", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_create_time <=", value, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeIn(List<Date> values) {
            addCriterion("blog_create_time in", values, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeNotIn(List<Date> values) {
            addCriterion("blog_create_time not in", values, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeBetween(Date value1, Date value2) {
            addCriterion("blog_create_time between", value1, value2, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_create_time not between", value1, value2, "blogCreateTime");
            return (Criteria) this;
        }

        public Criteria andBlogStatusIsNull() {
            addCriterion("blog_status is null");
            return (Criteria) this;
        }

        public Criteria andBlogStatusIsNotNull() {
            addCriterion("blog_status is not null");
            return (Criteria) this;
        }

        public Criteria andBlogStatusEqualTo(Integer value) {
            addCriterion("blog_status =", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusNotEqualTo(Integer value) {
            addCriterion("blog_status <>", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusGreaterThan(Integer value) {
            addCriterion("blog_status >", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_status >=", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusLessThan(Integer value) {
            addCriterion("blog_status <", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusLessThanOrEqualTo(Integer value) {
            addCriterion("blog_status <=", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusIn(List<Integer> values) {
            addCriterion("blog_status in", values, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusNotIn(List<Integer> values) {
            addCriterion("blog_status not in", values, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusBetween(Integer value1, Integer value2) {
            addCriterion("blog_status between", value1, value2, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_status not between", value1, value2, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeIsNull() {
            addCriterion("blog_pub_type is null");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeIsNotNull() {
            addCriterion("blog_pub_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeEqualTo(Integer value) {
            addCriterion("blog_pub_type =", value, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeNotEqualTo(Integer value) {
            addCriterion("blog_pub_type <>", value, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeGreaterThan(Integer value) {
            addCriterion("blog_pub_type >", value, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_pub_type >=", value, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeLessThan(Integer value) {
            addCriterion("blog_pub_type <", value, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeLessThanOrEqualTo(Integer value) {
            addCriterion("blog_pub_type <=", value, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeIn(List<Integer> values) {
            addCriterion("blog_pub_type in", values, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeNotIn(List<Integer> values) {
            addCriterion("blog_pub_type not in", values, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeBetween(Integer value1, Integer value2) {
            addCriterion("blog_pub_type between", value1, value2, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogPubTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_pub_type not between", value1, value2, "blogPubType");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeIsNull() {
            addCriterion("blog_send_time is null");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeIsNotNull() {
            addCriterion("blog_send_time is not null");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeEqualTo(Date value) {
            addCriterion("blog_send_time =", value, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeNotEqualTo(Date value) {
            addCriterion("blog_send_time <>", value, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeGreaterThan(Date value) {
            addCriterion("blog_send_time >", value, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("blog_send_time >=", value, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeLessThan(Date value) {
            addCriterion("blog_send_time <", value, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("blog_send_time <=", value, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeIn(List<Date> values) {
            addCriterion("blog_send_time in", values, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeNotIn(List<Date> values) {
            addCriterion("blog_send_time not in", values, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeBetween(Date value1, Date value2) {
            addCriterion("blog_send_time between", value1, value2, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andBlogSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("blog_send_time not between", value1, value2, "blogSendTime");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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