package org.deepwater.daisy.entity.blog;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class BlogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlogExample() {
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

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(Integer value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(Integer value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(Integer value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(Integer value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<Integer> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<Integer> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(Integer value1, Integer value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNull() {
            addCriterion("blog_title is null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIsNotNull() {
            addCriterion("blog_title is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTitleEqualTo(String value) {
            addCriterion("blog_title =", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotEqualTo(String value) {
            addCriterion("blog_title <>", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThan(String value) {
            addCriterion("blog_title >", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_title >=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThan(String value) {
            addCriterion("blog_title <", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLessThanOrEqualTo(String value) {
            addCriterion("blog_title <=", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleLike(String value) {
            addCriterion("blog_title like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotLike(String value) {
            addCriterion("blog_title not like", value, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleIn(List<String> values) {
            addCriterion("blog_title in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotIn(List<String> values) {
            addCriterion("blog_title not in", values, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleBetween(String value1, String value2) {
            addCriterion("blog_title between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogTitleNotBetween(String value1, String value2) {
            addCriterion("blog_title not between", value1, value2, "blogTitle");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNull() {
            addCriterion("blog_author is null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIsNotNull() {
            addCriterion("blog_author is not null");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorEqualTo(String value) {
            addCriterion("blog_author =", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotEqualTo(String value) {
            addCriterion("blog_author <>", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThan(String value) {
            addCriterion("blog_author >", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("blog_author >=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThan(String value) {
            addCriterion("blog_author <", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLessThanOrEqualTo(String value) {
            addCriterion("blog_author <=", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorLike(String value) {
            addCriterion("blog_author like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotLike(String value) {
            addCriterion("blog_author not like", value, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorIn(List<String> values) {
            addCriterion("blog_author in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotIn(List<String> values) {
            addCriterion("blog_author not in", values, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorBetween(String value1, String value2) {
            addCriterion("blog_author between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogAuthorNotBetween(String value1, String value2) {
            addCriterion("blog_author not between", value1, value2, "blogAuthor");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeIsNull() {
            addCriterion("blog_publishtime is null");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeIsNotNull() {
            addCriterion("blog_publishtime is not null");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeEqualTo(Date value) {
            addCriterionForJDBCDate("blog_publishtime =", value, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("blog_publishtime <>", value, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("blog_publishtime >", value, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("blog_publishtime >=", value, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeLessThan(Date value) {
            addCriterionForJDBCDate("blog_publishtime <", value, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("blog_publishtime <=", value, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeIn(List<Date> values) {
            addCriterionForJDBCDate("blog_publishtime in", values, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("blog_publishtime not in", values, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("blog_publishtime between", value1, value2, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogPublishtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("blog_publishtime not between", value1, value2, "blogPublishtime");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlIsNull() {
            addCriterion("blog_bannerurl is null");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlIsNotNull() {
            addCriterion("blog_bannerurl is not null");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlEqualTo(String value) {
            addCriterion("blog_bannerurl =", value, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlNotEqualTo(String value) {
            addCriterion("blog_bannerurl <>", value, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlGreaterThan(String value) {
            addCriterion("blog_bannerurl >", value, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlGreaterThanOrEqualTo(String value) {
            addCriterion("blog_bannerurl >=", value, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlLessThan(String value) {
            addCriterion("blog_bannerurl <", value, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlLessThanOrEqualTo(String value) {
            addCriterion("blog_bannerurl <=", value, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlLike(String value) {
            addCriterion("blog_bannerurl like", value, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlNotLike(String value) {
            addCriterion("blog_bannerurl not like", value, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlIn(List<String> values) {
            addCriterion("blog_bannerurl in", values, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlNotIn(List<String> values) {
            addCriterion("blog_bannerurl not in", values, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlBetween(String value1, String value2) {
            addCriterion("blog_bannerurl between", value1, value2, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogBannerurlNotBetween(String value1, String value2) {
            addCriterion("blog_bannerurl not between", value1, value2, "blogBannerurl");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionIsNull() {
            addCriterion("blog_introduction is null");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionIsNotNull() {
            addCriterion("blog_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionEqualTo(String value) {
            addCriterion("blog_introduction =", value, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionNotEqualTo(String value) {
            addCriterion("blog_introduction <>", value, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionGreaterThan(String value) {
            addCriterion("blog_introduction >", value, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("blog_introduction >=", value, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionLessThan(String value) {
            addCriterion("blog_introduction <", value, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionLessThanOrEqualTo(String value) {
            addCriterion("blog_introduction <=", value, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionLike(String value) {
            addCriterion("blog_introduction like", value, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionNotLike(String value) {
            addCriterion("blog_introduction not like", value, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionIn(List<String> values) {
            addCriterion("blog_introduction in", values, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionNotIn(List<String> values) {
            addCriterion("blog_introduction not in", values, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionBetween(String value1, String value2) {
            addCriterion("blog_introduction between", value1, value2, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogIntroductionNotBetween(String value1, String value2) {
            addCriterion("blog_introduction not between", value1, value2, "blogIntroduction");
            return (Criteria) this;
        }

        public Criteria andBlogStatusIsNull() {
            addCriterion("blog_status is null");
            return (Criteria) this;
        }

        public Criteria andBlogStatusIsNotNull() {
            addCriterion("blog_status is not null");
            return (Criteria) this;
        }

        public Criteria andBlogStatusEqualTo(String value) {
            addCriterion("blog_status =", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusNotEqualTo(String value) {
            addCriterion("blog_status <>", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusGreaterThan(String value) {
            addCriterion("blog_status >", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusGreaterThanOrEqualTo(String value) {
            addCriterion("blog_status >=", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusLessThan(String value) {
            addCriterion("blog_status <", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusLessThanOrEqualTo(String value) {
            addCriterion("blog_status <=", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusLike(String value) {
            addCriterion("blog_status like", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusNotLike(String value) {
            addCriterion("blog_status not like", value, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusIn(List<String> values) {
            addCriterion("blog_status in", values, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusNotIn(List<String> values) {
            addCriterion("blog_status not in", values, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusBetween(String value1, String value2) {
            addCriterion("blog_status between", value1, value2, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogStatusNotBetween(String value1, String value2) {
            addCriterion("blog_status not between", value1, value2, "blogStatus");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIsNull() {
            addCriterion("blog_type is null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIsNotNull() {
            addCriterion("blog_type is not null");
            return (Criteria) this;
        }

        public Criteria andBlogTypeEqualTo(String value) {
            addCriterion("blog_type =", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotEqualTo(String value) {
            addCriterion("blog_type <>", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeGreaterThan(String value) {
            addCriterion("blog_type >", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeGreaterThanOrEqualTo(String value) {
            addCriterion("blog_type >=", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLessThan(String value) {
            addCriterion("blog_type <", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLessThanOrEqualTo(String value) {
            addCriterion("blog_type <=", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeLike(String value) {
            addCriterion("blog_type like", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotLike(String value) {
            addCriterion("blog_type not like", value, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeIn(List<String> values) {
            addCriterion("blog_type in", values, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotIn(List<String> values) {
            addCriterion("blog_type not in", values, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeBetween(String value1, String value2) {
            addCriterion("blog_type between", value1, value2, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogTypeNotBetween(String value1, String value2) {
            addCriterion("blog_type not between", value1, value2, "blogType");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleIsNull() {
            addCriterion("blog_subtitle is null");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleIsNotNull() {
            addCriterion("blog_subtitle is not null");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleEqualTo(String value) {
            addCriterion("blog_subtitle =", value, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleNotEqualTo(String value) {
            addCriterion("blog_subtitle <>", value, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleGreaterThan(String value) {
            addCriterion("blog_subtitle >", value, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleGreaterThanOrEqualTo(String value) {
            addCriterion("blog_subtitle >=", value, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleLessThan(String value) {
            addCriterion("blog_subtitle <", value, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleLessThanOrEqualTo(String value) {
            addCriterion("blog_subtitle <=", value, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleLike(String value) {
            addCriterion("blog_subtitle like", value, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleNotLike(String value) {
            addCriterion("blog_subtitle not like", value, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleIn(List<String> values) {
            addCriterion("blog_subtitle in", values, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleNotIn(List<String> values) {
            addCriterion("blog_subtitle not in", values, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleBetween(String value1, String value2) {
            addCriterion("blog_subtitle between", value1, value2, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogSubtitleNotBetween(String value1, String value2) {
            addCriterion("blog_subtitle not between", value1, value2, "blogSubtitle");
            return (Criteria) this;
        }

        public Criteria andBlogNumberIsNull() {
            addCriterion("blog_number is null");
            return (Criteria) this;
        }

        public Criteria andBlogNumberIsNotNull() {
            addCriterion("blog_number is not null");
            return (Criteria) this;
        }

        public Criteria andBlogNumberEqualTo(String value) {
            addCriterion("blog_number =", value, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberNotEqualTo(String value) {
            addCriterion("blog_number <>", value, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberGreaterThan(String value) {
            addCriterion("blog_number >", value, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberGreaterThanOrEqualTo(String value) {
            addCriterion("blog_number >=", value, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberLessThan(String value) {
            addCriterion("blog_number <", value, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberLessThanOrEqualTo(String value) {
            addCriterion("blog_number <=", value, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberLike(String value) {
            addCriterion("blog_number like", value, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberNotLike(String value) {
            addCriterion("blog_number not like", value, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberIn(List<String> values) {
            addCriterion("blog_number in", values, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberNotIn(List<String> values) {
            addCriterion("blog_number not in", values, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberBetween(String value1, String value2) {
            addCriterion("blog_number between", value1, value2, "blogNumber");
            return (Criteria) this;
        }

        public Criteria andBlogNumberNotBetween(String value1, String value2) {
            addCriterion("blog_number not between", value1, value2, "blogNumber");
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