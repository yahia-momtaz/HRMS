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
 * This class represents the primary key of the RELIGION table.
 */
public class ReligionPk implements Serializable
{
	protected int religionId;

	/** 
	 * This attribute represents whether the primitive attribute religionId is null.
	 */
	protected boolean religionIdNull;

	/** 
	 * Sets the value of religionId
	 */
	public void setReligionId(int religionId)
	{
		this.religionId = religionId;
	}

	/** 
	 * Gets the value of religionId
	 */
	public int getReligionId()
	{
		return religionId;
	}

	/**
	 * Method 'ReligionPk'
	 * 
	 */
	public ReligionPk()
	{
	}

	/**
	 * Method 'ReligionPk'
	 * 
	 * @param religionId
	 */
	public ReligionPk(final int religionId)
	{
		this.religionId = religionId;
	}

	/** 
	 * Sets the value of religionIdNull
	 */
	public void setReligionIdNull(boolean religionIdNull)
	{
		this.religionIdNull = religionIdNull;
	}

	/** 
	 * Gets the value of religionIdNull
	 */
	public boolean isReligionIdNull()
	{
		return religionIdNull;
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
		
		if (!(_other instanceof ReligionPk)) {
			return false;
		}
		
		final ReligionPk _cast = (ReligionPk) _other;
		if (religionId != _cast.religionId) {
			return false;
		}
		
		if (religionIdNull != _cast.religionIdNull) {
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
		_hashCode = 29 * _hashCode + religionId;
		_hashCode = 29 * _hashCode + (religionIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.ReligionPk: " );
		ret.append( "religionId=" + religionId );
		return ret.toString();
	}

}
