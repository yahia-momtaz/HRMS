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

public class EmpSickLeave implements Serializable
{
	/** 
	 * This attribute maps to the column EMP_SICK_LEAVE_ID in the EMP_SICK_LEAVE table.
	 */
	protected int empSickLeaveId;

	/** 
	 * This attribute maps to the column EMPLOYEE_ID in the EMP_SICK_LEAVE table.
	 */
	protected int employeeId;

	/** 
	 * This attribute maps to the column DISEASE_ID in the EMP_SICK_LEAVE table.
	 */
	protected int diseaseId;

	/** 
	 * This attribute maps to the column HOSPITAL_ID in the EMP_SICK_LEAVE table.
	 */
	protected int hospitalId;

	/** 
	 * This attribute maps to the column EMP_VACATION_ID in the EMP_SICK_LEAVE table.
	 */
	protected long empVacationId;

	/** 
	 * This attribute maps to the column HOSPITAL_REPORT_IMAGE in the EMP_SICK_LEAVE table.
	 */
	protected byte[] hospitalReportImage;

	/**
	 * Method 'EmpSickLeave'
	 * 
	 */
	public EmpSickLeave()
	{
	}

	/**
	 * Method 'getEmpSickLeaveId'
	 * 
	 * @return int
	 */
	public int getEmpSickLeaveId()
	{
		return empSickLeaveId;
	}

	/**
	 * Method 'setEmpSickLeaveId'
	 * 
	 * @param empSickLeaveId
	 */
	public void setEmpSickLeaveId(int empSickLeaveId)
	{
		this.empSickLeaveId = empSickLeaveId;
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
	 * Method 'getDiseaseId'
	 * 
	 * @return int
	 */
	public int getDiseaseId()
	{
		return diseaseId;
	}

	/**
	 * Method 'setDiseaseId'
	 * 
	 * @param diseaseId
	 */
	public void setDiseaseId(int diseaseId)
	{
		this.diseaseId = diseaseId;
	}

	/**
	 * Method 'getHospitalId'
	 * 
	 * @return int
	 */
	public int getHospitalId()
	{
		return hospitalId;
	}

	/**
	 * Method 'setHospitalId'
	 * 
	 * @param hospitalId
	 */
	public void setHospitalId(int hospitalId)
	{
		this.hospitalId = hospitalId;
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
	 * Method 'getHospitalReportImage'
	 * 
	 * @return byte[]
	 */
	public byte[] getHospitalReportImage()
	{
		return hospitalReportImage;
	}

	/**
	 * Method 'setHospitalReportImage'
	 * 
	 * @param hospitalReportImage
	 */
	public void setHospitalReportImage(byte[] hospitalReportImage)
	{
		this.hospitalReportImage = hospitalReportImage;
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
		
		if (!(_other instanceof EmpSickLeave)) {
			return false;
		}
		
		final EmpSickLeave _cast = (EmpSickLeave) _other;
		if (empSickLeaveId != _cast.empSickLeaveId) {
			return false;
		}
		
		if (employeeId != _cast.employeeId) {
			return false;
		}
		
		if (diseaseId != _cast.diseaseId) {
			return false;
		}
		
		if (hospitalId != _cast.hospitalId) {
			return false;
		}
		
		if (empVacationId != _cast.empVacationId) {
			return false;
		}
		
		if (hospitalReportImage == null ? _cast.hospitalReportImage != hospitalReportImage : !hospitalReportImage.equals( _cast.hospitalReportImage )) {
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
		_hashCode = 29 * _hashCode + empSickLeaveId;
		_hashCode = 29 * _hashCode + employeeId;
		_hashCode = 29 * _hashCode + diseaseId;
		_hashCode = 29 * _hashCode + hospitalId;
		_hashCode = 29 * _hashCode + (int) (empVacationId ^ (empVacationId >>> 32));
		if (hospitalReportImage != null) {
			_hashCode = 29 * _hashCode + hospitalReportImage.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpSickLeavePk
	 */
	public EmpSickLeavePk createPk()
	{
		return new EmpSickLeavePk(empSickLeaveId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EmpSickLeave: " );
		ret.append( "empSickLeaveId=" + empSickLeaveId );
		ret.append( ", employeeId=" + employeeId );
		ret.append( ", diseaseId=" + diseaseId );
		ret.append( ", hospitalId=" + hospitalId );
		ret.append( ", empVacationId=" + empVacationId );
		ret.append( ", hospitalReportImage=" + hospitalReportImage );
		return ret.toString();
	}

}
