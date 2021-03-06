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

public interface FinancialYearsDao
{
	/** 
	 * Inserts a new row in the FINANCIAL_YEARS table.
	 */
	public FinancialYearsPk insert(FinancialYears dto) throws FinancialYearsDaoException;

	/** 
	 * Updates a single row in the FINANCIAL_YEARS table.
	 */
	public void update(FinancialYearsPk pk, FinancialYears dto) throws FinancialYearsDaoException;

	/** 
	 * Deletes a single row in the FINANCIAL_YEARS table.
	 */
	public void delete(FinancialYearsPk pk) throws FinancialYearsDaoException;

	/** 
	 * Returns the rows from the FINANCIAL_YEARS table that matches the specified primary-key value.
	 */
	public FinancialYears findByPrimaryKey(FinancialYearsPk pk) throws FinancialYearsDaoException;

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public FinancialYears findByPrimaryKey(int financialYearId) throws FinancialYearsDaoException;

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria ''.
	 */
	public FinancialYears[] findAll() throws FinancialYearsDaoException;

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public FinancialYears[] findWhereFinancialYearIdEquals(int financialYearId) throws FinancialYearsDaoException;

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'FINANCIAL_YEAR_TITLE = :financialYearTitle'.
	 */
	public FinancialYears[] findWhereFinancialYearTitleEquals(String financialYearTitle) throws FinancialYearsDaoException;

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'DATE_FROM = :dateFrom'.
	 */
	public FinancialYears[] findWhereDateFromEquals(Date dateFrom) throws FinancialYearsDaoException;

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'DATE_TO = :dateTo'.
	 */
	public FinancialYears[] findWhereDateToEquals(Date dateTo) throws FinancialYearsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the specified arbitrary SQL statement
	 */
	public FinancialYears[] findByDynamicSelect(String sql, Object[] sqlParams) throws FinancialYearsDaoException;

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the specified arbitrary SQL statement
	 */
	public FinancialYears[] findByDynamicWhere(String sql, Object[] sqlParams) throws FinancialYearsDaoException;

}
