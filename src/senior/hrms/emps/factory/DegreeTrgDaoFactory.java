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

public class DegreeTrgDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return DegreeTrgDao
	 */
	public static DegreeTrgDao create()
	{
		return new DegreeTrgDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return DegreeTrgDao
	 */
	public static DegreeTrgDao create(Connection conn)
	{
		return new DegreeTrgDaoImpl( conn );
	}

}
