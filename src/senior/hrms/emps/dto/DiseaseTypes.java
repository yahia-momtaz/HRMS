/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dto;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.factory.*;
import senior.hrms.emps.exceptions.*;
import java.io.Serializable;
import java.util.*;

public class DiseaseTypes implements Serializable
{
	/** 
	 * This attribute maps to the column DISEASE_TYPE_ID in the DISEASE_TYPES table.
	 */
	protected int diseaseTypeId;

	/** 
	 * This attribute maps to the column DISEASE_TYPE_NAME in the DISEASE_TYPES table.
	 */
	protected String diseaseTypeName;

	/**
	 * Method 'DiseaseTypes'
	 * 
	 */
	public DiseaseTypes()
	{
	}

	/**
	 * Method 'getDiseaseTypeId'
	 * 
	 * @return int
	 */
	public int getDiseaseTypeId()
	{
		return diseaseTypeId;
	}

	/**
	 * Method 'setDiseaseTypeId'
	 * 
	 * @param diseaseTypeId
	 */
	public void setDiseaseTypeId(int diseaseTypeId)
	{
		this.diseaseTypeId = diseaseTypeId;
	}

	/**
	 * Method 'getDiseaseTypeName'
	 * 
	 * @return String
	 */
	public String getDiseaseTypeName()
	{
		return diseaseTypeName;
	}

	/**
	 * Method 'setDiseaseTypeName'
	 * 
	 * @param diseaseTypeName
	 */
	public void setDiseaseTypeName(String diseaseTypeName)
	{
		this.diseaseTypeName = diseaseTypeName;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof DiseaseTypes)) {
			return false;
		}
		
		final DiseaseTypes _cast = (DiseaseTypes) _other;
		if (diseaseTypeId != _cast.diseaseTypeId) {
			return false;
		}
		
		if (diseaseTypeName == null ? _cast.diseaseTypeName != diseaseTypeName : !diseaseTypeName.equals( _cast.diseaseTypeName )) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + diseaseTypeId;
		if (diseaseTypeName != null) {
			_hashCode = 29 * _hashCode + diseaseTypeName.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return DiseaseTypesPk
	 */
	public DiseaseTypesPk createPk()
	{
		return new DiseaseTypesPk(diseaseTypeId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.DiseaseTypes: " );
		ret.append( "diseaseTypeId=" + diseaseTypeId );
		ret.append( ", diseaseTypeName=" + diseaseTypeName );
		return ret.toString();
	}

}
