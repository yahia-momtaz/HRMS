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
import java.util.Date;

public class EmpEndService implements Serializable
{
	/** 
	 * This attribute maps to the column EMP_END_SERVICE_ID in the EMP_END_SERVICE table.
	 */
	protected int empEndServiceId;

	/** 
	 * This attribute maps to the column EMPLOYEE_ID in the EMP_END_SERVICE table.
	 */
	protected int employeeId;

	/** 
	 * This attribute maps to the column END_SERVICE_CAUSE_ID in the EMP_END_SERVICE table.
	 */
	protected int endServiceCauseId;

	/** 
	 * This attribute maps to the column END_DATE in the EMP_END_SERVICE table.
	 */
	protected Date endDate;

	/**
	 * Method 'EmpEndService'
	 * 
	 */
	public EmpEndService()
	{
	}

	/**
	 * Method 'getEmpEndServiceId'
	 * 
	 * @return int
	 */
	public int getEmpEndServiceId()
	{
		return empEndServiceId;
	}

	/**
	 * Method 'setEmpEndServiceId'
	 * 
	 * @param empEndServiceId
	 */
	public void setEmpEndServiceId(int empEndServiceId)
	{
		this.empEndServiceId = empEndServiceId;
	}

	/**
	 * Method 'getEmployeeId'
	 * 
	 * @return int
	 */
	public int getEmployeeId()
	{
		return employeeId;
	}

	/**
	 * Method 'setEmployeeId'
	 * 
	 * @param employeeId
	 */
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}

	/**
	 * Method 'getEndServiceCauseId'
	 * 
	 * @return int
	 */
	public int getEndServiceCauseId()
	{
		return endServiceCauseId;
	}

	/**
	 * Method 'setEndServiceCauseId'
	 * 
	 * @param endServiceCauseId
	 */
	public void setEndServiceCauseId(int endServiceCauseId)
	{
		this.endServiceCauseId = endServiceCauseId;
	}

	/**
	 * Method 'getEndDate'
	 * 
	 * @return Date
	 */
	public Date getEndDate()
	{
		return endDate;
	}

	/**
	 * Method 'setEndDate'
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
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
		
		if (!(_other instanceof EmpEndService)) {
			return false;
		}
		
		final EmpEndService _cast = (EmpEndService) _other;
		if (empEndServiceId != _cast.empEndServiceId) {
			return false;
		}
		
		if (employeeId != _cast.employeeId) {
			return false;
		}
		
		if (endServiceCauseId != _cast.endServiceCauseId) {
			return false;
		}
		
		if (endDate == null ? _cast.endDate != endDate : !endDate.equals( _cast.endDate )) {
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
		_hashCode = 29 * _hashCode + empEndServiceId;
		_hashCode = 29 * _hashCode + employeeId;
		_hashCode = 29 * _hashCode + endServiceCauseId;
		if (endDate != null) {
			_hashCode = 29 * _hashCode + endDate.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpEndServicePk
	 */
	public EmpEndServicePk createPk()
	{
		return new EmpEndServicePk(empEndServiceId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EmpEndService: " );
		ret.append( "empEndServiceId=" + empEndServiceId );
		ret.append( ", employeeId=" + employeeId );
		ret.append( ", endServiceCauseId=" + endServiceCauseId );
		ret.append( ", endDate=" + endDate );
		return ret.toString();
	}

}
