package org.com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TblCustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblCustomerExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumIsNull() {
            addCriterion("customer_telnum is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumIsNotNull() {
            addCriterion("customer_telnum is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumEqualTo(String value) {
            addCriterion("customer_telnum =", value, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumNotEqualTo(String value) {
            addCriterion("customer_telnum <>", value, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumGreaterThan(String value) {
            addCriterion("customer_telnum >", value, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumGreaterThanOrEqualTo(String value) {
            addCriterion("customer_telnum >=", value, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumLessThan(String value) {
            addCriterion("customer_telnum <", value, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumLessThanOrEqualTo(String value) {
            addCriterion("customer_telnum <=", value, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumLike(String value) {
            addCriterion("customer_telnum like", value, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumNotLike(String value) {
            addCriterion("customer_telnum not like", value, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumIn(List<String> values) {
            addCriterion("customer_telnum in", values, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumNotIn(List<String> values) {
            addCriterion("customer_telnum not in", values, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumBetween(String value1, String value2) {
            addCriterion("customer_telnum between", value1, value2, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerTelnumNotBetween(String value1, String value2) {
            addCriterion("customer_telnum not between", value1, value2, "customerTelnum");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNull() {
            addCriterion("customer_password is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIsNotNull() {
            addCriterion("customer_password is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordEqualTo(String value) {
            addCriterion("customer_password =", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotEqualTo(String value) {
            addCriterion("customer_password <>", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThan(String value) {
            addCriterion("customer_password >", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("customer_password >=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThan(String value) {
            addCriterion("customer_password <", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLessThanOrEqualTo(String value) {
            addCriterion("customer_password <=", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordLike(String value) {
            addCriterion("customer_password like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotLike(String value) {
            addCriterion("customer_password not like", value, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordIn(List<String> values) {
            addCriterion("customer_password in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotIn(List<String> values) {
            addCriterion("customer_password not in", values, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordBetween(String value1, String value2) {
            addCriterion("customer_password between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerPasswordNotBetween(String value1, String value2) {
            addCriterion("customer_password not between", value1, value2, "customerPassword");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNull() {
            addCriterion("customer_sex is null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIsNotNull() {
            addCriterion("customer_sex is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerSexEqualTo(Boolean value) {
            addCriterion("customer_sex =", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotEqualTo(Boolean value) {
            addCriterion("customer_sex <>", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThan(Boolean value) {
            addCriterion("customer_sex >", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("customer_sex >=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThan(Boolean value) {
            addCriterion("customer_sex <", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexLessThanOrEqualTo(Boolean value) {
            addCriterion("customer_sex <=", value, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexIn(List<Boolean> values) {
            addCriterion("customer_sex in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotIn(List<Boolean> values) {
            addCriterion("customer_sex not in", values, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexBetween(Boolean value1, Boolean value2) {
            addCriterion("customer_sex between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerSexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("customer_sex not between", value1, value2, "customerSex");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayIsNull() {
            addCriterion("customer_birthday is null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayIsNotNull() {
            addCriterion("customer_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("customer_birthday =", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("customer_birthday <>", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("customer_birthday >", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_birthday >=", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("customer_birthday <", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("customer_birthday <=", value, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("customer_birthday in", values, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("customer_birthday not in", values, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_birthday between", value1, value2, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("customer_birthday not between", value1, value2, "customerBirthday");
            return (Criteria) this;
        }

        public Criteria andCustomerJobIsNull() {
            addCriterion("customer_job is null");
            return (Criteria) this;
        }

        public Criteria andCustomerJobIsNotNull() {
            addCriterion("customer_job is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerJobEqualTo(String value) {
            addCriterion("customer_job =", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobNotEqualTo(String value) {
            addCriterion("customer_job <>", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobGreaterThan(String value) {
            addCriterion("customer_job >", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobGreaterThanOrEqualTo(String value) {
            addCriterion("customer_job >=", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobLessThan(String value) {
            addCriterion("customer_job <", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobLessThanOrEqualTo(String value) {
            addCriterion("customer_job <=", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobLike(String value) {
            addCriterion("customer_job like", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobNotLike(String value) {
            addCriterion("customer_job not like", value, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobIn(List<String> values) {
            addCriterion("customer_job in", values, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobNotIn(List<String> values) {
            addCriterion("customer_job not in", values, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobBetween(String value1, String value2) {
            addCriterion("customer_job between", value1, value2, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerJobNotBetween(String value1, String value2) {
            addCriterion("customer_job not between", value1, value2, "customerJob");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureIsNull() {
            addCriterion("customer_picture is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureIsNotNull() {
            addCriterion("customer_picture is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureEqualTo(String value) {
            addCriterion("customer_picture =", value, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureNotEqualTo(String value) {
            addCriterion("customer_picture <>", value, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureGreaterThan(String value) {
            addCriterion("customer_picture >", value, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureGreaterThanOrEqualTo(String value) {
            addCriterion("customer_picture >=", value, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureLessThan(String value) {
            addCriterion("customer_picture <", value, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureLessThanOrEqualTo(String value) {
            addCriterion("customer_picture <=", value, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureLike(String value) {
            addCriterion("customer_picture like", value, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureNotLike(String value) {
            addCriterion("customer_picture not like", value, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureIn(List<String> values) {
            addCriterion("customer_picture in", values, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureNotIn(List<String> values) {
            addCriterion("customer_picture not in", values, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureBetween(String value1, String value2) {
            addCriterion("customer_picture between", value1, value2, "customerPicture");
            return (Criteria) this;
        }

        public Criteria andCustomerPictureNotBetween(String value1, String value2) {
            addCriterion("customer_picture not between", value1, value2, "customerPicture");
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