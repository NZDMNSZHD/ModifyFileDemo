import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CenterAccountBalanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterAccountBalanceExample() {
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

        public Criteria andAccountIdIsNull() {
            addCriterion("account_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountIdIsNotNull() {
            addCriterion("account_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountIdEqualTo(Long value) {
            addCriterion("account_id =", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotEqualTo(Long value) {
            addCriterion("account_id <>", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThan(Long value) {
            addCriterion("account_id >", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_id >=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThan(Long value) {
            addCriterion("account_id <", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdLessThanOrEqualTo(Long value) {
            addCriterion("account_id <=", value, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdIn(List<Long> values) {
            addCriterion("account_id in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotIn(List<Long> values) {
            addCriterion("account_id not in", values, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdBetween(Long value1, Long value2) {
            addCriterion("account_id between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountIdNotBetween(Long value1, Long value2) {
            addCriterion("account_id not between", value1, value2, "accountId");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("account_no is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("account_no is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("account_no =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("account_no <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("account_no >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("account_no >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("account_no <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("account_no <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("account_no like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("account_no not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("account_no in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("account_no not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("account_no between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("account_no not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountIsNull() {
            addCriterion("use_amount is null");
            return (Criteria) this;
        }

        public Criteria andUseAmountIsNotNull() {
            addCriterion("use_amount is not null");
            return (Criteria) this;
        }

        public Criteria andUseAmountEqualTo(BigDecimal value) {
            addCriterion("use_amount =", value, "useAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountNotEqualTo(BigDecimal value) {
            addCriterion("use_amount <>", value, "useAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountGreaterThan(BigDecimal value) {
            addCriterion("use_amount >", value, "useAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("use_amount >=", value, "useAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountLessThan(BigDecimal value) {
            addCriterion("use_amount <", value, "useAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("use_amount <=", value, "useAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountIn(List<BigDecimal> values) {
            addCriterion("use_amount in", values, "useAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountNotIn(List<BigDecimal> values) {
            addCriterion("use_amount not in", values, "useAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_amount between", value1, value2, "useAmount");
            return (Criteria) this;
        }

        public Criteria andUseAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("use_amount not between", value1, value2, "useAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountIsNull() {
            addCriterion("no_use_amount is null");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountIsNotNull() {
            addCriterion("no_use_amount is not null");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountEqualTo(BigDecimal value) {
            addCriterion("no_use_amount =", value, "noUseAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountNotEqualTo(BigDecimal value) {
            addCriterion("no_use_amount <>", value, "noUseAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountGreaterThan(BigDecimal value) {
            addCriterion("no_use_amount >", value, "noUseAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("no_use_amount >=", value, "noUseAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountLessThan(BigDecimal value) {
            addCriterion("no_use_amount <", value, "noUseAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("no_use_amount <=", value, "noUseAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountIn(List<BigDecimal> values) {
            addCriterion("no_use_amount in", values, "noUseAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountNotIn(List<BigDecimal> values) {
            addCriterion("no_use_amount not in", values, "noUseAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_use_amount between", value1, value2, "noUseAmount");
            return (Criteria) this;
        }

        public Criteria andNoUseAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("no_use_amount not between", value1, value2, "noUseAmount");
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