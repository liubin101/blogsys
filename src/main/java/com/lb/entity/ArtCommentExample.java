package com.lb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArtCommentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArtCommentExample() {
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

        public Criteria andArtidIsNull() {
            addCriterion("ARTID is null");
            return (Criteria) this;
        }

        public Criteria andArtidIsNotNull() {
            addCriterion("ARTID is not null");
            return (Criteria) this;
        }

        public Criteria andArtidEqualTo(Long value) {
            addCriterion("ARTID =", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidNotEqualTo(Long value) {
            addCriterion("ARTID <>", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidGreaterThan(Long value) {
            addCriterion("ARTID >", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidGreaterThanOrEqualTo(Long value) {
            addCriterion("ARTID >=", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidLessThan(Long value) {
            addCriterion("ARTID <", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidLessThanOrEqualTo(Long value) {
            addCriterion("ARTID <=", value, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidIn(List<Long> values) {
            addCriterion("ARTID in", values, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidNotIn(List<Long> values) {
            addCriterion("ARTID not in", values, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidBetween(Long value1, Long value2) {
            addCriterion("ARTID between", value1, value2, "artid");
            return (Criteria) this;
        }

        public Criteria andArtidNotBetween(Long value1, Long value2) {
            addCriterion("ARTID not between", value1, value2, "artid");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCcontentIsNull() {
            addCriterion("CCONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCcontentIsNotNull() {
            addCriterion("CCONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCcontentEqualTo(String value) {
            addCriterion("CCONTENT =", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotEqualTo(String value) {
            addCriterion("CCONTENT <>", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentGreaterThan(String value) {
            addCriterion("CCONTENT >", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentGreaterThanOrEqualTo(String value) {
            addCriterion("CCONTENT >=", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLessThan(String value) {
            addCriterion("CCONTENT <", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLessThanOrEqualTo(String value) {
            addCriterion("CCONTENT <=", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentLike(String value) {
            addCriterion("CCONTENT like", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotLike(String value) {
            addCriterion("CCONTENT not like", value, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentIn(List<String> values) {
            addCriterion("CCONTENT in", values, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotIn(List<String> values) {
            addCriterion("CCONTENT not in", values, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentBetween(String value1, String value2) {
            addCriterion("CCONTENT between", value1, value2, "ccontent");
            return (Criteria) this;
        }

        public Criteria andCcontentNotBetween(String value1, String value2) {
            addCriterion("CCONTENT not between", value1, value2, "ccontent");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNull() {
            addCriterion("LIKENUM is null");
            return (Criteria) this;
        }

        public Criteria andLikenumIsNotNull() {
            addCriterion("LIKENUM is not null");
            return (Criteria) this;
        }

        public Criteria andLikenumEqualTo(Long value) {
            addCriterion("LIKENUM =", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotEqualTo(Long value) {
            addCriterion("LIKENUM <>", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThan(Long value) {
            addCriterion("LIKENUM >", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumGreaterThanOrEqualTo(Long value) {
            addCriterion("LIKENUM >=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThan(Long value) {
            addCriterion("LIKENUM <", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumLessThanOrEqualTo(Long value) {
            addCriterion("LIKENUM <=", value, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumIn(List<Long> values) {
            addCriterion("LIKENUM in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotIn(List<Long> values) {
            addCriterion("LIKENUM not in", values, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumBetween(Long value1, Long value2) {
            addCriterion("LIKENUM between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andLikenumNotBetween(Long value1, Long value2) {
            addCriterion("LIKENUM not between", value1, value2, "likenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumIsNull() {
            addCriterion("DISLIKENUM is null");
            return (Criteria) this;
        }

        public Criteria andDislikenumIsNotNull() {
            addCriterion("DISLIKENUM is not null");
            return (Criteria) this;
        }

        public Criteria andDislikenumEqualTo(Long value) {
            addCriterion("DISLIKENUM =", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumNotEqualTo(Long value) {
            addCriterion("DISLIKENUM <>", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumGreaterThan(Long value) {
            addCriterion("DISLIKENUM >", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumGreaterThanOrEqualTo(Long value) {
            addCriterion("DISLIKENUM >=", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumLessThan(Long value) {
            addCriterion("DISLIKENUM <", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumLessThanOrEqualTo(Long value) {
            addCriterion("DISLIKENUM <=", value, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumIn(List<Long> values) {
            addCriterion("DISLIKENUM in", values, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumNotIn(List<Long> values) {
            addCriterion("DISLIKENUM not in", values, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumBetween(Long value1, Long value2) {
            addCriterion("DISLIKENUM between", value1, value2, "dislikenum");
            return (Criteria) this;
        }

        public Criteria andDislikenumNotBetween(Long value1, Long value2) {
            addCriterion("DISLIKENUM not between", value1, value2, "dislikenum");
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