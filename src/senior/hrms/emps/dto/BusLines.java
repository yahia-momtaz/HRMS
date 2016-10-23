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

public class BusLines implements Serializable
{
	/** 
	 * This attribute maps to the column BUS_LINE_ID in the BUS_LINES table.
	 */
	protected int busLineId;

	/** 
	 * This attribute maps to the column BUS_LINE_NAME in the BUS_LINES table.
	 */
	protected String busLineName;

	/**
	 * Method 'BusLines'
	 * 
	 */
	public BusLines()
	{
	}

	/**
	 * Method 'getBusLineId'
	 * 
	 * @return int
	 */
	public int getBusLineId()
	{
		return busLineId;
	}

	/**
	 * Method 'setBusLineId'
	 * 
	 * @param busLineId
	 */
	public void setBusLineId(int busLineId)
	{
		this.busLineId = busLineId;
	}

	/**
	 * Method 'getBusLineName'
	 * 
	 * @return String
	 */
	public String getBusLineName()
	{
		return busLineName;
	}

	/**
	 * Method 'setBusLineName'
	 * 
	 * @param busLineName
	 */
	public void setBusLineName(String busLineName)
	{
		this.busLineName = busLineName;
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
		
		if (!(_other instanceof BusLines)) {
			return false;
		}
		
		final BusLines _cast = (BusLines) _other;
		if (busLineId != _cast.busLineId) {
			return false;
		}
		
		if (busLineName == null ? _cast.busLineName != busLineName : !busLineName.equals( _cast.busLineName )) {
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
		_hashCode = 29 * _hashCode + busLineId;
		if (busLineName != null) {
			_hashCode = 29 * _hashCode + busLineName.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return BusLinesPk
	 */
	public BusLinesPk createPk()
	{
		return new BusLinesPk(busLineId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.BusLines: " );
		ret.append( "busLineId=" + busLineId );
		ret.append( ", busLineName=" + busLineName );
		return ret.toString();
	}

}
