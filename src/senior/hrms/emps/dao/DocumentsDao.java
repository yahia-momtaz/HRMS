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

public interface DocumentsDao
{
	/** 
	 * Inserts a new row in the DOCUMENTS table.
	 */
	public DocumentsPk insert(Documents dto) throws DocumentsDaoException;

	/** 
	 * Updates a single row in the DOCUMENTS table.
	 */
	public void update(DocumentsPk pk, Documents dto) throws DocumentsDaoException;

	/** 
	 * Deletes a single row in the DOCUMENTS table.
	 */
	public void delete(DocumentsPk pk) throws DocumentsDaoException;

	/** 
	 * Returns the rows from the DOCUMENTS table that matches the specified primary-key value.
	 */
	public Documents findByPrimaryKey(DocumentsPk pk) throws DocumentsDaoException;

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria 'DOCUMENT_ID = :documentId'.
	 */
	public Documents findByPrimaryKey(int documentId) throws DocumentsDaoException;

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria ''.
	 */
	public Documents[] findAll() throws DocumentsDaoException;

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria 'DOCUMENT_ID = :documentId'.
	 */
	public Documents[] findWhereDocumentIdEquals(int documentId) throws DocumentsDaoException;

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria 'DOCUMENT_NAME = :documentName'.
	 */
	public Documents[] findWhereDocumentNameEquals(String documentName) throws DocumentsDaoException;

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria 'DOCUMENT_DESCRIPTION = :documentDescription'.
	 */
	public Documents[] findWhereDocumentDescriptionEquals(String documentDescription) throws DocumentsDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the DOCUMENTS table that match the specified arbitrary SQL statement
	 */
	public Documents[] findByDynamicSelect(String sql, Object[] sqlParams) throws DocumentsDaoException;

	/** 
	 * Returns all rows from the DOCUMENTS table that match the specified arbitrary SQL statement
	 */
	public Documents[] findByDynamicWhere(String sql, Object[] sqlParams) throws DocumentsDaoException;

}
