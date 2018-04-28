package cn.testutils.pojo;

import java.util.ArrayList;
import java.util.List;

public class TtCourtshipPagesParametersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TtCourtshipPagesParametersExample() {
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

        public Criteria andCppIndexIsNull() {
            addCriterion("CPP_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andCppIndexIsNotNull() {
            addCriterion("CPP_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andCppIndexEqualTo(Integer value) {
            addCriterion("CPP_INDEX =", value, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppIndexNotEqualTo(Integer value) {
            addCriterion("CPP_INDEX <>", value, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppIndexGreaterThan(Integer value) {
            addCriterion("CPP_INDEX >", value, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("CPP_INDEX >=", value, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppIndexLessThan(Integer value) {
            addCriterion("CPP_INDEX <", value, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppIndexLessThanOrEqualTo(Integer value) {
            addCriterion("CPP_INDEX <=", value, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppIndexIn(List<Integer> values) {
            addCriterion("CPP_INDEX in", values, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppIndexNotIn(List<Integer> values) {
            addCriterion("CPP_INDEX not in", values, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppIndexBetween(Integer value1, Integer value2) {
            addCriterion("CPP_INDEX between", value1, value2, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("CPP_INDEX not between", value1, value2, "cppIndex");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionIsNull() {
            addCriterion("CPP_DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionIsNotNull() {
            addCriterion("CPP_DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionEqualTo(String value) {
            addCriterion("CPP_DESCRIPTION =", value, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionNotEqualTo(String value) {
            addCriterion("CPP_DESCRIPTION <>", value, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionGreaterThan(String value) {
            addCriterion("CPP_DESCRIPTION >", value, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("CPP_DESCRIPTION >=", value, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionLessThan(String value) {
            addCriterion("CPP_DESCRIPTION <", value, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionLessThanOrEqualTo(String value) {
            addCriterion("CPP_DESCRIPTION <=", value, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionLike(String value) {
            addCriterion("CPP_DESCRIPTION like", value, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionNotLike(String value) {
            addCriterion("CPP_DESCRIPTION not like", value, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionIn(List<String> values) {
            addCriterion("CPP_DESCRIPTION in", values, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionNotIn(List<String> values) {
            addCriterion("CPP_DESCRIPTION not in", values, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionBetween(String value1, String value2) {
            addCriterion("CPP_DESCRIPTION between", value1, value2, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppDescriptionNotBetween(String value1, String value2) {
            addCriterion("CPP_DESCRIPTION not between", value1, value2, "cppDescription");
            return (Criteria) this;
        }

        public Criteria andCppContentIsNull() {
            addCriterion("CPP_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andCppContentIsNotNull() {
            addCriterion("CPP_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andCppContentEqualTo(String value) {
            addCriterion("CPP_CONTENT =", value, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentNotEqualTo(String value) {
            addCriterion("CPP_CONTENT <>", value, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentGreaterThan(String value) {
            addCriterion("CPP_CONTENT >", value, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentGreaterThanOrEqualTo(String value) {
            addCriterion("CPP_CONTENT >=", value, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentLessThan(String value) {
            addCriterion("CPP_CONTENT <", value, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentLessThanOrEqualTo(String value) {
            addCriterion("CPP_CONTENT <=", value, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentLike(String value) {
            addCriterion("CPP_CONTENT like", value, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentNotLike(String value) {
            addCriterion("CPP_CONTENT not like", value, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentIn(List<String> values) {
            addCriterion("CPP_CONTENT in", values, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentNotIn(List<String> values) {
            addCriterion("CPP_CONTENT not in", values, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentBetween(String value1, String value2) {
            addCriterion("CPP_CONTENT between", value1, value2, "cppContent");
            return (Criteria) this;
        }

        public Criteria andCppContentNotBetween(String value1, String value2) {
            addCriterion("CPP_CONTENT not between", value1, value2, "cppContent");
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