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

public class EmpSalaryTrgDaoFactory
{
	/**
	 * Method 'create'
	 * 
	 * @return EmpSalaryTrgDao
	 */
	public static EmpSalaryTrgDao create()
	{
		return new EmpSalaryTrgDaoImpl();
	}

	/**
	 * Method 'create'
	 * 
	 * @param conn
	 * @return EmpSalaryTrgDao
	 */
	public static EmpSalaryTrgDao create(Connection conn)
	{
		return new EmpSalaryTrgDaoImpl( conn );
	}

}
