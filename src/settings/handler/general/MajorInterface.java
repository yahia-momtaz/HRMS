/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */
package settings.handler.general;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface MajorInterface
{

    public MajorPk addMajor(Major dto) throws MajorDaoException;

    public void updateMajor(MajorPk pk, Major dto) throws MajorDaoException;

    public void deleteMajor(MajorPk pk) throws MajorDaoException;

    public Major getMajorById(int majorId) throws MajorDaoException;

    public Major[] getAllMajor() throws MajorDaoException;

    public Major[] getMajorByName(String majorName) throws MajorDaoException;

}
