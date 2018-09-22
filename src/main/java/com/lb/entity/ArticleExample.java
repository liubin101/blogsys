package com.lb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ArticleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ArticleExample() {
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

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
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

        public Criteria andLooknumIsNull() {
            addCriterion("LOOKNUM is null");
            return (Criteria) this;
        }

        public Criteria andLooknumIsNotNull() {
            addCriterion("LOOKNUM is not null");
            return (Criteria) this;
        }

        public Criteria andLooknumEqualTo(Long value) {
            addCriterion("LOOKNUM =", value, "looknum");
            return (Criteria) this;
        }

        public Criteria andLooknumNotEqualTo(Long value) {
            addCriterion("LOOKNUM <>", value, "looknum");
            return (Criteria) this;
        }

        public Criteria andLooknumGreaterThan(Long value) {
            addCriterion("LOOKNUM >", value, "looknum");
            return (Criteria) this;
        }

        public Criteria andLooknumGreaterThanOrEqualTo(Long value) {
            addCriterion("LOOKNUM >=", value, "looknum");
            return (Criteria) this;
        }

        public Criteria andLooknumLessThan(Long value) {
            addCriterion("LOOKNUM <", value, "looknum");
            return (Criteria) this;
        }

        public Criteria andLooknumLessThanOrEqualTo(Long value) {
            addCriterion("LOOKNUM <=", value, "looknum");
            return (Criteria) this;
        }

        public Criteria andLooknumIn(List<Long> values) {
            addCriterion("LOOKNUM in", values, "looknum");
            return (Criteria) this;
        }

        public Criteria andLooknumNotIn(List<Long> values) {
            addCriterion("LOOKNUM not in", values, "looknum");
            return (Criteria) this;
        }

        public Criteria andLooknumBetween(Long value1, Long value2) {
            addCriterion("LOOKNUM between", value1, value2, "looknum");
            return (Criteria) this;
        }

        public Criteria andLooknumNotBetween(Long value1, Long value2) {
            addCriterion("LOOKNUM not between", value1, value2, "looknum");
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

        public Criteria andCommentsnumIsNull() {
            addCriterion("COMMENTSNUM is null");
            return (Criteria) this;
        }

        public Criteria andCommentsnumIsNotNull() {
            addCriterion("COMMENTSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsnumEqualTo(Long value) {
            addCriterion("COMMENTSNUM =", value, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andCommentsnumNotEqualTo(Long value) {
            addCriterion("COMMENTSNUM <>", value, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andCommentsnumGreaterThan(Long value) {
            addCriterion("COMMENTSNUM >", value, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andCommentsnumGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENTSNUM >=", value, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andCommentsnumLessThan(Long value) {
            addCriterion("COMMENTSNUM <", value, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andCommentsnumLessThanOrEqualTo(Long value) {
            addCriterion("COMMENTSNUM <=", value, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andCommentsnumIn(List<Long> values) {
            addCriterion("COMMENTSNUM in", values, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andCommentsnumNotIn(List<Long> values) {
            addCriterion("COMMENTSNUM not in", values, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andCommentsnumBetween(Long value1, Long value2) {
            addCriterion("COMMENTSNUM between", value1, value2, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andCommentsnumNotBetween(Long value1, Long value2) {
            addCriterion("COMMENTSNUM not between", value1, value2, "commentsnum");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNull() {
            addCriterion("ISCHECKED is null");
            return (Criteria) this;
        }

        public Criteria andIscheckedIsNotNull() {
            addCriterion("ISCHECKED is not null");
            return (Criteria) this;
        }

        public Criteria andIscheckedEqualTo(Short value) {
            addCriterion("ISCHECKED =", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotEqualTo(Short value) {
            addCriterion("ISCHECKED <>", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThan(Short value) {
            addCriterion("ISCHECKED >", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedGreaterThanOrEqualTo(Short value) {
            addCriterion("ISCHECKED >=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThan(Short value) {
            addCriterion("ISCHECKED <", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedLessThanOrEqualTo(Short value) {
            addCriterion("ISCHECKED <=", value, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedIn(List<Short> values) {
            addCriterion("ISCHECKED in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotIn(List<Short> values) {
            addCriterion("ISCHECKED not in", values, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedBetween(Short value1, Short value2) {
            addCriterion("ISCHECKED between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andIscheckedNotBetween(Short value1, Short value2) {
            addCriterion("ISCHECKED not between", value1, value2, "ischecked");
            return (Criteria) this;
        }

        public Criteria andArtclassIsNull() {
            addCriterion("ARTCLASS is null");
            return (Criteria) this;
        }

        public Criteria andArtclassIsNotNull() {
            addCriterion("ARTCLASS is not null");
            return (Criteria) this;
        }

        public Criteria andArtclassEqualTo(String value) {
            addCriterion("ARTCLASS =", value, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassNotEqualTo(String value) {
            addCriterion("ARTCLASS <>", value, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassGreaterThan(String value) {
            addCriterion("ARTCLASS >", value, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassGreaterThanOrEqualTo(String value) {
            addCriterion("ARTCLASS >=", value, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassLessThan(String value) {
            addCriterion("ARTCLASS <", value, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassLessThanOrEqualTo(String value) {
            addCriterion("ARTCLASS <=", value, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassLike(String value) {
            addCriterion("ARTCLASS like", value, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassNotLike(String value) {
            addCriterion("ARTCLASS not like", value, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassIn(List<String> values) {
            addCriterion("ARTCLASS in", values, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassNotIn(List<String> values) {
            addCriterion("ARTCLASS not in", values, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassBetween(String value1, String value2) {
            addCriterion("ARTCLASS between", value1, value2, "artclass");
            return (Criteria) this;
        }

        public Criteria andArtclassNotBetween(String value1, String value2) {
            addCriterion("ARTCLASS not between", value1, value2, "artclass");
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