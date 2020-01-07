package com.jsu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbCommentExample() {
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

        public Criteria andCmtIdIsNull() {
            addCriterion("cmt_id is null");
            return (Criteria) this;
        }

        public Criteria andCmtIdIsNotNull() {
            addCriterion("cmt_id is not null");
            return (Criteria) this;
        }

        public Criteria andCmtIdEqualTo(Integer value) {
            addCriterion("cmt_id =", value, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtIdNotEqualTo(Integer value) {
            addCriterion("cmt_id <>", value, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtIdGreaterThan(Integer value) {
            addCriterion("cmt_id >", value, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmt_id >=", value, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtIdLessThan(Integer value) {
            addCriterion("cmt_id <", value, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtIdLessThanOrEqualTo(Integer value) {
            addCriterion("cmt_id <=", value, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtIdIn(List<Integer> values) {
            addCriterion("cmt_id in", values, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtIdNotIn(List<Integer> values) {
            addCriterion("cmt_id not in", values, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtIdBetween(Integer value1, Integer value2) {
            addCriterion("cmt_id between", value1, value2, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cmt_id not between", value1, value2, "cmtId");
            return (Criteria) this;
        }

        public Criteria andCmtContentIsNull() {
            addCriterion("cmt_content is null");
            return (Criteria) this;
        }

        public Criteria andCmtContentIsNotNull() {
            addCriterion("cmt_content is not null");
            return (Criteria) this;
        }

        public Criteria andCmtContentEqualTo(String value) {
            addCriterion("cmt_content =", value, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentNotEqualTo(String value) {
            addCriterion("cmt_content <>", value, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentGreaterThan(String value) {
            addCriterion("cmt_content >", value, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentGreaterThanOrEqualTo(String value) {
            addCriterion("cmt_content >=", value, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentLessThan(String value) {
            addCriterion("cmt_content <", value, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentLessThanOrEqualTo(String value) {
            addCriterion("cmt_content <=", value, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentLike(String value) {
            addCriterion("cmt_content like", value, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentNotLike(String value) {
            addCriterion("cmt_content not like", value, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentIn(List<String> values) {
            addCriterion("cmt_content in", values, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentNotIn(List<String> values) {
            addCriterion("cmt_content not in", values, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentBetween(String value1, String value2) {
            addCriterion("cmt_content between", value1, value2, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtContentNotBetween(String value1, String value2) {
            addCriterion("cmt_content not between", value1, value2, "cmtContent");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeIsNull() {
            addCriterion("cmt_create_time is null");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeIsNotNull() {
            addCriterion("cmt_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeEqualTo(Date value) {
            addCriterion("cmt_create_time =", value, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeNotEqualTo(Date value) {
            addCriterion("cmt_create_time <>", value, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeGreaterThan(Date value) {
            addCriterion("cmt_create_time >", value, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cmt_create_time >=", value, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeLessThan(Date value) {
            addCriterion("cmt_create_time <", value, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("cmt_create_time <=", value, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeIn(List<Date> values) {
            addCriterion("cmt_create_time in", values, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeNotIn(List<Date> values) {
            addCriterion("cmt_create_time not in", values, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeBetween(Date value1, Date value2) {
            addCriterion("cmt_create_time between", value1, value2, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("cmt_create_time not between", value1, value2, "cmtCreateTime");
            return (Criteria) this;
        }

        public Criteria andCmtStatusIsNull() {
            addCriterion("cmt_status is null");
            return (Criteria) this;
        }

        public Criteria andCmtStatusIsNotNull() {
            addCriterion("cmt_status is not null");
            return (Criteria) this;
        }

        public Criteria andCmtStatusEqualTo(Integer value) {
            addCriterion("cmt_status =", value, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtStatusNotEqualTo(Integer value) {
            addCriterion("cmt_status <>", value, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtStatusGreaterThan(Integer value) {
            addCriterion("cmt_status >", value, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmt_status >=", value, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtStatusLessThan(Integer value) {
            addCriterion("cmt_status <", value, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtStatusLessThanOrEqualTo(Integer value) {
            addCriterion("cmt_status <=", value, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtStatusIn(List<Integer> values) {
            addCriterion("cmt_status in", values, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtStatusNotIn(List<Integer> values) {
            addCriterion("cmt_status not in", values, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtStatusBetween(Integer value1, Integer value2) {
            addCriterion("cmt_status between", value1, value2, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("cmt_status not between", value1, value2, "cmtStatus");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeIsNull() {
            addCriterion("cmt_reply_type is null");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeIsNotNull() {
            addCriterion("cmt_reply_type is not null");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeEqualTo(Integer value) {
            addCriterion("cmt_reply_type =", value, "cmtReplyType");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeNotEqualTo(Integer value) {
            addCriterion("cmt_reply_type <>", value, "cmtReplyType");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeGreaterThan(Integer value) {
            addCriterion("cmt_reply_type >", value, "cmtReplyType");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cmt_reply_type >=", value, "cmtReplyType");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeLessThan(Integer value) {
            addCriterion("cmt_reply_type <", value, "cmtReplyType");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeLessThanOrEqualTo(Integer value) {
            addCriterion("cmt_reply_type <=", value, "cmtReplyType");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeIn(List<Integer> values) {
            addCriterion("cmt_reply_type in", values, "cmtReplyType");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeNotIn(List<Integer> values) {
            addCriterion("cmt_reply_type not in", values, "cmtReplyType");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeBetween(Integer value1, Integer value2) {
            addCriterion("cmt_reply_type between", value1, value2, "cmtReplyType");
            return (Criteria) this;
        }

        public Criteria andCmtReplyTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("cmt_reply_type not between", value1, value2, "cmtReplyType");
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

        public Criteria andReplyIdIsNull() {
            addCriterion("reply_id is null");
            return (Criteria) this;
        }

        public Criteria andReplyIdIsNotNull() {
            addCriterion("reply_id is not null");
            return (Criteria) this;
        }

        public Criteria andReplyIdEqualTo(Integer value) {
            addCriterion("reply_id =", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotEqualTo(Integer value) {
            addCriterion("reply_id <>", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThan(Integer value) {
            addCriterion("reply_id >", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reply_id >=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThan(Integer value) {
            addCriterion("reply_id <", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdLessThanOrEqualTo(Integer value) {
            addCriterion("reply_id <=", value, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdIn(List<Integer> values) {
            addCriterion("reply_id in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotIn(List<Integer> values) {
            addCriterion("reply_id not in", values, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdBetween(Integer value1, Integer value2) {
            addCriterion("reply_id between", value1, value2, "replyId");
            return (Criteria) this;
        }

        public Criteria andReplyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reply_id not between", value1, value2, "replyId");
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