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

public interface IssuersDao
{
	/** 
	 * Inserts a new row in the ISSUERS table.
	 */
	public IssuersPk insert(Issuers dto) throws IssuersDaoException;

	/** 
	 * Updates a single row in the ISSUERS table.
	 */
	public void update(IssuersPk pk, Issuers dto) throws IssuersDaoException;

	/** 
	 * Deletes a single row in the ISSUERS table.
	 */
	public void delete(IssuersPk pk) throws IssuersDaoException;

	/** 
	 * Returns the rows from the ISSUERS table that matches the specified primary-key value.
	 */
	public Issuers findByPrimaryKey(IssuersPk pk) throws IssuersDaoException;

	/** 
	 * Returns all rows from the ISSUERS table that match the criteria 'ISSUER_ID = :issuerId'.
	 */
	public Issuers findByPrimaryKey(int issuerId) throws IssuersDaoException;

	/** 
	 * Returns all rows from the ISSUERS table that match the criteria ''.
	 */
	public Issuers[] findAll() throws IssuersDaoException;

	/** 
	 * Returns all rows from the ISSUERS table that match the criteria 'ISSUER_ID = :issuerId'.
	 */
	public Issuers[] findWhereIssuerIdEquals(int issuerId) throws IssuersDaoException;

	/** 
	 * Returns all rows from the ISSUERS table that match the criteria 'ISSUER_NAME = :issuerName'.
	 */
	public Issuers[] findWhereIssuerNameEquals(String issuerName) throws IssuersDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the ISSUERS table that match the specified arbitrary SQL statement
	 */
	public Issuers[] findByDynamicSelect(String sql, Object[] sqlParams) throws IssuersDaoException;

	/** 
	 * Returns all rows from the ISSUERS table that match the specified arbitrary SQL statement
	 */
	public Issuers[] findByDynamicWhere(String sql, Object[] sqlParams) throws IssuersDaoException;

}
