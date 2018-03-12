import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CenterAccountTransactionRelationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterAccountTransactionRelationExample() {
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

        public Criteria andAccountTypeIsNull() {
            addCriterion("account_type is null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIsNotNull() {
            addCriterion("account_type is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTypeEqualTo(Byte value) {
            addCriterion("account_type =", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotEqualTo(Byte value) {
            addCriterion("account_type <>", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThan(Byte value) {
            addCriterion("account_type >", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("account_type >=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThan(Byte value) {
            addCriterion("account_type <", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeLessThanOrEqualTo(Byte value) {
            addCriterion("account_type <=", value, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeIn(List<Byte> values) {
            addCriterion("account_type in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotIn(List<Byte> values) {
            addCriterion("account_type not in", values, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeBetween(Byte value1, Byte value2) {
            addCriterion("account_type between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("account_type not between", value1, value2, "accountType");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("account_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("account_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("account_name =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("account_name <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("account_name >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("account_name >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("account_name <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("account_name <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("account_name like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("account_name not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("account_name in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("account_name not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("account_name between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("account_name not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeIsNull() {
            addCriterion("charge_account_type is null");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeIsNotNull() {
            addCriterion("charge_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeEqualTo(String value) {
            addCriterion("charge_account_type =", value, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeNotEqualTo(String value) {
            addCriterion("charge_account_type <>", value, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeGreaterThan(String value) {
            addCriterion("charge_account_type >", value, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("charge_account_type >=", value, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeLessThan(String value) {
            addCriterion("charge_account_type <", value, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("charge_account_type <=", value, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeLike(String value) {
            addCriterion("charge_account_type like", value, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeNotLike(String value) {
            addCriterion("charge_account_type not like", value, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeIn(List<String> values) {
            addCriterion("charge_account_type in", values, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeNotIn(List<String> values) {
            addCriterion("charge_account_type not in", values, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeBetween(String value1, String value2) {
            addCriterion("charge_account_type between", value1, value2, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountTypeNotBetween(String value1, String value2) {
            addCriterion("charge_account_type not between", value1, value2, "chargeAccountType");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameIsNull() {
            addCriterion("charge_account_name is null");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameIsNotNull() {
            addCriterion("charge_account_name is not null");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameEqualTo(String value) {
            addCriterion("charge_account_name =", value, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameNotEqualTo(String value) {
            addCriterion("charge_account_name <>", value, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameGreaterThan(String value) {
            addCriterion("charge_account_name >", value, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("charge_account_name >=", value, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameLessThan(String value) {
            addCriterion("charge_account_name <", value, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameLessThanOrEqualTo(String value) {
            addCriterion("charge_account_name <=", value, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameLike(String value) {
            addCriterion("charge_account_name like", value, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameNotLike(String value) {
            addCriterion("charge_account_name not like", value, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameIn(List<String> values) {
            addCriterion("charge_account_name in", values, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameNotIn(List<String> values) {
            addCriterion("charge_account_name not in", values, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameBetween(String value1, String value2) {
            addCriterion("charge_account_name between", value1, value2, "chargeAccountName");
            return (Criteria) this;
        }

        public Criteria andChargeAccountNameNotBetween(String value1, String value2) {
            addCriterion("charge_account_name not between", value1, value2, "chargeAccountName");
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