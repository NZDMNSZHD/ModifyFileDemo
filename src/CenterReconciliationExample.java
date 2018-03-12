import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CenterReconciliationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CenterReconciliationExample() {
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

        public Criteria andEntryDaybookIdEqualTo(String value) {
            addCriterion("entry_daybook_id =", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdNotEqualTo(String value) {
            addCriterion("entry_daybook_id <>", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdGreaterThan(String value) {
            addCriterion("entry_daybook_id >", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdGreaterThanOrEqualTo(String value) {
            addCriterion("entry_daybook_id >=", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdLessThan(String value) {
            addCriterion("entry_daybook_id <", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdLessThanOrEqualTo(String value) {
            addCriterion("entry_daybook_id <=", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdLike(String value) {
            addCriterion("entry_daybook_id like", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdNotLike(String value) {
            addCriterion("entry_daybook_id not like", value, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdIn(List<String> values) {
            addCriterion("entry_daybook_id in", values, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdNotIn(List<String> values) {
            addCriterion("entry_daybook_id not in", values, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdBetween(String value1, String value2) {
            addCriterion("entry_daybook_id between", value1, value2, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andEntryDaybookIdNotBetween(String value1, String value2) {
            addCriterion("entry_daybook_id not between", value1, value2, "entryDaybookId");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNull() {
            addCriterion("audit_user is null");
            return (Criteria) this;
        }

        public Criteria andAuditUserIsNotNull() {
            addCriterion("audit_user is not null");
            return (Criteria) this;
        }

        public Criteria andAuditUserEqualTo(Long value) {
            addCriterion("audit_user =", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotEqualTo(Long value) {
            addCriterion("audit_user <>", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThan(Long value) {
            addCriterion("audit_user >", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserGreaterThanOrEqualTo(Long value) {
            addCriterion("audit_user >=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThan(Long value) {
            addCriterion("audit_user <", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserLessThanOrEqualTo(Long value) {
            addCriterion("audit_user <=", value, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserIn(List<Long> values) {
            addCriterion("audit_user in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotIn(List<Long> values) {
            addCriterion("audit_user not in", values, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserBetween(Long value1, Long value2) {
            addCriterion("audit_user between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditUserNotBetween(Long value1, Long value2) {
            addCriterion("audit_user not between", value1, value2, "auditUser");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNull() {
            addCriterion("audit_time is null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIsNotNull() {
            addCriterion("audit_time is not null");
            return (Criteria) this;
        }

        public Criteria andAuditTimeEqualTo(Date value) {
            addCriterion("audit_time =", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotEqualTo(Date value) {
            addCriterion("audit_time <>", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThan(Date value) {
            addCriterion("audit_time >", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("audit_time >=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThan(Date value) {
            addCriterion("audit_time <", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeLessThanOrEqualTo(Date value) {
            addCriterion("audit_time <=", value, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeIn(List<Date> values) {
            addCriterion("audit_time in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotIn(List<Date> values) {
            addCriterion("audit_time not in", values, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeBetween(Date value1, Date value2) {
            addCriterion("audit_time between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditTimeNotBetween(Date value1, Date value2) {
            addCriterion("audit_time not between", value1, value2, "auditTime");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(String value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(String value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(String value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(String value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(String value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(String value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLike(String value) {
            addCriterion("audit_status like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotLike(String value) {
            addCriterion("audit_status not like", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<String> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<String> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(String value1, String value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(String value1, String value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNull() {
            addCriterion("audit_remark is null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIsNotNull() {
            addCriterion("audit_remark is not null");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkEqualTo(String value) {
            addCriterion("audit_remark =", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotEqualTo(String value) {
            addCriterion("audit_remark <>", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThan(String value) {
            addCriterion("audit_remark >", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("audit_remark >=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThan(String value) {
            addCriterion("audit_remark <", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLessThanOrEqualTo(String value) {
            addCriterion("audit_remark <=", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkLike(String value) {
            addCriterion("audit_remark like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotLike(String value) {
            addCriterion("audit_remark not like", value, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkIn(List<String> values) {
            addCriterion("audit_remark in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotIn(List<String> values) {
            addCriterion("audit_remark not in", values, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkBetween(String value1, String value2) {
            addCriterion("audit_remark between", value1, value2, "auditRemark");
            return (Criteria) this;
        }

        public Criteria andAuditRemarkNotBetween(String value1, String value2) {
            addCriterion("audit_remark not between", value1, value2, "auditRemark");
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

        public Criteria andLastUpdateUserIsNull() {
            addCriterion("last_update_user is null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIsNotNull() {
            addCriterion("last_update_user is not null");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserEqualTo(Long value) {
            addCriterion("last_update_user =", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotEqualTo(Long value) {
            addCriterion("last_update_user <>", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThan(Long value) {
            addCriterion("last_update_user >", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("last_update_user >=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThan(Long value) {
            addCriterion("last_update_user <", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserLessThanOrEqualTo(Long value) {
            addCriterion("last_update_user <=", value, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserIn(List<Long> values) {
            addCriterion("last_update_user in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotIn(List<Long> values) {
            addCriterion("last_update_user not in", values, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserBetween(Long value1, Long value2) {
            addCriterion("last_update_user between", value1, value2, "lastUpdateUser");
            return (Criteria) this;
        }

        public Criteria andLastUpdateUserNotBetween(Long value1, Long value2) {
            addCriterion("last_update_user not between", value1, value2, "lastUpdateUser");
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