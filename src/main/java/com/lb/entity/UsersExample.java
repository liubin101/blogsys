package com.lb.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UsersExample() {
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

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpwIsNull() {
            addCriterion("USERPW is null");
            return (Criteria) this;
        }

        public Criteria andUserpwIsNotNull() {
            addCriterion("USERPW is not null");
            return (Criteria) this;
        }

        public Criteria andUserpwEqualTo(String value) {
            addCriterion("USERPW =", value, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwNotEqualTo(String value) {
            addCriterion("USERPW <>", value, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwGreaterThan(String value) {
            addCriterion("USERPW >", value, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwGreaterThanOrEqualTo(String value) {
            addCriterion("USERPW >=", value, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwLessThan(String value) {
            addCriterion("USERPW <", value, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwLessThanOrEqualTo(String value) {
            addCriterion("USERPW <=", value, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwLike(String value) {
            addCriterion("USERPW like", value, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwNotLike(String value) {
            addCriterion("USERPW not like", value, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwIn(List<String> values) {
            addCriterion("USERPW in", values, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwNotIn(List<String> values) {
            addCriterion("USERPW not in", values, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwBetween(String value1, String value2) {
            addCriterion("USERPW between", value1, value2, "userpw");
            return (Criteria) this;
        }

        public Criteria andUserpwNotBetween(String value1, String value2) {
            addCriterion("USERPW not between", value1, value2, "userpw");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(Short value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(Short value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(Short value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(Short value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(Short value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(Short value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<Short> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<Short> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(Short value1, Short value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(Short value1, Short value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthIsNull() {
            addCriterion("BIRTH is null");
            return (Criteria) this;
        }

        public Criteria andBirthIsNotNull() {
            addCriterion("BIRTH is not null");
            return (Criteria) this;
        }

        public Criteria andBirthEqualTo(Date value) {
            addCriterion("BIRTH =", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotEqualTo(Date value) {
            addCriterion("BIRTH <>", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThan(Date value) {
            addCriterion("BIRTH >", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTH >=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThan(Date value) {
            addCriterion("BIRTH <", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthLessThanOrEqualTo(Date value) {
            addCriterion("BIRTH <=", value, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthIn(List<Date> values) {
            addCriterion("BIRTH in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotIn(List<Date> values) {
            addCriterion("BIRTH not in", values, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthBetween(Date value1, Date value2) {
            addCriterion("BIRTH between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andBirthNotBetween(Date value1, Date value2) {
            addCriterion("BIRTH not between", value1, value2, "birth");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andHeadphotoIsNull() {
            addCriterion("HEADPHOTO is null");
            return (Criteria) this;
        }

        public Criteria andHeadphotoIsNotNull() {
            addCriterion("HEADPHOTO is not null");
            return (Criteria) this;
        }

        public Criteria andHeadphotoEqualTo(String value) {
            addCriterion("HEADPHOTO =", value, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoNotEqualTo(String value) {
            addCriterion("HEADPHOTO <>", value, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoGreaterThan(String value) {
            addCriterion("HEADPHOTO >", value, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoGreaterThanOrEqualTo(String value) {
            addCriterion("HEADPHOTO >=", value, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoLessThan(String value) {
            addCriterion("HEADPHOTO <", value, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoLessThanOrEqualTo(String value) {
            addCriterion("HEADPHOTO <=", value, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoLike(String value) {
            addCriterion("HEADPHOTO like", value, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoNotLike(String value) {
            addCriterion("HEADPHOTO not like", value, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoIn(List<String> values) {
            addCriterion("HEADPHOTO in", values, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoNotIn(List<String> values) {
            addCriterion("HEADPHOTO not in", values, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoBetween(String value1, String value2) {
            addCriterion("HEADPHOTO between", value1, value2, "headphoto");
            return (Criteria) this;
        }

        public Criteria andHeadphotoNotBetween(String value1, String value2) {
            addCriterion("HEADPHOTO not between", value1, value2, "headphoto");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNull() {
            addCriterion("SIGNATURE is null");
            return (Criteria) this;
        }

        public Criteria andSignatureIsNotNull() {
            addCriterion("SIGNATURE is not null");
            return (Criteria) this;
        }

        public Criteria andSignatureEqualTo(String value) {
            addCriterion("SIGNATURE =", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotEqualTo(String value) {
            addCriterion("SIGNATURE <>", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThan(String value) {
            addCriterion("SIGNATURE >", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureGreaterThanOrEqualTo(String value) {
            addCriterion("SIGNATURE >=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThan(String value) {
            addCriterion("SIGNATURE <", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLessThanOrEqualTo(String value) {
            addCriterion("SIGNATURE <=", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureLike(String value) {
            addCriterion("SIGNATURE like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotLike(String value) {
            addCriterion("SIGNATURE not like", value, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureIn(List<String> values) {
            addCriterion("SIGNATURE in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotIn(List<String> values) {
            addCriterion("SIGNATURE not in", values, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureBetween(String value1, String value2) {
            addCriterion("SIGNATURE between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andSignatureNotBetween(String value1, String value2) {
            addCriterion("SIGNATURE not between", value1, value2, "signature");
            return (Criteria) this;
        }

        public Criteria andUlevelIsNull() {
            addCriterion("ULEVEL is null");
            return (Criteria) this;
        }

        public Criteria andUlevelIsNotNull() {
            addCriterion("ULEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andUlevelEqualTo(Short value) {
            addCriterion("ULEVEL =", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotEqualTo(Short value) {
            addCriterion("ULEVEL <>", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelGreaterThan(Short value) {
            addCriterion("ULEVEL >", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelGreaterThanOrEqualTo(Short value) {
            addCriterion("ULEVEL >=", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelLessThan(Short value) {
            addCriterion("ULEVEL <", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelLessThanOrEqualTo(Short value) {
            addCriterion("ULEVEL <=", value, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelIn(List<Short> values) {
            addCriterion("ULEVEL in", values, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotIn(List<Short> values) {
            addCriterion("ULEVEL not in", values, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelBetween(Short value1, Short value2) {
            addCriterion("ULEVEL between", value1, value2, "ulevel");
            return (Criteria) this;
        }

        public Criteria andUlevelNotBetween(Short value1, Short value2) {
            addCriterion("ULEVEL not between", value1, value2, "ulevel");
            return (Criteria) this;
        }

        public Criteria andFocusnumIsNull() {
            addCriterion("FOCUSNUM is null");
            return (Criteria) this;
        }

        public Criteria andFocusnumIsNotNull() {
            addCriterion("FOCUSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFocusnumEqualTo(Long value) {
            addCriterion("FOCUSNUM =", value, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFocusnumNotEqualTo(Long value) {
            addCriterion("FOCUSNUM <>", value, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFocusnumGreaterThan(Long value) {
            addCriterion("FOCUSNUM >", value, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFocusnumGreaterThanOrEqualTo(Long value) {
            addCriterion("FOCUSNUM >=", value, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFocusnumLessThan(Long value) {
            addCriterion("FOCUSNUM <", value, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFocusnumLessThanOrEqualTo(Long value) {
            addCriterion("FOCUSNUM <=", value, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFocusnumIn(List<Long> values) {
            addCriterion("FOCUSNUM in", values, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFocusnumNotIn(List<Long> values) {
            addCriterion("FOCUSNUM not in", values, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFocusnumBetween(Long value1, Long value2) {
            addCriterion("FOCUSNUM between", value1, value2, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFocusnumNotBetween(Long value1, Long value2) {
            addCriterion("FOCUSNUM not between", value1, value2, "focusnum");
            return (Criteria) this;
        }

        public Criteria andFansnumIsNull() {
            addCriterion("FANSNUM is null");
            return (Criteria) this;
        }

        public Criteria andFansnumIsNotNull() {
            addCriterion("FANSNUM is not null");
            return (Criteria) this;
        }

        public Criteria andFansnumEqualTo(Long value) {
            addCriterion("FANSNUM =", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumNotEqualTo(Long value) {
            addCriterion("FANSNUM <>", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumGreaterThan(Long value) {
            addCriterion("FANSNUM >", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumGreaterThanOrEqualTo(Long value) {
            addCriterion("FANSNUM >=", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumLessThan(Long value) {
            addCriterion("FANSNUM <", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumLessThanOrEqualTo(Long value) {
            addCriterion("FANSNUM <=", value, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumIn(List<Long> values) {
            addCriterion("FANSNUM in", values, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumNotIn(List<Long> values) {
            addCriterion("FANSNUM not in", values, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumBetween(Long value1, Long value2) {
            addCriterion("FANSNUM between", value1, value2, "fansnum");
            return (Criteria) this;
        }

        public Criteria andFansnumNotBetween(Long value1, Long value2) {
            addCriterion("FANSNUM not between", value1, value2, "fansnum");
            return (Criteria) this;
        }

        public Criteria andArticlenumIsNull() {
            addCriterion("ARTICLENUM is null");
            return (Criteria) this;
        }

        public Criteria andArticlenumIsNotNull() {
            addCriterion("ARTICLENUM is not null");
            return (Criteria) this;
        }

        public Criteria andArticlenumEqualTo(Long value) {
            addCriterion("ARTICLENUM =", value, "articlenum");
            return (Criteria) this;
        }

        public Criteria andArticlenumNotEqualTo(Long value) {
            addCriterion("ARTICLENUM <>", value, "articlenum");
            return (Criteria) this;
        }

        public Criteria andArticlenumGreaterThan(Long value) {
            addCriterion("ARTICLENUM >", value, "articlenum");
            return (Criteria) this;
        }

        public Criteria andArticlenumGreaterThanOrEqualTo(Long value) {
            addCriterion("ARTICLENUM >=", value, "articlenum");
            return (Criteria) this;
        }

        public Criteria andArticlenumLessThan(Long value) {
            addCriterion("ARTICLENUM <", value, "articlenum");
            return (Criteria) this;
        }

        public Criteria andArticlenumLessThanOrEqualTo(Long value) {
            addCriterion("ARTICLENUM <=", value, "articlenum");
            return (Criteria) this;
        }

        public Criteria andArticlenumIn(List<Long> values) {
            addCriterion("ARTICLENUM in", values, "articlenum");
            return (Criteria) this;
        }

        public Criteria andArticlenumNotIn(List<Long> values) {
            addCriterion("ARTICLENUM not in", values, "articlenum");
            return (Criteria) this;
        }

        public Criteria andArticlenumBetween(Long value1, Long value2) {
            addCriterion("ARTICLENUM between", value1, value2, "articlenum");
            return (Criteria) this;
        }

        public Criteria andArticlenumNotBetween(Long value1, Long value2) {
            addCriterion("ARTICLENUM not between", value1, value2, "articlenum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumIsNull() {
            addCriterion("ALBUMNUM is null");
            return (Criteria) this;
        }

        public Criteria andAlbumnumIsNotNull() {
            addCriterion("ALBUMNUM is not null");
            return (Criteria) this;
        }

        public Criteria andAlbumnumEqualTo(Long value) {
            addCriterion("ALBUMNUM =", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumNotEqualTo(Long value) {
            addCriterion("ALBUMNUM <>", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumGreaterThan(Long value) {
            addCriterion("ALBUMNUM >", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumGreaterThanOrEqualTo(Long value) {
            addCriterion("ALBUMNUM >=", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumLessThan(Long value) {
            addCriterion("ALBUMNUM <", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumLessThanOrEqualTo(Long value) {
            addCriterion("ALBUMNUM <=", value, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumIn(List<Long> values) {
            addCriterion("ALBUMNUM in", values, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumNotIn(List<Long> values) {
            addCriterion("ALBUMNUM not in", values, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumBetween(Long value1, Long value2) {
            addCriterion("ALBUMNUM between", value1, value2, "albumnum");
            return (Criteria) this;
        }

        public Criteria andAlbumnumNotBetween(Long value1, Long value2) {
            addCriterion("ALBUMNUM not between", value1, value2, "albumnum");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNull() {
            addCriterion("NICKNAME is null");
            return (Criteria) this;
        }

        public Criteria andNicknameIsNotNull() {
            addCriterion("NICKNAME is not null");
            return (Criteria) this;
        }

        public Criteria andNicknameEqualTo(String value) {
            addCriterion("NICKNAME =", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotEqualTo(String value) {
            addCriterion("NICKNAME <>", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThan(String value) {
            addCriterion("NICKNAME >", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameGreaterThanOrEqualTo(String value) {
            addCriterion("NICKNAME >=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThan(String value) {
            addCriterion("NICKNAME <", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLessThanOrEqualTo(String value) {
            addCriterion("NICKNAME <=", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameLike(String value) {
            addCriterion("NICKNAME like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotLike(String value) {
            addCriterion("NICKNAME not like", value, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameIn(List<String> values) {
            addCriterion("NICKNAME in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotIn(List<String> values) {
            addCriterion("NICKNAME not in", values, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameBetween(String value1, String value2) {
            addCriterion("NICKNAME between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andNicknameNotBetween(String value1, String value2) {
            addCriterion("NICKNAME not between", value1, value2, "nickname");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNull() {
            addCriterion("COMMENTNUM is null");
            return (Criteria) this;
        }

        public Criteria andCommentnumIsNotNull() {
            addCriterion("COMMENTNUM is not null");
            return (Criteria) this;
        }

        public Criteria andCommentnumEqualTo(Long value) {
            addCriterion("COMMENTNUM =", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotEqualTo(Long value) {
            addCriterion("COMMENTNUM <>", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThan(Long value) {
            addCriterion("COMMENTNUM >", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumGreaterThanOrEqualTo(Long value) {
            addCriterion("COMMENTNUM >=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThan(Long value) {
            addCriterion("COMMENTNUM <", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumLessThanOrEqualTo(Long value) {
            addCriterion("COMMENTNUM <=", value, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumIn(List<Long> values) {
            addCriterion("COMMENTNUM in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotIn(List<Long> values) {
            addCriterion("COMMENTNUM not in", values, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumBetween(Long value1, Long value2) {
            addCriterion("COMMENTNUM between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andCommentnumNotBetween(Long value1, Long value2) {
            addCriterion("COMMENTNUM not between", value1, value2, "commentnum");
            return (Criteria) this;
        }

        public Criteria andQqIsNull() {
            addCriterion("QQ is null");
            return (Criteria) this;
        }

        public Criteria andQqIsNotNull() {
            addCriterion("QQ is not null");
            return (Criteria) this;
        }

        public Criteria andQqEqualTo(String value) {
            addCriterion("QQ =", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotEqualTo(String value) {
            addCriterion("QQ <>", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThan(String value) {
            addCriterion("QQ >", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqGreaterThanOrEqualTo(String value) {
            addCriterion("QQ >=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThan(String value) {
            addCriterion("QQ <", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLessThanOrEqualTo(String value) {
            addCriterion("QQ <=", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqLike(String value) {
            addCriterion("QQ like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotLike(String value) {
            addCriterion("QQ not like", value, "qq");
            return (Criteria) this;
        }

        public Criteria andQqIn(List<String> values) {
            addCriterion("QQ in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotIn(List<String> values) {
            addCriterion("QQ not in", values, "qq");
            return (Criteria) this;
        }

        public Criteria andQqBetween(String value1, String value2) {
            addCriterion("QQ between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andQqNotBetween(String value1, String value2) {
            addCriterion("QQ not between", value1, value2, "qq");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
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