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
 * This class represents the primary key of the MILITARY_SERVICE table.
 */
public class MilitaryServicePk implements Serializable
{
	protected int militaryServiceId;

	/** 
	 * This attribute represents whether the primitive attribute militaryServiceId is null.
	 */
	protected boolean militaryServiceIdNull;

	/** 
	 * Sets the value of militaryServiceId
	 */
	public void setMilitaryServiceId(int militaryServiceId)
	{
		this.militaryServiceId = militaryServiceId;
	}

	/** 
	 * Gets the value of militaryServiceId
	 */
	public int getMilitaryServiceId()
	{
		return militaryServiceId;
	}

	/**
	 * Method 'MilitaryServicePk'
	 * 
	 */
	public MilitaryServicePk()
	{
	}

	/**
	 * Method 'MilitaryServicePk'
	 * 
	 * @param militaryServiceId
	 */
	public MilitaryServicePk(final int militaryServiceId)
	{
		this.militaryServiceId = militaryServiceId;
	}

	/** 
	 * Sets the value of militaryServiceIdNull
	 */
	public void setMilitaryServiceIdNull(boolean militaryServiceIdNull)
	{
		this.militaryServiceIdNull = militaryServiceIdNull;
	}

	/** 
	 * Gets the value of militaryServiceIdNull
	 */
	public boolean isMilitaryServiceIdNull()
	{
		return militaryServiceIdNull;
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
		
		if (!(_other instanceof MilitaryServicePk)) {
			return false;
		}
		
		final MilitaryServicePk _cast = (MilitaryServicePk) _other;
		if (militaryServiceId != _cast.militaryServiceId) {
			return false;
		}
		
		if (militaryServiceIdNull != _cast.militaryServiceIdNull) {
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
		_hashCode = 29 * _hashCode + militaryServiceId;
		_hashCode = 29 * _hashCode + (militaryServiceIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.MilitaryServicePk: " );
		ret.append( "militaryServiceId=" + militaryServiceId );
		return ret.toString();
	}

}