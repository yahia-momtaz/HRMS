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

public interface EmpQualificationsDao
{
	/** 
	 * Inserts a new row in the EMP_QUALIFICATIONS table.
	 */
	public EmpQualificationsPk insert(EmpQualifications dto) throws EmpQualificationsDaoException;

	/** 
	 * Updates a single row in the EMP_QUALIFICATIONS table.
	 */
	public void update(EmpQualificationsPk pk, EmpQualifications dto) throws EmpQualificationsDaoException;

	/** 
	 * Deletes a single row in the EMP_QUALIFICATIONS table.
	 */
	public void delete(EmpQualificationsPk pk) throws EmpQualificationsDaoException;

	/** 
	 * Returns the rows from the EMP_QUALIFICATIONS table that matches the specified primary-key value.
	 */
	public EmpQualifications findByPrimaryKey(EmpQualificationsPk pk) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'EMP_QUAL_ID = :empQualId'.
	 */
	public EmpQualifications findByPrimaryKey(int empQualId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria ''.
	 */
	public EmpQualifications[] findAll() throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'DEGREE_ID = :degreeId'.
	 */
	public EmpQualifications[] findByDegree(int degreeId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpQualifications[] findByEmployees(int employeeId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'GRADE_ID = :gradeId'.
	 */
	public EmpQualifications[] findByGrade(int gradeId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'INSTITUTE_ID = :instituteId'.
	 */
	public EmpQualifications[] findByInstitutions(int instituteId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'MAJOR_ID = :majorId'.
	 */
	public EmpQualifications[] findByMajor(int majorId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'EMP_QUAL_ID = :empQualId'.
	 */
	public EmpQualifications[] findWhereEmpQualIdEquals(int empQualId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpQualifications[] findWhereEmployeeIdEquals(int employeeId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'INSTITUTE_ID = :instituteId'.
	 */
	public EmpQualifications[] findWhereInstituteIdEquals(int instituteId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'DEGREE_ID = :degreeId'.
	 */
	public EmpQualifications[] findWhereDegreeIdEquals(int degreeId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'MAJOR_ID = :majorId'.
	 */
	public EmpQualifications[] findWhereMajorIdEquals(int majorId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'GRADE_ID = :gradeId'.
	 */
	public EmpQualifications[] findWhereGradeIdEquals(int gradeId) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the criteria 'GRADUATION_YEAR = :graduationYear'.
	 */
	public EmpQualifications[] findWhereGraduationYearEquals(String graduationYear) throws EmpQualificationsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the specified arbitrary SQL statement
	 */
	public EmpQualifications[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpQualificationsDaoException;

	/** 
	 * Returns all rows from the EMP_QUALIFICATIONS table that match the specified arbitrary SQL statement
	 */
	public EmpQualifications[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpQualificationsDaoException;

}
