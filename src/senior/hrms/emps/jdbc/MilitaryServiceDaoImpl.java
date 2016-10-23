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

public class MilitaryServiceDaoImpl extends AbstractDAO implements MilitaryServiceDao
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
	protected final String SQL_SELECT = "SELECT MILITARY_SERVICE_ID, EMPLOYEE_ID, DATE_FROM, DATE_TO, RETURN_DATE, MILITARY_REPORT_IMAGE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( MILITARY_SERVICE_ID, EMPLOYEE_ID, DATE_FROM, DATE_TO, RETURN_DATE, MILITARY_REPORT_IMAGE ) VALUES ( ?, ?, ?, ?, ?, EMPTY_BLOB() )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET MILITARY_SERVICE_ID = ?, EMPLOYEE_ID = ?, DATE_FROM = ?, DATE_TO = ?, RETURN_DATE = ?, MILITARY_REPORT_IMAGE = EMPTY_BLOB() WHERE MILITARY_SERVICE_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE MILITARY_SERVICE_ID = ?";

	/** 
	 * Index of column MILITARY_SERVICE_ID
	 */
	protected static final int COLUMN_MILITARY_SERVICE_ID = 1;

	/** 
	 * Index of column EMPLOYEE_ID
	 */
	protected static final int COLUMN_EMPLOYEE_ID = 2;

	/** 
	 * Index of column DATE_FROM
	 */
	protected static final int COLUMN_DATE_FROM = 3;

	/** 
	 * Index of column DATE_TO
	 */
	protected static final int COLUMN_DATE_TO = 4;

	/** 
	 * Index of column RETURN_DATE
	 */
	protected static final int COLUMN_RETURN_DATE = 5;

	/** 
	 * Index of column MILITARY_REPORT_IMAGE
	 */
	protected static final int COLUMN_MILITARY_REPORT_IMAGE = 6;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 6;

	/** 
	 * Index of primary-key column MILITARY_SERVICE_ID
	 */
	protected static final int PK_COLUMN_MILITARY_SERVICE_ID = 1;

	/** 
	 * Inserts a new row in the MILITARY_SERVICE table.
	 */
	public MilitaryServicePk insert(MilitaryService dto) throws MilitaryServiceDaoException
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
			stmt.setInt( index++, dto.getMilitaryServiceId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setTimestamp(index++, dto.getDateFrom()==null ? null : new java.sql.Timestamp( dto.getDateFrom().getTime() ) );
			stmt.setTimestamp(index++, dto.getDateTo()==null ? null : new java.sql.Timestamp( dto.getDateTo().getTime() ) );
			stmt.setTimestamp(index++, dto.getReturnDate()==null ? null : new java.sql.Timestamp( dto.getReturnDate().getTime() ) );
			// no need to bind value for LOB column
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MilitaryServiceDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the MILITARY_SERVICE table.
	 */
	public void update(MilitaryServicePk pk, MilitaryService dto) throws MilitaryServiceDaoException
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
			stmt.setInt( index++, dto.getMilitaryServiceId() );
			stmt.setInt( index++, dto.getEmployeeId() );
			stmt.setTimestamp(index++, dto.getDateFrom()==null ? null : new java.sql.Timestamp( dto.getDateFrom().getTime() ) );
			stmt.setTimestamp(index++, dto.getDateTo()==null ? null : new java.sql.Timestamp( dto.getDateTo().getTime() ) );
			stmt.setTimestamp(index++, dto.getReturnDate()==null ? null : new java.sql.Timestamp( dto.getReturnDate().getTime() ) );
			// no need to bind value for LOB column
			stmt.setInt( 6, pk.getMilitaryServiceId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MilitaryServiceDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the MILITARY_SERVICE table.
	 */
	public void delete(MilitaryServicePk pk) throws MilitaryServiceDaoException
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
			stmt.setInt( 1, pk.getMilitaryServiceId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MilitaryServiceDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the MILITARY_SERVICE table that matches the specified primary-key value.
	 */
	public MilitaryService findByPrimaryKey(MilitaryServicePk pk) throws MilitaryServiceDaoException
	{
		return findByPrimaryKey( pk.getMilitaryServiceId() );
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the criteria 'MILITARY_SERVICE_ID = :militaryServiceId'.
	 */
	public MilitaryService findByPrimaryKey(int militaryServiceId) throws MilitaryServiceDaoException
	{
		MilitaryService ret[] = findByDynamicSelect( SQL_SELECT + " WHERE MILITARY_SERVICE_ID = ?", new Object[] {  new Integer(militaryServiceId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the criteria ''.
	 */
	public MilitaryService[] findAll() throws MilitaryServiceDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY MILITARY_SERVICE_ID", null );
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public MilitaryService[] findByEmployees(int employeeId) throws MilitaryServiceDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ?", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the criteria 'MILITARY_SERVICE_ID = :militaryServiceId'.
	 */
	public MilitaryService[] findWhereMilitaryServiceIdEquals(int militaryServiceId) throws MilitaryServiceDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MILITARY_SERVICE_ID = ? ORDER BY MILITARY_SERVICE_ID", new Object[] {  new Integer(militaryServiceId) } );
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the criteria 'EMPLOYEE_ID = :employeeId'.
	 */
	public MilitaryService[] findWhereEmployeeIdEquals(int employeeId) throws MilitaryServiceDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE EMPLOYEE_ID = ? ORDER BY EMPLOYEE_ID", new Object[] {  new Integer(employeeId) } );
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the criteria 'DATE_FROM = :dateFrom'.
	 */
	public MilitaryService[] findWhereDateFromEquals(Date dateFrom) throws MilitaryServiceDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DATE_FROM = ? ORDER BY DATE_FROM", new Object[] { dateFrom==null ? null : new java.sql.Timestamp( dateFrom.getTime() ) } );
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the criteria 'DATE_TO = :dateTo'.
	 */
	public MilitaryService[] findWhereDateToEquals(Date dateTo) throws MilitaryServiceDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DATE_TO = ? ORDER BY DATE_TO", new Object[] { dateTo==null ? null : new java.sql.Timestamp( dateTo.getTime() ) } );
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the criteria 'RETURN_DATE = :returnDate'.
	 */
	public MilitaryService[] findWhereReturnDateEquals(Date returnDate) throws MilitaryServiceDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE RETURN_DATE = ? ORDER BY RETURN_DATE", new Object[] { returnDate==null ? null : new java.sql.Timestamp( returnDate.getTime() ) } );
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the criteria 'MILITARY_REPORT_IMAGE = :militaryReportImage'.
	 */
	public MilitaryService[] findWhereMilitaryReportImageEquals(byte[] militaryReportImage) throws MilitaryServiceDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MILITARY_REPORT_IMAGE = ? ORDER BY MILITARY_REPORT_IMAGE", new Object[] { militaryReportImage } );
	}

	/**
	 * Method 'MilitaryServiceDaoImpl'
	 * 
	 */
	public MilitaryServiceDaoImpl()
	{
	}

	/**
	 * Method 'MilitaryServiceDaoImpl'
	 * 
	 * @param userConn
	 */
	public MilitaryServiceDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.MILITARY_SERVICE";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected MilitaryService fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			MilitaryService dto = new MilitaryService();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected MilitaryService[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			MilitaryService dto = new MilitaryService();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		MilitaryService ret[] = new MilitaryService[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(MilitaryService dto, ResultSet rs) throws SQLException
	{
		dto.setMilitaryServiceId( rs.getInt( COLUMN_MILITARY_SERVICE_ID ) );
		dto.setEmployeeId( rs.getInt( COLUMN_EMPLOYEE_ID ) );
		dto.setDateFrom( rs.getTimestamp(COLUMN_DATE_FROM ) );
		dto.setDateTo( rs.getTimestamp(COLUMN_DATE_TO ) );
		dto.setReturnDate( rs.getTimestamp(COLUMN_RETURN_DATE ) );
		dto.setMilitaryReportImage( super.getBlobColumn(rs, COLUMN_MILITARY_REPORT_IMAGE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(MilitaryService dto)
	{
	}

	/** 
	 * Returns all rows from the MILITARY_SERVICE table that match the specified arbitrary SQL statement
	 */
	public MilitaryService[] findByDynamicSelect(String sql, Object[] sqlParams) throws MilitaryServiceDaoException
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
			throw new MilitaryServiceDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the MILITARY_SERVICE table that match the specified arbitrary SQL statement
	 */
	public MilitaryService[] findByDynamicWhere(String sql, Object[] sqlParams) throws MilitaryServiceDaoException
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
			throw new MilitaryServiceDaoException( "Exception: " + _e.getMessage(), _e );
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