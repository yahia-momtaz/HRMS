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
 * This class represents the primary key of the EMPLOYEE_JOBS table.
 */
public class EmployeeJobsPk implements Serializable
{
	protected int employeeJobId;

	/** 
	 * This attribute represents whether the primitive attribute employeeJobId is null.
	 */
	protected boolean employeeJobIdNull;

	/** 
	 * Sets the value of employeeJobId
	 */
	public void setEmployeeJobId(int employeeJobId)
	{
		this.employeeJobId = employeeJobId;
	}

	/** 
	 * Gets the value of employeeJobId
	 */
	public int getEmployeeJobId()
	{
		return employeeJobId;
	}

	/**
	 * Method 'EmployeeJobsPk'
	 * 
	 */
	public EmployeeJobsPk()
	{
	}

	/**
	 * Method 'EmployeeJobsPk'
	 * 
	 * @param employeeJobId
	 */
	public EmployeeJobsPk(final int employeeJobId)
	{
		this.employeeJobId = employeeJobId;
	}

	/** 
	 * Sets the value of employeeJobIdNull
	 */
	public void setEmployeeJobIdNull(boolean employeeJobIdNull)
	{
		this.employeeJobIdNull = employeeJobIdNull;
	}

	/** 
	 * Gets the value of employeeJobIdNull
	 */
	public boolean isEmployeeJobIdNull()
	{
		return employeeJobIdNull;
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
		
		if (!(_other instanceof EmployeeJobsPk)) {
			return false;
		}
		
		final EmployeeJobsPk _cast = (EmployeeJobsPk) _other;
		if (employeeJobId != _cast.employeeJobId) {
			return false;
		}
		
		if (employeeJobIdNull != _cast.employeeJobIdNull) {
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
		_hashCode = 29 * _hashCode + employeeJobId;
		_hashCode = 29 * _hashCode + (employeeJobIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.EmployeeJobsPk: " );
		ret.append( "employeeJobId=" + employeeJobId );
		return ret.toString();
	}

}
