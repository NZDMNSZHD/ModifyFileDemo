import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CenterAccountDateExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterAccountDateExample() {
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

        public Criteria andAccountStartYearIsNull() {
            addCriterion("account_start_year is null");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearIsNotNull() {
            addCriterion("account_start_year is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearEqualTo(Date value) {
            addCriterionForJDBCDate("account_start_year =", value, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("account_start_year <>", value, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearGreaterThan(Date value) {
            addCriterionForJDBCDate("account_start_year >", value, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_start_year >=", value, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearLessThan(Date value) {
            addCriterionForJDBCDate("account_start_year <", value, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_start_year <=", value, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearIn(List<Date> values) {
            addCriterionForJDBCDate("account_start_year in", values, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("account_start_year not in", values, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_start_year between", value1, value2, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_start_year not between", value1, value2, "accountStartYear");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthIsNull() {
            addCriterion("account_start_month is null");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthIsNotNull() {
            addCriterion("account_start_month is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthEqualTo(Byte value) {
            addCriterion("account_start_month =", value, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthNotEqualTo(Byte value) {
            addCriterion("account_start_month <>", value, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthGreaterThan(Byte value) {
            addCriterion("account_start_month >", value, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthGreaterThanOrEqualTo(Byte value) {
            addCriterion("account_start_month >=", value, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthLessThan(Byte value) {
            addCriterion("account_start_month <", value, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthLessThanOrEqualTo(Byte value) {
            addCriterion("account_start_month <=", value, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthIn(List<Byte> values) {
            addCriterion("account_start_month in", values, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthNotIn(List<Byte> values) {
            addCriterion("account_start_month not in", values, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthBetween(Byte value1, Byte value2) {
            addCriterion("account_start_month between", value1, value2, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountStartMonthNotBetween(Byte value1, Byte value2) {
            addCriterion("account_start_month not between", value1, value2, "accountStartMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearIsNull() {
            addCriterion("account_end_year is null");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearIsNotNull() {
            addCriterion("account_end_year is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearEqualTo(Date value) {
            addCriterionForJDBCDate("account_end_year =", value, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearNotEqualTo(Date value) {
            addCriterionForJDBCDate("account_end_year <>", value, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearGreaterThan(Date value) {
            addCriterionForJDBCDate("account_end_year >", value, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_end_year >=", value, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearLessThan(Date value) {
            addCriterionForJDBCDate("account_end_year <", value, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("account_end_year <=", value, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearIn(List<Date> values) {
            addCriterionForJDBCDate("account_end_year in", values, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearNotIn(List<Date> values) {
            addCriterionForJDBCDate("account_end_year not in", values, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_end_year between", value1, value2, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndYearNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("account_end_year not between", value1, value2, "accountEndYear");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthIsNull() {
            addCriterion("account_end_month is null");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthIsNotNull() {
            addCriterion("account_end_month is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthEqualTo(Byte value) {
            addCriterion("account_end_month =", value, "accountEndMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthNotEqualTo(Byte value) {
            addCriterion("account_end_month <>", value, "accountEndMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthGreaterThan(Byte value) {
            addCriterion("account_end_month >", value, "accountEndMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthGreaterThanOrEqualTo(Byte value) {
            addCriterion("account_end_month >=", value, "accountEndMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthLessThan(Byte value) {
            addCriterion("account_end_month <", value, "accountEndMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthLessThanOrEqualTo(Byte value) {
            addCriterion("account_end_month <=", value, "accountEndMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthIn(List<Byte> values) {
            addCriterion("account_end_month in", values, "accountEndMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthNotIn(List<Byte> values) {
            addCriterion("account_end_month not in", values, "accountEndMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthBetween(Byte value1, Byte value2) {
            addCriterion("account_end_month between", value1, value2, "accountEndMonth");
            return (Criteria) this;
        }

        public Criteria andAccountEndMonthNotBetween(Byte value1, Byte value2) {
            addCriterion("account_end_month not between", value1, value2, "accountEndMonth");
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

        public Criteria andLastUpdateTimeIsNull() {
            addCriterion("last_update_time is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIsNotNull() {
            addCriterion("last_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeEqualTo(Date value) {
            addCriterion("last_update_time =", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotEqualTo(Date value) {
            addCriterion("last_update_time <>", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThan(Date value) {
            addCriterion("last_update_time >", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_time >=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThan(Date value) {
            addCriterion("last_update_time <", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_update_time <=", value, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeIn(List<Date> values) {
            addCriterion("last_update_time in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotIn(List<Date> values) {
            addCriterion("last_update_time not in", values, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("last_update_time between", value1, value2, "lastUpdateTime");
            return (Criteria) this;
        }

        public Criteria andLastUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_update_time not between", value1, value2, "lastUpdateTime");
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