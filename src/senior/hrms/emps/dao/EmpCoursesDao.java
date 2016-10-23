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

public interface EmpCoursesDao
{
	/** 
	 * Inserts a new row in the EMP_COURSES table.
	 */
	public EmpCoursesPk insert(EmpCourses dto) throws EmpCoursesDaoException;

	/** 
	 * Updates a single row in the EMP_COURSES table.
	 */
	public void update(EmpCoursesPk pk, EmpCourses dto) throws EmpCoursesDaoException;

	/** 
	 * Deletes a single row in the EMP_COURSES table.
	 */
	public void delete(EmpCoursesPk pk) throws EmpCoursesDaoException;

	/** 
	 * Returns the rows from the EMP_COURSES table that matches the specified primary-key value.
	 */
	public EmpCourses findByPrimaryKey(EmpCoursesPk pk) throws EmpCoursesDaoException;

	/** 
	 * Returns all rows from the EMP_COURSES table that match the criteria 'EMP_COURSE_ID = :empCourseId'.
	 */
	public EmpCourses findByPrimaryKey(int empCourseId) throws EmpCoursesDaoException;

	/** 
	 * Returns all rows from the EMP_COURSES table that match the criteria ''.
	 */
	public EmpCourses[] findAll() throws EmpCoursesDaoException;

	/** 
	 * Returns all rows from the EMP_COURSES table that match the criteria 'COURSE_ID = :courseId'.
	 */
	public EmpCourses[] findByCourses(int courseId) throws EmpCoursesDaoException;

	/** 
	 * Returns all rows from the EMP_COURSES table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpCourses[] findByEmployees(int employeeId) throws EmpCoursesDaoException;

	/** 
	 * Returns all rows from the EMP_COURSES table that match the criteria 'EMP_COURSE_ID = :empCourseId'.
	 */
	public EmpCourses[] findWhereEmpCourseIdEquals(int empCourseId) throws EmpCoursesDaoException;

	/** 
	 * Returns all rows from the EMP_COURSES table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpCourses[] findWhereEmployeeIdEquals(int employeeId) throws EmpCoursesDaoException;

	/** 
	 * Returns all rows from the EMP_COURSES table that match the criteria 'COURSE_ID = :courseId'.
	 */
	public EmpCourses[] findWhereCourseIdEquals(int courseId) throws EmpCoursesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the EMP_COURSES table that match the specified arbitrary SQL statement
	 */
	public EmpCourses[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpCoursesDaoException;

	/** 
	 * Returns all rows from the EMP_COURSES table that match the specified arbitrary SQL statement
	 */
	public EmpCourses[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpCoursesDaoException;

}