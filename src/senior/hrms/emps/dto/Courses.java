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

public class Courses implements Serializable
{
	/** 
	 * This attribute maps to the column COURSE_ID in the COURSES table.
	 */
	protected int courseId;

	/** 
	 * This attribute maps to the column COURSE_NAME in the COURSES table.
	 */
	protected String courseName;

	/** 
	 * This attribute maps to the column COURSE_LOCATION in the COURSES table.
	 */
	protected String courseLocation;

	/** 
	 * This attribute maps to the column DATE_FROM in the COURSES table.
	 */
	protected Date dateFrom;

	/** 
	 * This attribute maps to the column DATE_TO in the COURSES table.
	 */
	protected Date dateTo;

	/**
	 * Method 'Courses'
	 * 
	 */
	public Courses()
	{
	}

	/**
	 * Method 'getCourseId'
	 * 
	 * @return int
	 */
	public int getCourseId()
	{
		return courseId;
	}

	/**
	 * Method 'setCourseId'
	 * 
	 * @param courseId
	 */
	public void setCourseId(int courseId)
	{
		this.courseId = courseId;
	}

	/**
	 * Method 'getCourseName'
	 * 
	 * @return String
	 */
	public String getCourseName()
	{
		return courseName;
	}

	/**
	 * Method 'setCourseName'
	 * 
	 * @param courseName
	 */
	public void setCourseName(String courseName)
	{
		this.courseName = courseName;
	}

	/**
	 * Method 'getCourseLocation'
	 * 
	 * @return String
	 */
	public String getCourseLocation()
	{
		return courseLocation;
	}

	/**
	 * Method 'setCourseLocation'
	 * 
	 * @param courseLocation
	 */
	public void setCourseLocation(String courseLocation)
	{
		this.courseLocation = courseLocation;
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
		
		if (!(_other instanceof Courses)) {
			return false;
		}
		
		final Courses _cast = (Courses) _other;
		if (courseId != _cast.courseId) {
			return false;
		}
		
		if (courseName == null ? _cast.courseName != courseName : !courseName.equals( _cast.courseName )) {
			return false;
		}
		
		if (courseLocation == null ? _cast.courseLocation != courseLocation : !courseLocation.equals( _cast.courseLocation )) {
			return false;
		}
		
		if (dateFrom == null ? _cast.dateFrom != dateFrom : !dateFrom.equals( _cast.dateFrom )) {
			return false;
		}
		
		if (dateTo == null ? _cast.dateTo != dateTo : !dateTo.equals( _cast.dateTo )) {
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
		_hashCode = 29 * _hashCode + courseId;
		if (courseName != null) {
			_hashCode = 29 * _hashCode + courseName.hashCode();
		}
		
		if (courseLocation != null) {
			_hashCode = 29 * _hashCode + courseLocation.hashCode();
		}
		
		if (dateFrom != null) {
			_hashCode = 29 * _hashCode + dateFrom.hashCode();
		}
		
		if (dateTo != null) {
			_hashCode = 29 * _hashCode + dateTo.hashCode();
		}
		
		return _hashCode;
	}

	/**
	 * Method 'createPk'
	 * 
	 * @return CoursesPk
	 */
	public CoursesPk createPk()
	{
		return new CoursesPk(courseId);
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "senior.hrms.emps.dto.Courses: " );
		ret.append( "courseId=" + courseId );
		ret.append( ", courseName=" + courseName );
		ret.append( ", courseLocation=" + courseLocation );
		ret.append( ", dateFrom=" + dateFrom );
		ret.append( ", dateTo=" + dateTo );
		return ret.toString();
	}

}