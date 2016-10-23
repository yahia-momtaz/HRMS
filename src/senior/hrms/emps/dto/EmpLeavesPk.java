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
 * This class represents the primary key of the EMP_LEAVES table.
 */
public class EmpLeavesPk implements Serializable
{
	protected int empLeaveId;

	/** 
	 * This attribute represents whether the primitive attribute empLeaveId is null.
	 */
	protected boolean empLeaveIdNull;

	/** 
	 * Sets the value of empLeaveId
	 */
	public void setEmpLeaveId(int empLeaveId)
	{
		this.empLeaveId = empLeaveId;
	}

	/** 
	 * Gets the value of empLeaveId
	 */
	public int getEmpLeaveId()
	{
		return empLeaveId;
	}

	/**
	 * Method 'EmpLeavesPk'
	 * 
	 */
	public EmpLeavesPk()
	{
	}

	/**
	 * Method 'EmpLeavesPk'
	 * 
	 * @param empLeaveId
	 */
	public EmpLeavesPk(final int empLeaveId)
	{
		this.empLeaveId = empLeaveId;
	}

	/** 
	 * Sets the value of empLeaveIdNull
	 */
	public void setEmpLeaveIdNull(boolean empLeaveIdNull)
	{
		this.empLeaveIdNull = empLeaveIdNull;
	}

	/** 
	 * Gets the value of empLeaveIdNull
	 */
	public boolean isEmpLeaveIdNull()
	{
		return empLeaveIdNull;
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
		
		if (!(_other instanceof EmpLeavesPk)) {
			return false;
		}
		
		final EmpLeavesPk _cast = (EmpLeavesPk) _other;
		if (empLeaveId != _cast.empLeaveId) {
			return false;
		}
		
		if (empLeaveIdNull != _cast.empLeaveIdNull) {
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
		_hashCode = 29 * _hashCode + empLeaveId;
		_hashCode = 29 * _hashCode + (empLeaveIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.EmpLeavesPk: " );
		ret.append( "empLeaveId=" + empLeaveId );
		return ret.toString();
	}

}
