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

public class Sectors implements Serializable
{
	/** 
	 * This attribute maps to the column SECTOR_ID in the SECTORS table.
	 */
	protected int sectorId;

	/** 
	 * This attribute maps to the column SECTOR_NAME in the SECTORS table.
	 */
	protected String sectorName;

	/**
	 * Method 'Sectors'
	 * 
	 */
	public Sectors()
	{
	}

	/**
	 * Method 'getSectorId'
	 * 
	 * @return int
	 */
	public int getSectorId()
	{
		return sectorId;
	}

	/**
	 * Method 'setSectorId'
	 * 
	 * @param sectorId
	 */
	public void setSectorId(int sectorId)
	{
		this.sectorId = sectorId;
	}

	/**
	 * Method 'getSectorName'
	 * 
	 * @return String
	 */
	public String getSectorName()
	{
		return sectorName;
	}

	/**
	 * Method 'setSectorName'
	 * 
	 * @param sectorName
	 */
	public void setSectorName(String sectorName)
	{
		this.sectorName = sectorName;
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
		
		if (!(_other instanceof Sectors)) {
			return false;
		}
		
		final Sectors _cast = (Sectors) _other;
		if (sectorId != _cast.sectorId) {
			return false;
		}
		
		if (sectorName == null ? _cast.sectorName != sectorName : !sectorName.equals( _cast.sectorName )) {
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
		_hashCode = 29 * _hashCode + sectorId;
		if (sectorName != null) {
			_hashCode = 29 * _hashCode + sectorName.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return SectorsPk
	 */
	public SectorsPk createPk()
	{
		return new SectorsPk(sectorId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.Sectors: " );
		ret.append( "sectorId=" + sectorId );
		ret.append( ", sectorName=" + sectorName );
		return ret.toString();
	}

}
