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

public class AccidentReasons implements Serializable
{
	/** 
	 * This attribute maps to the column ACCIDENT_REASON_ID in the ACCIDENT_REASONS table.
	 */
	protected int accidentReasonId;

	/** 
	 * This attribute maps to the column ACCIDENT_REASON in the ACCIDENT_REASONS table.
	 */
	protected String accidentReason;

	/**
	 * Method 'AccidentReasons'
	 * 
	 */
	public AccidentReasons()
	{
	}

	/**
	 * Method 'getAccidentReasonId'
	 * 
	 * @return int
	 */
	public int getAccidentReasonId()
	{
		return accidentReasonId;
	}

	/**
	 * Method 'setAccidentReasonId'
	 * 
	 * @param accidentReasonId
	 */
	public void setAccidentReasonId(int accidentReasonId)
	{
		this.accidentReasonId = accidentReasonId;
	}

	/**
	 * Method 'getAccidentReason'
	 * 
	 * @return String
	 */
	public String getAccidentReason()
	{
		return accidentReason;
	}

	/**
	 * Method 'setAccidentReason'
	 * 
	 * @param accidentReason
	 */
	public void setAccidentReason(String accidentReason)
	{
		this.accidentReason = accidentReason;
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
		
		if (!(_other instanceof AccidentReasons)) {
			return false;
		}
		
		final AccidentReasons _cast = (AccidentReasons) _other;
		if (accidentReasonId != _cast.accidentReasonId) {
			return false;
		}
		
		if (accidentReason == null ? _cast.accidentReason != accidentReason : !accidentReason.equals( _cast.accidentReason )) {
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
		_hashCode = 29 * _hashCode + accidentReasonId;
		if (accidentReason != null) {
			_hashCode = 29 * _hashCode + accidentReason.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return AccidentReasonsPk
	 */
	public AccidentReasonsPk createPk()
	{
		return new AccidentReasonsPk(accidentReasonId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.AccidentReasons: " );
		ret.append( "accidentReasonId=" + accidentReasonId );
		ret.append( ", accidentReason=" + accidentReason );
		return ret.toString();
	}

}
