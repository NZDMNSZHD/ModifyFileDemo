import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CenterBusinessDaybookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterBusinessDaybookExample() {
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

        public Criteria andBusinessSerialIsNull() {
            addCriterion("business_serial is null");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialIsNotNull() {
            addCriterion("business_serial is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialEqualTo(String value) {
            addCriterion("business_serial =", value, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialNotEqualTo(String value) {
            addCriterion("business_serial <>", value, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialGreaterThan(String value) {
            addCriterion("business_serial >", value, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialGreaterThanOrEqualTo(String value) {
            addCriterion("business_serial >=", value, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialLessThan(String value) {
            addCriterion("business_serial <", value, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialLessThanOrEqualTo(String value) {
            addCriterion("business_serial <=", value, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialLike(String value) {
            addCriterion("business_serial like", value, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialNotLike(String value) {
            addCriterion("business_serial not like", value, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialIn(List<String> values) {
            addCriterion("business_serial in", values, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialNotIn(List<String> values) {
            addCriterion("business_serial not in", values, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialBetween(String value1, String value2) {
            addCriterion("business_serial between", value1, value2, "businessSerial");
            return (Criteria) this;
        }

        public Criteria andBusinessSerialNotBetween(String value1, String value2) {
            addCriterion("business_serial not between", value1, value2, "businessSerial");
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

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Byte value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Byte value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Byte value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Byte value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Byte value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Byte> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Byte> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Byte value1, Byte value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("product_type not between", value1, value2, "productType");
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

        public Criteria andReqTimeIsNull() {
            addCriterion("req_time is null");
            return (Criteria) this;
        }

        public Criteria andReqTimeIsNotNull() {
            addCriterion("req_time is not null");
            return (Criteria) this;
        }

        public Criteria andReqTimeEqualTo(Date value) {
            addCriterion("req_time =", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotEqualTo(Date value) {
            addCriterion("req_time <>", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThan(Date value) {
            addCriterion("req_time >", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("req_time >=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThan(Date value) {
            addCriterion("req_time <", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeLessThanOrEqualTo(Date value) {
            addCriterion("req_time <=", value, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeIn(List<Date> values) {
            addCriterion("req_time in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotIn(List<Date> values) {
            addCriterion("req_time not in", values, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeBetween(Date value1, Date value2) {
            addCriterion("req_time between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andReqTimeNotBetween(Date value1, Date value2) {
            addCriterion("req_time not between", value1, value2, "reqTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeIsNull() {
            addCriterion("resp_time is null");
            return (Criteria) this;
        }

        public Criteria andRespTimeIsNotNull() {
            addCriterion("resp_time is not null");
            return (Criteria) this;
        }

        public Criteria andRespTimeEqualTo(Date value) {
            addCriterion("resp_time =", value, "respTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeNotEqualTo(Date value) {
            addCriterion("resp_time <>", value, "respTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeGreaterThan(Date value) {
            addCriterion("resp_time >", value, "respTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("resp_time >=", value, "respTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeLessThan(Date value) {
            addCriterion("resp_time <", value, "respTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeLessThanOrEqualTo(Date value) {
            addCriterion("resp_time <=", value, "respTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeIn(List<Date> values) {
            addCriterion("resp_time in", values, "respTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeNotIn(List<Date> values) {
            addCriterion("resp_time not in", values, "respTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeBetween(Date value1, Date value2) {
            addCriterion("resp_time between", value1, value2, "respTime");
            return (Criteria) this;
        }

        public Criteria andRespTimeNotBetween(Date value1, Date value2) {
            addCriterion("resp_time not between", value1, value2, "respTime");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNull() {
            addCriterion("error_code is null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIsNotNull() {
            addCriterion("error_code is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCodeEqualTo(String value) {
            addCriterion("error_code =", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotEqualTo(String value) {
            addCriterion("error_code <>", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThan(String value) {
            addCriterion("error_code >", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeGreaterThanOrEqualTo(String value) {
            addCriterion("error_code >=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThan(String value) {
            addCriterion("error_code <", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLessThanOrEqualTo(String value) {
            addCriterion("error_code <=", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeLike(String value) {
            addCriterion("error_code like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotLike(String value) {
            addCriterion("error_code not like", value, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeIn(List<String> values) {
            addCriterion("error_code in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotIn(List<String> values) {
            addCriterion("error_code not in", values, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeBetween(String value1, String value2) {
            addCriterion("error_code between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andErrorCodeNotBetween(String value1, String value2) {
            addCriterion("error_code not between", value1, value2, "errorCode");
            return (Criteria) this;
        }

        public Criteria andRespDescIsNull() {
            addCriterion("resp_desc is null");
            return (Criteria) this;
        }

        public Criteria andRespDescIsNotNull() {
            addCriterion("resp_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRespDescEqualTo(String value) {
            addCriterion("resp_desc =", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescNotEqualTo(String value) {
            addCriterion("resp_desc <>", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescGreaterThan(String value) {
            addCriterion("resp_desc >", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescGreaterThanOrEqualTo(String value) {
            addCriterion("resp_desc >=", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescLessThan(String value) {
            addCriterion("resp_desc <", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescLessThanOrEqualTo(String value) {
            addCriterion("resp_desc <=", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescLike(String value) {
            addCriterion("resp_desc like", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescNotLike(String value) {
            addCriterion("resp_desc not like", value, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescIn(List<String> values) {
            addCriterion("resp_desc in", values, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescNotIn(List<String> values) {
            addCriterion("resp_desc not in", values, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescBetween(String value1, String value2) {
            addCriterion("resp_desc between", value1, value2, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRespDescNotBetween(String value1, String value2) {
            addCriterion("resp_desc not between", value1, value2, "respDesc");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookIsNull() {
            addCriterion("need_account_daybook is null");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookIsNotNull() {
            addCriterion("need_account_daybook is not null");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookEqualTo(Byte value) {
            addCriterion("need_account_daybook =", value, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookNotEqualTo(Byte value) {
            addCriterion("need_account_daybook <>", value, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookGreaterThan(Byte value) {
            addCriterion("need_account_daybook >", value, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookGreaterThanOrEqualTo(Byte value) {
            addCriterion("need_account_daybook >=", value, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookLessThan(Byte value) {
            addCriterion("need_account_daybook <", value, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookLessThanOrEqualTo(Byte value) {
            addCriterion("need_account_daybook <=", value, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookIn(List<Byte> values) {
            addCriterion("need_account_daybook in", values, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookNotIn(List<Byte> values) {
            addCriterion("need_account_daybook not in", values, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookBetween(Byte value1, Byte value2) {
            addCriterion("need_account_daybook between", value1, value2, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountDaybookNotBetween(Byte value1, Byte value2) {
            addCriterion("need_account_daybook not between", value1, value2, "needAccountDaybook");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNull() {
            addCriterion("account_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIsNotNull() {
            addCriterion("account_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountStatusEqualTo(Byte value) {
            addCriterion("account_status =", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotEqualTo(Byte value) {
            addCriterion("account_status <>", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThan(Byte value) {
            addCriterion("account_status >", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("account_status >=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThan(Byte value) {
            addCriterion("account_status <", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusLessThanOrEqualTo(Byte value) {
            addCriterion("account_status <=", value, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusIn(List<Byte> values) {
            addCriterion("account_status in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotIn(List<Byte> values) {
            addCriterion("account_status not in", values, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusBetween(Byte value1, Byte value2) {
            addCriterion("account_status between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andAccountStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("account_status not between", value1, value2, "accountStatus");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookIsNull() {
            addCriterion("need_accounting_daybook is null");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookIsNotNull() {
            addCriterion("need_accounting_daybook is not null");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookEqualTo(Byte value) {
            addCriterion("need_accounting_daybook =", value, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookNotEqualTo(Byte value) {
            addCriterion("need_accounting_daybook <>", value, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookGreaterThan(Byte value) {
            addCriterion("need_accounting_daybook >", value, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookGreaterThanOrEqualTo(Byte value) {
            addCriterion("need_accounting_daybook >=", value, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookLessThan(Byte value) {
            addCriterion("need_accounting_daybook <", value, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookLessThanOrEqualTo(Byte value) {
            addCriterion("need_accounting_daybook <=", value, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookIn(List<Byte> values) {
            addCriterion("need_accounting_daybook in", values, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookNotIn(List<Byte> values) {
            addCriterion("need_accounting_daybook not in", values, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookBetween(Byte value1, Byte value2) {
            addCriterion("need_accounting_daybook between", value1, value2, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedAccountingDaybookNotBetween(Byte value1, Byte value2) {
            addCriterion("need_accounting_daybook not between", value1, value2, "needAccountingDaybook");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusIsNull() {
            addCriterion("accounting_status is null");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusIsNotNull() {
            addCriterion("accounting_status is not null");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusEqualTo(Byte value) {
            addCriterion("accounting_status =", value, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusNotEqualTo(Byte value) {
            addCriterion("accounting_status <>", value, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusGreaterThan(Byte value) {
            addCriterion("accounting_status >", value, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("accounting_status >=", value, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusLessThan(Byte value) {
            addCriterion("accounting_status <", value, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusLessThanOrEqualTo(Byte value) {
            addCriterion("accounting_status <=", value, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusIn(List<Byte> values) {
            addCriterion("accounting_status in", values, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusNotIn(List<Byte> values) {
            addCriterion("accounting_status not in", values, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusBetween(Byte value1, Byte value2) {
            addCriterion("accounting_status between", value1, value2, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andAccountingStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("accounting_status not between", value1, value2, "accountingStatus");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookIsNull() {
            addCriterion("need_entry_daybook is null");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookIsNotNull() {
            addCriterion("need_entry_daybook is not null");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookEqualTo(Byte value) {
            addCriterion("need_entry_daybook =", value, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookNotEqualTo(Byte value) {
            addCriterion("need_entry_daybook <>", value, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookGreaterThan(Byte value) {
            addCriterion("need_entry_daybook >", value, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookGreaterThanOrEqualTo(Byte value) {
            addCriterion("need_entry_daybook >=", value, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookLessThan(Byte value) {
            addCriterion("need_entry_daybook <", value, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookLessThanOrEqualTo(Byte value) {
            addCriterion("need_entry_daybook <=", value, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookIn(List<Byte> values) {
            addCriterion("need_entry_daybook in", values, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookNotIn(List<Byte> values) {
            addCriterion("need_entry_daybook not in", values, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookBetween(Byte value1, Byte value2) {
            addCriterion("need_entry_daybook between", value1, value2, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andNeedEntryDaybookNotBetween(Byte value1, Byte value2) {
            addCriterion("need_entry_daybook not between", value1, value2, "needEntryDaybook");
            return (Criteria) this;
        }

        public Criteria andEntryStatusIsNull() {
            addCriterion("entry_status is null");
            return (Criteria) this;
        }

        public Criteria andEntryStatusIsNotNull() {
            addCriterion("entry_status is not null");
            return (Criteria) this;
        }

        public Criteria andEntryStatusEqualTo(Byte value) {
            addCriterion("entry_status =", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotEqualTo(Byte value) {
            addCriterion("entry_status <>", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusGreaterThan(Byte value) {
            addCriterion("entry_status >", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("entry_status >=", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusLessThan(Byte value) {
            addCriterion("entry_status <", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusLessThanOrEqualTo(Byte value) {
            addCriterion("entry_status <=", value, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusIn(List<Byte> values) {
            addCriterion("entry_status in", values, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotIn(List<Byte> values) {
            addCriterion("entry_status not in", values, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusBetween(Byte value1, Byte value2) {
            addCriterion("entry_status between", value1, value2, "entryStatus");
            return (Criteria) this;
        }

        public Criteria andEntryStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("entry_status not between", value1, value2, "entryStatus");
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