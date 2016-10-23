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

public class EvaluationItem implements Serializable
{
	/** 
	 * This attribute maps to the column EVALUATION_ITEM_ID in the EVALUATION_ITEM table.
	 */
	protected int evaluationItemId;

	/** 
	 * This attribute maps to the column EVALUATION_ITEM_NAME in the EVALUATION_ITEM table.
	 */
	protected String evaluationItemName;

	/** 
	 * This attribute maps to the column EVALUATION_ITEM_NOTE in the EVALUATION_ITEM table.
	 */
	protected String evaluationItemNote;

	/**
	 * Method 'EvaluationItem'
	 * 
	 */
	public EvaluationItem()
	{
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
	 * Method 'getEvaluationItemName'
	 * 
	 * @return String
	 */
	public String getEvaluationItemName()
	{
		return evaluationItemName;
	}

	/**
	 * Method 'setEvaluationItemName'
	 * 
	 * @param evaluationItemName
	 */
	public void setEvaluationItemName(String evaluationItemName)
	{
		this.evaluationItemName = evaluationItemName;
	}

	/**
	 * Method 'getEvaluationItemNote'
	 * 
	 * @return String
	 */
	public String getEvaluationItemNote()
	{
		return evaluationItemNote;
	}

	/**
	 * Method 'setEvaluationItemNote'
	 * 
	 * @param evaluationItemNote
	 */
	public void setEvaluationItemNote(String evaluationItemNote)
	{
		this.evaluationItemNote = evaluationItemNote;
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
		
		if (!(_other instanceof EvaluationItem)) {
			return false;
		}
		
		final EvaluationItem _cast = (EvaluationItem) _other;
		if (evaluationItemId != _cast.evaluationItemId) {
			return false;
		}
		
		if (evaluationItemName == null ? _cast.evaluationItemName != evaluationItemName : !evaluationItemName.equals( _cast.evaluationItemName )) {
			return false;
		}
		
		if (evaluationItemNote == null ? _cast.evaluationItemNote != evaluationItemNote : !evaluationItemNote.equals( _cast.evaluationItemNote )) {
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
		_hashCode = 29 * _hashCode + evaluationItemId;
		if (evaluationItemName != null) {
			_hashCode = 29 * _hashCode + evaluationItemName.hashCode();
		}
		
		if (evaluationItemNote != null) {
			_hashCode = 29 * _hashCode + evaluationItemNote.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return EvaluationItemPk
	 */
	public EvaluationItemPk createPk()
	{
		return new EvaluationItemPk(evaluationItemId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.EvaluationItem: " );
		ret.append( "evaluationItemId=" + evaluationItemId );
		ret.append( ", evaluationItemName=" + evaluationItemName );
		ret.append( ", evaluationItemNote=" + evaluationItemNote );
		return ret.toString();
	}

}