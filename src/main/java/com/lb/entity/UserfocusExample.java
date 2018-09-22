package com.lb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserfocusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserfocusExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andBeuseridIsNull() {
            addCriterion("BEUSERID is null");
            return (Criteria) this;
        }

        public Criteria andBeuseridIsNotNull() {
            addCriterion("BEUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andBeuseridEqualTo(Long value) {
            addCriterion("BEUSERID =", value, "beuserid");
            return (Criteria) this;
        }

        public Criteria andBeuseridNotEqualTo(Long value) {
            addCriterion("BEUSERID <>", value, "beuserid");
            return (Criteria) this;
        }

        public Criteria andBeuseridGreaterThan(Long value) {
            addCriterion("BEUSERID >", value, "beuserid");
            return (Criteria) this;
        }

        public Criteria andBeuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("BEUSERID >=", value, "beuserid");
            return (Criteria) this;
        }

        public Criteria andBeuseridLessThan(Long value) {
            addCriterion("BEUSERID <", value, "beuserid");
            return (Criteria) this;
        }

        public Criteria andBeuseridLessThanOrEqualTo(Long value) {
            addCriterion("BEUSERID <=", value, "beuserid");
            return (Criteria) this;
        }

        public Criteria andBeuseridIn(List<Long> values) {
            addCriterion("BEUSERID in", values, "beuserid");
            return (Criteria) this;
        }

        public Criteria andBeuseridNotIn(List<Long> values) {
            addCriterion("BEUSERID not in", values, "beuserid");
            return (Criteria) this;
        }

        public Criteria andBeuseridBetween(Long value1, Long value2) {
            addCriterion("BEUSERID between", value1, value2, "beuserid");
            return (Criteria) this;
        }

        public Criteria andBeuseridNotBetween(Long value1, Long value2) {
            addCriterion("BEUSERID not between", value1, value2, "beuserid");
            return (Criteria) this;
        }

        public Criteria andFocustimeIsNull() {
            addCriterion("FOCUSTIME is null");
            return (Criteria) this;
        }

        public Criteria andFocustimeIsNotNull() {
            addCriterion("FOCUSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andFocustimeEqualTo(Date value) {
            addCriterion("FOCUSTIME =", value, "focustime");
            return (Criteria) this;
        }

        public Criteria andFocustimeNotEqualTo(Date value) {
            addCriterion("FOCUSTIME <>", value, "focustime");
            return (Criteria) this;
        }

        public Criteria andFocustimeGreaterThan(Date value) {
            addCriterion("FOCUSTIME >", value, "focustime");
            return (Criteria) this;
        }

        public Criteria andFocustimeGreaterThanOrEqualTo(Date value) {
            addCriterion("FOCUSTIME >=", value, "focustime");
            return (Criteria) this;
        }

        public Criteria andFocustimeLessThan(Date value) {
            addCriterion("FOCUSTIME <", value, "focustime");
            return (Criteria) this;
        }

        public Criteria andFocustimeLessThanOrEqualTo(Date value) {
            addCriterion("FOCUSTIME <=", value, "focustime");
            return (Criteria) this;
        }

        public Criteria andFocustimeIn(List<Date> values) {
            addCriterion("FOCUSTIME in", values, "focustime");
            return (Criteria) this;
        }

        public Criteria andFocustimeNotIn(List<Date> values) {
            addCriterion("FOCUSTIME not in", values, "focustime");
            return (Criteria) this;
        }

        public Criteria andFocustimeBetween(Date value1, Date value2) {
            addCriterion("FOCUSTIME between", value1, value2, "focustime");
            return (Criteria) this;
        }

        public Criteria andFocustimeNotBetween(Date value1, Date value2) {
            addCriterion("FOCUSTIME not between", value1, value2, "focustime");
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