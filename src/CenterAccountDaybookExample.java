import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CenterAccountDaybookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterAccountDaybookExample() {
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

        public Criteria andAccountTemplateIdIsNull() {
            addCriterion("account_template_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdIsNotNull() {
            addCriterion("account_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdEqualTo(Long value) {
            addCriterion("account_template_id =", value, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdNotEqualTo(Long value) {
            addCriterion("account_template_id <>", value, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdGreaterThan(Long value) {
            addCriterion("account_template_id >", value, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_template_id >=", value, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdLessThan(Long value) {
            addCriterion("account_template_id <", value, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("account_template_id <=", value, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdIn(List<Long> values) {
            addCriterion("account_template_id in", values, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdNotIn(List<Long> values) {
            addCriterion("account_template_id not in", values, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdBetween(Long value1, Long value2) {
            addCriterion("account_template_id between", value1, value2, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("account_template_id not between", value1, value2, "accountTemplateId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdIsNull() {
            addCriterion("account_template_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdIsNotNull() {
            addCriterion("account_template_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdEqualTo(Long value) {
            addCriterion("account_template_detail_id =", value, "accountTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdNotEqualTo(Long value) {
            addCriterion("account_template_detail_id <>", value, "accountTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdGreaterThan(Long value) {
            addCriterion("account_template_detail_id >", value, "accountTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("account_template_detail_id >=", value, "accountTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdLessThan(Long value) {
            addCriterion("account_template_detail_id <", value, "accountTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("account_template_detail_id <=", value, "accountTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdIn(List<Long> values) {
            addCriterion("account_template_detail_id in", values, "accountTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdNotIn(List<Long> values) {
            addCriterion("account_template_detail_id not in", values, "accountTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdBetween(Long value1, Long value2) {
            addCriterion("account_template_detail_id between", value1, value2, "accountTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andAccountTemplateDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("account_template_detail_id not between", value1, value2, "accountTemplateDetailId");
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

        public Criteria andDirectionIsNull() {
            addCriterion("direction is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIsNotNull() {
            addCriterion("direction is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionEqualTo(Byte value) {
            addCriterion("direction =", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotEqualTo(Byte value) {
            addCriterion("direction <>", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThan(Byte value) {
            addCriterion("direction >", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionGreaterThanOrEqualTo(Byte value) {
            addCriterion("direction >=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThan(Byte value) {
            addCriterion("direction <", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionLessThanOrEqualTo(Byte value) {
            addCriterion("direction <=", value, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionIn(List<Byte> values) {
            addCriterion("direction in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotIn(List<Byte> values) {
            addCriterion("direction not in", values, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionBetween(Byte value1, Byte value2) {
            addCriterion("direction between", value1, value2, "direction");
            return (Criteria) this;
        }

        public Criteria andDirectionNotBetween(Byte value1, Byte value2) {
            addCriterion("direction not between", value1, value2, "direction");
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

        public Criteria andSubjectNameIsNull() {
            addCriterion("subject_name is null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIsNotNull() {
            addCriterion("subject_name is not null");
            return (Criteria) this;
        }

        public Criteria andSubjectNameEqualTo(String value) {
            addCriterion("subject_name =", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotEqualTo(String value) {
            addCriterion("subject_name <>", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThan(String value) {
            addCriterion("subject_name >", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("subject_name >=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThan(String value) {
            addCriterion("subject_name <", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLessThanOrEqualTo(String value) {
            addCriterion("subject_name <=", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameLike(String value) {
            addCriterion("subject_name like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotLike(String value) {
            addCriterion("subject_name not like", value, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameIn(List<String> values) {
            addCriterion("subject_name in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotIn(List<String> values) {
            addCriterion("subject_name not in", values, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameBetween(String value1, String value2) {
            addCriterion("subject_name between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andSubjectNameNotBetween(String value1, String value2) {
            addCriterion("subject_name not between", value1, value2, "subjectName");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(BigDecimal value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(BigDecimal value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(BigDecimal value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(BigDecimal value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<BigDecimal> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<BigDecimal> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceIsNull() {
            addCriterion("complete_balance is null");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceIsNotNull() {
            addCriterion("complete_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceEqualTo(BigDecimal value) {
            addCriterion("complete_balance =", value, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceNotEqualTo(BigDecimal value) {
            addCriterion("complete_balance <>", value, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceGreaterThan(BigDecimal value) {
            addCriterion("complete_balance >", value, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("complete_balance >=", value, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceLessThan(BigDecimal value) {
            addCriterion("complete_balance <", value, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("complete_balance <=", value, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceIn(List<BigDecimal> values) {
            addCriterion("complete_balance in", values, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceNotIn(List<BigDecimal> values) {
            addCriterion("complete_balance not in", values, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("complete_balance between", value1, value2, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("complete_balance not between", value1, value2, "completeBalance");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenIsNull() {
            addCriterion("complete_frozen is null");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenIsNotNull() {
            addCriterion("complete_frozen is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenEqualTo(BigDecimal value) {
            addCriterion("complete_frozen =", value, "completeFrozen");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenNotEqualTo(BigDecimal value) {
            addCriterion("complete_frozen <>", value, "completeFrozen");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenGreaterThan(BigDecimal value) {
            addCriterion("complete_frozen >", value, "completeFrozen");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("complete_frozen >=", value, "completeFrozen");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenLessThan(BigDecimal value) {
            addCriterion("complete_frozen <", value, "completeFrozen");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("complete_frozen <=", value, "completeFrozen");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenIn(List<BigDecimal> values) {
            addCriterion("complete_frozen in", values, "completeFrozen");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenNotIn(List<BigDecimal> values) {
            addCriterion("complete_frozen not in", values, "completeFrozen");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("complete_frozen between", value1, value2, "completeFrozen");
            return (Criteria) this;
        }

        public Criteria andCompleteFrozenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("complete_frozen not between", value1, value2, "completeFrozen");
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

        public Criteria andTransationTimeIsNull() {
            addCriterion("transation_time is null");
            return (Criteria) this;
        }

        public Criteria andTransationTimeIsNotNull() {
            addCriterion("transation_time is not null");
            return (Criteria) this;
        }

        public Criteria andTransationTimeEqualTo(Date value) {
            addCriterion("transation_time =", value, "transationTime");
            return (Criteria) this;
        }

        public Criteria andTransationTimeNotEqualTo(Date value) {
            addCriterion("transation_time <>", value, "transationTime");
            return (Criteria) this;
        }

        public Criteria andTransationTimeGreaterThan(Date value) {
            addCriterion("transation_time >", value, "transationTime");
            return (Criteria) this;
        }

        public Criteria andTransationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("transation_time >=", value, "transationTime");
            return (Criteria) this;
        }

        public Criteria andTransationTimeLessThan(Date value) {
            addCriterion("transation_time <", value, "transationTime");
            return (Criteria) this;
        }

        public Criteria andTransationTimeLessThanOrEqualTo(Date value) {
            addCriterion("transation_time <=", value, "transationTime");
            return (Criteria) this;
        }

        public Criteria andTransationTimeIn(List<Date> values) {
            addCriterion("transation_time in", values, "transationTime");
            return (Criteria) this;
        }

        public Criteria andTransationTimeNotIn(List<Date> values) {
            addCriterion("transation_time not in", values, "transationTime");
            return (Criteria) this;
        }

        public Criteria andTransationTimeBetween(Date value1, Date value2) {
            addCriterion("transation_time between", value1, value2, "transationTime");
            return (Criteria) this;
        }

        public Criteria andTransationTimeNotBetween(Date value1, Date value2) {
            addCriterion("transation_time not between", value1, value2, "transationTime");
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