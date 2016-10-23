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

public interface DriversModeratorsLinesDao
{
	/** 
	 * Inserts a new row in the DRIVERS_MODERATORS_LINES table.
	 */
	public DriversModeratorsLinesPk insert(DriversModeratorsLines dto) throws DriversModeratorsLinesDaoException;

	/** 
	 * Updates a single row in the DRIVERS_MODERATORS_LINES table.
	 */
	public void update(DriversModeratorsLinesPk pk, DriversModeratorsLines dto) throws DriversModeratorsLinesDaoException;

	/** 
	 * Deletes a single row in the DRIVERS_MODERATORS_LINES table.
	 */
	public void delete(DriversModeratorsLinesPk pk) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns the rows from the DRIVERS_MODERATORS_LINES table that matches the specified primary-key value.
	 */
	public DriversModeratorsLines findByPrimaryKey(DriversModeratorsLinesPk pk) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'DRIVER_MODERATOR_LINE_ID = :driverModeratorLineId'.
	 */
	public DriversModeratorsLines findByPrimaryKey(int driverModeratorLineId) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria ''.
	 */
	public DriversModeratorsLines[] findAll() throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'BUS_LINE_ID = :busLineId'.
	 */
	public DriversModeratorsLines[] findByBusLines(int busLineId) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'DRIVER_ID = :driverId'.
	 */
	public DriversModeratorsLines[] findByEmployees(int driverId) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'MODERATOR_EMP_ID = :moderatorEmpId'.
	 */
	public DriversModeratorsLines[] findByEmployees2(int moderatorEmpId) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'DRIVER_MODERATOR_LINE_ID = :driverModeratorLineId'.
	 */
	public DriversModeratorsLines[] findWhereDriverModeratorLineIdEquals(int driverModeratorLineId) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'DRIVER_ID = :driverId'.
	 */
	public DriversModeratorsLines[] findWhereDriverIdEquals(int driverId) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'BUS_LINE_ID = :busLineId'.
	 */
	public DriversModeratorsLines[] findWhereBusLineIdEquals(int busLineId) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the criteria 'MODERATOR_EMP_ID = :moderatorEmpId'.
	 */
	public DriversModeratorsLines[] findWhereModeratorEmpIdEquals(int moderatorEmpId) throws DriversModeratorsLinesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the specified arbitrary SQL statement
	 */
	public DriversModeratorsLines[] findByDynamicSelect(String sql, Object[] sqlParams) throws DriversModeratorsLinesDaoException;

	/** 
	 * Returns all rows from the DRIVERS_MODERATORS_LINES table that match the specified arbitrary SQL statement
	 */
	public DriversModeratorsLines[] findByDynamicWhere(String sql, Object[] sqlParams) throws DriversModeratorsLinesDaoException;

}
