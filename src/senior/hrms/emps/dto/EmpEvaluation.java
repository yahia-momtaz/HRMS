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

public class EmpEvaluation implements Serializable
{
	/** 
	 * This attribute maps to the column EMP_EVALUATION_ID in the EMP_EVALUATION table.
	 */
	protected int empEvaluationId;

	/** 
	 * This attribute maps to the column EMPLOYEE_ID in the EMP_EVALUATION table.
	 */
	protected int employeeId;

	/** 
	 * This attribute maps to the column EVALUATION_ITEM_ID in the EMP_EVALUATION table.
	 */
	protected int evaluationItemId;

	/** 
	 * This attribute maps to the column EVALUATION_DEGERE_ID in the EMP_EVALUATION table.
	 */
	protected int evaluationDegereId;

	/** 
	 * This attribute maps to the column DEGREE_PERCENTAGE in the EMP_EVALUATION table.
	 */
	protected int degreePercentage;

	/** 
	 * This attribute represents whether the primitive attribute degreePercentage is null.
	 */
	protected boolean degreePercentageNull = true;

	/** 
	 * This attribute maps to the column EVALUATED_BY_EMP_ID in the EMP_EVALUATION table.
	 */
	protected int evaluatedByEmpId;

	/** 
	 * This attribute maps to the column FINANCIAL_YEAR_ID in the EMP_EVALUATION table.
	 */
	protected int financialYearId;

	/**
	 * Method 'EmpEvaluation'
	 * 
	 */
	public EmpEvaluation()
	{
	}

	/**
	 * Method 'getEmpEvaluationId'
	 * 
	 * @return int
	 */
	public int getEmpEvaluationId()
	{
		return empEvaluationId;
	}

	/**
	 * Method 'setEmpEvaluationId'
	 * 
	 * @param empEvaluationId
	 */
	public void setEmpEvaluationId(int empEvaluationId)
	{
		this.empEvaluationId = empEvaluationId;
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
	 * Method 'getEvaluationItemId'
	 * 
	 * @return int
	 */
	public int getEvaluationItemId()
	{
		return evaluationItemId;
	}

	/**
	 * Method 'setEvaluationItemId'
	 * 
	 * @param evaluationItemId
	 */
	public void setEvaluationItemId(int evaluationItemId)
	{
		this.evaluationItemId = evaluationItemId;
	}

	/**
	 * Method 'getEvaluationDegereId'
	 * 
	 * @return int
	 */
	public int getEvaluationDegereId()
	{
		return evaluationDegereId;
	}

	/**
	 * Method 'setEvaluationDegereId'
	 * 
	 * @param evaluationDegereId
	 */
	public void setEvaluationDegereId(int evaluationDegereId)
	{
		this.evaluationDegereId = evaluationDegereId;
	}

	/**
	 * Method 'getDegreePercentage'
	 * 
	 * @return int
	 */
	public int getDegreePercentage()
	{
		return degreePercentage;
	}

	/**
	 * Method 'setDegreePercentage'
	 * 
	 * @param degreePercentage
	 */
	public void setDegreePercentage(int degreePercentage)
	{
		this.degreePercentage = degreePercentage;
		this.degreePercentageNull = false;
	}

	/**
	 * Method 'setDegreePercentageNull'
	 * 
	 * @param value
	 */
	public void setDegreePercentageNull(boolean value)
	{
		this.degreePercentageNull = value;
	}

	/**
	 * Method 'isDegreePercentageNull'
	 * 
	 * @return boolean
	 */
	public boolean isDegreePercentageNull()
	{
		return degreePercentageNull;
	}

	/**
	 * Method 'getEvaluatedByEmpId'
	 * 
	 * @return int
	 */
	public int getEvaluatedByEmpId()
	{
		return evaluatedByEmpId;
	}

	/**
	 * Method 'setEvaluatedByEmpId'
	 * 
	 * @param evaluatedByEmpId
	 */
	public void setEvaluatedByEmpId(int evaluatedByEmpId)
	{
		this.evaluatedByEmpId = evaluatedByEmpId;
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
		
		if (!(_other instanceof EmpEvaluation)) {
			return false;
		}
		
		final EmpEvaluation _cast = (EmpEvaluation) _other;
		if (empEvaluationId != _cast.empEvaluationId) {
			return false;
		}
		
		if (employeeId != _cast.employeeId) {
			return false;
		}
		
		if (evaluationItemId != _cast.evaluationItemId) {
			return false;
		}
		
		if (evaluationDegereId != _cast.evaluationDegereId) {
			return false;
		}
		
		if (degreePercentage != _cast.degreePercentage) {
			return false;
		}
		
		if (degreePercentageNull != _cast.degreePercentageNull) {
			return false;
		}
		
		if (evaluatedByEmpId != _cast.evaluatedByEmpId) {
			return false;
		}
		
		if (financialYearId != _cast.financialYearId) {
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
		_hashCode = 29 * _hashCode + empEvaluationId;
		_hashCode = 29 * _hashCode + employeeId;
		_hashCode = 29 * _hashCode + evaluationItemId;
		_hashCode = 29 * _hashCode + evaluationDegereId;
		_hashCode = 29 * _hashCode + degreePercentage;
		_hashCode = 29 * _hashCode + (degreePercentageNull ? 1 : 0);
		_hashCode = 29 * _hashCode + evaluatedByEmpId;
		_hashCode = 29 * _hashCode + financialYearId;
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EmpEvaluationPk
	 */
	public EmpEvaluationPk createPk()
	{
		return new EmpEvaluationPk(empEvaluationId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EmpEvaluation: " );
		ret.append( "empEvaluationId=" + empEvaluationId );
		ret.append( ", employeeId=" + employeeId );
		ret.append( ", evaluationItemId=" + evaluationItemId );
		ret.append( ", evaluationDegereId=" + evaluationDegereId );
		ret.append( ", degreePercentage=" + degreePercentage );
		ret.append( ", evaluatedByEmpId=" + evaluatedByEmpId );
		ret.append( ", financialYearId=" + financialYearId );
		return ret.toString();
	}

}
