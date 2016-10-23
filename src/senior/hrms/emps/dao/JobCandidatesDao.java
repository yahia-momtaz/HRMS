/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.dao;

import java.util.Date;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;

public interface JobCandidatesDao
{
	/** 
	 * Inserts a new row in the JOB_CANDIDATES table.
	 */
	public JobCandidatesPk insert(JobCandidates dto) throws JobCandidatesDaoException;

	/** 
	 * Updates a single row in the JOB_CANDIDATES table.
	 */
	public void update(JobCandidatesPk pk, JobCandidates dto) throws JobCandidatesDaoException;

	/** 
	 * Deletes a single row in the JOB_CANDIDATES table.
	 */
	public void delete(JobCandidatesPk pk) throws JobCandidatesDaoException;

	/** 
	 * Returns the rows from the JOB_CANDIDATES table that matches the specified primary-key value.
	 */
	public JobCandidates findByPrimaryKey(JobCandidatesPk pk) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_ID = :candidateId'.
	 */
	public JobCandidates findByPrimaryKey(int candidateId) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria ''.
	 */
	public JobCandidates[] findAll() throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_ID = :candidateId'.
	 */
	public JobCandidates[] findWhereCandidateIdEquals(int candidateId) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_NAME = :candidateName'.
	 */
	public JobCandidates[] findWhereCandidateNameEquals(String candidateName) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_PHONE = :candidatePhone'.
	 */
	public JobCandidates[] findWhereCandidatePhoneEquals(String candidatePhone) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_MOBILE = :candidateMobile'.
	 */
	public JobCandidates[] findWhereCandidateMobileEquals(String candidateMobile) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_ADDRESS = :candidateAddress'.
	 */
	public JobCandidates[] findWhereCandidateAddressEquals(String candidateAddress) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_REG_DATE = :candidateRegDate'.
	 */
	public JobCandidates[] findWhereCandidateRegDateEquals(Date candidateRegDate) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_INTERVIEW_DEGREE = :candidateInterviewDegree'.
	 */
	public JobCandidates[] findWhereCandidateInterviewDegreeEquals(int candidateInterviewDegree) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'JOB_TITLE_ID = :jobTitleId'.
	 */
	public JobCandidates[] findWhereJobTitleIdEquals(int jobTitleId) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CV_FILE = :cvFile'.
	 */
	public JobCandidates[] findWhereCvFileEquals(byte[] cvFile) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CANDIDATE_IMAGE = :candidateImage'.
	 */
	public JobCandidates[] findWhereCandidateImageEquals(byte[] candidateImage) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the criteria 'CV_DEGREE = :cvDegree'.
	 */
	public JobCandidates[] findWhereCvDegreeEquals(int cvDegree) throws JobCandidatesDaoException;

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows);

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows();

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the specified arbitrary SQL statement
	 */
	public JobCandidates[] findByDynamicSelect(String sql, Object[] sqlParams) throws JobCandidatesDaoException;

	/** 
	 * Returns all rows from the JOB_CANDIDATES table that match the specified arbitrary SQL statement
	 */
	public JobCandidates[] findByDynamicWhere(String sql, Object[] sqlParams) throws JobCandidatesDaoException;

}
