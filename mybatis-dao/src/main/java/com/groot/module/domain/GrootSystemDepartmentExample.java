package com.groot.module.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class GrootSystemDepartmentExample {

	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	protected String orderByClause;
	/**
	 * This field was generated by Apache iBATIS ibator. This field corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	protected List oredCriteria;

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public GrootSystemDepartmentExample() {
		oredCriteria = new ArrayList();
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	protected GrootSystemDepartmentExample(GrootSystemDepartmentExample example) {
		this.orderByClause = example.orderByClause;
		this.oredCriteria = example.oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public List getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by Apache iBATIS ibator. This method corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public void clear() {
		oredCriteria.clear();
	}

	/**
	 * This class was generated by Apache iBATIS ibator. This class corresponds to the database table GROOT_SYSTEM_DEPARTMENT
	 * @ibatorgenerated  Wed Oct 29 15:35:22 CST 2014
	 */
	public static class Criteria {
		protected List criteriaWithoutValue;
		protected List criteriaWithSingleValue;
		protected List criteriaWithListValue;
		protected List criteriaWithBetweenValue;

		protected Criteria() {
			super();
			criteriaWithoutValue = new ArrayList();
			criteriaWithSingleValue = new ArrayList();
			criteriaWithListValue = new ArrayList();
			criteriaWithBetweenValue = new ArrayList();
		}

		public boolean isValid() {
			return criteriaWithoutValue.size() > 0
					|| criteriaWithSingleValue.size() > 0
					|| criteriaWithListValue.size() > 0
					|| criteriaWithBetweenValue.size() > 0;
		}

		public List getCriteriaWithoutValue() {
			return criteriaWithoutValue;
		}

		public List getCriteriaWithSingleValue() {
			return criteriaWithSingleValue;
		}

		public List getCriteriaWithListValue() {
			return criteriaWithListValue;
		}

		public List getCriteriaWithBetweenValue() {
			return criteriaWithBetweenValue;
		}

		protected void addCriterion(String condition) {
			if (condition == null) {
				throw new RuntimeException("Value for condition cannot be null");
			}
			criteriaWithoutValue.add(condition);
		}

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("value", value);
			criteriaWithSingleValue.add(map);
		}

		protected void addCriterion(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", values);
			criteriaWithListValue.add(map);
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			List list = new ArrayList();
			list.add(value1);
			list.add(value2);
			Map map = new HashMap();
			map.put("condition", condition);
			map.put("values", list);
			criteriaWithBetweenValue.add(map);
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition, List values,
				String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List dateList = new ArrayList();
			Iterator iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(((Date) iter.next()).getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andIdIsNull() {
			addCriterion("ID is null");
			return this;
		}

		public Criteria andIdIsNotNull() {
			addCriterion("ID is not null");
			return this;
		}

		public Criteria andIdEqualTo(String value) {
			addCriterion("ID =", value, "id");
			return this;
		}

		public Criteria andIdNotEqualTo(String value) {
			addCriterion("ID <>", value, "id");
			return this;
		}

		public Criteria andIdGreaterThan(String value) {
			addCriterion("ID >", value, "id");
			return this;
		}

		public Criteria andIdGreaterThanOrEqualTo(String value) {
			addCriterion("ID >=", value, "id");
			return this;
		}

		public Criteria andIdLessThan(String value) {
			addCriterion("ID <", value, "id");
			return this;
		}

		public Criteria andIdLessThanOrEqualTo(String value) {
			addCriterion("ID <=", value, "id");
			return this;
		}

		public Criteria andIdLike(String value) {
			addCriterion("ID like", value, "id");
			return this;
		}

		public Criteria andIdNotLike(String value) {
			addCriterion("ID not like", value, "id");
			return this;
		}

		public Criteria andIdIn(List values) {
			addCriterion("ID in", values, "id");
			return this;
		}

		public Criteria andIdNotIn(List values) {
			addCriterion("ID not in", values, "id");
			return this;
		}

		public Criteria andIdBetween(String value1, String value2) {
			addCriterion("ID between", value1, value2, "id");
			return this;
		}

		public Criteria andIdNotBetween(String value1, String value2) {
			addCriterion("ID not between", value1, value2, "id");
			return this;
		}

		public Criteria andDepartmentNameIsNull() {
			addCriterion("DEPARTMENT_NAME is null");
			return this;
		}

		public Criteria andDepartmentNameIsNotNull() {
			addCriterion("DEPARTMENT_NAME is not null");
			return this;
		}

		public Criteria andDepartmentNameEqualTo(String value) {
			addCriterion("DEPARTMENT_NAME =", value, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameNotEqualTo(String value) {
			addCriterion("DEPARTMENT_NAME <>", value, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameGreaterThan(String value) {
			addCriterion("DEPARTMENT_NAME >", value, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameGreaterThanOrEqualTo(String value) {
			addCriterion("DEPARTMENT_NAME >=", value, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameLessThan(String value) {
			addCriterion("DEPARTMENT_NAME <", value, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameLessThanOrEqualTo(String value) {
			addCriterion("DEPARTMENT_NAME <=", value, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameLike(String value) {
			addCriterion("DEPARTMENT_NAME like", value, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameNotLike(String value) {
			addCriterion("DEPARTMENT_NAME not like", value, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameIn(List values) {
			addCriterion("DEPARTMENT_NAME in", values, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameNotIn(List values) {
			addCriterion("DEPARTMENT_NAME not in", values, "departmentName");
			return this;
		}

		public Criteria andDepartmentNameBetween(String value1, String value2) {
			addCriterion("DEPARTMENT_NAME between", value1, value2,
					"departmentName");
			return this;
		}

		public Criteria andDepartmentNameNotBetween(String value1, String value2) {
			addCriterion("DEPARTMENT_NAME not between", value1, value2,
					"departmentName");
			return this;
		}

		public Criteria andUserIdIsNull() {
			addCriterion("USER_ID is null");
			return this;
		}

		public Criteria andUserIdIsNotNull() {
			addCriterion("USER_ID is not null");
			return this;
		}

		public Criteria andUserIdEqualTo(String value) {
			addCriterion("USER_ID =", value, "userId");
			return this;
		}

		public Criteria andUserIdNotEqualTo(String value) {
			addCriterion("USER_ID <>", value, "userId");
			return this;
		}

		public Criteria andUserIdGreaterThan(String value) {
			addCriterion("USER_ID >", value, "userId");
			return this;
		}

		public Criteria andUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("USER_ID >=", value, "userId");
			return this;
		}

		public Criteria andUserIdLessThan(String value) {
			addCriterion("USER_ID <", value, "userId");
			return this;
		}

		public Criteria andUserIdLessThanOrEqualTo(String value) {
			addCriterion("USER_ID <=", value, "userId");
			return this;
		}

		public Criteria andUserIdLike(String value) {
			addCriterion("USER_ID like", value, "userId");
			return this;
		}

		public Criteria andUserIdNotLike(String value) {
			addCriterion("USER_ID not like", value, "userId");
			return this;
		}

		public Criteria andUserIdIn(List values) {
			addCriterion("USER_ID in", values, "userId");
			return this;
		}

		public Criteria andUserIdNotIn(List values) {
			addCriterion("USER_ID not in", values, "userId");
			return this;
		}

		public Criteria andUserIdBetween(String value1, String value2) {
			addCriterion("USER_ID between", value1, value2, "userId");
			return this;
		}

		public Criteria andUserIdNotBetween(String value1, String value2) {
			addCriterion("USER_ID not between", value1, value2, "userId");
			return this;
		}

		public Criteria andParentIdIsNull() {
			addCriterion("PARENT_ID is null");
			return this;
		}

		public Criteria andParentIdIsNotNull() {
			addCriterion("PARENT_ID is not null");
			return this;
		}

		public Criteria andParentIdEqualTo(String value) {
			addCriterion("PARENT_ID =", value, "parentId");
			return this;
		}

		public Criteria andParentIdNotEqualTo(String value) {
			addCriterion("PARENT_ID <>", value, "parentId");
			return this;
		}

		public Criteria andParentIdGreaterThan(String value) {
			addCriterion("PARENT_ID >", value, "parentId");
			return this;
		}

		public Criteria andParentIdGreaterThanOrEqualTo(String value) {
			addCriterion("PARENT_ID >=", value, "parentId");
			return this;
		}

		public Criteria andParentIdLessThan(String value) {
			addCriterion("PARENT_ID <", value, "parentId");
			return this;
		}

		public Criteria andParentIdLessThanOrEqualTo(String value) {
			addCriterion("PARENT_ID <=", value, "parentId");
			return this;
		}

		public Criteria andParentIdLike(String value) {
			addCriterion("PARENT_ID like", value, "parentId");
			return this;
		}

		public Criteria andParentIdNotLike(String value) {
			addCriterion("PARENT_ID not like", value, "parentId");
			return this;
		}

		public Criteria andParentIdIn(List values) {
			addCriterion("PARENT_ID in", values, "parentId");
			return this;
		}

		public Criteria andParentIdNotIn(List values) {
			addCriterion("PARENT_ID not in", values, "parentId");
			return this;
		}

		public Criteria andParentIdBetween(String value1, String value2) {
			addCriterion("PARENT_ID between", value1, value2, "parentId");
			return this;
		}

		public Criteria andParentIdNotBetween(String value1, String value2) {
			addCriterion("PARENT_ID not between", value1, value2, "parentId");
			return this;
		}

		public Criteria andDepartmentCodeIsNull() {
			addCriterion("DEPARTMENT_CODE is null");
			return this;
		}

		public Criteria andDepartmentCodeIsNotNull() {
			addCriterion("DEPARTMENT_CODE is not null");
			return this;
		}

		public Criteria andDepartmentCodeEqualTo(String value) {
			addCriterion("DEPARTMENT_CODE =", value, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeNotEqualTo(String value) {
			addCriterion("DEPARTMENT_CODE <>", value, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeGreaterThan(String value) {
			addCriterion("DEPARTMENT_CODE >", value, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeGreaterThanOrEqualTo(String value) {
			addCriterion("DEPARTMENT_CODE >=", value, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeLessThan(String value) {
			addCriterion("DEPARTMENT_CODE <", value, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeLessThanOrEqualTo(String value) {
			addCriterion("DEPARTMENT_CODE <=", value, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeLike(String value) {
			addCriterion("DEPARTMENT_CODE like", value, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeNotLike(String value) {
			addCriterion("DEPARTMENT_CODE not like", value, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeIn(List values) {
			addCriterion("DEPARTMENT_CODE in", values, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeNotIn(List values) {
			addCriterion("DEPARTMENT_CODE not in", values, "departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeBetween(String value1, String value2) {
			addCriterion("DEPARTMENT_CODE between", value1, value2,
					"departmentCode");
			return this;
		}

		public Criteria andDepartmentCodeNotBetween(String value1, String value2) {
			addCriterion("DEPARTMENT_CODE not between", value1, value2,
					"departmentCode");
			return this;
		}

		public Criteria andStatusIsNull() {
			addCriterion("STATUS is null");
			return this;
		}

		public Criteria andStatusIsNotNull() {
			addCriterion("STATUS is not null");
			return this;
		}

		public Criteria andStatusEqualTo(String value) {
			addCriterion("STATUS =", value, "status");
			return this;
		}

		public Criteria andStatusNotEqualTo(String value) {
			addCriterion("STATUS <>", value, "status");
			return this;
		}

		public Criteria andStatusGreaterThan(String value) {
			addCriterion("STATUS >", value, "status");
			return this;
		}

		public Criteria andStatusGreaterThanOrEqualTo(String value) {
			addCriterion("STATUS >=", value, "status");
			return this;
		}

		public Criteria andStatusLessThan(String value) {
			addCriterion("STATUS <", value, "status");
			return this;
		}

		public Criteria andStatusLessThanOrEqualTo(String value) {
			addCriterion("STATUS <=", value, "status");
			return this;
		}

		public Criteria andStatusLike(String value) {
			addCriterion("STATUS like", value, "status");
			return this;
		}

		public Criteria andStatusNotLike(String value) {
			addCriterion("STATUS not like", value, "status");
			return this;
		}

		public Criteria andStatusIn(List values) {
			addCriterion("STATUS in", values, "status");
			return this;
		}

		public Criteria andStatusNotIn(List values) {
			addCriterion("STATUS not in", values, "status");
			return this;
		}

		public Criteria andStatusBetween(String value1, String value2) {
			addCriterion("STATUS between", value1, value2, "status");
			return this;
		}

		public Criteria andStatusNotBetween(String value1, String value2) {
			addCriterion("STATUS not between", value1, value2, "status");
			return this;
		}

		public Criteria andRemarkIsNull() {
			addCriterion("REMARK is null");
			return this;
		}

		public Criteria andRemarkIsNotNull() {
			addCriterion("REMARK is not null");
			return this;
		}

		public Criteria andRemarkEqualTo(String value) {
			addCriterion("REMARK =", value, "remark");
			return this;
		}

		public Criteria andRemarkNotEqualTo(String value) {
			addCriterion("REMARK <>", value, "remark");
			return this;
		}

		public Criteria andRemarkGreaterThan(String value) {
			addCriterion("REMARK >", value, "remark");
			return this;
		}

		public Criteria andRemarkGreaterThanOrEqualTo(String value) {
			addCriterion("REMARK >=", value, "remark");
			return this;
		}

		public Criteria andRemarkLessThan(String value) {
			addCriterion("REMARK <", value, "remark");
			return this;
		}

		public Criteria andRemarkLessThanOrEqualTo(String value) {
			addCriterion("REMARK <=", value, "remark");
			return this;
		}

		public Criteria andRemarkLike(String value) {
			addCriterion("REMARK like", value, "remark");
			return this;
		}

		public Criteria andRemarkNotLike(String value) {
			addCriterion("REMARK not like", value, "remark");
			return this;
		}

		public Criteria andRemarkIn(List values) {
			addCriterion("REMARK in", values, "remark");
			return this;
		}

		public Criteria andRemarkNotIn(List values) {
			addCriterion("REMARK not in", values, "remark");
			return this;
		}

		public Criteria andRemarkBetween(String value1, String value2) {
			addCriterion("REMARK between", value1, value2, "remark");
			return this;
		}

		public Criteria andRemarkNotBetween(String value1, String value2) {
			addCriterion("REMARK not between", value1, value2, "remark");
			return this;
		}

		public Criteria andCreateTimeIsNull() {
			addCriterion("CREATE_TIME is null");
			return this;
		}

		public Criteria andCreateTimeIsNotNull() {
			addCriterion("CREATE_TIME is not null");
			return this;
		}

		public Criteria andCreateTimeEqualTo(Date value) {
			addCriterion("CREATE_TIME =", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeNotEqualTo(Date value) {
			addCriterion("CREATE_TIME <>", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeGreaterThan(Date value) {
			addCriterion("CREATE_TIME >", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
			addCriterion("CREATE_TIME >=", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeLessThan(Date value) {
			addCriterion("CREATE_TIME <", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
			addCriterion("CREATE_TIME <=", value, "createTime");
			return this;
		}

		public Criteria andCreateTimeIn(List values) {
			addCriterion("CREATE_TIME in", values, "createTime");
			return this;
		}

		public Criteria andCreateTimeNotIn(List values) {
			addCriterion("CREATE_TIME not in", values, "createTime");
			return this;
		}

		public Criteria andCreateTimeBetween(Date value1, Date value2) {
			addCriterion("CREATE_TIME between", value1, value2, "createTime");
			return this;
		}

		public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
			addCriterion("CREATE_TIME not between", value1, value2,
					"createTime");
			return this;
		}

		public Criteria andCreateUserIdIsNull() {
			addCriterion("CREATE_USER_ID is null");
			return this;
		}

		public Criteria andCreateUserIdIsNotNull() {
			addCriterion("CREATE_USER_ID is not null");
			return this;
		}

		public Criteria andCreateUserIdEqualTo(String value) {
			addCriterion("CREATE_USER_ID =", value, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdNotEqualTo(String value) {
			addCriterion("CREATE_USER_ID <>", value, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdGreaterThan(String value) {
			addCriterion("CREATE_USER_ID >", value, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("CREATE_USER_ID >=", value, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdLessThan(String value) {
			addCriterion("CREATE_USER_ID <", value, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdLessThanOrEqualTo(String value) {
			addCriterion("CREATE_USER_ID <=", value, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdLike(String value) {
			addCriterion("CREATE_USER_ID like", value, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdNotLike(String value) {
			addCriterion("CREATE_USER_ID not like", value, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdIn(List values) {
			addCriterion("CREATE_USER_ID in", values, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdNotIn(List values) {
			addCriterion("CREATE_USER_ID not in", values, "createUserId");
			return this;
		}

		public Criteria andCreateUserIdBetween(String value1, String value2) {
			addCriterion("CREATE_USER_ID between", value1, value2,
					"createUserId");
			return this;
		}

		public Criteria andCreateUserIdNotBetween(String value1, String value2) {
			addCriterion("CREATE_USER_ID not between", value1, value2,
					"createUserId");
			return this;
		}

		public Criteria andUpdateTimeIsNull() {
			addCriterion("UPDATE_TIME is null");
			return this;
		}

		public Criteria andUpdateTimeIsNotNull() {
			addCriterion("UPDATE_TIME is not null");
			return this;
		}

		public Criteria andUpdateTimeEqualTo(Date value) {
			addCriterionForJDBCDate("UPDATE_TIME =", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeNotEqualTo(Date value) {
			addCriterionForJDBCDate("UPDATE_TIME <>", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeGreaterThan(Date value) {
			addCriterionForJDBCDate("UPDATE_TIME >", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("UPDATE_TIME >=", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeLessThan(Date value) {
			addCriterionForJDBCDate("UPDATE_TIME <", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("UPDATE_TIME <=", value, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeIn(List values) {
			addCriterionForJDBCDate("UPDATE_TIME in", values, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeNotIn(List values) {
			addCriterionForJDBCDate("UPDATE_TIME not in", values, "updateTime");
			return this;
		}

		public Criteria andUpdateTimeBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("UPDATE_TIME between", value1, value2,
					"updateTime");
			return this;
		}

		public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("UPDATE_TIME not between", value1, value2,
					"updateTime");
			return this;
		}

		public Criteria andUpdateUserIdIsNull() {
			addCriterion("UPDATE_USER_ID is null");
			return this;
		}

		public Criteria andUpdateUserIdIsNotNull() {
			addCriterion("UPDATE_USER_ID is not null");
			return this;
		}

		public Criteria andUpdateUserIdEqualTo(String value) {
			addCriterion("UPDATE_USER_ID =", value, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdNotEqualTo(String value) {
			addCriterion("UPDATE_USER_ID <>", value, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdGreaterThan(String value) {
			addCriterion("UPDATE_USER_ID >", value, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdGreaterThanOrEqualTo(String value) {
			addCriterion("UPDATE_USER_ID >=", value, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdLessThan(String value) {
			addCriterion("UPDATE_USER_ID <", value, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdLessThanOrEqualTo(String value) {
			addCriterion("UPDATE_USER_ID <=", value, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdLike(String value) {
			addCriterion("UPDATE_USER_ID like", value, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdNotLike(String value) {
			addCriterion("UPDATE_USER_ID not like", value, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdIn(List values) {
			addCriterion("UPDATE_USER_ID in", values, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdNotIn(List values) {
			addCriterion("UPDATE_USER_ID not in", values, "updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdBetween(String value1, String value2) {
			addCriterion("UPDATE_USER_ID between", value1, value2,
					"updateUserId");
			return this;
		}

		public Criteria andUpdateUserIdNotBetween(String value1, String value2) {
			addCriterion("UPDATE_USER_ID not between", value1, value2,
					"updateUserId");
			return this;
		}
	}
}