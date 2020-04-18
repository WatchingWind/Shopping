package com.shop.mbg.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class PsmProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PsmProductExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNull() {
            addCriterion("brand_id is null");
            return (Criteria) this;
        }

        public Criteria andBrandIdIsNotNull() {
            addCriterion("brand_id is not null");
            return (Criteria) this;
        }

        public Criteria andBrandIdEqualTo(Long value) {
            addCriterion("brand_id =", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotEqualTo(Long value) {
            addCriterion("brand_id <>", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThan(Long value) {
            addCriterion("brand_id >", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("brand_id >=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThan(Long value) {
            addCriterion("brand_id <", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdLessThanOrEqualTo(Long value) {
            addCriterion("brand_id <=", value, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdIn(List<Long> values) {
            addCriterion("brand_id in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotIn(List<Long> values) {
            addCriterion("brand_id not in", values, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdBetween(Long value1, Long value2) {
            addCriterion("brand_id between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andBrandIdNotBetween(Long value1, Long value2) {
            addCriterion("brand_id not between", value1, value2, "brandId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNull() {
            addCriterion("product_category_id is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIsNotNull() {
            addCriterion("product_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdEqualTo(Long value) {
            addCriterion("product_category_id =", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotEqualTo(Long value) {
            addCriterion("product_category_id <>", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThan(Long value) {
            addCriterion("product_category_id >", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_category_id >=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThan(Long value) {
            addCriterion("product_category_id <", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdLessThanOrEqualTo(Long value) {
            addCriterion("product_category_id <=", value, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdIn(List<Long> values) {
            addCriterion("product_category_id in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotIn(List<Long> values) {
            addCriterion("product_category_id not in", values, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdBetween(Long value1, Long value2) {
            addCriterion("product_category_id between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andProductCategoryIdNotBetween(Long value1, Long value2) {
            addCriterion("product_category_id not between", value1, value2, "productCategoryId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdIsNull() {
            addCriterion("feight_templete_id is null");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdIsNotNull() {
            addCriterion("feight_templete_id is not null");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdEqualTo(Long value) {
            addCriterion("feight_templete_id =", value, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdNotEqualTo(Long value) {
            addCriterion("feight_templete_id <>", value, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdGreaterThan(Long value) {
            addCriterion("feight_templete_id >", value, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdGreaterThanOrEqualTo(Long value) {
            addCriterion("feight_templete_id >=", value, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdLessThan(Long value) {
            addCriterion("feight_templete_id <", value, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdLessThanOrEqualTo(Long value) {
            addCriterion("feight_templete_id <=", value, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdIn(List<Long> values) {
            addCriterion("feight_templete_id in", values, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdNotIn(List<Long> values) {
            addCriterion("feight_templete_id not in", values, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdBetween(Long value1, Long value2) {
            addCriterion("feight_templete_id between", value1, value2, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andFeightTempleteIdNotBetween(Long value1, Long value2) {
            addCriterion("feight_templete_id not between", value1, value2, "feightTempleteId");
            return (Criteria) this;
        }

        public Criteria andOrigPriceIsNull() {
            addCriterion("orig_price is null");
            return (Criteria) this;
        }

        public Criteria andOrigPriceIsNotNull() {
            addCriterion("orig_price is not null");
            return (Criteria) this;
        }

        public Criteria andOrigPriceEqualTo(BigDecimal value) {
            addCriterion("orig_price =", value, "origPrice");
            return (Criteria) this;
        }

        public Criteria andOrigPriceNotEqualTo(BigDecimal value) {
            addCriterion("orig_price <>", value, "origPrice");
            return (Criteria) this;
        }

        public Criteria andOrigPriceGreaterThan(BigDecimal value) {
            addCriterion("orig_price >", value, "origPrice");
            return (Criteria) this;
        }

        public Criteria andOrigPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orig_price >=", value, "origPrice");
            return (Criteria) this;
        }

        public Criteria andOrigPriceLessThan(BigDecimal value) {
            addCriterion("orig_price <", value, "origPrice");
            return (Criteria) this;
        }

        public Criteria andOrigPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orig_price <=", value, "origPrice");
            return (Criteria) this;
        }

        public Criteria andOrigPriceIn(List<BigDecimal> values) {
            addCriterion("orig_price in", values, "origPrice");
            return (Criteria) this;
        }

        public Criteria andOrigPriceNotIn(List<BigDecimal> values) {
            addCriterion("orig_price not in", values, "origPrice");
            return (Criteria) this;
        }

        public Criteria andOrigPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orig_price between", value1, value2, "origPrice");
            return (Criteria) this;
        }

        public Criteria andOrigPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orig_price not between", value1, value2, "origPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceIsNull() {
            addCriterion("cur_price is null");
            return (Criteria) this;
        }

        public Criteria andCurPriceIsNotNull() {
            addCriterion("cur_price is not null");
            return (Criteria) this;
        }

        public Criteria andCurPriceEqualTo(BigDecimal value) {
            addCriterion("cur_price =", value, "curPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceNotEqualTo(BigDecimal value) {
            addCriterion("cur_price <>", value, "curPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceGreaterThan(BigDecimal value) {
            addCriterion("cur_price >", value, "curPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_price >=", value, "curPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceLessThan(BigDecimal value) {
            addCriterion("cur_price <", value, "curPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_price <=", value, "curPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceIn(List<BigDecimal> values) {
            addCriterion("cur_price in", values, "curPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceNotIn(List<BigDecimal> values) {
            addCriterion("cur_price not in", values, "curPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_price between", value1, value2, "curPrice");
            return (Criteria) this;
        }

        public Criteria andCurPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_price not between", value1, value2, "curPrice");
            return (Criteria) this;
        }

        public Criteria andAttributeIsNull() {
            addCriterion("attribute is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIsNotNull() {
            addCriterion("attribute is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeEqualTo(String value) {
            addCriterion("attribute =", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotEqualTo(String value) {
            addCriterion("attribute <>", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeGreaterThan(String value) {
            addCriterion("attribute >", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeGreaterThanOrEqualTo(String value) {
            addCriterion("attribute >=", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeLessThan(String value) {
            addCriterion("attribute <", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeLessThanOrEqualTo(String value) {
            addCriterion("attribute <=", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeLike(String value) {
            addCriterion("attribute like", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotLike(String value) {
            addCriterion("attribute not like", value, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeIn(List<String> values) {
            addCriterion("attribute in", values, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotIn(List<String> values) {
            addCriterion("attribute not in", values, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeBetween(String value1, String value2) {
            addCriterion("attribute between", value1, value2, "attribute");
            return (Criteria) this;
        }

        public Criteria andAttributeNotBetween(String value1, String value2) {
            addCriterion("attribute not between", value1, value2, "attribute");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBigPictureIsNull() {
            addCriterion("big_picture is null");
            return (Criteria) this;
        }

        public Criteria andBigPictureIsNotNull() {
            addCriterion("big_picture is not null");
            return (Criteria) this;
        }

        public Criteria andBigPictureEqualTo(String value) {
            addCriterion("big_picture =", value, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureNotEqualTo(String value) {
            addCriterion("big_picture <>", value, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureGreaterThan(String value) {
            addCriterion("big_picture >", value, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureGreaterThanOrEqualTo(String value) {
            addCriterion("big_picture >=", value, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureLessThan(String value) {
            addCriterion("big_picture <", value, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureLessThanOrEqualTo(String value) {
            addCriterion("big_picture <=", value, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureLike(String value) {
            addCriterion("big_picture like", value, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureNotLike(String value) {
            addCriterion("big_picture not like", value, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureIn(List<String> values) {
            addCriterion("big_picture in", values, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureNotIn(List<String> values) {
            addCriterion("big_picture not in", values, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureBetween(String value1, String value2) {
            addCriterion("big_picture between", value1, value2, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andBigPictureNotBetween(String value1, String value2) {
            addCriterion("big_picture not between", value1, value2, "bigPicture");
            return (Criteria) this;
        }

        public Criteria andPictureIsNull() {
            addCriterion("picture is null");
            return (Criteria) this;
        }

        public Criteria andPictureIsNotNull() {
            addCriterion("picture is not null");
            return (Criteria) this;
        }

        public Criteria andPictureEqualTo(String value) {
            addCriterion("picture =", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotEqualTo(String value) {
            addCriterion("picture <>", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThan(String value) {
            addCriterion("picture >", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureGreaterThanOrEqualTo(String value) {
            addCriterion("picture >=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThan(String value) {
            addCriterion("picture <", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLessThanOrEqualTo(String value) {
            addCriterion("picture <=", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureLike(String value) {
            addCriterion("picture like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotLike(String value) {
            addCriterion("picture not like", value, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureIn(List<String> values) {
            addCriterion("picture in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotIn(List<String> values) {
            addCriterion("picture not in", values, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureBetween(String value1, String value2) {
            addCriterion("picture between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPictureNotBetween(String value1, String value2) {
            addCriterion("picture not between", value1, value2, "picture");
            return (Criteria) this;
        }

        public Criteria andPublishIsNull() {
            addCriterion("publish is null");
            return (Criteria) this;
        }

        public Criteria andPublishIsNotNull() {
            addCriterion("publish is not null");
            return (Criteria) this;
        }

        public Criteria andPublishEqualTo(Integer value) {
            addCriterion("publish =", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotEqualTo(Integer value) {
            addCriterion("publish <>", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThan(Integer value) {
            addCriterion("publish >", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishGreaterThanOrEqualTo(Integer value) {
            addCriterion("publish >=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThan(Integer value) {
            addCriterion("publish <", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishLessThanOrEqualTo(Integer value) {
            addCriterion("publish <=", value, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishIn(List<Integer> values) {
            addCriterion("publish in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotIn(List<Integer> values) {
            addCriterion("publish not in", values, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishBetween(Integer value1, Integer value2) {
            addCriterion("publish between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andPublishNotBetween(Integer value1, Integer value2) {
            addCriterion("publish not between", value1, value2, "publish");
            return (Criteria) this;
        }

        public Criteria andNewStatusIsNull() {
            addCriterion("new_status is null");
            return (Criteria) this;
        }

        public Criteria andNewStatusIsNotNull() {
            addCriterion("new_status is not null");
            return (Criteria) this;
        }

        public Criteria andNewStatusEqualTo(Integer value) {
            addCriterion("new_status =", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotEqualTo(Integer value) {
            addCriterion("new_status <>", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusGreaterThan(Integer value) {
            addCriterion("new_status >", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_status >=", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusLessThan(Integer value) {
            addCriterion("new_status <", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusLessThanOrEqualTo(Integer value) {
            addCriterion("new_status <=", value, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusIn(List<Integer> values) {
            addCriterion("new_status in", values, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotIn(List<Integer> values) {
            addCriterion("new_status not in", values, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusBetween(Integer value1, Integer value2) {
            addCriterion("new_status between", value1, value2, "newStatus");
            return (Criteria) this;
        }

        public Criteria andNewStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("new_status not between", value1, value2, "newStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusIsNull() {
            addCriterion("recommand_status is null");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusIsNotNull() {
            addCriterion("recommand_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusEqualTo(Integer value) {
            addCriterion("recommand_status =", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusNotEqualTo(Integer value) {
            addCriterion("recommand_status <>", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusGreaterThan(Integer value) {
            addCriterion("recommand_status >", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("recommand_status >=", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusLessThan(Integer value) {
            addCriterion("recommand_status <", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusLessThanOrEqualTo(Integer value) {
            addCriterion("recommand_status <=", value, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusIn(List<Integer> values) {
            addCriterion("recommand_status in", values, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusNotIn(List<Integer> values) {
            addCriterion("recommand_status not in", values, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusBetween(Integer value1, Integer value2) {
            addCriterion("recommand_status between", value1, value2, "recommandStatus");
            return (Criteria) this;
        }

        public Criteria andRecommandStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("recommand_status not between", value1, value2, "recommandStatus");
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