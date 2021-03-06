package cn.testutils.pojo;

import java.util.ArrayList;
import java.util.List;

public class TtCourtshipPagesUseingParametersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TtCourtshipPagesUseingParametersExample() {
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

        public Criteria andCpupIndexIsNull() {
            addCriterion("CPUP_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andCpupIndexIsNotNull() {
            addCriterion("CPUP_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andCpupIndexEqualTo(Integer value) {
            addCriterion("CPUP_INDEX =", value, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupIndexNotEqualTo(Integer value) {
            addCriterion("CPUP_INDEX <>", value, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupIndexGreaterThan(Integer value) {
            addCriterion("CPUP_INDEX >", value, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("CPUP_INDEX >=", value, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupIndexLessThan(Integer value) {
            addCriterion("CPUP_INDEX <", value, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupIndexLessThanOrEqualTo(Integer value) {
            addCriterion("CPUP_INDEX <=", value, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupIndexIn(List<Integer> values) {
            addCriterion("CPUP_INDEX in", values, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupIndexNotIn(List<Integer> values) {
            addCriterion("CPUP_INDEX not in", values, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupIndexBetween(Integer value1, Integer value2) {
            addCriterion("CPUP_INDEX between", value1, value2, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("CPUP_INDEX not between", value1, value2, "cpupIndex");
            return (Criteria) this;
        }

        public Criteria andCpupContentIsNull() {
            addCriterion("CPUP_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCpupContentIsNotNull() {
            addCriterion("CPUP_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCpupContentEqualTo(String value) {
            addCriterion("CPUP_CONTENT =", value, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentNotEqualTo(String value) {
            addCriterion("CPUP_CONTENT <>", value, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentGreaterThan(String value) {
            addCriterion("CPUP_CONTENT >", value, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentGreaterThanOrEqualTo(String value) {
            addCriterion("CPUP_CONTENT >=", value, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentLessThan(String value) {
            addCriterion("CPUP_CONTENT <", value, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentLessThanOrEqualTo(String value) {
            addCriterion("CPUP_CONTENT <=", value, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentLike(String value) {
            addCriterion("CPUP_CONTENT like", value, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentNotLike(String value) {
            addCriterion("CPUP_CONTENT not like", value, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentIn(List<String> values) {
            addCriterion("CPUP_CONTENT in", values, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentNotIn(List<String> values) {
            addCriterion("CPUP_CONTENT not in", values, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentBetween(String value1, String value2) {
            addCriterion("CPUP_CONTENT between", value1, value2, "cpupContent");
            return (Criteria) this;
        }

        public Criteria andCpupContentNotBetween(String value1, String value2) {
            addCriterion("CPUP_CONTENT not between", value1, value2, "cpupContent");
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