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

public interface DiseasesDao
{
	/** 
	 * Inserts a new row in the DISEASES table.
	 */
	public DiseasesPk insert(Diseases dto) throws DiseasesDaoException;

	/** 
	 * Updates a single row in the DISEASES table.
	 */
	public void update(DiseasesPk pk, Diseases dto) throws DiseasesDaoException;

	/** 
	 * Deletes a single row in the DISEASES table.
	 */
	public void delete(DiseasesPk pk) throws DiseasesDaoException;

	/** 
	 * Returns the rows from the DISEASES table that matches the specified primary-key value.
	 */
	public Diseases findByPrimaryKey(DiseasesPk pk) throws DiseasesDaoException;

	/** 
	 * Returns all rows from the DISEASES table that match the criteria 'DISEASE_ID = :diseaseId'.
	 */
	public Diseases findByPrimaryKey(int diseaseId) throws DiseasesDaoException;

	/** 
	 * Returns all rows from the DISEASES table that match the criteria ''.
	 */
	public Diseases[] findAll() throws DiseasesDaoException;

	/** 
	 * Returns all rows from the DISEASES table that match the criteria 'DISEASE_TYPE_ID = :diseaseTypeId'.
	 */
	public Diseases[] findByDiseaseTypes(int diseaseTypeId) throws DiseasesDaoException;

	/** 
	 * Returns all rows from the DISEASES table that match the criteria 'DISEASE_ID = :diseaseId'.
	 */
	public Diseases[] findWhereDiseaseIdEquals(int diseaseId) throws DiseasesDaoException;

	/** 
	 * Returns all rows from the DISEASES table that match the criteria 'DISEASE_NAME = :diseaseName'.
	 */
	public Diseases[] findWhereDiseaseNameEquals(String diseaseName) throws DiseasesDaoException;

	/** 
	 * Returns all rows from the DISEASES table that match the criteria 'RESULT = :result'.
	 */
	public Diseases[] findWhereResultEquals(String result) throws DiseasesDaoException;

	/** 
	 * Returns all rows from the DISEASES table that match the criteria 'DISEASE_TYPE_ID = :diseaseTypeId'.
	 */
	public Diseases[] findWhereDiseaseTypeIdEquals(int diseaseTypeId) throws DiseasesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the DISEASES table that match the specified arbitrary SQL statement
	 */
	public Diseases[] findByDynamicSelect(String sql, Object[] sqlParams) throws DiseasesDaoException;

	/** 
	 * Returns all rows from the DISEASES table that match the specified arbitrary SQL statement
	 */
	public Diseases[] findByDynamicWhere(String sql, Object[] sqlParams) throws DiseasesDaoException;

}
