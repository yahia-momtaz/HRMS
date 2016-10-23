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
 * This class represents the primary key of the EMP_SALARY table.
 */
public class EmpSalaryPk implements Serializable
{
	protected int empJobId;

	/** 
	 * This attribute represents whether the primitive attribute empJobId is null.
	 */
	protected boolean empJobIdNull;

	/** 
	 * Sets the value of empJobId
	 */
	public void setEmpJobId(int empJobId)
	{
		this.empJobId = empJobId;
	}

	/** 
	 * Gets the value of empJobId
	 */
	public int getEmpJobId()
	{
		return empJobId;
	}

	/**
	 * Method 'EmpSalaryPk'
	 * 
	 */
	public EmpSalaryPk()
	{
	}

	/**
	 * Method 'EmpSalaryPk'
	 * 
	 * @param empJobId
	 */
	public EmpSalaryPk(final int empJobId)
	{
		this.empJobId = empJobId;
	}

	/** 
	 * Sets the value of empJobIdNull
	 */
	public void setEmpJobIdNull(boolean empJobIdNull)
	{
		this.empJobIdNull = empJobIdNull;
	}

	/** 
	 * Gets the value of empJobIdNull
	 */
	public boolean isEmpJobIdNull()
	{
		return empJobIdNull;
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
		
		if (!(_other instanceof EmpSalaryPk)) {
			return false;
		}
		
		final EmpSalaryPk _cast = (EmpSalaryPk) _other;
		if (empJobId != _cast.empJobId) {
			return false;
		}
		
		if (empJobIdNull != _cast.empJobIdNull) {
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
		_hashCode = 29 * _hashCode + empJobId;
		_hashCode = 29 * _hashCode + (empJobIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.EmpSalaryPk: " );
		ret.append( "empJobId=" + empJobId );
		return ret.toString();
	}

}
