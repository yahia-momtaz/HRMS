/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package senior.hrms.emps.jdbc;

import senior.hrms.emps.dao.*;
import senior.hrms.emps.factory.*;
import java.util.Date;
import senior.hrms.emps.dto.*;
import senior.hrms.emps.exceptions.*;
import java.sql.Connection;
import java.util.Collection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class EmployeeJobsDaoImpl extends AbstractDAO implements EmployeeJobsDao
{
	/** 
	 * The factory class for this DAO has two versions of the create() method - one that
takes no arguments and one that takes a Connection argument. If the Connection version
is chosen then the connection will be stored in this attribute and will be used by all
calls to this DAO, otherwise a new Connection will be allocated for each operation.
	 */
	protected java.sql.Connection userConn;

	/** 
	 * All finder methods in this class use this SELECT constant to build their queries
	 */
	protected final String SQL_SELECT = "SELECT EMPLOYEE_JOB_ID, EMPLOYEE_ID, JOB_TITLE_ID, JOB_LEVEL_ID, SECTOR_ID, DEPARTMENT_ID, SECTION_ID, JOIN_DATE, CURRENT_JOB, IS_MANAGER, CURRENT_MANAGER, REQUEST_DATE, REQUEST_EMP_ID, APPROVED_EMP_ID, EMPLOYEE_TYPE_ID FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( EMPLOYEE_JOB_ID, EMPLOYEE_ID, JOB_TITLE_ID, JOB_LEVEL_ID, SECTOR_ID, DEPARTMENT_ID, SECTION_ID, JOIN_DATE, CURRENT_JOB, IS_MANAGER, CURRENT_MANAGER, REQUEST_DATE, REQUEST_EMP_ID, APPROVED_EMP_ID, EMPLOYEE_TYPE_ID ) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET EMPLOYEE_JOB_ID = ?, EMPLOYEE_ID = ?, JOB_TITLE_ID = ?, JOB_LEVEL_ID = ?, SECTOR_ID = ?, DEPARTMENT_ID = ?, SECTION_ID = ?, JOIN_DATE = ?, CURRENT_JOB = ?, IS_MANAGER = ?, CURRENT_MANAGER = ?, REQUEST_DATE = ?, REQUEST_EMP_ID = ?, APPROVED_EMP_ID = ?, EMPLOYEE_TYPE_ID = ? WHERE EMPLOYEE_JOB_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE EMPLOYEE_JOB_ID = ?";

	/** 
	 * Index of column EMPLOYEE_JOB_ID
	 */
	protected static final int COLUMN_EMPLOYEE_JOB_ID = 1;

	/** 
	 * Index of column EMPLOYEE_ID
	 */
	protected static final int COLUMN_EMPLOYEE_ID = 2;

	/** 
	 * Index of column JOB_TITLE_ID
	 */
	protected static final int COLUMN_JOB_TITLE_ID = 3;

	/** 
	 * Index of column JOB_LEVEL_ID
	 */
	protected static final int COLUMN_JOB_LEVEL_ID = 4;

	/** 
	 * Index of column SECTOR_ID
	 */
	protected static final int COLUMN_SECTOR_ID = 5;

	/** 
	 * Index of column DEPARTMENT_ID
	 */
	protected static final int COLUMN_DEPARTMENT_ID = 6;

	/** 
	 * Index of column SECTION_ID
	 */
	protected static final int COLUMN_SECTION_ID = 7;

	/** 
	 * Index of column JOIN_DATE
	 */
	protected static final int COLUMN_JOIN_DATE = 8;

	/** 
	 * Index of column CURRENT_JOB
	 */
	protected static final int COLUMN_CURRENT_JOB = 9;

	/** 
	 * Index of column IS_MANAGER
	 */
	protected static final int COLUMN_IS_MANAGER = 10;

	/** 
	 * Index of column CURRENT_MANAGER
	 */
	protected static final int COLUMN_CURRENT_MANAGER = 11;

	/** 
	 * Index of column REQUEST_DATE
	 */
	protected static final int COLUMN_REQUEST_DATE = 12;

	/** 
	 * Index of column REQUEST_EMP_ID
	 */
	protected static final int COLUMN_REQUEST_EMP_ID = 13;

	/** 
	 * Index of column APPROVED_EMP_ID
	 */
	protected static final int COLUMN_APPROVED_EMP_ID = 14;

	/** 
	 * Index of column EMPLOYEE_TYPE_ID
	 */
	protected static final int COLUMN_EMPLOYEE_TYPE_ID = 15;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 15;

	/** 
	 * Index of primary-key column EMPLOYEE_JOB_ID
	 */
	protected static final int PK_COLUMN_EMPLOYEE_JOB_ID = 1;

	/** 
	 * Inserts a new row in the EMPLOYEE_JOBS table.
	 */
	public EmployeeJobsPk insert(EmployeeJobs dto) throws EmployeeJobsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			stmt = conn.prepareStatement( SQL_INSERT );
			int index = 1;
			stmt.setInt( index++, dto.getEmployeeJobId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setInt( index++, dto.getJobTitleId() );
			if (dto.isJobLevelIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getJobLevelId() );
			}
		
			if (dto.isSectorIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSectorId() );
			}
		
			if (dto.isDepartmentIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getDepartmentId() );
			}
		
			if (dto.isSectionIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSectionId() );
			}
		
			stmt.setTimestamp(index++, dto.getJoinDate()==null ? null : new java.sql.Timestamp( dto.getJoinDate().getTime() ) );
			if (dto.isCurrentJobNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCurrentJob() );
			}
		
			if (dto.isIsManagerNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIsManager() );
			}
		
			if (dto.isCurrentManagerNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCurrentManager() );
			}
		
			stmt.setTimestamp(index++, dto.getRequestDate()==null ? null : new java.sql.Timestamp( dto.getRequestDate().getTime() ) );
			stmt.setInt( index++, dto.getRequestEmpId() );
			stmt.setInt( index++, dto.getApprovedEmpId() );
			stmt.setInt( index++, dto.getEmployeeTypeId() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmployeeJobsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the EMPLOYEE_JOBS table.
	 */
	public void update(EmployeeJobsPk pk, EmployeeJobs dto) throws EmployeeJobsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_UPDATE + " with DTO: " + dto );
			stmt = conn.prepareStatement( SQL_UPDATE );
			int index=1;
			stmt.setInt( index++, dto.getEmployeeJobId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setInt( index++, dto.getJobTitleId() );
			if (dto.isJobLevelIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getJobLevelId() );
			}
		
			if (dto.isSectorIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSectorId() );
			}
		
			if (dto.isDepartmentIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getDepartmentId() );
			}
		
			if (dto.isSectionIdNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getSectionId() );
			}
		
			stmt.setTimestamp(index++, dto.getJoinDate()==null ? null : new java.sql.Timestamp( dto.getJoinDate().getTime() ) );
			if (dto.isCurrentJobNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCurrentJob() );
			}
		
			if (dto.isIsManagerNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getIsManager() );
			}
		
			if (dto.isCurrentManagerNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getCurrentManager() );
			}
		
			stmt.setTimestamp(index++, dto.getRequestDate()==null ? null : new java.sql.Timestamp( dto.getRequestDate().getTime() ) );
			stmt.setInt( index++, dto.getRequestEmpId() );
			stmt.setInt( index++, dto.getApprovedEmpId() );
			stmt.setInt( index++, dto.getEmployeeTypeId() );
			stmt.setInt( 16, pk.getEmployeeJobId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmployeeJobsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the EMPLOYEE_JOBS table.
	 */
	public void delete(EmployeeJobsPk pk) throws EmployeeJobsDaoException
	{
		long t1 = System.currentTimeMillis();
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			System.out.println( "Executing " + SQL_DELETE + " with PK: " + pk );
			stmt = conn.prepareStatement( SQL_DELETE );
			stmt.setInt( 1, pk.getEmployeeJobId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmployeeJobsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the EMPLOYEE_JOBS table that matches the specified primary-key value.
	 */
	public EmployeeJobs findByPrimaryKey(EmployeeJobsPk pk) throws EmployeeJobsDaoException
	{
		return findByPrimaryKey( pk.getEmployeeJobId() );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'EMPLOYEE_JOB_ID = :employeeJobId'.
	 */
	public EmployeeJobs findByPrimaryKey(int employeeJobId) throws EmployeeJobsDaoException
	{
		EmployeeJobs ret[] = findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_JOB_ID = ?", new Object[] {  new Integer(employeeJobId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria ''.
	 */
	public EmployeeJobs[] findAll() throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY EMPLOYEE_JOB_ID", null );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'DEPARTMENT_ID = :departmentId'.
	 */
	public EmployeeJobs[] findByDepartments(int departmentId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DEPARTMENT_ID = ?", new Object[] {  new Integer(departmentId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmployeeJobs[] findByEmployees(int employeeId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ?", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'REQUEST_EMP_ID = :requestEmpId'.
	 */
	public EmployeeJobs[] findByEmployees2(int requestEmpId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REQUEST_EMP_ID = ?", new Object[] {  new Integer(requestEmpId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'APPROVED_EMP_ID = :approvedEmpId'.
	 */
	public EmployeeJobs[] findByEmployees3(int approvedEmpId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APPROVED_EMP_ID = ?", new Object[] {  new Integer(approvedEmpId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'EMPLOYEE_TYPE_ID = :employeeTypeId'.
	 */
	public EmployeeJobs[] findByEmployeeType(int employeeTypeId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_TYPE_ID = ?", new Object[] {  new Integer(employeeTypeId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'JOB_LEVEL_ID = :jobLevelId'.
	 */
	public EmployeeJobs[] findByJobLevel(int jobLevelId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE JOB_LEVEL_ID = ?", new Object[] {  new Integer(jobLevelId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'JOB_TITLE_ID = :jobTitleId'.
	 */
	public EmployeeJobs[] findByJobTitle(int jobTitleId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE JOB_TITLE_ID = ?", new Object[] {  new Integer(jobTitleId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'SECTION_ID = :sectionId'.
	 */
	public EmployeeJobs[] findBySections(int sectionId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SECTION_ID = ?", new Object[] {  new Integer(sectionId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'SECTOR_ID = :sectorId'.
	 */
	public EmployeeJobs[] findBySectors(int sectorId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SECTOR_ID = ?", new Object[] {  new Integer(sectorId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'EMPLOYEE_JOB_ID = :employeeJobId'.
	 */
	public EmployeeJobs[] findWhereEmployeeJobIdEquals(int employeeJobId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_JOB_ID = ? ORDER BY EMPLOYEE_JOB_ID", new Object[] {  new Integer(employeeJobId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmployeeJobs[] findWhereEmployeeIdEquals(int employeeId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ? ORDER BY EMPLOYEE_ID", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'JOB_TITLE_ID = :jobTitleId'.
	 */
	public EmployeeJobs[] findWhereJobTitleIdEquals(int jobTitleId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE JOB_TITLE_ID = ? ORDER BY JOB_TITLE_ID", new Object[] {  new Integer(jobTitleId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'JOB_LEVEL_ID = :jobLevelId'.
	 */
	public EmployeeJobs[] findWhereJobLevelIdEquals(int jobLevelId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE JOB_LEVEL_ID = ? ORDER BY JOB_LEVEL_ID", new Object[] {  new Integer(jobLevelId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'SECTOR_ID = :sectorId'.
	 */
	public EmployeeJobs[] findWhereSectorIdEquals(int sectorId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SECTOR_ID = ? ORDER BY SECTOR_ID", new Object[] {  new Integer(sectorId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'DEPARTMENT_ID = :departmentId'.
	 */
	public EmployeeJobs[] findWhereDepartmentIdEquals(int departmentId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DEPARTMENT_ID = ? ORDER BY DEPARTMENT_ID", new Object[] {  new Integer(departmentId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'SECTION_ID = :sectionId'.
	 */
	public EmployeeJobs[] findWhereSectionIdEquals(int sectionId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE SECTION_ID = ? ORDER BY SECTION_ID", new Object[] {  new Integer(sectionId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'JOIN_DATE = :joinDate'.
	 */
	public EmployeeJobs[] findWhereJoinDateEquals(Date joinDate) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE JOIN_DATE = ? ORDER BY JOIN_DATE", new Object[] { joinDate==null ? null : new java.sql.Timestamp( joinDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'CURRENT_JOB = :currentJob'.
	 */
	public EmployeeJobs[] findWhereCurrentJobEquals(int currentJob) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CURRENT_JOB = ? ORDER BY CURRENT_JOB", new Object[] {  new Integer(currentJob) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'IS_MANAGER = :isManager'.
	 */
	public EmployeeJobs[] findWhereIsManagerEquals(int isManager) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE IS_MANAGER = ? ORDER BY IS_MANAGER", new Object[] {  new Integer(isManager) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'CURRENT_MANAGER = :currentManager'.
	 */
	public EmployeeJobs[] findWhereCurrentManagerEquals(int currentManager) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE CURRENT_MANAGER = ? ORDER BY CURRENT_MANAGER", new Object[] {  new Integer(currentManager) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'REQUEST_DATE = :requestDate'.
	 */
	public EmployeeJobs[] findWhereRequestDateEquals(Date requestDate) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REQUEST_DATE = ? ORDER BY REQUEST_DATE", new Object[] { requestDate==null ? null : new java.sql.Timestamp( requestDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'REQUEST_EMP_ID = :requestEmpId'.
	 */
	public EmployeeJobs[] findWhereRequestEmpIdEquals(int requestEmpId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE REQUEST_EMP_ID = ? ORDER BY REQUEST_EMP_ID", new Object[] {  new Integer(requestEmpId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'APPROVED_EMP_ID = :approvedEmpId'.
	 */
	public EmployeeJobs[] findWhereApprovedEmpIdEquals(int approvedEmpId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE APPROVED_EMP_ID = ? ORDER BY APPROVED_EMP_ID", new Object[] {  new Integer(approvedEmpId) } );
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the criteria 'EMPLOYEE_TYPE_ID = :employeeTypeId'.
	 */
	public EmployeeJobs[] findWhereEmployeeTypeIdEquals(int employeeTypeId) throws EmployeeJobsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_TYPE_ID = ? ORDER BY EMPLOYEE_TYPE_ID", new Object[] {  new Integer(employeeTypeId) } );
	}

	/**
	 * Method 'EmployeeJobsDaoImpl'
	 * 
	 */
	public EmployeeJobsDaoImpl()
	{
	}

	/**
	 * Method 'EmployeeJobsDaoImpl'
	 * 
	 * @param userConn
	 */
	public EmployeeJobsDaoImpl(final java.sql.Connection userConn)
	{
		this.userConn = userConn;
	}

	/** 
	 * Sets the value of maxRows
	 */
	public void setMaxRows(int maxRows)
	{
		this.maxRows = maxRows;
	}

	/** 
	 * Gets the value of maxRows
	 */
	public int getMaxRows()
	{
		return maxRows;
	}

	/**
	 * Method 'getTableName'
	 * 
	 * @return String
	 */
	public String getTableName()
	{
		return "HRMS.EMPLOYEE_JOBS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected EmployeeJobs fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			EmployeeJobs dto = new EmployeeJobs();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected EmployeeJobs[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			EmployeeJobs dto = new EmployeeJobs();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		EmployeeJobs ret[] = new EmployeeJobs[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(EmployeeJobs dto, ResultSet rs) throws SQLException
	{
		dto.setEmployeeJobId( rs.getInt( COLUMN_EMPLOYEE_JOB_ID ) );
		dto.setEmployeeId( rs.getInt( COLUMN_EMPLOYEE_ID ) );
		dto.setJobTitleId( rs.getInt( COLUMN_JOB_TITLE_ID ) );
		dto.setJobLevelId( rs.getInt( COLUMN_JOB_LEVEL_ID ) );
		if (rs.wasNull()) {
			dto.setJobLevelIdNull( true );
		}
		
		dto.setSectorId( rs.getInt( COLUMN_SECTOR_ID ) );
		if (rs.wasNull()) {
			dto.setSectorIdNull( true );
		}
		
		dto.setDepartmentId( rs.getInt( COLUMN_DEPARTMENT_ID ) );
		if (rs.wasNull()) {
			dto.setDepartmentIdNull( true );
		}
		
		dto.setSectionId( rs.getInt( COLUMN_SECTION_ID ) );
		if (rs.wasNull()) {
			dto.setSectionIdNull( true );
		}
		
		dto.setJoinDate( rs.getTimestamp(COLUMN_JOIN_DATE ) );
		dto.setCurrentJob( rs.getInt( COLUMN_CURRENT_JOB ) );
		if (rs.wasNull()) {
			dto.setCurrentJobNull( true );
		}
		
		dto.setIsManager( rs.getInt( COLUMN_IS_MANAGER ) );
		if (rs.wasNull()) {
			dto.setIsManagerNull( true );
		}
		
		dto.setCurrentManager( rs.getInt( COLUMN_CURRENT_MANAGER ) );
		if (rs.wasNull()) {
			dto.setCurrentManagerNull( true );
		}
		
		dto.setRequestDate( rs.getTimestamp(COLUMN_REQUEST_DATE ) );
		dto.setRequestEmpId( rs.getInt( COLUMN_REQUEST_EMP_ID ) );
		dto.setApprovedEmpId( rs.getInt( COLUMN_APPROVED_EMP_ID ) );
		dto.setEmployeeTypeId( rs.getInt( COLUMN_EMPLOYEE_TYPE_ID ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(EmployeeJobs dto)
	{
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the specified arbitrary SQL statement
	 */
	public EmployeeJobs[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmployeeJobsDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmployeeJobsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns all rows from the EMPLOYEE_JOBS table that match the specified arbitrary SQL statement
	 */
	public EmployeeJobs[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmployeeJobsDaoException
	{
		// declare variables
		final boolean isConnSupplied = (userConn != null);
		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			// get the user-specified connection or get a connection from the ResourceManager
			conn = isConnSupplied ? userConn : ResourceManager.getConnection();
		
			// construct the SQL statement
			final String SQL = SQL_SELECT + " WHERE " + sql;
		
		
			System.out.println( "Executing " + SQL );
			// prepare statement
			stmt = conn.prepareStatement( SQL );
			stmt.setMaxRows( maxRows );
		
			// bind parameters
			for (int i=0; sqlParams!=null && i<sqlParams.length; i++ ) {
				stmt.setObject( i+1, sqlParams[i] );
			}
		
		
			rs = stmt.executeQuery();
		
			// fetch the results
			return fetchMultiResults(rs);
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmployeeJobsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(rs);
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

}
