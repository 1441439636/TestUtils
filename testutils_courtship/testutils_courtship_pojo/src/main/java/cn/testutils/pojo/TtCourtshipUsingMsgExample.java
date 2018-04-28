package cn.testutils.pojo;

import java.util.ArrayList;
import java.util.List;

public class TtCourtshipUsingMsgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TtCourtshipUsingMsgExample() {
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

        public Criteria andCuIdIsNull() {
            addCriterion("CU_ID is null");
            return (Criteria) this;
        }

        public Criteria andCuIdIsNotNull() {
            addCriterion("CU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCuIdEqualTo(Integer value) {
            addCriterion("CU_ID =", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdNotEqualTo(Integer value) {
            addCriterion("CU_ID <>", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdGreaterThan(Integer value) {
            addCriterion("CU_ID >", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CU_ID >=", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdLessThan(Integer value) {
            addCriterion("CU_ID <", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdLessThanOrEqualTo(Integer value) {
            addCriterion("CU_ID <=", value, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdIn(List<Integer> values) {
            addCriterion("CU_ID in", values, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdNotIn(List<Integer> values) {
            addCriterion("CU_ID not in", values, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdBetween(Integer value1, Integer value2) {
            addCriterion("CU_ID between", value1, value2, "cuId");
            return (Criteria) this;
        }

        public Criteria andCuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CU_ID not between", value1, value2, "cuId");
            return (Criteria) this;
        }

        public Criteria andCumPasswdIsNull() {
            addCriterion("CUM_PASSWD is null");
            return (Criteria) this;
        }

        public Criteria andCumPasswdIsNotNull() {
            addCriterion("CUM_PASSWD is not null");
            return (Criteria) this;
        }

        public Criteria andCumPasswdEqualTo(String value) {
            addCriterion("CUM_PASSWD =", value, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdNotEqualTo(String value) {
            addCriterion("CUM_PASSWD <>", value, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdGreaterThan(String value) {
            addCriterion("CUM_PASSWD >", value, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdGreaterThanOrEqualTo(String value) {
            addCriterion("CUM_PASSWD >=", value, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdLessThan(String value) {
            addCriterion("CUM_PASSWD <", value, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdLessThanOrEqualTo(String value) {
            addCriterion("CUM_PASSWD <=", value, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdLike(String value) {
            addCriterion("CUM_PASSWD like", value, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdNotLike(String value) {
            addCriterion("CUM_PASSWD not like", value, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdIn(List<String> values) {
            addCriterion("CUM_PASSWD in", values, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdNotIn(List<String> values) {
            addCriterion("CUM_PASSWD not in", values, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdBetween(String value1, String value2) {
            addCriterion("CUM_PASSWD between", value1, value2, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumPasswdNotBetween(String value1, String value2) {
            addCriterion("CUM_PASSWD not between", value1, value2, "cumPasswd");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgIsNull() {
            addCriterion("CUM_LEVEL_MSG is null");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgIsNotNull() {
            addCriterion("CUM_LEVEL_MSG is not null");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgEqualTo(String value) {
            addCriterion("CUM_LEVEL_MSG =", value, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgNotEqualTo(String value) {
            addCriterion("CUM_LEVEL_MSG <>", value, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgGreaterThan(String value) {
            addCriterion("CUM_LEVEL_MSG >", value, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgGreaterThanOrEqualTo(String value) {
            addCriterion("CUM_LEVEL_MSG >=", value, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgLessThan(String value) {
            addCriterion("CUM_LEVEL_MSG <", value, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgLessThanOrEqualTo(String value) {
            addCriterion("CUM_LEVEL_MSG <=", value, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgLike(String value) {
            addCriterion("CUM_LEVEL_MSG like", value, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgNotLike(String value) {
            addCriterion("CUM_LEVEL_MSG not like", value, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgIn(List<String> values) {
            addCriterion("CUM_LEVEL_MSG in", values, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgNotIn(List<String> values) {
            addCriterion("CUM_LEVEL_MSG not in", values, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgBetween(String value1, String value2) {
            addCriterion("CUM_LEVEL_MSG between", value1, value2, "cumLevelMsg");
            return (Criteria) this;
        }

        public Criteria andCumLevelMsgNotBetween(String value1, String value2) {
            addCriterion("CUM_LEVEL_MSG not between", value1, value2, "cumLevelMsg");
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