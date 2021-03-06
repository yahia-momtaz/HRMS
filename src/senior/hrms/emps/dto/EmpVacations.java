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

public class EmpVacations implements Serializable
{
	/** 
	 * This attribute maps to the column EMP_VACATION_ID in the EMP_VACATIONS table.
	 */
	protected long empVacationId;

	/** 
	 * This attribute maps to the column EMPLOYEE_ID in the EMP_VACATIONS table.
	 */
	protected int employeeId;

	/** 
	 * This attribute maps to the column VACATION_TYPE_ID in the EMP_VACATIONS table.
	 */
	protected int vacationTypeId;

	/** 
	 * This attribute maps to the column FINANCIAL_YEAR_ID in the EMP_VACATIONS table.
	 */
	protected int financialYearId;

	/** 
	 * This attribute maps to the column DATE_FROM in the EMP_VACATIONS table.
	 */
	protected Date dateFrom;

	/** 
	 * This attribute maps to the column DATE_TO in the EMP_VACATIONS table.
	 */
	protected Date dateTo;

	/** 
	 * This attribute maps to the column REQUEST_EMP_ID in the EMP_VACATIONS table.
	 */
	protected int requestEmpId;

	/** 
	 * This attribute maps to the column VACATION_REQUEST_STATUS_ID in the EMP_VACATIONS table.
	 */
	protected int vacationRequestStatusId;

	/** 
	 * This attribute maps to the column DECISION_EMP_ID in the EMP_VACATIONS table.
	 */
	protected int decisionEmpId;

	/** 
	 * This attribute represents whether the primitive attribute decisionEmpId is null.
	 */
	protected boolean decisionEmpIdNull = true;

	/** 
	 * This attribute maps to the column DECISION_DATE in the EMP_VACATIONS table.
	 */
	protected Date decisionDate;

	/** 
	 * This attribute maps to the column NOTE in the EMP_VACATIONS table.
	 */
	protected String note;

	/**
	 * Method 'EmpVacations'
	 * 
	 */
	public EmpVacations()
	{
	}

	/**
	 * Method 'getEmpVacationId'
	 * 
	 * @return long
	 */
	public long getEmpVacationId()
	{
		return empVacationId;
	}

