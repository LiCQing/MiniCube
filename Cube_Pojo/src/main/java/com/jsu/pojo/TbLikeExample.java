package com.jsu.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbLikeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbLikeExample() {
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

        public Criteria andLkIdIsNull() {
            addCriterion("lk_id is null");
            return (Criteria) this;
        }

        public Criteria andLkIdIsNotNull() {
            addCriterion("lk_id is not null");
            return (Criteria) this;
        }

        public Criteria andLkIdEqualTo(Integer value) {
            addCriterion("lk_id =", value, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkIdNotEqualTo(Integer value) {
            addCriterion("lk_id <>", value, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkIdGreaterThan(Integer value) {
            addCriterion("lk_id >", value, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("lk_id >=", value, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkIdLessThan(Integer value) {
            addCriterion("lk_id <", value, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkIdLessThanOrEqualTo(Integer value) {
            addCriterion("lk_id <=", value, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkIdIn(List<Integer> values) {
            addCriterion("lk_id in", values, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkIdNotIn(List<Integer> values) {
            addCriterion("lk_id not in", values, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkIdBetween(Integer value1, Integer value2) {
            addCriterion("lk_id between", value1, value2, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("lk_id not between", value1, value2, "lkId");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeIsNull() {
            addCriterion("lk_create_time is null");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeIsNotNull() {
            addCriterion("lk_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeEqualTo(Date value) {
            addCriterion("lk_create_time =", value, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeNotEqualTo(Date value) {
            addCriterion("lk_create_time <>", value, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeGreaterThan(Date value) {
            addCriterion("lk_create_time >", value, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("lk_create_time >=", value, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeLessThan(Date value) {
            addCriterion("lk_create_time <", value, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("lk_create_time <=", value, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeIn(List<Date> values) {
            addCriterion("lk_create_time in", values, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeNotIn(List<Date> values) {
            addCriterion("lk_create_time not in", values, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeBetween(Date value1, Date value2) {
            addCriterion("lk_create_time between", value1, value2, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("lk_create_time not between", value1, value2, "lkCreateTime");
            return (Criteria) this;
        }

        public Criteria andLkTypeIsNull() {
            addCriterion("lk_type is null");
            return (Criteria) this;
        }

        public Criteria andLkTypeIsNotNull() {
            addCriterion("lk_type is not null");
            return (Criteria) this;
        }

        public Criteria andLkTypeEqualTo(Integer value) {
            addCriterion("lk_type =", value, "lkType");
            return (Criteria) this;
        }

        public Criteria andLkTypeNotEqualTo(Integer value) {
            addCriterion("lk_type <>", value, "lkType");
            return (Criteria) this;
        }

        public Criteria andLkTypeGreaterThan(Integer value) {
            addCriterion("lk_type >", value, "lkType");
            return (Criteria) this;
        }

        public Criteria andLkTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("lk_type >=", value, "lkType");
            return (Criteria) this;
        }

        public Criteria andLkTypeLessThan(Integer value) {
            addCriterion("lk_type <", value, "lkType");
            return (Criteria) this;
        }

        public Criteria andLkTypeLessThanOrEqualTo(Integer value) {
            addCriterion("lk_type <=", value, "lkType");
            return (Criteria) this;
        }

        public Criteria andLkTypeIn(List<Integer> values) {
            addCriterion("lk_type in", values, "lkType");
            return (Criteria) this;
        }

        public Criteria andLkTypeNotIn(List<Integer> values) {
            addCriterion("lk_type not in", values, "lkType");
            return (Criteria) this;
        }

        public Criteria andLkTypeBetween(Integer value1, Integer value2) {
            addCriterion("lk_type between", value1, value2, "lkType");
            return (Criteria) this;
        }

        public Criteria andLkTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("lk_type not between", value1, value2, "lkType");
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

        public Criteria andLikedIdIsNull() {
            addCriterion("liked_id is null");
            return (Criteria) this;
        }

        public Criteria andLikedIdIsNotNull() {
            addCriterion("liked_id is not null");
            return (Criteria) this;
        }

        public Criteria andLikedIdEqualTo(Integer value) {
            addCriterion("liked_id =", value, "likedId");
            return (Criteria) this;
        }

        public Criteria andLikedIdNotEqualTo(Integer value) {
            addCriterion("liked_id <>", value, "likedId");
            return (Criteria) this;
        }

        public Criteria andLikedIdGreaterThan(Integer value) {
            addCriterion("liked_id >", value, "likedId");
            return (Criteria) this;
        }

        public Criteria andLikedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("liked_id >=", value, "likedId");
            return (Criteria) this;
        }

        public Criteria andLikedIdLessThan(Integer value) {
            addCriterion("liked_id <", value, "likedId");
            return (Criteria) this;
        }

        public Criteria andLikedIdLessThanOrEqualTo(Integer value) {
            addCriterion("liked_id <=", value, "likedId");
            return (Criteria) this;
        }

        public Criteria andLikedIdIn(List<Integer> values) {
            addCriterion("liked_id in", values, "likedId");
            return (Criteria) this;
        }

        public Criteria andLikedIdNotIn(List<Integer> values) {
            addCriterion("liked_id not in", values, "likedId");
            return (Criteria) this;
        }

        public Criteria andLikedIdBetween(Integer value1, Integer value2) {
            addCriterion("liked_id between", value1, value2, "likedId");
            return (Criteria) this;
        }

        public Criteria andLikedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("liked_id not between", value1, value2, "likedId");
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