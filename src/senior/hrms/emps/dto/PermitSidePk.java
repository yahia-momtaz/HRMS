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
 * This class represents the primary key of the PERMIT_SIDE table.
 */
public class PermitSidePk implements Serializable
{
	protected int permitSideId;

	/** 
	 * This attribute represents whether the primitive attribute permitSideId is null.
	 */
	protected boolean permitSideIdNull;

	/** 
	 * Sets the value of permitSideId
	 */
	public void setPermitSideId(int permitSideId)
	{
		this.permitSideId = permitSideId;
	}

	/** 
	 * Gets the value of permitSideId
	 */
	public int getPermitSideId()
	{
		return permitSideId;
	}

	/**
	 * Method 'PermitSidePk'
	 * 
	 */
	public PermitSidePk()
	{
	}

	/**
	 * Method 'PermitSidePk'
	 * 
	 * @param permitSideId
	 */
	public PermitSidePk(final int permitSideId)
	{
		this.permitSideId = permitSideId;
	}

	/** 
	 * Sets the value of permitSideIdNull
	 */
	public void setPermitSideIdNull(boolean permitSideIdNull)
	{
		this.permitSideIdNull = permitSideIdNull;
	}

	/** 
	 * Gets the value of permitSideIdNull
	 */
	public boolean isPermitSideIdNull()
	{
		return permitSideIdNull;
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
		
		if (!(_other instanceof PermitSidePk)) {
			return false;
		}
		
		final PermitSidePk _cast = (PermitSidePk) _other;
		if (permitSideId != _cast.permitSideId) {
			return false;
		}
		
		if (permitSideIdNull != _cast.permitSideIdNull) {
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
		_hashCode = 29 * _hashCode + permitSideId;
		_hashCode = 29 * _hashCode + (permitSideIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.PermitSidePk: " );
		ret.append( "permitSideId=" + permitSideId );
		return ret.toString();
	}

}
