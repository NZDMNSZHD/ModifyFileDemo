import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CenterAccountChangeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterAccountChangeExample() {
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

        public Criteria andAccountDateIsNull() {
            addCriterion("account_date is null");
            return (Criteria) this;
        }

        public Criteria andAccountDateIsNotNull() {
            addCriterion("account_date is not null");
            return (Criteria) this;
        }

        public Criteria andAccountDateEqualTo(Date value) {
            addCriterionForJDBCDate("account_date =", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("account_date <>", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThan(Date value) {
            addCriterionForJDBCDate("account_date >", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_date >=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThan(Date value) {
            addCriterionForJDBCDate("account_date <", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_date <=", value, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateIn(List<Date> values) {
            addCriterionForJDBCDate("account_date in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("account_date not in", values, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_date between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andAccountDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_date not between", value1, value2, "accountDate");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(BigDecimal value) {
            addCriterion("recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(BigDecimal value) {
            addCriterion("recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(BigDecimal value) {
            addCriterion("recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(BigDecimal value) {
            addCriterion("recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<BigDecimal> values) {
            addCriterion("recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<BigDecimal> values) {
            addCriterion("recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyIsNull() {
            addCriterion("cash_money is null");
            return (Criteria) this;
        }

        public Criteria andCashMoneyIsNotNull() {
            addCriterion("cash_money is not null");
            return (Criteria) this;
        }

        public Criteria andCashMoneyEqualTo(BigDecimal value) {
            addCriterion("cash_money =", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyNotEqualTo(BigDecimal value) {
            addCriterion("cash_money <>", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyGreaterThan(BigDecimal value) {
            addCriterion("cash_money >", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_money >=", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyLessThan(BigDecimal value) {
            addCriterion("cash_money <", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cash_money <=", value, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyIn(List<BigDecimal> values) {
            addCriterion("cash_money in", values, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyNotIn(List<BigDecimal> values) {
            addCriterion("cash_money not in", values, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_money between", value1, value2, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andCashMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cash_money not between", value1, value2, "cashMoney");
            return (Criteria) this;
        }

        public Criteria andUserAmountIsNull() {
            addCriterion("user_amount is null");
            return (Criteria) this;
        }

        public Criteria andUserAmountIsNotNull() {
            addCriterion("user_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUserAmountEqualTo(BigDecimal value) {
            addCriterion("user_amount =", value, "userAmount");
            return (Criteria) this;
        }

        public Criteria andUserAmountNotEqualTo(BigDecimal value) {
            addCriterion("user_amount <>", value, "userAmount");
            return (Criteria) this;
        }

        public Criteria andUserAmountGreaterThan(BigDecimal value) {
            addCriterion("user_amount >", value, "userAmount");
            return (Criteria) this;
        }

        public Criteria andUserAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("user_amount >=", value, "userAmount");
            return (Criteria) this;
        }

        public Criteria andUserAmountLessThan(BigDecimal value) {
            addCriterion("user_amount <", value, "userAmount");
            return (Criteria) this;
        }

        public Criteria andUserAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("user_amount <=", value, "userAmount");
            return (Criteria) this;
        }

        public Criteria andUserAmountIn(List<BigDecimal> values) {
            addCriterion("user_amount in", values, "userAmount");
            return (Criteria) this;
        }

        public Criteria andUserAmountNotIn(List<BigDecimal> values) {
            addCriterion("user_amount not in", values, "userAmount");
            return (Criteria) this;
        }

        public Criteria andUserAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_amount between", value1, value2, "userAmount");
            return (Criteria) this;
        }

        public Criteria andUserAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("user_amount not between", value1, value2, "userAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountIsNull() {
            addCriterion("platform_amount is null");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountIsNotNull() {
            addCriterion("platform_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountEqualTo(BigDecimal value) {
            addCriterion("platform_amount =", value, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountNotEqualTo(BigDecimal value) {
            addCriterion("platform_amount <>", value, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountGreaterThan(BigDecimal value) {
            addCriterion("platform_amount >", value, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_amount >=", value, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountLessThan(BigDecimal value) {
            addCriterion("platform_amount <", value, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("platform_amount <=", value, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountIn(List<BigDecimal> values) {
            addCriterion("platform_amount in", values, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountNotIn(List<BigDecimal> values) {
            addCriterion("platform_amount not in", values, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_amount between", value1, value2, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andPlatformAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("platform_amount not between", value1, value2, "platformAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountIsNull() {
            addCriterion("exchange_amount is null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountIsNotNull() {
            addCriterion("exchange_amount is not null");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountEqualTo(BigDecimal value) {
            addCriterion("exchange_amount =", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNotEqualTo(BigDecimal value) {
            addCriterion("exchange_amount <>", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountGreaterThan(BigDecimal value) {
            addCriterion("exchange_amount >", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_amount >=", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountLessThan(BigDecimal value) {
            addCriterion("exchange_amount <", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("exchange_amount <=", value, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountIn(List<BigDecimal> values) {
            addCriterion("exchange_amount in", values, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNotIn(List<BigDecimal> values) {
            addCriterion("exchange_amount not in", values, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_amount between", value1, value2, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andExchangeAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("exchange_amount not between", value1, value2, "exchangeAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountIsNull() {
            addCriterion("reserves_amount is null");
            return (Criteria) this;
        }

        public Criteria andReservesAmountIsNotNull() {
            addCriterion("reserves_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReservesAmountEqualTo(BigDecimal value) {
            addCriterion("reserves_amount =", value, "reservesAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountNotEqualTo(BigDecimal value) {
            addCriterion("reserves_amount <>", value, "reservesAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountGreaterThan(BigDecimal value) {
            addCriterion("reserves_amount >", value, "reservesAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("reserves_amount >=", value, "reservesAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountLessThan(BigDecimal value) {
            addCriterion("reserves_amount <", value, "reservesAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("reserves_amount <=", value, "reservesAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountIn(List<BigDecimal> values) {
            addCriterion("reserves_amount in", values, "reservesAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountNotIn(List<BigDecimal> values) {
            addCriterion("reserves_amount not in", values, "reservesAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserves_amount between", value1, value2, "reservesAmount");
            return (Criteria) this;
        }

        public Criteria andReservesAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("reserves_amount not between", value1, value2, "reservesAmount");
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