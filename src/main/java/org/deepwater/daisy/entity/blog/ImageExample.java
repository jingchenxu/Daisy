package org.deepwater.daisy.entity.blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andImageIdIsNull() {
            addCriterion("image_id is null");
            return (Criteria) this;
        }

        public Criteria andImageIdIsNotNull() {
            addCriterion("image_id is not null");
            return (Criteria) this;
        }

        public Criteria andImageIdEqualTo(Integer value) {
            addCriterion("image_id =", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotEqualTo(Integer value) {
            addCriterion("image_id <>", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThan(Integer value) {
            addCriterion("image_id >", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("image_id >=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThan(Integer value) {
            addCriterion("image_id <", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdLessThanOrEqualTo(Integer value) {
            addCriterion("image_id <=", value, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdIn(List<Integer> values) {
            addCriterion("image_id in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotIn(List<Integer> values) {
            addCriterion("image_id not in", values, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdBetween(Integer value1, Integer value2) {
            addCriterion("image_id between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("image_id not between", value1, value2, "imageId");
            return (Criteria) this;
        }

        public Criteria andImageNumberIsNull() {
            addCriterion("image_number is null");
            return (Criteria) this;
        }

        public Criteria andImageNumberIsNotNull() {
            addCriterion("image_number is not null");
            return (Criteria) this;
        }

        public Criteria andImageNumberEqualTo(String value) {
            addCriterion("image_number =", value, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberNotEqualTo(String value) {
            addCriterion("image_number <>", value, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberGreaterThan(String value) {
            addCriterion("image_number >", value, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberGreaterThanOrEqualTo(String value) {
            addCriterion("image_number >=", value, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberLessThan(String value) {
            addCriterion("image_number <", value, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberLessThanOrEqualTo(String value) {
            addCriterion("image_number <=", value, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberLike(String value) {
            addCriterion("image_number like", value, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberNotLike(String value) {
            addCriterion("image_number not like", value, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberIn(List<String> values) {
            addCriterion("image_number in", values, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberNotIn(List<String> values) {
            addCriterion("image_number not in", values, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberBetween(String value1, String value2) {
            addCriterion("image_number between", value1, value2, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNumberNotBetween(String value1, String value2) {
            addCriterion("image_number not between", value1, value2, "imageNumber");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNull() {
            addCriterion("image_name is null");
            return (Criteria) this;
        }

        public Criteria andImageNameIsNotNull() {
            addCriterion("image_name is not null");
            return (Criteria) this;
        }

        public Criteria andImageNameEqualTo(String value) {
            addCriterion("image_name =", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotEqualTo(String value) {
            addCriterion("image_name <>", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThan(String value) {
            addCriterion("image_name >", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameGreaterThanOrEqualTo(String value) {
            addCriterion("image_name >=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThan(String value) {
            addCriterion("image_name <", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLessThanOrEqualTo(String value) {
            addCriterion("image_name <=", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameLike(String value) {
            addCriterion("image_name like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotLike(String value) {
            addCriterion("image_name not like", value, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameIn(List<String> values) {
            addCriterion("image_name in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotIn(List<String> values) {
            addCriterion("image_name not in", values, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameBetween(String value1, String value2) {
            addCriterion("image_name between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageNameNotBetween(String value1, String value2) {
            addCriterion("image_name not between", value1, value2, "imageName");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNull() {
            addCriterion("image_url is null");
            return (Criteria) this;
        }

        public Criteria andImageUrlIsNotNull() {
            addCriterion("image_url is not null");
            return (Criteria) this;
        }

        public Criteria andImageUrlEqualTo(String value) {
            addCriterion("image_url =", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotEqualTo(String value) {
            addCriterion("image_url <>", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThan(String value) {
            addCriterion("image_url >", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("image_url >=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThan(String value) {
            addCriterion("image_url <", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLessThanOrEqualTo(String value) {
            addCriterion("image_url <=", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlLike(String value) {
            addCriterion("image_url like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotLike(String value) {
            addCriterion("image_url not like", value, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlIn(List<String> values) {
            addCriterion("image_url in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotIn(List<String> values) {
            addCriterion("image_url not in", values, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlBetween(String value1, String value2) {
            addCriterion("image_url between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageUrlNotBetween(String value1, String value2) {
            addCriterion("image_url not between", value1, value2, "imageUrl");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexIsNull() {
            addCriterion("image_is_index is null");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexIsNotNull() {
            addCriterion("image_is_index is not null");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexEqualTo(Boolean value) {
            addCriterion("image_is_index =", value, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexNotEqualTo(Boolean value) {
            addCriterion("image_is_index <>", value, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexGreaterThan(Boolean value) {
            addCriterion("image_is_index >", value, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexGreaterThanOrEqualTo(Boolean value) {
            addCriterion("image_is_index >=", value, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexLessThan(Boolean value) {
            addCriterion("image_is_index <", value, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexLessThanOrEqualTo(Boolean value) {
            addCriterion("image_is_index <=", value, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexIn(List<Boolean> values) {
            addCriterion("image_is_index in", values, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexNotIn(List<Boolean> values) {
            addCriterion("image_is_index not in", values, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexBetween(Boolean value1, Boolean value2) {
            addCriterion("image_is_index between", value1, value2, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageIsIndexNotBetween(Boolean value1, Boolean value2) {
            addCriterion("image_is_index not between", value1, value2, "imageIsIndex");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionIsNull() {
            addCriterion("image_description is null");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionIsNotNull() {
            addCriterion("image_description is not null");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionEqualTo(String value) {
            addCriterion("image_description =", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionNotEqualTo(String value) {
            addCriterion("image_description <>", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionGreaterThan(String value) {
            addCriterion("image_description >", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("image_description >=", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionLessThan(String value) {
            addCriterion("image_description <", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionLessThanOrEqualTo(String value) {
            addCriterion("image_description <=", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionLike(String value) {
            addCriterion("image_description like", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionNotLike(String value) {
            addCriterion("image_description not like", value, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionIn(List<String> values) {
            addCriterion("image_description in", values, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionNotIn(List<String> values) {
            addCriterion("image_description not in", values, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionBetween(String value1, String value2) {
            addCriterion("image_description between", value1, value2, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageDescriptionNotBetween(String value1, String value2) {
            addCriterion("image_description not between", value1, value2, "imageDescription");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteIsNull() {
            addCriterion("image_is_remote is null");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteIsNotNull() {
            addCriterion("image_is_remote is not null");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteEqualTo(Boolean value) {
            addCriterion("image_is_remote =", value, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteNotEqualTo(Boolean value) {
            addCriterion("image_is_remote <>", value, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteGreaterThan(Boolean value) {
            addCriterion("image_is_remote >", value, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("image_is_remote >=", value, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteLessThan(Boolean value) {
            addCriterion("image_is_remote <", value, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteLessThanOrEqualTo(Boolean value) {
            addCriterion("image_is_remote <=", value, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteIn(List<Boolean> values) {
            addCriterion("image_is_remote in", values, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteNotIn(List<Boolean> values) {
            addCriterion("image_is_remote not in", values, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteBetween(Boolean value1, Boolean value2) {
            addCriterion("image_is_remote between", value1, value2, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageIsRemoteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("image_is_remote not between", value1, value2, "imageIsRemote");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeIsNull() {
            addCriterion("image_createtime is null");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeIsNotNull() {
            addCriterion("image_createtime is not null");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("image_createtime =", value, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("image_createtime <>", value, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("image_createtime >", value, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("image_createtime >=", value, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeLessThan(Date value) {
            addCriterionForJDBCDate("image_createtime <", value, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("image_createtime <=", value, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("image_createtime in", values, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("image_createtime not in", values, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("image_createtime between", value1, value2, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("image_createtime not between", value1, value2, "imageCreatetime");
            return (Criteria) this;
        }

        public Criteria andImageCreatorIsNull() {
            addCriterion("image_creator is null");
            return (Criteria) this;
        }

        public Criteria andImageCreatorIsNotNull() {
            addCriterion("image_creator is not null");
            return (Criteria) this;
        }

        public Criteria andImageCreatorEqualTo(String value) {
            addCriterion("image_creator =", value, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorNotEqualTo(String value) {
            addCriterion("image_creator <>", value, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorGreaterThan(String value) {
            addCriterion("image_creator >", value, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("image_creator >=", value, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorLessThan(String value) {
            addCriterion("image_creator <", value, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorLessThanOrEqualTo(String value) {
            addCriterion("image_creator <=", value, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorLike(String value) {
            addCriterion("image_creator like", value, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorNotLike(String value) {
            addCriterion("image_creator not like", value, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorIn(List<String> values) {
            addCriterion("image_creator in", values, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorNotIn(List<String> values) {
            addCriterion("image_creator not in", values, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorBetween(String value1, String value2) {
            addCriterion("image_creator between", value1, value2, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageCreatorNotBetween(String value1, String value2) {
            addCriterion("image_creator not between", value1, value2, "imageCreator");
            return (Criteria) this;
        }

        public Criteria andImageTypeIsNull() {
            addCriterion("image_type is null");
            return (Criteria) this;
        }

        public Criteria andImageTypeIsNotNull() {
            addCriterion("image_type is not null");
            return (Criteria) this;
        }

        public Criteria andImageTypeEqualTo(String value) {
            addCriterion("image_type =", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotEqualTo(String value) {
            addCriterion("image_type <>", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThan(String value) {
            addCriterion("image_type >", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("image_type >=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThan(String value) {
            addCriterion("image_type <", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLessThanOrEqualTo(String value) {
            addCriterion("image_type <=", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeLike(String value) {
            addCriterion("image_type like", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotLike(String value) {
            addCriterion("image_type not like", value, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeIn(List<String> values) {
            addCriterion("image_type in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotIn(List<String> values) {
            addCriterion("image_type not in", values, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeBetween(String value1, String value2) {
            addCriterion("image_type between", value1, value2, "imageType");
            return (Criteria) this;
        }

        public Criteria andImageTypeNotBetween(String value1, String value2) {
            addCriterion("image_type not between", value1, value2, "imageType");
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