package org.com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TblItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TblItemExample() {
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

        public Criteria andItemIdIsNull() {
            addCriterion("item_id is null");
            return (Criteria) this;
        }

        public Criteria andItemIdIsNotNull() {
            addCriterion("item_id is not null");
            return (Criteria) this;
        }

        public Criteria andItemIdEqualTo(Integer value) {
            addCriterion("item_id =", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotEqualTo(Integer value) {
            addCriterion("item_id <>", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThan(Integer value) {
            addCriterion("item_id >", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("item_id >=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThan(Integer value) {
            addCriterion("item_id <", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdLessThanOrEqualTo(Integer value) {
            addCriterion("item_id <=", value, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdIn(List<Integer> values) {
            addCriterion("item_id in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotIn(List<Integer> values) {
            addCriterion("item_id not in", values, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdBetween(Integer value1, Integer value2) {
            addCriterion("item_id between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("item_id not between", value1, value2, "itemId");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNull() {
            addCriterion("item_name is null");
            return (Criteria) this;
        }

        public Criteria andItemNameIsNotNull() {
            addCriterion("item_name is not null");
            return (Criteria) this;
        }

        public Criteria andItemNameEqualTo(String value) {
            addCriterion("item_name =", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotEqualTo(String value) {
            addCriterion("item_name <>", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThan(String value) {
            addCriterion("item_name >", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameGreaterThanOrEqualTo(String value) {
            addCriterion("item_name >=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThan(String value) {
            addCriterion("item_name <", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLessThanOrEqualTo(String value) {
            addCriterion("item_name <=", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameLike(String value) {
            addCriterion("item_name like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotLike(String value) {
            addCriterion("item_name not like", value, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameIn(List<String> values) {
            addCriterion("item_name in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotIn(List<String> values) {
            addCriterion("item_name not in", values, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameBetween(String value1, String value2) {
            addCriterion("item_name between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemNameNotBetween(String value1, String value2) {
            addCriterion("item_name not between", value1, value2, "itemName");
            return (Criteria) this;
        }

        public Criteria andItemUrlIsNull() {
            addCriterion("item_url is null");
            return (Criteria) this;
        }

        public Criteria andItemUrlIsNotNull() {
            addCriterion("item_url is not null");
            return (Criteria) this;
        }

        public Criteria andItemUrlEqualTo(String value) {
            addCriterion("item_url =", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotEqualTo(String value) {
            addCriterion("item_url <>", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlGreaterThan(String value) {
            addCriterion("item_url >", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlGreaterThanOrEqualTo(String value) {
            addCriterion("item_url >=", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLessThan(String value) {
            addCriterion("item_url <", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLessThanOrEqualTo(String value) {
            addCriterion("item_url <=", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlLike(String value) {
            addCriterion("item_url like", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotLike(String value) {
            addCriterion("item_url not like", value, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlIn(List<String> values) {
            addCriterion("item_url in", values, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotIn(List<String> values) {
            addCriterion("item_url not in", values, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlBetween(String value1, String value2) {
            addCriterion("item_url between", value1, value2, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemUrlNotBetween(String value1, String value2) {
            addCriterion("item_url not between", value1, value2, "itemUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlIsNull() {
            addCriterion("item_git_url is null");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlIsNotNull() {
            addCriterion("item_git_url is not null");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlEqualTo(String value) {
            addCriterion("item_git_url =", value, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlNotEqualTo(String value) {
            addCriterion("item_git_url <>", value, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlGreaterThan(String value) {
            addCriterion("item_git_url >", value, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlGreaterThanOrEqualTo(String value) {
            addCriterion("item_git_url >=", value, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlLessThan(String value) {
            addCriterion("item_git_url <", value, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlLessThanOrEqualTo(String value) {
            addCriterion("item_git_url <=", value, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlLike(String value) {
            addCriterion("item_git_url like", value, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlNotLike(String value) {
            addCriterion("item_git_url not like", value, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlIn(List<String> values) {
            addCriterion("item_git_url in", values, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlNotIn(List<String> values) {
            addCriterion("item_git_url not in", values, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlBetween(String value1, String value2) {
            addCriterion("item_git_url between", value1, value2, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemGitUrlNotBetween(String value1, String value2) {
            addCriterion("item_git_url not between", value1, value2, "itemGitUrl");
            return (Criteria) this;
        }

        public Criteria andItemStateIsNull() {
            addCriterion("Item_state is null");
            return (Criteria) this;
        }

        public Criteria andItemStateIsNotNull() {
            addCriterion("Item_state is not null");
            return (Criteria) this;
        }

        public Criteria andItemStateEqualTo(Integer value) {
            addCriterion("Item_state =", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateNotEqualTo(Integer value) {
            addCriterion("Item_state <>", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateGreaterThan(Integer value) {
            addCriterion("Item_state >", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Item_state >=", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateLessThan(Integer value) {
            addCriterion("Item_state <", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateLessThanOrEqualTo(Integer value) {
            addCriterion("Item_state <=", value, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateIn(List<Integer> values) {
            addCriterion("Item_state in", values, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateNotIn(List<Integer> values) {
            addCriterion("Item_state not in", values, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateBetween(Integer value1, Integer value2) {
            addCriterion("Item_state between", value1, value2, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemStateNotBetween(Integer value1, Integer value2) {
            addCriterion("Item_state not between", value1, value2, "itemState");
            return (Criteria) this;
        }

        public Criteria andItemTimeIsNull() {
            addCriterion("Item_time is null");
            return (Criteria) this;
        }

        public Criteria andItemTimeIsNotNull() {
            addCriterion("Item_time is not null");
            return (Criteria) this;
        }

        public Criteria andItemTimeEqualTo(Date value) {
            addCriterion("Item_time =", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotEqualTo(Date value) {
            addCriterion("Item_time <>", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeGreaterThan(Date value) {
            addCriterion("Item_time >", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("Item_time >=", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeLessThan(Date value) {
            addCriterion("Item_time <", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeLessThanOrEqualTo(Date value) {
            addCriterion("Item_time <=", value, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeIn(List<Date> values) {
            addCriterion("Item_time in", values, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotIn(List<Date> values) {
            addCriterion("Item_time not in", values, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeBetween(Date value1, Date value2) {
            addCriterion("Item_time between", value1, value2, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemTimeNotBetween(Date value1, Date value2) {
            addCriterion("Item_time not between", value1, value2, "itemTime");
            return (Criteria) this;
        }

        public Criteria andItemDescribeIsNull() {
            addCriterion("Item_describe is null");
            return (Criteria) this;
        }

        public Criteria andItemDescribeIsNotNull() {
            addCriterion("Item_describe is not null");
            return (Criteria) this;
        }

        public Criteria andItemDescribeEqualTo(String value) {
            addCriterion("Item_describe =", value, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeNotEqualTo(String value) {
            addCriterion("Item_describe <>", value, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeGreaterThan(String value) {
            addCriterion("Item_describe >", value, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("Item_describe >=", value, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeLessThan(String value) {
            addCriterion("Item_describe <", value, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeLessThanOrEqualTo(String value) {
            addCriterion("Item_describe <=", value, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeLike(String value) {
            addCriterion("Item_describe like", value, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeNotLike(String value) {
            addCriterion("Item_describe not like", value, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeIn(List<String> values) {
            addCriterion("Item_describe in", values, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeNotIn(List<String> values) {
            addCriterion("Item_describe not in", values, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeBetween(String value1, String value2) {
            addCriterion("Item_describe between", value1, value2, "itemDescribe");
            return (Criteria) this;
        }

        public Criteria andItemDescribeNotBetween(String value1, String value2) {
            addCriterion("Item_describe not between", value1, value2, "itemDescribe");
            return (Criteria) this;
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