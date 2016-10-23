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

public interface ReligionDao
{
	/** 
	 * Inserts a new row in the RELIGION table.
	 */
	public ReligionPk insert(Religion dto) throws ReligionDaoException;

	/** 
	 * Updates a single row in the RELIGION table.
	 */
	public void update(ReligionPk pk, Religion dto) throws ReligionDaoException;

	/** 
	 * Deletes a single row in the RELIGION table.
	 */
	public void delete(ReligionPk pk) throws ReligionDaoException;

	/** 
	 * Returns the rows from the RELIGION table that matches the specified primary-key value.
	 */
	public Religion findByPrimaryKey(ReligionPk pk) throws ReligionDaoException;

	/** 
	 * Returns all rows from the RELIGION table that match the criteria 'RELIGION_ID = :religionId'.
	 */
	public Religion findByPrimaryKey(int religionId) throws ReligionDaoException;

	/** 
	 * Returns all rows from the RELIGION table that match the criteria ''.
	 */
	public Religion[] findAll() throws ReligionDaoException;

	/** 
	 * Returns all rows from the RELIGION table that match the criteria 'RELIGION_ID = :religionId'.
	 */
	public Religion[] findWhereReligionIdEquals(int religionId) throws ReligionDaoException;

	/** 
	 * Returns all rows from the RELIGION table that match the criteria 'RELIGION_NAME = :religionName'.
	 */
	public Religion[] findWhereReligionNameEquals(String religionName) throws ReligionDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the RELIGION table that match the specified arbitrary SQL statement
	 */
	public Religion[] findByDynamicSelect(String sql, Object[] sqlParams) throws ReligionDaoException;

	/** 
	 * Returns all rows from the RELIGION table that match the specified arbitrary SQL statement
	 */
	public Religion[] findByDynamicWhere(String sql, Object[] sqlParams) throws ReligionDaoException;

}
