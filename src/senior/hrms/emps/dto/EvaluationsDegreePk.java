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
 * This class represents the primary key of the EVALUATIONS_DEGREE table.
 */
public class EvaluationsDegreePk implements Serializable
{
	protected int evaluationsDegreeId;

	/** 
	 * This attribute represents whether the primitive attribute evaluationsDegreeId is null.
	 */
	protected boolean evaluationsDegreeIdNull;

	/** 
	 * Sets the value of evaluationsDegreeId
	 */
	public void setEvaluationsDegreeId(int evaluationsDegreeId)
	{
		this.evaluationsDegreeId = evaluationsDegreeId;
	}

	/** 
	 * Gets the value of evaluationsDegreeId
	 */
	public int getEvaluationsDegreeId()
	{
		return evaluationsDegreeId;
	}

	/**
	 * Method 'EvaluationsDegreePk'
	 * 
	 */
	public EvaluationsDegreePk()
	{
	}

	/**
	 * Method 'EvaluationsDegreePk'
	 * 
	 * @param evaluationsDegreeId
	 */
	public EvaluationsDegreePk(final int evaluationsDegreeId)
	{
		this.evaluationsDegreeId = evaluationsDegreeId;
	}

	/** 
	 * Sets the value of evaluationsDegreeIdNull
	 */
	public void setEvaluationsDegreeIdNull(boolean evaluationsDegreeIdNull)
	{
		this.evaluationsDegreeIdNull = evaluationsDegreeIdNull;
	}

	/** 
	 * Gets the value of evaluationsDegreeIdNull
	 */
	public boolean isEvaluationsDegreeIdNull()
	{
		return evaluationsDegreeIdNull;
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
		
		if (!(_other instanceof EvaluationsDegreePk)) {
			return false;
		}
		
		final EvaluationsDegreePk _cast = (EvaluationsDegreePk) _other;
		if (evaluationsDegreeId != _cast.evaluationsDegreeId) {
			return false;
		}
		
		if (evaluationsDegreeIdNull != _cast.evaluationsDegreeIdNull) {
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
		_hashCode = 29 * _hashCode + evaluationsDegreeId;
		_hashCode = 29 * _hashCode + (evaluationsDegreeIdNull ? 1 : 0);
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
		ret.append( "senior.hrms.emps.dto.EvaluationsDegreePk: " );
		ret.append( "evaluationsDegreeId=" + evaluationsDegreeId );
		return ret.toString();
	}

}
