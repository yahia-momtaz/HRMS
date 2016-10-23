/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.factory;

import java.sql.Connection;
import senior.hrms.emps.dao.*;
import senior.hrms.emps.jdbc.*;

public class CoursesDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return CoursesDao
	 */
	public static CoursesDao create()
	{
		return new CoursesDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return CoursesDao
	 */
	public static CoursesDao create(Connection conn)
	{
		return new CoursesDaoImpl( conn );
	}

}
