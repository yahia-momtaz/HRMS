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
 * This class represents the primary key of the ISSUERS table.
 */
public class IssuersPk implements Serializable
{
	protected int issuerId;

	/** 
	 * This attribute represents whether the primitive attribute issuerId is null.
	 */
	protected boolean issuerIdNull;

	/** 
	 * Sets the value of issuerId
	 */
	public void setIssuerId(int issuerId)
	{
		this.issuerId = issuerId;
	}

	/** 
	 * Gets the value of issuerId
	 */
	public int getIssuerId()
	{
		return issuerId;
	}

	/**
	 * Method 'IssuersPk'
	 * 
	 */
	public IssuersPk()
	{
	}

	/**
	 * Method 'IssuersPk'
	 * 
	 * @param issuerId
	 */
	public IssuersPk(final int issuerId)
	{
		this.issuerId = issuerId;
	}

	/** 
	 * Sets the value of issuerIdNull
	 */
	public void setIssuerIdNull(boolean issuerIdNull)
	{
		this.issuerIdNull = issuerIdNull;
	}

	/** 
	 * Gets the value of issuerIdNull
	 */
	public boolean isIssuerIdNull()
	{
		return issuerIdNull;
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
		
		if (!(_other instanceof IssuersPk)) {
			return false;
		}
		
		final IssuersPk _cast = (IssuersPk) _other;
		if (issuerId != _cast.issuerId) {
			return false;
		}
		
		if (issuerIdNull != _cast.issuerIdNull) {
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
		_hashCode = 29 * _hashCode + issuerId;
		_hashCode = 29 * _hashCode + (issuerIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.IssuersPk: " );
		ret.append( "issuerId=" + issuerId );
		return ret.toString();
	}

}
