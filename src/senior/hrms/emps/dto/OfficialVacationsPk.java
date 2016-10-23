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
 * This class represents the primary key of the OFFICIAL_VACATIONS table.
 */
public class OfficialVacationsPk implements Serializable
{
	protected int officialVacationId;

	/** 
	 * This attribute represents whether the primitive attribute officialVacationId is null.
	 */
	protected boolean officialVacationIdNull;

	/** 
	 * Sets the value of officialVacationId
	 */
	public void setOfficialVacationId(int officialVacationId)
	{
		this.officialVacationId = officialVacationId;
	}

	/** 
	 * Gets the value of officialVacationId
	 */
	public int getOfficialVacationId()
	{
		return officialVacationId;
	}

	/**
	 * Method 'OfficialVacationsPk'
	 * 
	 */
	public OfficialVacationsPk()
	{
	}

	/**
	 * Method 'OfficialVacationsPk'
	 * 
	 * @param officialVacationId
	 */
	public OfficialVacationsPk(final int officialVacationId)
	{
		this.officialVacationId = officialVacationId;
	}

	/** 
	 * Sets the value of officialVacationIdNull
	 */
	public void setOfficialVacationIdNull(boolean officialVacationIdNull)
	{
		this.officialVacationIdNull = officialVacationIdNull;
	}

	/** 
	 * Gets the value of officialVacationIdNull
	 */
	public boolean isOfficialVacationIdNull()
	{
		return officialVacationIdNull;
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
		
		if (!(_other instanceof OfficialVacationsPk)) {
			return false;
		}
		
		final OfficialVacationsPk _cast = (OfficialVacationsPk) _other;
		if (officialVacationId != _cast.officialVacationId) {
			return false;
		}
		
		if (officialVacationIdNull != _cast.officialVacationIdNull) {
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
		_hashCode = 29 * _hashCode + officialVacationId;
		_hashCode = 29 * _hashCode + (officialVacationIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.OfficialVacationsPk: " );
		ret.append( "officialVacationId=" + officialVacationId );
		return ret.toString();
	}

}
