import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CenterChargeTransactionRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterChargeTransactionRelationExample() {
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

        public Criteria andTransactionTypeIsNull() {
            addCriterion("transaction_type is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIsNotNull() {
            addCriterion("transaction_type is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeEqualTo(String value) {
            addCriterion("transaction_type =", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotEqualTo(String value) {
            addCriterion("transaction_type <>", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThan(String value) {
            addCriterion("transaction_type >", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_type >=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThan(String value) {
            addCriterion("transaction_type <", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLessThanOrEqualTo(String value) {
            addCriterion("transaction_type <=", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeLike(String value) {
            addCriterion("transaction_type like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotLike(String value) {
            addCriterion("transaction_type not like", value, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeIn(List<String> values) {
            addCriterion("transaction_type in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotIn(List<String> values) {
            addCriterion("transaction_type not in", values, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeBetween(String value1, String value2) {
            addCriterion("transaction_type between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNotBetween(String value1, String value2) {
            addCriterion("transaction_type not between", value1, value2, "transactionType");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameIsNull() {
            addCriterion("transaction_type_name is null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameIsNotNull() {
            addCriterion("transaction_type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameEqualTo(String value) {
            addCriterion("transaction_type_name =", value, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameNotEqualTo(String value) {
            addCriterion("transaction_type_name <>", value, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameGreaterThan(String value) {
            addCriterion("transaction_type_name >", value, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_type_name >=", value, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameLessThan(String value) {
            addCriterion("transaction_type_name <", value, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameLessThanOrEqualTo(String value) {
            addCriterion("transaction_type_name <=", value, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameLike(String value) {
            addCriterion("transaction_type_name like", value, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameNotLike(String value) {
            addCriterion("transaction_type_name not like", value, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameIn(List<String> values) {
            addCriterion("transaction_type_name in", values, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameNotIn(List<String> values) {
            addCriterion("transaction_type_name not in", values, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameBetween(String value1, String value2) {
            addCriterion("transaction_type_name between", value1, value2, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andTransactionTypeNameNotBetween(String value1, String value2) {
            addCriterion("transaction_type_name not between", value1, value2, "transactionTypeName");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeIsNull() {
            addCriterion("charge_value_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeIsNotNull() {
            addCriterion("charge_value_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeEqualTo(Byte value) {
            addCriterion("charge_value_type =", value, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeNotEqualTo(Byte value) {
            addCriterion("charge_value_type <>", value, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeGreaterThan(Byte value) {
            addCriterion("charge_value_type >", value, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("charge_value_type >=", value, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeLessThan(Byte value) {
            addCriterion("charge_value_type <", value, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeLessThanOrEqualTo(Byte value) {
            addCriterion("charge_value_type <=", value, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeIn(List<Byte> values) {
            addCriterion("charge_value_type in", values, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeNotIn(List<Byte> values) {
            addCriterion("charge_value_type not in", values, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeBetween(Byte value1, Byte value2) {
            addCriterion("charge_value_type between", value1, value2, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("charge_value_type not between", value1, value2, "chargeValueType");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameIsNull() {
            addCriterion("charge_value_name is null");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameIsNotNull() {
            addCriterion("charge_value_name is not null");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameEqualTo(String value) {
            addCriterion("charge_value_name =", value, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameNotEqualTo(String value) {
            addCriterion("charge_value_name <>", value, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameGreaterThan(String value) {
            addCriterion("charge_value_name >", value, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameGreaterThanOrEqualTo(String value) {
            addCriterion("charge_value_name >=", value, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameLessThan(String value) {
            addCriterion("charge_value_name <", value, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameLessThanOrEqualTo(String value) {
            addCriterion("charge_value_name <=", value, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameLike(String value) {
            addCriterion("charge_value_name like", value, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameNotLike(String value) {
            addCriterion("charge_value_name not like", value, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameIn(List<String> values) {
            addCriterion("charge_value_name in", values, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameNotIn(List<String> values) {
            addCriterion("charge_value_name not in", values, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameBetween(String value1, String value2) {
            addCriterion("charge_value_name between", value1, value2, "chargeValueName");
            return (Criteria) this;
        }

        public Criteria andChargeValueNameNotBetween(String value1, String value2) {
            addCriterion("charge_value_name not between", value1, value2, "chargeValueName");
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