package cn.testutils.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TtCourtshipPagesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TtCourtshipPagesExample() {
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

        public Criteria andCpAddressIsNull() {
            addCriterion("CP_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andCpAddressIsNotNull() {
            addCriterion("CP_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andCpAddressEqualTo(String value) {
            addCriterion("CP_ADDRESS =", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressNotEqualTo(String value) {
            addCriterion("CP_ADDRESS <>", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressGreaterThan(String value) {
            addCriterion("CP_ADDRESS >", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CP_ADDRESS >=", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressLessThan(String value) {
            addCriterion("CP_ADDRESS <", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressLessThanOrEqualTo(String value) {
            addCriterion("CP_ADDRESS <=", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressLike(String value) {
            addCriterion("CP_ADDRESS like", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressNotLike(String value) {
            addCriterion("CP_ADDRESS not like", value, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressIn(List<String> values) {
            addCriterion("CP_ADDRESS in", values, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressNotIn(List<String> values) {
            addCriterion("CP_ADDRESS not in", values, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressBetween(String value1, String value2) {
            addCriterion("CP_ADDRESS between", value1, value2, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpAddressNotBetween(String value1, String value2) {
            addCriterion("CP_ADDRESS not between", value1, value2, "cpAddress");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountIsNull() {
            addCriterion("CP_USED_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountIsNotNull() {
            addCriterion("CP_USED_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountEqualTo(Integer value) {
            addCriterion("CP_USED_COUNT =", value, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountNotEqualTo(Integer value) {
            addCriterion("CP_USED_COUNT <>", value, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountGreaterThan(Integer value) {
            addCriterion("CP_USED_COUNT >", value, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CP_USED_COUNT >=", value, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountLessThan(Integer value) {
            addCriterion("CP_USED_COUNT <", value, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountLessThanOrEqualTo(Integer value) {
            addCriterion("CP_USED_COUNT <=", value, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountIn(List<Integer> values) {
            addCriterion("CP_USED_COUNT in", values, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountNotIn(List<Integer> values) {
            addCriterion("CP_USED_COUNT not in", values, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountBetween(Integer value1, Integer value2) {
            addCriterion("CP_USED_COUNT between", value1, value2, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpUsedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("CP_USED_COUNT not between", value1, value2, "cpUsedCount");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeIsNull() {
            addCriterion("CP_STARTTIME is null");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeIsNotNull() {
            addCriterion("CP_STARTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeEqualTo(Date value) {
            addCriterion("CP_STARTTIME =", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeNotEqualTo(Date value) {
            addCriterion("CP_STARTTIME <>", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeGreaterThan(Date value) {
            addCriterion("CP_STARTTIME >", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CP_STARTTIME >=", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeLessThan(Date value) {
            addCriterion("CP_STARTTIME <", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("CP_STARTTIME <=", value, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeIn(List<Date> values) {
            addCriterion("CP_STARTTIME in", values, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeNotIn(List<Date> values) {
            addCriterion("CP_STARTTIME not in", values, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeBetween(Date value1, Date value2) {
            addCriterion("CP_STARTTIME between", value1, value2, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("CP_STARTTIME not between", value1, value2, "cpStarttime");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountIsNull() {
            addCriterion("CP_COLLECTED_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountIsNotNull() {
            addCriterion("CP_COLLECTED_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountEqualTo(Integer value) {
            addCriterion("CP_COLLECTED_COUNT =", value, "cpCollectedCount");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountNotEqualTo(Integer value) {
            addCriterion("CP_COLLECTED_COUNT <>", value, "cpCollectedCount");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountGreaterThan(Integer value) {
            addCriterion("CP_COLLECTED_COUNT >", value, "cpCollectedCount");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("CP_COLLECTED_COUNT >=", value, "cpCollectedCount");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountLessThan(Integer value) {
            addCriterion("CP_COLLECTED_COUNT <", value, "cpCollectedCount");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountLessThanOrEqualTo(Integer value) {
            addCriterion("CP_COLLECTED_COUNT <=", value, "cpCollectedCount");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountIn(List<Integer> values) {
            addCriterion("CP_COLLECTED_COUNT in", values, "cpCollectedCount");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountNotIn(List<Integer> values) {
            addCriterion("CP_COLLECTED_COUNT not in", values, "cpCollectedCount");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountBetween(Integer value1, Integer value2) {
            addCriterion("CP_COLLECTED_COUNT between", value1, value2, "cpCollectedCount");
            return (Criteria) this;
        }

        public Criteria andCpCollectedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("CP_COLLECTED_COUNT not between", value1, value2, "cpCollectedCount");
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