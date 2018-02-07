package org.deepwater.daisy.entity.flag;

import java.util.ArrayList;
import java.util.List;

public class FlagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlagExample() {
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

        public Criteria andFlagIdIsNull() {
            addCriterion("flag_id is null");
            return (Criteria) this;
        }

        public Criteria andFlagIdIsNotNull() {
            addCriterion("flag_id is not null");
            return (Criteria) this;
        }

        public Criteria andFlagIdEqualTo(Integer value) {
            addCriterion("flag_id =", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotEqualTo(Integer value) {
            addCriterion("flag_id <>", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdGreaterThan(Integer value) {
            addCriterion("flag_id >", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag_id >=", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdLessThan(Integer value) {
            addCriterion("flag_id <", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdLessThanOrEqualTo(Integer value) {
            addCriterion("flag_id <=", value, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdIn(List<Integer> values) {
            addCriterion("flag_id in", values, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotIn(List<Integer> values) {
            addCriterion("flag_id not in", values, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdBetween(Integer value1, Integer value2) {
            addCriterion("flag_id between", value1, value2, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("flag_id not between", value1, value2, "flagId");
            return (Criteria) this;
        }

        public Criteria andFlagNumberIsNull() {
            addCriterion("flag_number is null");
            return (Criteria) this;
        }

        public Criteria andFlagNumberIsNotNull() {
            addCriterion("flag_number is not null");
            return (Criteria) this;
        }

        public Criteria andFlagNumberEqualTo(String value) {
            addCriterion("flag_number =", value, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberNotEqualTo(String value) {
            addCriterion("flag_number <>", value, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberGreaterThan(String value) {
            addCriterion("flag_number >", value, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberGreaterThanOrEqualTo(String value) {
            addCriterion("flag_number >=", value, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberLessThan(String value) {
            addCriterion("flag_number <", value, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberLessThanOrEqualTo(String value) {
            addCriterion("flag_number <=", value, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberLike(String value) {
            addCriterion("flag_number like", value, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberNotLike(String value) {
            addCriterion("flag_number not like", value, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberIn(List<String> values) {
            addCriterion("flag_number in", values, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberNotIn(List<String> values) {
            addCriterion("flag_number not in", values, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberBetween(String value1, String value2) {
            addCriterion("flag_number between", value1, value2, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNumberNotBetween(String value1, String value2) {
            addCriterion("flag_number not between", value1, value2, "flagNumber");
            return (Criteria) this;
        }

        public Criteria andFlagNameIsNull() {
            addCriterion("flag_name is null");
            return (Criteria) this;
        }

        public Criteria andFlagNameIsNotNull() {
            addCriterion("flag_name is not null");
            return (Criteria) this;
        }

        public Criteria andFlagNameEqualTo(String value) {
            addCriterion("flag_name =", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotEqualTo(String value) {
            addCriterion("flag_name <>", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameGreaterThan(String value) {
            addCriterion("flag_name >", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameGreaterThanOrEqualTo(String value) {
            addCriterion("flag_name >=", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameLessThan(String value) {
            addCriterion("flag_name <", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameLessThanOrEqualTo(String value) {
            addCriterion("flag_name <=", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameLike(String value) {
            addCriterion("flag_name like", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotLike(String value) {
            addCriterion("flag_name not like", value, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameIn(List<String> values) {
            addCriterion("flag_name in", values, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotIn(List<String> values) {
            addCriterion("flag_name not in", values, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameBetween(String value1, String value2) {
            addCriterion("flag_name between", value1, value2, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagNameNotBetween(String value1, String value2) {
            addCriterion("flag_name not between", value1, value2, "flagName");
            return (Criteria) this;
        }

        public Criteria andFlagIconIsNull() {
            addCriterion("flag_icon is null");
            return (Criteria) this;
        }

        public Criteria andFlagIconIsNotNull() {
            addCriterion("flag_icon is not null");
            return (Criteria) this;
        }

        public Criteria andFlagIconEqualTo(String value) {
            addCriterion("flag_icon =", value, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconNotEqualTo(String value) {
            addCriterion("flag_icon <>", value, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconGreaterThan(String value) {
            addCriterion("flag_icon >", value, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconGreaterThanOrEqualTo(String value) {
            addCriterion("flag_icon >=", value, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconLessThan(String value) {
            addCriterion("flag_icon <", value, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconLessThanOrEqualTo(String value) {
            addCriterion("flag_icon <=", value, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconLike(String value) {
            addCriterion("flag_icon like", value, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconNotLike(String value) {
            addCriterion("flag_icon not like", value, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconIn(List<String> values) {
            addCriterion("flag_icon in", values, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconNotIn(List<String> values) {
            addCriterion("flag_icon not in", values, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconBetween(String value1, String value2) {
            addCriterion("flag_icon between", value1, value2, "flagIcon");
            return (Criteria) this;
        }

        public Criteria andFlagIconNotBetween(String value1, String value2) {
            addCriterion("flag_icon not between", value1, value2, "flagIcon");
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