/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */
package settings.handler.affairs;

import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface EvaluationItemInterface
{

    public EvaluationItemPk addEvaluationItem(EvaluationItem dto) throws EvaluationItemDaoException;

    public void updateEvaluationItem(EvaluationItemPk pk, EvaluationItem dto) throws EvaluationItemDaoException;

    public void deleteEvaluationItem(EvaluationItemPk pk) throws EvaluationItemDaoException;

    public EvaluationItem getEvaluationItemById(int evaluationItemId) throws EvaluationItemDaoException;

    public EvaluationItem[] getAllEvaluationItems() throws EvaluationItemDaoException;

    public EvaluationItem[] getEvaluationItemByName(String evaluationItemName) throws EvaluationItemDaoException;

    public EvaluationItem[] getEvaluationItemByNote(String evaluationItemNote) throws EvaluationItemDaoException;

}
