package cn.testutils.pojo;

import java.util.ArrayList;
import java.util.List;

public class TtAccountsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TtAccountsExample() {
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

        public Criteria andAIdIsNull() {
            addCriterion("A_ID is null");
            return (Criteria) this;
        }

        public Criteria andAIdIsNotNull() {
            addCriterion("A_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAIdEqualTo(Integer value) {
            addCriterion("A_ID =", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotEqualTo(Integer value) {
            addCriterion("A_ID <>", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThan(Integer value) {
            addCriterion("A_ID >", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("A_ID >=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThan(Integer value) {
            addCriterion("A_ID <", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdLessThanOrEqualTo(Integer value) {
            addCriterion("A_ID <=", value, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdIn(List<Integer> values) {
            addCriterion("A_ID in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotIn(List<Integer> values) {
            addCriterion("A_ID not in", values, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdBetween(Integer value1, Integer value2) {
            addCriterion("A_ID between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAIdNotBetween(Integer value1, Integer value2) {
            addCriterion("A_ID not between", value1, value2, "aId");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailIsNull() {
            addCriterion("A_ACCOUNT_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailIsNotNull() {
            addCriterion("A_ACCOUNT_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailEqualTo(String value) {
            addCriterion("A_ACCOUNT_EMAIL =", value, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailNotEqualTo(String value) {
            addCriterion("A_ACCOUNT_EMAIL <>", value, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailGreaterThan(String value) {
            addCriterion("A_ACCOUNT_EMAIL >", value, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailGreaterThanOrEqualTo(String value) {
            addCriterion("A_ACCOUNT_EMAIL >=", value, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailLessThan(String value) {
            addCriterion("A_ACCOUNT_EMAIL <", value, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailLessThanOrEqualTo(String value) {
            addCriterion("A_ACCOUNT_EMAIL <=", value, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailLike(String value) {
            addCriterion("A_ACCOUNT_EMAIL like", value, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailNotLike(String value) {
            addCriterion("A_ACCOUNT_EMAIL not like", value, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailIn(List<String> values) {
            addCriterion("A_ACCOUNT_EMAIL in", values, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailNotIn(List<String> values) {
            addCriterion("A_ACCOUNT_EMAIL not in", values, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailBetween(String value1, String value2) {
            addCriterion("A_ACCOUNT_EMAIL between", value1, value2, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAAccountEmailNotBetween(String value1, String value2) {
            addCriterion("A_ACCOUNT_EMAIL not between", value1, value2, "aAccountEmail");
            return (Criteria) this;
        }

        public Criteria andAPasswdIsNull() {
            addCriterion("A_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andAPasswdIsNotNull() {
            addCriterion("A_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andAPasswdEqualTo(String value) {
            addCriterion("A_PASSWD =", value, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdNotEqualTo(String value) {
            addCriterion("A_PASSWD <>", value, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdGreaterThan(String value) {
            addCriterion("A_PASSWD >", value, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("A_PASSWD >=", value, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdLessThan(String value) {
            addCriterion("A_PASSWD <", value, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdLessThanOrEqualTo(String value) {
            addCriterion("A_PASSWD <=", value, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdLike(String value) {
            addCriterion("A_PASSWD like", value, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdNotLike(String value) {
            addCriterion("A_PASSWD not like", value, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdIn(List<String> values) {
            addCriterion("A_PASSWD in", values, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdNotIn(List<String> values) {
            addCriterion("A_PASSWD not in", values, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdBetween(String value1, String value2) {
            addCriterion("A_PASSWD between", value1, value2, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAPasswdNotBetween(String value1, String value2) {
            addCriterion("A_PASSWD not between", value1, value2, "aPasswd");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneIsNull() {
            addCriterion("A_ACCOUNT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneIsNotNull() {
            addCriterion("A_ACCOUNT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneEqualTo(String value) {
            addCriterion("A_ACCOUNT_PHONE =", value, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneNotEqualTo(String value) {
            addCriterion("A_ACCOUNT_PHONE <>", value, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneGreaterThan(String value) {
            addCriterion("A_ACCOUNT_PHONE >", value, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("A_ACCOUNT_PHONE >=", value, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneLessThan(String value) {
            addCriterion("A_ACCOUNT_PHONE <", value, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneLessThanOrEqualTo(String value) {
            addCriterion("A_ACCOUNT_PHONE <=", value, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneLike(String value) {
            addCriterion("A_ACCOUNT_PHONE like", value, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneNotLike(String value) {
            addCriterion("A_ACCOUNT_PHONE not like", value, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneIn(List<String> values) {
            addCriterion("A_ACCOUNT_PHONE in", values, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneNotIn(List<String> values) {
            addCriterion("A_ACCOUNT_PHONE not in", values, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneBetween(String value1, String value2) {
            addCriterion("A_ACCOUNT_PHONE between", value1, value2, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andAAccountPhoneNotBetween(String value1, String value2) {
            addCriterion("A_ACCOUNT_PHONE not between", value1, value2, "aAccountPhone");
            return (Criteria) this;
        }

        public Criteria andANameIsNull() {
            addCriterion("A_NAME is null");
            return (Criteria) this;
        }

        public Criteria andANameIsNotNull() {
            addCriterion("A_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andANameEqualTo(String value) {
            addCriterion("A_NAME =", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotEqualTo(String value) {
            addCriterion("A_NAME <>", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThan(String value) {
            addCriterion("A_NAME >", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameGreaterThanOrEqualTo(String value) {
            addCriterion("A_NAME >=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThan(String value) {
            addCriterion("A_NAME <", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLessThanOrEqualTo(String value) {
            addCriterion("A_NAME <=", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameLike(String value) {
            addCriterion("A_NAME like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotLike(String value) {
            addCriterion("A_NAME not like", value, "aName");
            return (Criteria) this;
        }

        public Criteria andANameIn(List<String> values) {
            addCriterion("A_NAME in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotIn(List<String> values) {
            addCriterion("A_NAME not in", values, "aName");
            return (Criteria) this;
        }

        public Criteria andANameBetween(String value1, String value2) {
            addCriterion("A_NAME between", value1, value2, "aName");
            return (Criteria) this;
        }

        public Criteria andANameNotBetween(String value1, String value2) {
            addCriterion("A_NAME not between", value1, value2, "aName");
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