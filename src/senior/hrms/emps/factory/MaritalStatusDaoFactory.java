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

public class MaritalStatusDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return MaritalStatusDao
	 */
	public static MaritalStatusDao create()
	{
		return new MaritalStatusDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return MaritalStatusDao
	 */
	public static MaritalStatusDao create(Connection conn)
	{
		return new MaritalStatusDaoImpl( conn );
	}

}
