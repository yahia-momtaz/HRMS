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

public class EmpProjects implements Serializable
{
	/** 
	 * This attribute maps to the column EMP_PROJECT_ID in the EMP_PROJECTS table.
	 */
	protected int empProjectId;

	/** 
	 * This attribute maps to the column EMPLOYEE_ID in the EMP_PROJECTS table.
	 */
	protected int employeeId;

	/** 
	 * This attribute maps to the column PROJECT_ID in the EMP_PROJECTS table.
	 */
	protected int projectId;

	/** 
	 * This attribute maps to the column START_DATE in the EMP_PROJECTS table.
	 */
	protected Date startDate;

	/** 
	 * This attribute maps to the column END_DATE in the EMP_PROJECTS table.
	 */
	protected Date endDate;

	/**
	 * Method 'EmpProjects'
	 * 
	 */
	public EmpProjects()
	{
	}

	/**
	 * Method 'getEmpProjectId'
	 * 
	 * @return int
	 */
	public int getEmpProjectId()
	{
		return empProjectId;
	}

	/**
	 * Method 'setEmpProjectId'
	 * 
	 * @param empProjectId
	 */
	public void setEmpProjectId(int empProjectId)
	{
		this.empProjectId = empProjectId;
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
	 * Method 'getProjectId'
	 * 
	 * @return int
	 */
	public int getProjectId()
	{
		return projectId;
	}

	/**
	 * Method 'setProjectId'
	 * 
	 * @param projectId
	 */
	public void setProjectId(int projectId)
	{
		this.projectId = projectId;
	}

	/**
	 * Method 'getStartDate'
	 * 
	 * @return Date
	 */
	public Date getStartDate()
	{
		return startDate;
	}

	/**
	 * Method 'setStartDate'
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
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
		
		if (!(_other instanceof EmpProjects)) {
			return false;
		}
		
		final EmpProjects _cast = (EmpProjects) _other;
		if (empProjectId != _cast.empProjectId) {
			return false;
		}
		
		if (employeeId != _cast.employeeId) {
			return false;
		}
		
		if (projectId != _cast.projectId) {
			return false;
		}
		
		if (startDate == null ? _cast.startDate != startDate : !startDate.equals( _cast.startDate )) {
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
		_hashCode = 29 * _hashCode + empProjectId;
		_hashCode = 29 * _hashCode + employeeId;
		_hashCode = 29 * _hashCode + projectId;
		if (startDate != null) {
			_hashCode = 29 * _hashCode + startDate.hashCode();
		}
		
		if (endDate != null) {
			_hashCode = 29 * _hashCode + endDate.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpProjectsPk
	 */
	public EmpProjectsPk createPk()
	{
		return new EmpProjectsPk(empProjectId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EmpProjects: " );
		ret.append( "empProjectId=" + empProjectId );
		ret.append( ", employeeId=" + employeeId );
		ret.append( ", projectId=" + projectId );
		ret.append( ", startDate=" + startDate );
		ret.append( ", endDate=" + endDate );
		return ret.toString();
	}

}
