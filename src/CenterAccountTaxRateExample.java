import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CenterAccountTaxRateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterAccountTaxRateExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdIsNull() {
            addCriterion("account_set_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdIsNotNull() {
            addCriterion("account_set_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdEqualTo(Long value) {
            addCriterion("account_set_id =", value, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdNotEqualTo(Long value) {
            addCriterion("account_set_id <>", value, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdGreaterThan(Long value) {
            addCriterion("account_set_id >", value, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_set_id >=", value, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdLessThan(Long value) {
            addCriterion("account_set_id <", value, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdLessThanOrEqualTo(Long value) {
            addCriterion("account_set_id <=", value, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdIn(List<Long> values) {
            addCriterion("account_set_id in", values, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdNotIn(List<Long> values) {
            addCriterion("account_set_id not in", values, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdBetween(Long value1, Long value2) {
            addCriterion("account_set_id between", value1, value2, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andAccountSetIdNotBetween(Long value1, Long value2) {
            addCriterion("account_set_id not between", value1, value2, "accountSetId");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeIsNull() {
            addCriterion("tax_rate_code is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeIsNotNull() {
            addCriterion("tax_rate_code is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeEqualTo(String value) {
            addCriterion("tax_rate_code =", value, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeNotEqualTo(String value) {
            addCriterion("tax_rate_code <>", value, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeGreaterThan(String value) {
            addCriterion("tax_rate_code >", value, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeGreaterThanOrEqualTo(String value) {
            addCriterion("tax_rate_code >=", value, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeLessThan(String value) {
            addCriterion("tax_rate_code <", value, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeLessThanOrEqualTo(String value) {
            addCriterion("tax_rate_code <=", value, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeLike(String value) {
            addCriterion("tax_rate_code like", value, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeNotLike(String value) {
            addCriterion("tax_rate_code not like", value, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeIn(List<String> values) {
            addCriterion("tax_rate_code in", values, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeNotIn(List<String> values) {
            addCriterion("tax_rate_code not in", values, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeBetween(String value1, String value2) {
            addCriterion("tax_rate_code between", value1, value2, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateCodeNotBetween(String value1, String value2) {
            addCriterion("tax_rate_code not between", value1, value2, "taxRateCode");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameIsNull() {
            addCriterion("tax_rate_name is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameIsNotNull() {
            addCriterion("tax_rate_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameEqualTo(String value) {
            addCriterion("tax_rate_name =", value, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameNotEqualTo(String value) {
            addCriterion("tax_rate_name <>", value, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameGreaterThan(String value) {
            addCriterion("tax_rate_name >", value, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameGreaterThanOrEqualTo(String value) {
            addCriterion("tax_rate_name >=", value, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameLessThan(String value) {
            addCriterion("tax_rate_name <", value, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameLessThanOrEqualTo(String value) {
            addCriterion("tax_rate_name <=", value, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameLike(String value) {
            addCriterion("tax_rate_name like", value, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameNotLike(String value) {
            addCriterion("tax_rate_name not like", value, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameIn(List<String> values) {
            addCriterion("tax_rate_name in", values, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameNotIn(List<String> values) {
            addCriterion("tax_rate_name not in", values, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameBetween(String value1, String value2) {
            addCriterion("tax_rate_name between", value1, value2, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateNameNotBetween(String value1, String value2) {
            addCriterion("tax_rate_name not between", value1, value2, "taxRateName");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeIsNull() {
            addCriterion("tax_rate_type is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeIsNotNull() {
            addCriterion("tax_rate_type is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeEqualTo(Byte value) {
            addCriterion("tax_rate_type =", value, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeNotEqualTo(Byte value) {
            addCriterion("tax_rate_type <>", value, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeGreaterThan(Byte value) {
            addCriterion("tax_rate_type >", value, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("tax_rate_type >=", value, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeLessThan(Byte value) {
            addCriterion("tax_rate_type <", value, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("tax_rate_type <=", value, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeIn(List<Byte> values) {
            addCriterion("tax_rate_type in", values, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeNotIn(List<Byte> values) {
            addCriterion("tax_rate_type not in", values, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeBetween(Byte value1, Byte value2) {
            addCriterion("tax_rate_type between", value1, value2, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("tax_rate_type not between", value1, value2, "taxRateType");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNull() {
            addCriterion("tax_rate is null");
            return (Criteria) this;
        }

        public Criteria andTaxRateIsNotNull() {
            addCriterion("tax_rate is not null");
            return (Criteria) this;
        }

        public Criteria andTaxRateEqualTo(BigDecimal value) {
            addCriterion("tax_rate =", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotEqualTo(BigDecimal value) {
            addCriterion("tax_rate <>", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThan(BigDecimal value) {
            addCriterion("tax_rate >", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate >=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThan(BigDecimal value) {
            addCriterion("tax_rate <", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("tax_rate <=", value, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateIn(List<BigDecimal> values) {
            addCriterion("tax_rate in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotIn(List<BigDecimal> values) {
            addCriterion("tax_rate not in", values, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andTaxRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("tax_rate not between", value1, value2, "taxRate");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNull() {
            addCriterion("subject_id is null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIsNotNull() {
            addCriterion("subject_id is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectIdEqualTo(Long value) {
            addCriterion("subject_id =", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotEqualTo(Long value) {
            addCriterion("subject_id <>", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThan(Long value) {
            addCriterion("subject_id >", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("subject_id >=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThan(Long value) {
            addCriterion("subject_id <", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdLessThanOrEqualTo(Long value) {
            addCriterion("subject_id <=", value, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdIn(List<Long> values) {
            addCriterion("subject_id in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotIn(List<Long> values) {
            addCriterion("subject_id not in", values, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdBetween(Long value1, Long value2) {
            addCriterion("subject_id between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andSubjectIdNotBetween(Long value1, Long value2) {
            addCriterion("subject_id not between", value1, value2, "subjectId");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Byte value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Byte value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Byte value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Byte value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Byte> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Byte> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNull() {
            addCriterion("operator_name is null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIsNotNull() {
            addCriterion("operator_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperatorNameEqualTo(String value) {
            addCriterion("operator_name =", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotEqualTo(String value) {
            addCriterion("operator_name <>", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThan(String value) {
            addCriterion("operator_name >", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameGreaterThanOrEqualTo(String value) {
            addCriterion("operator_name >=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThan(String value) {
            addCriterion("operator_name <", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLessThanOrEqualTo(String value) {
            addCriterion("operator_name <=", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameLike(String value) {
            addCriterion("operator_name like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotLike(String value) {
            addCriterion("operator_name not like", value, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameIn(List<String> values) {
            addCriterion("operator_name in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotIn(List<String> values) {
            addCriterion("operator_name not in", values, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameBetween(String value1, String value2) {
            addCriterion("operator_name between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andOperatorNameNotBetween(String value1, String value2) {
            addCriterion("operator_name not between", value1, value2, "operatorName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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