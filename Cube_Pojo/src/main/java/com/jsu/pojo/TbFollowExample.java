package com.jsu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbFollowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFollowExample() {
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

        public Criteria andFlIdIsNull() {
            addCriterion("fl_id is null");
            return (Criteria) this;
        }

        public Criteria andFlIdIsNotNull() {
            addCriterion("fl_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlIdEqualTo(Integer value) {
            addCriterion("fl_id =", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdNotEqualTo(Integer value) {
            addCriterion("fl_id <>", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdGreaterThan(Integer value) {
            addCriterion("fl_id >", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fl_id >=", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdLessThan(Integer value) {
            addCriterion("fl_id <", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdLessThanOrEqualTo(Integer value) {
            addCriterion("fl_id <=", value, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdIn(List<Integer> values) {
            addCriterion("fl_id in", values, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdNotIn(List<Integer> values) {
            addCriterion("fl_id not in", values, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdBetween(Integer value1, Integer value2) {
            addCriterion("fl_id between", value1, value2, "flId");
            return (Criteria) this;
        }

        public Criteria andFlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fl_id not between", value1, value2, "flId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdIsNull() {
            addCriterion("fl_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFlUserIdIsNotNull() {
            addCriterion("fl_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlUserIdEqualTo(Integer value) {
            addCriterion("fl_user_id =", value, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdNotEqualTo(Integer value) {
            addCriterion("fl_user_id <>", value, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdGreaterThan(Integer value) {
            addCriterion("fl_user_id >", value, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fl_user_id >=", value, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdLessThan(Integer value) {
            addCriterion("fl_user_id <", value, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("fl_user_id <=", value, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdIn(List<Integer> values) {
            addCriterion("fl_user_id in", values, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdNotIn(List<Integer> values) {
            addCriterion("fl_user_id not in", values, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdBetween(Integer value1, Integer value2) {
            addCriterion("fl_user_id between", value1, value2, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fl_user_id not between", value1, value2, "flUserId");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeIsNull() {
            addCriterion("fl_create_time is null");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeIsNotNull() {
            addCriterion("fl_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeEqualTo(Date value) {
            addCriterion("fl_create_time =", value, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeNotEqualTo(Date value) {
            addCriterion("fl_create_time <>", value, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeGreaterThan(Date value) {
            addCriterion("fl_create_time >", value, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fl_create_time >=", value, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeLessThan(Date value) {
            addCriterion("fl_create_time <", value, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("fl_create_time <=", value, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeIn(List<Date> values) {
            addCriterion("fl_create_time in", values, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeNotIn(List<Date> values) {
            addCriterion("fl_create_time not in", values, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeBetween(Date value1, Date value2) {
            addCriterion("fl_create_time between", value1, value2, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFlCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("fl_create_time not between", value1, value2, "flCreateTime");
            return (Criteria) this;
        }

        public Criteria andFledUserIdIsNull() {
            addCriterion("fled_user_id is null");
            return (Criteria) this;
        }

        public Criteria andFledUserIdIsNotNull() {
            addCriterion("fled_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andFledUserIdEqualTo(Integer value) {
            addCriterion("fled_user_id =", value, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFledUserIdNotEqualTo(Integer value) {
            addCriterion("fled_user_id <>", value, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFledUserIdGreaterThan(Integer value) {
            addCriterion("fled_user_id >", value, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFledUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("fled_user_id >=", value, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFledUserIdLessThan(Integer value) {
            addCriterion("fled_user_id <", value, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFledUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("fled_user_id <=", value, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFledUserIdIn(List<Integer> values) {
            addCriterion("fled_user_id in", values, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFledUserIdNotIn(List<Integer> values) {
            addCriterion("fled_user_id not in", values, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFledUserIdBetween(Integer value1, Integer value2) {
            addCriterion("fled_user_id between", value1, value2, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFledUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("fled_user_id not between", value1, value2, "fledUserId");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeIsNull() {
            addCriterion("fl_interact_time is null");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeIsNotNull() {
            addCriterion("fl_interact_time is not null");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeEqualTo(Date value) {
            addCriterion("fl_interact_time =", value, "flInteractTime");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeNotEqualTo(Date value) {
            addCriterion("fl_interact_time <>", value, "flInteractTime");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeGreaterThan(Date value) {
            addCriterion("fl_interact_time >", value, "flInteractTime");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("fl_interact_time >=", value, "flInteractTime");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeLessThan(Date value) {
            addCriterion("fl_interact_time <", value, "flInteractTime");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeLessThanOrEqualTo(Date value) {
            addCriterion("fl_interact_time <=", value, "flInteractTime");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeIn(List<Date> values) {
            addCriterion("fl_interact_time in", values, "flInteractTime");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeNotIn(List<Date> values) {
            addCriterion("fl_interact_time not in", values, "flInteractTime");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeBetween(Date value1, Date value2) {
            addCriterion("fl_interact_time between", value1, value2, "flInteractTime");
            return (Criteria) this;
        }

        public Criteria andFlInteractTimeNotBetween(Date value1, Date value2) {
            addCriterion("fl_interact_time not between", value1, value2, "flInteractTime");
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