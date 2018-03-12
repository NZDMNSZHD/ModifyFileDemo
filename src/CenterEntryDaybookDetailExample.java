import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CenterEntryDaybookDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterEntryDaybookDetailExample() {
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

        public Criteria andEntryDaybookIdIsNull() {
            addCriterion("entry_daybook_id is null");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdIsNotNull() {
            addCriterion("entry_daybook_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdEqualTo(Long value) {
            addCriterion("entry_daybook_id =", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdNotEqualTo(Long value) {
            addCriterion("entry_daybook_id <>", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdGreaterThan(Long value) {
            addCriterion("entry_daybook_id >", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdGreaterThanOrEqualTo(Long value) {
            addCriterion("entry_daybook_id >=", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdLessThan(Long value) {
            addCriterion("entry_daybook_id <", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdLessThanOrEqualTo(Long value) {
            addCriterion("entry_daybook_id <=", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdIn(List<Long> values) {
            addCriterion("entry_daybook_id in", values, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdNotIn(List<Long> values) {
            addCriterion("entry_daybook_id not in", values, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdBetween(Long value1, Long value2) {
            addCriterion("entry_daybook_id between", value1, value2, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdNotBetween(Long value1, Long value2) {
            addCriterion("entry_daybook_id not between", value1, value2, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdIsNull() {
            addCriterion("entry_template_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdIsNotNull() {
            addCriterion("entry_template_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdEqualTo(Long value) {
            addCriterion("entry_template_detail_id =", value, "entryTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdNotEqualTo(Long value) {
            addCriterion("entry_template_detail_id <>", value, "entryTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdGreaterThan(Long value) {
            addCriterion("entry_template_detail_id >", value, "entryTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdGreaterThanOrEqualTo(Long value) {
            addCriterion("entry_template_detail_id >=", value, "entryTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdLessThan(Long value) {
            addCriterion("entry_template_detail_id <", value, "entryTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdLessThanOrEqualTo(Long value) {
            addCriterion("entry_template_detail_id <=", value, "entryTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdIn(List<Long> values) {
            addCriterion("entry_template_detail_id in", values, "entryTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdNotIn(List<Long> values) {
            addCriterion("entry_template_detail_id not in", values, "entryTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdBetween(Long value1, Long value2) {
            addCriterion("entry_template_detail_id between", value1, value2, "entryTemplateDetailId");
            return (Criteria) this;
        }

        public Criteria andEntryTemplateDetailIdNotBetween(Long value1, Long value2) {
            addCriterion("entry_template_detail_id not between", value1, value2, "entryTemplateDetailId");
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

        public Criteria andBalanceDirectionIsNull() {
            addCriterion("balance_direction is null");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionIsNotNull() {
            addCriterion("balance_direction is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionEqualTo(String value) {
            addCriterion("balance_direction =", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionNotEqualTo(String value) {
            addCriterion("balance_direction <>", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionGreaterThan(String value) {
            addCriterion("balance_direction >", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionGreaterThanOrEqualTo(String value) {
            addCriterion("balance_direction >=", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionLessThan(String value) {
            addCriterion("balance_direction <", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionLessThanOrEqualTo(String value) {
            addCriterion("balance_direction <=", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionLike(String value) {
            addCriterion("balance_direction like", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionNotLike(String value) {
            addCriterion("balance_direction not like", value, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionIn(List<String> values) {
            addCriterion("balance_direction in", values, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionNotIn(List<String> values) {
            addCriterion("balance_direction not in", values, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionBetween(String value1, String value2) {
            addCriterion("balance_direction between", value1, value2, "balanceDirection");
            return (Criteria) this;
        }

        public Criteria andBalanceDirectionNotBetween(String value1, String value2) {
            addCriterion("balance_direction not between", value1, value2, "balanceDirection");
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

        public Criteria andAbstractNameIsNull() {
            addCriterion("abstract_name is null");
            return (Criteria) this;
        }

        public Criteria andAbstractNameIsNotNull() {
            addCriterion("abstract_name is not null");
            return (Criteria) this;
        }

        public Criteria andAbstractNameEqualTo(String value) {
            addCriterion("abstract_name =", value, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameNotEqualTo(String value) {
            addCriterion("abstract_name <>", value, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameGreaterThan(String value) {
            addCriterion("abstract_name >", value, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameGreaterThanOrEqualTo(String value) {
            addCriterion("abstract_name >=", value, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameLessThan(String value) {
            addCriterion("abstract_name <", value, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameLessThanOrEqualTo(String value) {
            addCriterion("abstract_name <=", value, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameLike(String value) {
            addCriterion("abstract_name like", value, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameNotLike(String value) {
            addCriterion("abstract_name not like", value, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameIn(List<String> values) {
            addCriterion("abstract_name in", values, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameNotIn(List<String> values) {
            addCriterion("abstract_name not in", values, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameBetween(String value1, String value2) {
            addCriterion("abstract_name between", value1, value2, "abstractName");
            return (Criteria) this;
        }

        public Criteria andAbstractNameNotBetween(String value1, String value2) {
            addCriterion("abstract_name not between", value1, value2, "abstractName");
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