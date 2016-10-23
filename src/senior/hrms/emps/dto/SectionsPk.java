/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the SECTIONS table.
 */
public class SectionsPk implements Serializable
{
	protected int sectionId;

	/** 
	 * This attribute represents whether the primitive attribute sectionId is null.
	 */
	protected boolean sectionIdNull;

	/** 
	 * Sets the value of sectionId
	 */
	public void setSectionId(int sectionId)
	{
		this.sectionId = sectionId;
	}

	/** 
	 * Gets the value of sectionId
	 */
	public int getSectionId()
	{
		return sectionId;
	}

	/**
	 * Method 'SectionsPk'
	 * 
	 */
	public SectionsPk()
	{
	}

	/**
	 * Method 'SectionsPk'
	 * 
	 * @param sectionId
	 */
	public SectionsPk(final int sectionId)
	{
		this.sectionId = sectionId;
	}

	/** 
	 * Sets the value of sectionIdNull
	 */
	public void setSectionIdNull(boolean sectionIdNull)
	{
		this.sectionIdNull = sectionIdNull;
	}

	/** 
	 * Gets the value of sectionIdNull
	 */
	public boolean isSectionIdNull()
	{
		return sectionIdNull;
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
		
		if (!(_other instanceof SectionsPk)) {
			return false;
		}
		
		final SectionsPk _cast = (SectionsPk) _other;
		if (sectionId != _cast.sectionId) {
			return false;
		}
		
		if (sectionIdNull != _cast.sectionIdNull) {
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
		_hashCode = 29 * _hashCode + sectionId;
		_hashCode = 29 * _hashCode + (sectionIdNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.SectionsPk: " );
		ret.append( "sectionId=" + sectionId );
		return ret.toString();
	}

}
