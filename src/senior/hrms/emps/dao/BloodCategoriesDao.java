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

public interface BloodCategoriesDao
{
	/** 
	 * Inserts a new row in the BLOOD_CATEGORIES table.
	 */
	public BloodCategoriesPk insert(BloodCategories dto) throws BloodCategoriesDaoException;

	/** 
	 * Updates a single row in the BLOOD_CATEGORIES table.
	 */
	public void update(BloodCategoriesPk pk, BloodCategories dto) throws BloodCategoriesDaoException;

	/** 
	 * Deletes a single row in the BLOOD_CATEGORIES table.
	 */
	public void delete(BloodCategoriesPk pk) throws BloodCategoriesDaoException;

	/** 
	 * Returns the rows from the BLOOD_CATEGORIES table that matches the specified primary-key value.
	 */
	public BloodCategories findByPrimaryKey(BloodCategoriesPk pk) throws BloodCategoriesDaoException;

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the criteria 'BLOOD_CATEGORY_ID = :bloodCategoryId'.
	 */
	public BloodCategories findByPrimaryKey(int bloodCategoryId) throws BloodCategoriesDaoException;

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the criteria ''.
	 */
	public BloodCategories[] findAll() throws BloodCategoriesDaoException;

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the criteria 'BLOOD_CATEGORY_ID = :bloodCategoryId'.
	 */
	public BloodCategories[] findWhereBloodCategoryIdEquals(int bloodCategoryId) throws BloodCategoriesDaoException;

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the criteria 'BLOOD_CATEGORIES_NAME = :bloodCategoriesName'.
	 */
	public BloodCategories[] findWhereBloodCategoriesNameEquals(String bloodCategoriesName) throws BloodCategoriesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the specified arbitrary SQL statement
	 */
	public BloodCategories[] findByDynamicSelect(String sql, Object[] sqlParams) throws BloodCategoriesDaoException;

	/** 
	 * Returns all rows from the BLOOD_CATEGORIES table that match the specified arbitrary SQL statement
	 */
	public BloodCategories[] findByDynamicWhere(String sql, Object[] sqlParams) throws BloodCategoriesDaoException;

}