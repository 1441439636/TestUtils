package cn.testutils.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TtCourtshipUseingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TtCourtshipUseingExample() {
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

        public Criteria andCpIdIsNull() {
            addCriterion("CP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCpIdIsNotNull() {
            addCriterion("CP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCpIdEqualTo(Integer value) {
            addCriterion("CP_ID =", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotEqualTo(Integer value) {
            addCriterion("CP_ID <>", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThan(Integer value) {
            addCriterion("CP_ID >", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("CP_ID >=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThan(Integer value) {
            addCriterion("CP_ID <", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdLessThanOrEqualTo(Integer value) {
            addCriterion("CP_ID <=", value, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdIn(List<Integer> values) {
            addCriterion("CP_ID in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotIn(List<Integer> values) {
            addCriterion("CP_ID not in", values, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdBetween(Integer value1, Integer value2) {
            addCriterion("CP_ID between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("CP_ID not between", value1, value2, "cpId");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeIsNull() {
            addCriterion("CU_STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeIsNotNull() {
            addCriterion("CU_STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeEqualTo(Date value) {
            addCriterion("CU_STARTTIME =", value, "cuStarttime");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeNotEqualTo(Date value) {
            addCriterion("CU_STARTTIME <>", value, "cuStarttime");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeGreaterThan(Date value) {
            addCriterion("CU_STARTTIME >", value, "cuStarttime");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CU_STARTTIME >=", value, "cuStarttime");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeLessThan(Date value) {
            addCriterion("CU_STARTTIME <", value, "cuStarttime");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("CU_STARTTIME <=", value, "cuStarttime");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeIn(List<Date> values) {
            addCriterion("CU_STARTTIME in", values, "cuStarttime");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeNotIn(List<Date> values) {
            addCriterion("CU_STARTTIME not in", values, "cuStarttime");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeBetween(Date value1, Date value2) {
            addCriterion("CU_STARTTIME between", value1, value2, "cuStarttime");
            return (Criteria) this;
        }

        public Criteria andCuStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("CU_STARTTIME not between", value1, value2, "cuStarttime");
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