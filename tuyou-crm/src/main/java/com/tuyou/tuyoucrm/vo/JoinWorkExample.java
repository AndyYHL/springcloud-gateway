package com.tuyou.tuyoucrm.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JoinWorkExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table join_work
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table join_work
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table join_work
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public JoinWorkExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table join_work
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table join_work
     *
     * @mbg.generated
     */
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

        public Criteria andJoinWorkIdIsNull() {
            addCriterion("join_work_id is null");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdIsNotNull() {
            addCriterion("join_work_id is not null");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdEqualTo(Integer value) {
            addCriterion("join_work_id =", value, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdNotEqualTo(Integer value) {
            addCriterion("join_work_id <>", value, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdGreaterThan(Integer value) {
            addCriterion("join_work_id >", value, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_work_id >=", value, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdLessThan(Integer value) {
            addCriterion("join_work_id <", value, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdLessThanOrEqualTo(Integer value) {
            addCriterion("join_work_id <=", value, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdIn(List<Integer> values) {
            addCriterion("join_work_id in", values, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdNotIn(List<Integer> values) {
            addCriterion("join_work_id not in", values, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdBetween(Integer value1, Integer value2) {
            addCriterion("join_work_id between", value1, value2, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkIdNotBetween(Integer value1, Integer value2) {
            addCriterion("join_work_id not between", value1, value2, "joinWorkId");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(Integer value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(Integer value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(Integer value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(Integer value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(Integer value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<Integer> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<Integer> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(Integer value1, Integer value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumIsNull() {
            addCriterion("join_work_num is null");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumIsNotNull() {
            addCriterion("join_work_num is not null");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumEqualTo(Integer value) {
            addCriterion("join_work_num =", value, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumNotEqualTo(Integer value) {
            addCriterion("join_work_num <>", value, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumGreaterThan(Integer value) {
            addCriterion("join_work_num >", value, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("join_work_num >=", value, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumLessThan(Integer value) {
            addCriterion("join_work_num <", value, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumLessThanOrEqualTo(Integer value) {
            addCriterion("join_work_num <=", value, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumIn(List<Integer> values) {
            addCriterion("join_work_num in", values, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumNotIn(List<Integer> values) {
            addCriterion("join_work_num not in", values, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumBetween(Integer value1, Integer value2) {
            addCriterion("join_work_num between", value1, value2, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andJoinWorkNumNotBetween(Integer value1, Integer value2) {
            addCriterion("join_work_num not between", value1, value2, "joinWorkNum");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNull() {
            addCriterion("station_name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("station_name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("station_name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("station_name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("station_name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("station_name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("station_name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("station_name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("station_name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("station_name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("station_name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("station_name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("station_name not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIsNull() {
            addCriterion("created_id is null");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIsNotNull() {
            addCriterion("created_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedIdEqualTo(Integer value) {
            addCriterion("created_id =", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotEqualTo(Integer value) {
            addCriterion("created_id <>", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdGreaterThan(Integer value) {
            addCriterion("created_id >", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_id >=", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdLessThan(Integer value) {
            addCriterion("created_id <", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdLessThanOrEqualTo(Integer value) {
            addCriterion("created_id <=", value, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdIn(List<Integer> values) {
            addCriterion("created_id in", values, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotIn(List<Integer> values) {
            addCriterion("created_id not in", values, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdBetween(Integer value1, Integer value2) {
            addCriterion("created_id between", value1, value2, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("created_id not between", value1, value2, "createdId");
            return (Criteria) this;
        }

        public Criteria andCreatedNameIsNull() {
            addCriterion("created_name is null");
            return (Criteria) this;
        }

        public Criteria andCreatedNameIsNotNull() {
            addCriterion("created_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedNameEqualTo(String value) {
            addCriterion("created_name =", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotEqualTo(String value) {
            addCriterion("created_name <>", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameGreaterThan(String value) {
            addCriterion("created_name >", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameGreaterThanOrEqualTo(String value) {
            addCriterion("created_name >=", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameLessThan(String value) {
            addCriterion("created_name <", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameLessThanOrEqualTo(String value) {
            addCriterion("created_name <=", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameLike(String value) {
            addCriterion("created_name like", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotLike(String value) {
            addCriterion("created_name not like", value, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameIn(List<String> values) {
            addCriterion("created_name in", values, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotIn(List<String> values) {
            addCriterion("created_name not in", values, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameBetween(String value1, String value2) {
            addCriterion("created_name between", value1, value2, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedNameNotBetween(String value1, String value2) {
            addCriterion("created_name not between", value1, value2, "createdName");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNull() {
            addCriterion("created_time is null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIsNotNull() {
            addCriterion("created_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeEqualTo(Date value) {
            addCriterion("created_time =", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotEqualTo(Date value) {
            addCriterion("created_time <>", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThan(Date value) {
            addCriterion("created_time >", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("created_time >=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThan(Date value) {
            addCriterion("created_time <", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeLessThanOrEqualTo(Date value) {
            addCriterion("created_time <=", value, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeIn(List<Date> values) {
            addCriterion("created_time in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotIn(List<Date> values) {
            addCriterion("created_time not in", values, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeBetween(Date value1, Date value2) {
            addCriterion("created_time between", value1, value2, "createdTime");
            return (Criteria) this;
        }

        public Criteria andCreatedTimeNotBetween(Date value1, Date value2) {
            addCriterion("created_time not between", value1, value2, "createdTime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table join_work
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table join_work
     *
     * @mbg.generated
     */
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