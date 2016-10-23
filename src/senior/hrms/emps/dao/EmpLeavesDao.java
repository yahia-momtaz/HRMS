/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dao;

import java.util.Date;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface EmpLeavesDao
{
	/** 
	 * Inserts a new row in the EMP_LEAVES table.
	 */
	public EmpLeavesPk insert(EmpLeaves dto) throws EmpLeavesDaoException;

	/** 
	 * Updates a single row in the EMP_LEAVES table.
	 */
	public void update(EmpLeavesPk pk, EmpLeaves dto) throws EmpLeavesDaoException;

	/** 
	 * Deletes a single row in the EMP_LEAVES table.
	 */
	public void delete(EmpLeavesPk pk) throws EmpLeavesDaoException;

	/** 
	 * Returns the rows from the EMP_LEAVES table that matches the specified primary-key value.
	 */
	public EmpLeaves findByPrimaryKey(EmpLeavesPk pk) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMP_LEAVE_ID = :empLeaveId'.
	 */
	public EmpLeaves findByPrimaryKey(int empLeaveId) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria ''.
	 */
	public EmpLeaves[] findAll() throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpLeaves[] findByEmployees(int employeeId) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'LEAVE_ID = :leaveId'.
	 */
	public EmpLeaves[] findByLeaves(int leaveId) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'PERMIT_SIDE_ID = :permitSideId'.
	 */
	public EmpLeaves[] findByPermitSide(int permitSideId) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMP_LEAVE_ID = :empLeaveId'.
	 */
	public EmpLeaves[] findWhereEmpLeaveIdEquals(int empLeaveId) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpLeaves[] findWhereEmployeeIdEquals(int employeeId) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'LEAVE_ID = :leaveId'.
	 */
	public EmpLeaves[] findWhereLeaveIdEquals(int leaveId) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'PERMIT_SIDE_ID = :permitSideId'.
	 */
	public EmpLeaves[] findWherePermitSideIdEquals(int permitSideId) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'DATE_TIME_FROM = :dateTimeFrom'.
	 */
	public EmpLeaves[] findWhereDateTimeFromEquals(Date dateTimeFrom) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'DATE_TIME_TO = :dateTimeTo'.
	 */
	public EmpLeaves[] findWhereDateTimeToEquals(Date dateTimeTo) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMP_LEAVE_NOTE = :empLeaveNote'.
	 */
	public EmpLeaves[] findWhereEmpLeaveNoteEquals(String empLeaveNote) throws EmpLeavesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the specified arbitrary SQL statement
	 */
	public EmpLeaves[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpLeavesDaoException;

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the specified arbitrary SQL statement
	 */
	public EmpLeaves[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpLeavesDaoException;

}
