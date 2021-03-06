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

public class EmployeeType implements Serializable
{
	/** 
	 * This attribute maps to the column EMPLOYEE_TYPE_ID in the EMPLOYEE_TYPE table.
	 */
	protected int employeeTypeId;

	/** 
	 * This attribute maps to the column EMPLOYEE_TYPE_NAME in the EMPLOYEE_TYPE table.
	 */
	protected String employeeTypeName;

	/**
	 * Method 'EmployeeType'
	 * 
	 */
	public EmployeeType()
	{
	}

	/**
	 * Method 'getEmployeeTypeId'
	 * 
	 * @return int
	 */
	public int getEmployeeTypeId()
	{
		return employeeTypeId;
	}

	/**
	 * Method 'setEmployeeTypeId'
	 * 
	 * @param employeeTypeId
	 */
	public void setEmployeeTypeId(int employeeTypeId)
	{
		this.employeeTypeId = employeeTypeId;
	}

	/**
	 * Method 'getEmployeeTypeName'
	 * 
	 * @return String
	 */
	public String getEmployeeTypeName()
	{
		return employeeTypeName;
	}

	/**
	 * Method 'setEmployeeTypeName'
	 * 
	 * @param employeeTypeName
	 */
	public void setEmployeeTypeName(String employeeTypeName)
	{
		this.employeeTypeName = employeeTypeName;
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
		
		if (!(_other instanceof EmployeeType)) {
			return false;
		}
		
		final EmployeeType _cast = (EmployeeType) _other;
		if (employeeTypeId != _cast.employeeTypeId) {
			return false;
		}
		
		if (employeeTypeName == null ? _cast.employeeTypeName != employeeTypeName : !employeeTypeName.equals( _cast.employeeTypeName )) {
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
		_hashCode = 29 * _hashCode + employeeTypeId;
		if (employeeTypeName != null) {
			_hashCode = 29 * _hashCode + employeeTypeName.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmployeeTypePk
	 */
	public EmployeeTypePk createPk()
	{
		return new EmployeeTypePk(employeeTypeId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EmployeeType: " );
		ret.append( "employeeTypeId=" + employeeTypeId );
		ret.append( ", employeeTypeName=" + employeeTypeName );
		return ret.toString();
	}

}
