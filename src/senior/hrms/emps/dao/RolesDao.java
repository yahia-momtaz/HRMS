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

public interface RolesDao
{
	/** 
	 * Inserts a new row in the ROLES table.
	 */
	public RolesPk insert(Roles dto) throws RolesDaoException;

	/** 
	 * Updates a single row in the ROLES table.
	 */
	public void update(RolesPk pk, Roles dto) throws RolesDaoException;

	/** 
	 * Deletes a single row in the ROLES table.
	 */
	public void delete(RolesPk pk) throws RolesDaoException;

	/** 
	 * Returns the rows from the ROLES table that matches the specified primary-key value.
	 */
	public Roles findByPrimaryKey(RolesPk pk) throws RolesDaoException;

	/** 
	 * Returns all rows from the ROLES table that match the criteria 'ROLE_ID = :roleId'.
	 */
	public Roles findByPrimaryKey(int roleId) throws RolesDaoException;

	/** 
	 * Returns all rows from the ROLES table that match the criteria ''.
	 */
	public Roles[] findAll() throws RolesDaoException;

	/** 
	 * Returns all rows from the ROLES table that match the criteria 'ROLE_ID = :roleId'.
	 */
	public Roles[] findWhereRoleIdEquals(int roleId) throws RolesDaoException;

	/** 
	 * Returns all rows from the ROLES table that match the criteria 'ROLE_NAME = :roleName'.
	 */
	public Roles[] findWhereRoleNameEquals(String roleName) throws RolesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ROLES table that match the specified arbitrary SQL statement
	 */
	public Roles[] findByDynamicSelect(String sql, Object[] sqlParams) throws RolesDaoException;

	/** 
	 * Returns all rows from the ROLES table that match the specified arbitrary SQL statement
	 */
	public Roles[] findByDynamicWhere(String sql, Object[] sqlParams) throws RolesDaoException;

}