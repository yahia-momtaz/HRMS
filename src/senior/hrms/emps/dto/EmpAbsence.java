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

public class EmpAbsence implements Serializable
{
	/** 
	 * This attribute maps to the column EMP_ABSENCE_ID in the EMP_ABSENCE table.
	 */
	protected long empAbsenceId;

	/** 
	 * This attribute maps to the column EMPLOYEE_ID in the EMP_ABSENCE table.
	 */
	protected int employeeId;

	/** 
	 * This attribute maps to the column ABSENCE_DATE in the EMP_ABSENCE table.
	 */
	protected Date absenceDate;

	/** 
	 * This attribute maps to the column NOTE in the EMP_ABSENCE table.
	 */
	protected String note;

	/**
	 * Method 'EmpAbsence'
	 * 
	 */
	public EmpAbsence()
	{
	}

	/**
	 * Method 'getEmpAbsenceId'
	 * 
	 * @return long
	 */
	public long getEmpAbsenceId()
	{
		return empAbsenceId;
	}

	/**
	 * Method 'setEmpAbsenceId'
	 * 
	 * @param empAbsenceId
	 */
	public void setEmpAbsenceId(long empAbsenceId)
	{
		this.empAbsenceId = empAbsenceId;
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
	 * Method 'getAbsenceDate'
	 * 
	 * @return Date
	 */
	public Date getAbsenceDate()
	{
		return absenceDate;
	}

	/**
	 * Method 'setAbsenceDate'
	 * 
	 * @param absenceDate
	 */
	public void setAbsenceDate(Date absenceDate)
	{
		this.absenceDate = absenceDate;
	}

	/**
	 * Method 'getNote'
	 * 
	 * @return String
	 */
	public String getNote()
	{
		return note;
	}

	/**
	 * Method 'setNote'
	 * 
	 * @param note
	 */
	public void setNote(String note)
	{
		this.note = note;
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
		
		if (!(_other instanceof EmpAbsence)) {
			return false;
		}
		
		final EmpAbsence _cast = (EmpAbsence) _other;
		if (empAbsenceId != _cast.empAbsenceId) {
			return false;
		}
		
		if (employeeId != _cast.employeeId) {
			return false;
		}
		
		if (absenceDate == null ? _cast.absenceDate != absenceDate : !absenceDate.equals( _cast.absenceDate )) {
			return false;
		}
		
		if (note == null ? _cast.note != note : !note.equals( _cast.note )) {
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
		_hashCode = 29 * _hashCode + (int) (empAbsenceId ^ (empAbsenceId >>> 32));
		_hashCode = 29 * _hashCode + employeeId;
		if (absenceDate != null) {
			_hashCode = 29 * _hashCode + absenceDate.hashCode();
		}
		
		if (note != null) {
			_hashCode = 29 * _hashCode + note.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpAbsencePk
	 */
	public EmpAbsencePk createPk()
	{
		return new EmpAbsencePk(empAbsenceId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EmpAbsence: " );
		ret.append( "empAbsenceId=" + empAbsenceId );
		ret.append( ", employeeId=" + employeeId );
		ret.append( ", absenceDate=" + absenceDate );
		ret.append( ", note=" + note );
		return ret.toString();
	}

}
