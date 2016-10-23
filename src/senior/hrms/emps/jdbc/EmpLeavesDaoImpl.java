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

public class EmpLeavesDaoImpl extends AbstractDAO implements EmpLeavesDao
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
	protected final String SQL_SELECT = "SELECT EMP_LEAVE_ID, EMPLOYEE_ID, LEAVE_ID, PERMIT_SIDE_ID, DATE_TIME_FROM, DATE_TIME_TO, EMP_LEAVE_NOTE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( EMP_LEAVE_ID, EMPLOYEE_ID, LEAVE_ID, PERMIT_SIDE_ID, DATE_TIME_FROM, DATE_TIME_TO, EMP_LEAVE_NOTE ) VALUES ( ?, ?, ?, ?, ?, ?, EMPTY_CLOB() )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET EMP_LEAVE_ID = ?, EMPLOYEE_ID = ?, LEAVE_ID = ?, PERMIT_SIDE_ID = ?, DATE_TIME_FROM = ?, DATE_TIME_TO = ?, EMP_LEAVE_NOTE = EMPTY_CLOB() WHERE EMP_LEAVE_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE EMP_LEAVE_ID = ?";

	/** 
	 * Index of column EMP_LEAVE_ID
	 */
	protected static final int COLUMN_EMP_LEAVE_ID = 1;

	/** 
	 * Index of column EMPLOYEE_ID
	 */
	protected static final int COLUMN_EMPLOYEE_ID = 2;

	/** 
	 * Index of column LEAVE_ID
	 */
	protected static final int COLUMN_LEAVE_ID = 3;

	/** 
	 * Index of column PERMIT_SIDE_ID
	 */
	protected static final int COLUMN_PERMIT_SIDE_ID = 4;

	/** 
	 * Index of column DATE_TIME_FROM
	 */
	protected static final int COLUMN_DATE_TIME_FROM = 5;

	/** 
	 * Index of column DATE_TIME_TO
	 */
	protected static final int COLUMN_DATE_TIME_TO = 6;

	/** 
	 * Index of column EMP_LEAVE_NOTE
	 */
	protected static final int COLUMN_EMP_LEAVE_NOTE = 7;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 7;

	/** 
	 * Index of primary-key column EMP_LEAVE_ID
	 */
	protected static final int PK_COLUMN_EMP_LEAVE_ID = 1;

	/** 
	 * Inserts a new row in the EMP_LEAVES table.
	 */
	public EmpLeavesPk insert(EmpLeaves dto) throws EmpLeavesDaoException
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
			stmt.setInt( index++, dto.getEmpLeaveId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setInt( index++, dto.getLeaveId() );
			stmt.setInt( index++, dto.getPermitSideId() );
			stmt.setTimestamp(index++, dto.getDateTimeFrom()==null ? null : new java.sql.Timestamp( dto.getDateTimeFrom().getTime() ) );
			stmt.setTimestamp(index++, dto.getDateTimeTo()==null ? null : new java.sql.Timestamp( dto.getDateTimeTo().getTime() ) );
			// no need to bind value for LOB column
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
		
			// Update CLOB columns
			boolean oldAutoCommitValue = conn.getAutoCommit();
			conn.setAutoCommit(false);
			String lobSQL = "SELECT EMP_LEAVE_NOTE FROM " + getTableName() + " WHERE EMP_LEAVE_ID=? FOR UPDATE";
			index = 1;
			System.out.println( lobSQL );
			PreparedStatement lobStmt = conn.prepareStatement( lobSQL );
			lobStmt.setInt( index++, dto.getEmpLeaveId() );
			ResultSet lobRs = lobStmt.executeQuery();
			int lobIndex = 1;
			if (lobRs.next()) {
				super.updateClob( lobRs.getClob(lobIndex++), dto.getEmpLeaveNote());
			}
		
			conn.commit();
			conn.setAutoCommit(oldAutoCommitValue);
			System.out.println( "Updated LOB" );
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpLeavesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the EMP_LEAVES table.
	 */
	public void update(EmpLeavesPk pk, EmpLeaves dto) throws EmpLeavesDaoException
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
			stmt.setInt( index++, dto.getEmpLeaveId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setInt( index++, dto.getLeaveId() );
			stmt.setInt( index++, dto.getPermitSideId() );
			stmt.setTimestamp(index++, dto.getDateTimeFrom()==null ? null : new java.sql.Timestamp( dto.getDateTimeFrom().getTime() ) );
			stmt.setTimestamp(index++, dto.getDateTimeTo()==null ? null : new java.sql.Timestamp( dto.getDateTimeTo().getTime() ) );
			// no need to bind value for LOB column
			stmt.setInt( 7, pk.getEmpLeaveId() );
			int rows = stmt.executeUpdate();
		
			// Update CLOB columns
			boolean oldAutoCommitValue = conn.getAutoCommit();
			conn.setAutoCommit(false);
			String lobSQL = "SELECT EMP_LEAVE_NOTE FROM " + getTableName() + " WHERE EMP_LEAVE_ID=? FOR UPDATE";
			index = 1;
			System.out.println( lobSQL );
			PreparedStatement lobStmt = conn.prepareStatement( lobSQL );
			lobStmt.setInt( index++, dto.getEmpLeaveId() );
			ResultSet lobRs = lobStmt.executeQuery();
			int lobIndex = 1;
			if (lobRs.next()) {
				super.updateClob( lobRs.getClob(lobIndex++), dto.getEmpLeaveNote());
			}
		
			conn.commit();
			conn.setAutoCommit(oldAutoCommitValue);
			System.out.println( "Updated LOB" );
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpLeavesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the EMP_LEAVES table.
	 */
	public void delete(EmpLeavesPk pk) throws EmpLeavesDaoException
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
			stmt.setInt( 1, pk.getEmpLeaveId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new EmpLeavesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the EMP_LEAVES table that matches the specified primary-key value.
	 */
	public EmpLeaves findByPrimaryKey(EmpLeavesPk pk) throws EmpLeavesDaoException
	{
		return findByPrimaryKey( pk.getEmpLeaveId() );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMP_LEAVE_ID = :empLeaveId'.
	 */
	public EmpLeaves findByPrimaryKey(int empLeaveId) throws EmpLeavesDaoException
	{
		EmpLeaves ret[] = findByDynamicSelect( SQL_SELECT + " WHERE EMP_LEAVE_ID = ?", new Object[] {  new Integer(empLeaveId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria ''.
	 */
	public EmpLeaves[] findAll() throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY EMP_LEAVE_ID", null );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpLeaves[] findByEmployees(int employeeId) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ?", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'LEAVE_ID = :leaveId'.
	 */
	public EmpLeaves[] findByLeaves(int leaveId) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LEAVE_ID = ?", new Object[] {  new Integer(leaveId) } );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'PERMIT_SIDE_ID = :permitSideId'.
	 */
	public EmpLeaves[] findByPermitSide(int permitSideId) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PERMIT_SIDE_ID = ?", new Object[] {  new Integer(permitSideId) } );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMP_LEAVE_ID = :empLeaveId'.
	 */
	public EmpLeaves[] findWhereEmpLeaveIdEquals(int empLeaveId) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMP_LEAVE_ID = ? ORDER BY EMP_LEAVE_ID", new Object[] {  new Integer(empLeaveId) } );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public EmpLeaves[] findWhereEmployeeIdEquals(int employeeId) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ? ORDER BY EMPLOYEE_ID", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'LEAVE_ID = :leaveId'.
	 */
	public EmpLeaves[] findWhereLeaveIdEquals(int leaveId) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE LEAVE_ID = ? ORDER BY LEAVE_ID", new Object[] {  new Integer(leaveId) } );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'PERMIT_SIDE_ID = :permitSideId'.
	 */
	public EmpLeaves[] findWherePermitSideIdEquals(int permitSideId) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE PERMIT_SIDE_ID = ? ORDER BY PERMIT_SIDE_ID", new Object[] {  new Integer(permitSideId) } );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'DATE_TIME_FROM = :dateTimeFrom'.
	 */
	public EmpLeaves[] findWhereDateTimeFromEquals(Date dateTimeFrom) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DATE_TIME_FROM = ? ORDER BY DATE_TIME_FROM", new Object[] { dateTimeFrom==null ? null : new java.sql.Timestamp( dateTimeFrom.getTime() ) } );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'DATE_TIME_TO = :dateTimeTo'.
	 */
	public EmpLeaves[] findWhereDateTimeToEquals(Date dateTimeTo) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DATE_TIME_TO = ? ORDER BY DATE_TIME_TO", new Object[] { dateTimeTo==null ? null : new java.sql.Timestamp( dateTimeTo.getTime() ) } );
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the criteria 'EMP_LEAVE_NOTE = :empLeaveNote'.
	 */
	public EmpLeaves[] findWhereEmpLeaveNoteEquals(String empLeaveNote) throws EmpLeavesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMP_LEAVE_NOTE = ? ORDER BY EMP_LEAVE_NOTE", new Object[] { empLeaveNote } );
	}

	/**
	 * Method 'EmpLeavesDaoImpl'
	 * 
	 */
	public EmpLeavesDaoImpl()
	{
	}

	/**
	 * Method 'EmpLeavesDaoImpl'
	 * 
	 * @param userConn
	 */
	public EmpLeavesDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.EMP_LEAVES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected EmpLeaves fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			EmpLeaves dto = new EmpLeaves();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected EmpLeaves[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			EmpLeaves dto = new EmpLeaves();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		EmpLeaves ret[] = new EmpLeaves[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(EmpLeaves dto, ResultSet rs) throws SQLException
	{
		dto.setEmpLeaveId( rs.getInt( COLUMN_EMP_LEAVE_ID ) );
		dto.setEmployeeId( rs.getInt( COLUMN_EMPLOYEE_ID ) );
		dto.setLeaveId( rs.getInt( COLUMN_LEAVE_ID ) );
		dto.setPermitSideId( rs.getInt( COLUMN_PERMIT_SIDE_ID ) );
		dto.setDateTimeFrom( rs.getTimestamp(COLUMN_DATE_TIME_FROM ) );
		dto.setDateTimeTo( rs.getTimestamp(COLUMN_DATE_TIME_TO ) );
		dto.setEmpLeaveNote( super.getClobColumn(rs, COLUMN_EMP_LEAVE_NOTE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(EmpLeaves dto)
	{
	}

	/** 
	 * Returns all rows from the EMP_LEAVES table that match the specified arbitrary SQL statement
	 */
	public EmpLeaves[] findByDynamicSelect(String sql, Object[] sqlParams) throws EmpLeavesDaoException
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
			throw new EmpLeavesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the EMP_LEAVES table that match the specified arbitrary SQL statement
	 */
	public EmpLeaves[] findByDynamicWhere(String sql, Object[] sqlParams) throws EmpLeavesDaoException
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
			throw new EmpLeavesDaoException( "Exception: " + _e.getMessage(), _e );
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