	/**
	 * Method 'setEmpVacationId'
	 * 
	 * @param empVacationId
	 */
	public void setEmpVacationId(long empVacationId)
	{
		this.empVacationId = empVacationId;
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
	 * Method 'getVacationTypeId'
	 * 
	 * @return int
	 */
	public int getVacationTypeId()
	{
		return vacationTypeId;
	}

	/**
	 * Method 'setVacationTypeId'
	 * 
	 * @param vacationTypeId
	 */
	public void setVacationTypeId(int vacationTypeId)
	{
		this.vacationTypeId = vacationTypeId;
	}

	/**
	 * Method 'getFinancialYearId'
	 * 
	 * @return int
	 */
	public int getFinancialYearId()
	{
		return financialYearId;
	}

	/**
	 * Method 'setFinancialYearId'
	 * 
	 * @param financialYearId
	 */
	public void setFinancialYearId(int financialYearId)
	{
		this.financialYearId = financialYearId;
	}

	/**
	 * Method 'getDateFrom'
	 * 
	 * @return Date
	 */
	public Date getDateFrom()
	{
		return dateFrom;
	}

	/**
	 * Method 'setDateFrom'
	 * 
	 * @param dateFrom
	 */
	public void setDateFrom(Date dateFrom)
	{
		this.dateFrom = dateFrom;
	}

	/**
	 * Method 'getDateTo'
	 * 
	 * @return Date
	 */
	public Date getDateTo()
	{
		return dateTo;
	}

	/**
	 * Method 'setDateTo'
	 * 
	 * @param dateTo
	 */
	public void setDateTo(Date dateTo)
	{
		this.dateTo = dateTo;
	}

	/**
	 * Method 'getRequestEmpId'
	 * 
	 * @return int
	 */
	public int getRequestEmpId()
	{
		return requestEmpId;
	}

	/**
	 * Method 'setRequestEmpId'
	 * 
	 * @param requestEmpId
	 */
	public void setRequestEmpId(int requestEmpId)
	{
		this.requestEmpId = requestEmpId;
	}

	/**
	 * Method 'getVacationRequestStatusId'
	 * 
	 * @return int
	 */
	public int getVacationRequestStatusId()
	{
		return vacationRequestStatusId;
	}

	/**
	 * Method 'setVacationRequestStatusId'
	 * 
	 * @param vacationRequestStatusId
	 */
	public void setVacationRequestStatusId(int vacationRequestStatusId)
	{
		this.vacationRequestStatusId = vacationRequestStatusId;
	}

	/**
	 * Method 'getDecisionEmpId'
	 * 
	 * @return int
	 */
	public int getDecisionEmpId()
	{
		return decisionEmpId;
	}

	/**
	 * Method 'setDecisionEmpId'
	 * 
	 * @param decisionEmpId
	 */
	public void setDecisionEmpId(int decisionEmpId)
	{
		this.decisionEmpId = decisionEmpId;
		this.decisionEmpIdNull = false;
	}

	/**
	 * Method 'setDecisionEmpIdNull'
	 * 
	 * @param value
	 */
	public void setDecisionEmpIdNull(boolean value)
	{
		this.decisionEmpIdNull = value;
	}

	/**
	 * Method 'isDecisionEmpIdNull'
	 * 
	 * @return boolean
	 */
	public boolean isDecisionEmpIdNull()
	{
		return decisionEmpIdNull;
	}

	/**
	 * Method 'getDecisionDate'
	 * 
	 * @return Date
	 */
	public Date getDecisionDate()
	{
		return decisionDate;
	}

	/**
	 * Method 'setDecisionDate'
	 * 
	 * @param decisionDate
	 */
	public void setDecisionDate(Date decisionDate)
	{
		this.decisionDate = decisionDate;
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
		
		if (!(_other instanceof EmpVacations)) {
			return false;
		}
		
		final EmpVacations _cast = (EmpVacations) _other;
		if (empVacationId != _cast.empVacationId) {
			return false;
		}
		
		if (employeeId != _cast.employeeId) {
			return false;
		}
		
		if (vacationTypeId != _cast.vacationTypeId) {
			return false;
		}
		
		if (financialYearId != _cast.financialYearId) {
			return false;
		}
		
		if (dateFrom == null ? _cast.dateFrom != dateFrom : !dateFrom.equals( _cast.dateFrom )) {
			return false;
		}
		
		if (dateTo == null ? _cast.dateTo != dateTo : !dateTo.equals( _cast.dateTo )) {
			return false;
		}
		
		if (requestEmpId != _cast.requestEmpId) {
			return false;
		}
		
		if (vacationRequestStatusId != _cast.vacationRequestStatusId) {
			return false;
		}
		
		if (decisionEmpId != _cast.decisionEmpId) {
			return false;
		}
		
		if (decisionEmpIdNull != _cast.decisionEmpIdNull) {
			return false;
		}
		
		if (decisionDate == null ? _cast.decisionDate != decisionDate : !decisionDate.equals( _cast.decisionDate )) {
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
		_hashCode = 29 * _hashCode + (int) (empVacationId ^ (empVacationId >>> 32));
		_hashCode = 29 * _hashCode + employeeId;
		_hashCode = 29 * _hashCode + vacationTypeId;
		_hashCode = 29 * _hashCode + financialYearId;
		if (dateFrom != null) {
			_hashCode = 29 * _hashCode + dateFrom.hashCode();
		}
		
		if (dateTo != null) {
			_hashCode = 29 * _hashCode + dateTo.hashCode();
		}
		
		_hashCode = 29 * _hashCode + requestEmpId;
		_hashCode = 29 * _hashCode + vacationRequestStatusId;
		_hashCode = 29 * _hashCode + decisionEmpId;
		_hashCode = 29 * _hashCode + (decisionEmpIdNull ? 1 : 0);
		if (decisionDate != null) {
			_hashCode = 29 * _hashCode + decisionDate.hashCode();
		}
		
		if (note != null) {
			_hashCode = 29 * _hashCode + note.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpVacationsPk
	 */
	public EmpVacationsPk createPk()
	{
		return new EmpVacationsPk(empVacationId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EmpVacations: " );
		ret.append( "empVacationId=" + empVacationId );
		ret.append( ", employeeId=" + employeeId );
		ret.append( ", vacationTypeId=" + vacationTypeId );
		ret.append( ", financialYearId=" + financialYearId );
		ret.append( ", dateFrom=" + dateFrom );
		ret.append( ", dateTo=" + dateTo );
		ret.append( ", requestEmpId=" + requestEmpId );
		ret.append( ", vacationRequestStatusId=" + vacationRequestStatusId );
		ret.append( ", decisionEmpId=" + decisionEmpId );
		ret.append( ", decisionDate=" + decisionDate );
		ret.append( ", note=" + note );
		return ret.toString();
	}

}
