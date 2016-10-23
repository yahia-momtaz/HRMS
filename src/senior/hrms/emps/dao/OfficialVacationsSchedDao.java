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

public interface OfficialVacationsSchedDao
{
	/** 
	 * Inserts a new row in the OFFICIAL_VACATIONS_SCHED table.
	 */
	public OfficialVacationsSchedPk insert(OfficialVacationsSched dto) throws OfficialVacationsSchedDaoException;

	/** 
	 * Updates a single row in the OFFICIAL_VACATIONS_SCHED table.
	 */
	public void update(OfficialVacationsSchedPk pk, OfficialVacationsSched dto) throws OfficialVacationsSchedDaoException;

	/** 
	 * Deletes a single row in the OFFICIAL_VACATIONS_SCHED table.
	 */
	public void delete(OfficialVacationsSchedPk pk) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns the rows from the OFFICIAL_VACATIONS_SCHED table that matches the specified primary-key value.
	 */
	public OfficialVacationsSched findByPrimaryKey(OfficialVacationsSchedPk pk) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the criteria 'OFFICIAL_VAC_SCHED_ID = :officialVacSchedId'.
	 */
	public OfficialVacationsSched findByPrimaryKey(int officialVacSchedId) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the criteria ''.
	 */
	public OfficialVacationsSched[] findAll() throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public OfficialVacationsSched[] findByFinancialYears(int financialYearId) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the criteria 'OFFICIAL_VACATION_ID = :officialVacationId'.
	 */
	public OfficialVacationsSched[] findByOfficialVacations(int officialVacationId) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the criteria 'OFFICIAL_VAC_SCHED_ID = :officialVacSchedId'.
	 */
	public OfficialVacationsSched[] findWhereOfficialVacSchedIdEquals(int officialVacSchedId) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the criteria 'OFFICIAL_VACATION_ID = :officialVacationId'.
	 */
	public OfficialVacationsSched[] findWhereOfficialVacationIdEquals(int officialVacationId) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the criteria 'DATE_FROM = :dateFrom'.
	 */
	public OfficialVacationsSched[] findWhereDateFromEquals(Date dateFrom) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the criteria 'DATE_TO = :dateTo'.
	 */
	public OfficialVacationsSched[] findWhereDateToEquals(Date dateTo) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public OfficialVacationsSched[] findWhereFinancialYearIdEquals(int financialYearId) throws OfficialVacationsSchedDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the specified arbitrary SQL statement
	 */
	public OfficialVacationsSched[] findByDynamicSelect(String sql, Object[] sqlParams) throws OfficialVacationsSchedDaoException;

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS_SCHED table that match the specified arbitrary SQL statement
	 */
	public OfficialVacationsSched[] findByDynamicWhere(String sql, Object[] sqlParams) throws OfficialVacationsSchedDaoException;

}
