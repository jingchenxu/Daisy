package org.deepwater.daisy.entity.blog;

import java.util.ArrayList;
import java.util.List;

public class BlogFlagExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogFlagExample() {
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

        public Criteria andBlogflagIdIsNull() {
            addCriterion("blogflag_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdIsNotNull() {
            addCriterion("blogflag_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdEqualTo(Integer value) {
            addCriterion("blogflag_id =", value, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdNotEqualTo(Integer value) {
            addCriterion("blogflag_id <>", value, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdGreaterThan(Integer value) {
            addCriterion("blogflag_id >", value, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blogflag_id >=", value, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdLessThan(Integer value) {
            addCriterion("blogflag_id <", value, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdLessThanOrEqualTo(Integer value) {
            addCriterion("blogflag_id <=", value, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdIn(List<Integer> values) {
            addCriterion("blogflag_id in", values, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdNotIn(List<Integer> values) {
            addCriterion("blogflag_id not in", values, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdBetween(Integer value1, Integer value2) {
            addCriterion("blogflag_id between", value1, value2, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blogflag_id not between", value1, value2, "blogflagId");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberIsNull() {
            addCriterion("blogflag_blog_number is null");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberIsNotNull() {
            addCriterion("blogflag_blog_number is not null");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberEqualTo(String value) {
            addCriterion("blogflag_blog_number =", value, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberNotEqualTo(String value) {
            addCriterion("blogflag_blog_number <>", value, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberGreaterThan(String value) {
            addCriterion("blogflag_blog_number >", value, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberGreaterThanOrEqualTo(String value) {
            addCriterion("blogflag_blog_number >=", value, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberLessThan(String value) {
            addCriterion("blogflag_blog_number <", value, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberLessThanOrEqualTo(String value) {
            addCriterion("blogflag_blog_number <=", value, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberLike(String value) {
            addCriterion("blogflag_blog_number like", value, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberNotLike(String value) {
            addCriterion("blogflag_blog_number not like", value, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberIn(List<String> values) {
            addCriterion("blogflag_blog_number in", values, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberNotIn(List<String> values) {
            addCriterion("blogflag_blog_number not in", values, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberBetween(String value1, String value2) {
            addCriterion("blogflag_blog_number between", value1, value2, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagBlogNumberNotBetween(String value1, String value2) {
            addCriterion("blogflag_blog_number not between", value1, value2, "blogflagBlogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberIsNull() {
            addCriterion("blogflag_flag_number is null");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberIsNotNull() {
            addCriterion("blogflag_flag_number is not null");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberEqualTo(String value) {
            addCriterion("blogflag_flag_number =", value, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberNotEqualTo(String value) {
            addCriterion("blogflag_flag_number <>", value, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberGreaterThan(String value) {
            addCriterion("blogflag_flag_number >", value, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberGreaterThanOrEqualTo(String value) {
            addCriterion("blogflag_flag_number >=", value, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberLessThan(String value) {
            addCriterion("blogflag_flag_number <", value, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberLessThanOrEqualTo(String value) {
            addCriterion("blogflag_flag_number <=", value, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberLike(String value) {
            addCriterion("blogflag_flag_number like", value, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberNotLike(String value) {
            addCriterion("blogflag_flag_number not like", value, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberIn(List<String> values) {
            addCriterion("blogflag_flag_number in", values, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberNotIn(List<String> values) {
            addCriterion("blogflag_flag_number not in", values, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberBetween(String value1, String value2) {
            addCriterion("blogflag_flag_number between", value1, value2, "blogflagFlagNumber");
            return (Criteria) this;
        }

        public Criteria andBlogflagFlagNumberNotBetween(String value1, String value2) {
            addCriterion("blogflag_flag_number not between", value1, value2, "blogflagFlagNumber");
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