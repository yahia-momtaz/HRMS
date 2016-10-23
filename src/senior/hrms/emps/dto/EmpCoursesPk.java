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
 * This class represents the primary key of the EMP_COURSES table.
 */
public class EmpCoursesPk implements Serializable
{
	protected int empCourseId;

	/** 
	 * This attribute represents whether the primitive attribute empCourseId is null.
	 */
	protected boolean empCourseIdNull;

	/** 
	 * Sets the value of empCourseId
	 */
	public void setEmpCourseId(int empCourseId)
	{
		this.empCourseId = empCourseId;
	}

	/** 
	 * Gets the value of empCourseId
	 */
	public int getEmpCourseId()
	{
		return empCourseId;
	}

	/**
	 * Method 'EmpCoursesPk'
	 * 
	 */
	public EmpCoursesPk()
	{
	}

	/**
	 * Method 'EmpCoursesPk'
	 * 
	 * @param empCourseId
	 */
	public EmpCoursesPk(final int empCourseId)
	{
		this.empCourseId = empCourseId;
	}

	/** 
	 * Sets the value of empCourseIdNull
	 */
	public void setEmpCourseIdNull(boolean empCourseIdNull)
	{
		this.empCourseIdNull = empCourseIdNull;
	}

	/** 
	 * Gets the value of empCourseIdNull
	 */
	public boolean isEmpCourseIdNull()
	{
		return empCourseIdNull;
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
		
		if (!(_other instanceof EmpCoursesPk)) {
			return false;
		}
		
		final EmpCoursesPk _cast = (EmpCoursesPk) _other;
		if (empCourseId != _cast.empCourseId) {
			return false;
		}
		
		if (empCourseIdNull != _cast.empCourseIdNull) {
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
		_hashCode = 29 * _hashCode + empCourseId;
		_hashCode = 29 * _hashCode + (empCourseIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.EmpCoursesPk: " );
		ret.append( "empCourseId=" + empCourseId );
		return ret.toString();
	}

}
