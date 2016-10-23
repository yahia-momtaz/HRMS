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
 * This class represents the primary key of the EMP_MISSIONS table.
 */
public class EmpMissionsPk implements Serializable
{
	protected int empMissionId;

	/** 
	 * This attribute represents whether the primitive attribute empMissionId is null.
	 */
	protected boolean empMissionIdNull;

	/** 
	 * Sets the value of empMissionId
	 */
	public void setEmpMissionId(int empMissionId)
	{
		this.empMissionId = empMissionId;
	}

	/** 
	 * Gets the value of empMissionId
	 */
	public int getEmpMissionId()
	{
		return empMissionId;
	}

	/**
	 * Method 'EmpMissionsPk'
	 * 
	 */
	public EmpMissionsPk()
	{
	}

	/**
	 * Method 'EmpMissionsPk'
	 * 
	 * @param empMissionId
	 */
	public EmpMissionsPk(final int empMissionId)
	{
		this.empMissionId = empMissionId;
	}

	/** 
	 * Sets the value of empMissionIdNull
	 */
	public void setEmpMissionIdNull(boolean empMissionIdNull)
	{
		this.empMissionIdNull = empMissionIdNull;
	}

	/** 
	 * Gets the value of empMissionIdNull
	 */
	public boolean isEmpMissionIdNull()
	{
		return empMissionIdNull;
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
		
		if (!(_other instanceof EmpMissionsPk)) {
			return false;
		}
		
		final EmpMissionsPk _cast = (EmpMissionsPk) _other;
		if (empMissionId != _cast.empMissionId) {
			return false;
		}
		
		if (empMissionIdNull != _cast.empMissionIdNull) {
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
		_hashCode = 29 * _hashCode + empMissionId;
		_hashCode = 29 * _hashCode + (empMissionIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.EmpMissionsPk: " );
		ret.append( "empMissionId=" + empMissionId );
		return ret.toString();
	}

}
