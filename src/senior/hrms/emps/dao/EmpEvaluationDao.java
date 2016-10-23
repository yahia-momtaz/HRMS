/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dao;

import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface EmpEvaluationDao
{
	/** 
	 * Inserts a new row in the EMP_EVALUATION table.
	 */
	public EmpEvaluationPk insert(EmpEvaluation dto) throws EmpEvaluationDaoException;

	/** 
	 * Updates a single row in the EMP_EVALUATION table.
	 */
	public void update(EmpEvaluationPk pk, EmpEvaluation dto) throws EmpEvaluationDaoException;

	/** 
	 * Deletes a single row in the EMP_EVALUATION table.
	 */
	public void delete(EmpEvaluationPk pk) throws EmpEvaluationDaoException;

	/** 
	 * Returns the rows from the EMP_EVALUATION table that matches the specified primary-key value.
	 */
	public EmpEvaluation findByPrimaryKey(EmpEvaluationPk pk) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'EMP_EVALUATION_ID = :empEvaluationId'.
	 */
	public EmpEvaluation findByPrimaryKey(int empEvaluationId) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria ''.
	 */
	public EmpEvaluation[] findAll() throws EmpEvaluationDaoException;

	
	
	
	
	
	
	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpEvaluation[] findByEmployees(int employeeId) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'EVALUATION_DEGERE_ID = :evaluationDegereId'.
	 */
	public EmpEvaluation[] findByEvaluationsDegree(int evaluationDegereId) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'EVALUATION_ITEM_ID = :evaluationItemId'.
	 */
	public EmpEvaluation[] findByEvaluationItem(int evaluationItemId) throws EmpEvaluationDaoException;

	
	
	
	
	
	
	
	
	
	
	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'EMP_EVALUATION_ID = :empEvaluationId'.
	 */
	public EmpEvaluation[] findWhereEmpEvaluationIdEquals(int empEvaluationId) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpEvaluation[] findWhereEmployeeIdEquals(int employeeId) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'EVALUATION_ITEM_ID = :evaluationItemId'.
	 */
	public EmpEvaluation[] findWhereEvaluationItemIdEquals(int evaluationItemId) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'EVALUATION_DEGERE_ID = :evaluationDegereId'.
	 */
	public EmpEvaluation[] findWhereEvaluationDegereIdEquals(int evaluationDegereId) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'DEGREE_PERCENTAGE = :degreePercentage'.
	 */
	public EmpEvaluation[] findWhereDegreePercentageEquals(int degreePercentage) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'EVALUATED_BY_EMP_ID = :evaluatedByEmpId'.
	 */
	public EmpEvaluation[] findWhereEvaluatedByEmpIdEquals(int evaluatedByEmpId) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public EmpEvaluation[] findWhereFinancialYearIdEquals(int financialYearId) throws EmpEvaluationDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the specified arbitrary SQL statement
	 */
	public EmpEvaluation[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpEvaluationDaoException;

	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the specified arbitrary SQL statement
	 */
	public EmpEvaluation[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpEvaluationDaoException;

	
	
	/***
	
	By Yahia
	
	*/
	
	/** 
	 * Returns all rows from the EMP_EVALUATION table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public EmpEvaluation[] findByFinancialYears(int financialYearId) throws EmpEvaluationDaoException;
	
	
	
	
	
	
}
