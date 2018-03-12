import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CenterEntryDaybookExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterEntryDaybookExample() {
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

        public Criteria andVoucherNoIsNull() {
            addCriterion("voucher_no is null");
            return (Criteria) this;
        }

        public Criteria andVoucherNoIsNotNull() {
            addCriterion("voucher_no is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherNoEqualTo(String value) {
            addCriterion("voucher_no =", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoNotEqualTo(String value) {
            addCriterion("voucher_no <>", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoGreaterThan(String value) {
            addCriterion("voucher_no >", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_no >=", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoLessThan(String value) {
            addCriterion("voucher_no <", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoLessThanOrEqualTo(String value) {
            addCriterion("voucher_no <=", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoLike(String value) {
            addCriterion("voucher_no like", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoNotLike(String value) {
            addCriterion("voucher_no not like", value, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoIn(List<String> values) {
            addCriterion("voucher_no in", values, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoNotIn(List<String> values) {
            addCriterion("voucher_no not in", values, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoBetween(String value1, String value2) {
            addCriterion("voucher_no between", value1, value2, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherNoNotBetween(String value1, String value2) {
            addCriterion("voucher_no not between", value1, value2, "voucherNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoIsNull() {
            addCriterion("voucher_serial_no is null");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoIsNotNull() {
            addCriterion("voucher_serial_no is not null");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoEqualTo(String value) {
            addCriterion("voucher_serial_no =", value, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoNotEqualTo(String value) {
            addCriterion("voucher_serial_no <>", value, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoGreaterThan(String value) {
            addCriterion("voucher_serial_no >", value, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoGreaterThanOrEqualTo(String value) {
            addCriterion("voucher_serial_no >=", value, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoLessThan(String value) {
            addCriterion("voucher_serial_no <", value, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoLessThanOrEqualTo(String value) {
            addCriterion("voucher_serial_no <=", value, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoLike(String value) {
            addCriterion("voucher_serial_no like", value, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoNotLike(String value) {
            addCriterion("voucher_serial_no not like", value, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoIn(List<String> values) {
            addCriterion("voucher_serial_no in", values, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoNotIn(List<String> values) {
            addCriterion("voucher_serial_no not in", values, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoBetween(String value1, String value2) {
            addCriterion("voucher_serial_no between", value1, value2, "voucherSerialNo");
            return (Criteria) this;
        }

        public Criteria andVoucherSerialNoNotBetween(String value1, String value2) {
            addCriterion("voucher_serial_no not between", value1, value2, "voucherSerialNo");
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

        public Criteria andEntryTemplateIdIsNull() {
            addCriterion("entry_template_id is null");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdIsNotNull() {
            addCriterion("entry_template_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdEqualTo(Long value) {
            addCriterion("entry_template_id =", value, "entryTemplateId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdNotEqualTo(Long value) {
            addCriterion("entry_template_id <>", value, "entryTemplateId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdGreaterThan(Long value) {
            addCriterion("entry_template_id >", value, "entryTemplateId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("entry_template_id >=", value, "entryTemplateId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdLessThan(Long value) {
            addCriterion("entry_template_id <", value, "entryTemplateId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdLessThanOrEqualTo(Long value) {
            addCriterion("entry_template_id <=", value, "entryTemplateId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdIn(List<Long> values) {
            addCriterion("entry_template_id in", values, "entryTemplateId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdNotIn(List<Long> values) {
            addCriterion("entry_template_id not in", values, "entryTemplateId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdBetween(Long value1, Long value2) {
            addCriterion("entry_template_id between", value1, value2, "entryTemplateId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateIdNotBetween(Long value1, Long value2) {
            addCriterion("entry_template_id not between", value1, value2, "entryTemplateId");
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

        public Criteria andDealTypeIsNull() {
            addCriterion("deal_type is null");
            return (Criteria) this;
        }

        public Criteria andDealTypeIsNotNull() {
            addCriterion("deal_type is not null");
            return (Criteria) this;
        }

        public Criteria andDealTypeEqualTo(Byte value) {
            addCriterion("deal_type =", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotEqualTo(Byte value) {
            addCriterion("deal_type <>", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThan(Byte value) {
            addCriterion("deal_type >", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("deal_type >=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThan(Byte value) {
            addCriterion("deal_type <", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeLessThanOrEqualTo(Byte value) {
            addCriterion("deal_type <=", value, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeIn(List<Byte> values) {
            addCriterion("deal_type in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotIn(List<Byte> values) {
            addCriterion("deal_type not in", values, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeBetween(Byte value1, Byte value2) {
            addCriterion("deal_type between", value1, value2, "dealType");
            return (Criteria) this;
        }

        public Criteria andDealTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("deal_type not between", value1, value2, "dealType");
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

        public Criteria andMakingUserNameIsNull() {
            addCriterion("making_user_name is null");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameIsNotNull() {
            addCriterion("making_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameEqualTo(String value) {
            addCriterion("making_user_name =", value, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameNotEqualTo(String value) {
            addCriterion("making_user_name <>", value, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameGreaterThan(String value) {
            addCriterion("making_user_name >", value, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("making_user_name >=", value, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameLessThan(String value) {
            addCriterion("making_user_name <", value, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameLessThanOrEqualTo(String value) {
            addCriterion("making_user_name <=", value, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameLike(String value) {
            addCriterion("making_user_name like", value, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameNotLike(String value) {
            addCriterion("making_user_name not like", value, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameIn(List<String> values) {
            addCriterion("making_user_name in", values, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameNotIn(List<String> values) {
            addCriterion("making_user_name not in", values, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameBetween(String value1, String value2) {
            addCriterion("making_user_name between", value1, value2, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andMakingUserNameNotBetween(String value1, String value2) {
            addCriterion("making_user_name not between", value1, value2, "makingUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNull() {
            addCriterion("audit_user_name is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIsNotNull() {
            addCriterion("audit_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameEqualTo(String value) {
            addCriterion("audit_user_name =", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotEqualTo(String value) {
            addCriterion("audit_user_name <>", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThan(String value) {
            addCriterion("audit_user_name >", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("audit_user_name >=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThan(String value) {
            addCriterion("audit_user_name <", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLessThanOrEqualTo(String value) {
            addCriterion("audit_user_name <=", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameLike(String value) {
            addCriterion("audit_user_name like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotLike(String value) {
            addCriterion("audit_user_name not like", value, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameIn(List<String> values) {
            addCriterion("audit_user_name in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotIn(List<String> values) {
            addCriterion("audit_user_name not in", values, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameBetween(String value1, String value2) {
            addCriterion("audit_user_name between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andAuditUserNameNotBetween(String value1, String value2) {
            addCriterion("audit_user_name not between", value1, value2, "auditUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameIsNull() {
            addCriterion("bookkeeper_user_name is null");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameIsNotNull() {
            addCriterion("bookkeeper_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameEqualTo(String value) {
            addCriterion("bookkeeper_user_name =", value, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameNotEqualTo(String value) {
            addCriterion("bookkeeper_user_name <>", value, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameGreaterThan(String value) {
            addCriterion("bookkeeper_user_name >", value, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("bookkeeper_user_name >=", value, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameLessThan(String value) {
            addCriterion("bookkeeper_user_name <", value, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameLessThanOrEqualTo(String value) {
            addCriterion("bookkeeper_user_name <=", value, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameLike(String value) {
            addCriterion("bookkeeper_user_name like", value, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameNotLike(String value) {
            addCriterion("bookkeeper_user_name not like", value, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameIn(List<String> values) {
            addCriterion("bookkeeper_user_name in", values, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameNotIn(List<String> values) {
            addCriterion("bookkeeper_user_name not in", values, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameBetween(String value1, String value2) {
            addCriterion("bookkeeper_user_name between", value1, value2, "bookkeeperUserName");
            return (Criteria) this;
        }

        public Criteria andBookkeeperUserNameNotBetween(String value1, String value2) {
            addCriterion("bookkeeper_user_name not between", value1, value2, "bookkeeperUserName");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Long> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Long> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
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