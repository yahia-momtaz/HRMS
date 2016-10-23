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

public class AccidentReasonsDaoImpl extends AbstractDAO implements AccidentReasonsDao
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
	protected final String SQL_SELECT = "SELECT ACCIDENT_REASON_ID, ACCIDENT_REASON FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ACCIDENT_REASON_ID, ACCIDENT_REASON ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ACCIDENT_REASON_ID = ?, ACCIDENT_REASON = ? WHERE ACCIDENT_REASON_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ACCIDENT_REASON_ID = ?";

	/** 
	 * Index of column ACCIDENT_REASON_ID
	 */
	protected static final int COLUMN_ACCIDENT_REASON_ID = 1;

	/** 
	 * Index of column ACCIDENT_REASON
	 */
	protected static final int COLUMN_ACCIDENT_REASON = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column ACCIDENT_REASON_ID
	 */
	protected static final int PK_COLUMN_ACCIDENT_REASON_ID = 1;

	/** 
	 * Inserts a new row in the ACCIDENT_REASONS table.
	 */
	public AccidentReasonsPk insert(AccidentReasons dto) throws AccidentReasonsDaoException
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
			stmt.setInt( index++, dto.getAccidentReasonId() );
			stmt.setString( index++, dto.getAccidentReason() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccidentReasonsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ACCIDENT_REASONS table.
	 */
	public void update(AccidentReasonsPk pk, AccidentReasons dto) throws AccidentReasonsDaoException
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
			stmt.setInt( index++, dto.getAccidentReasonId() );
			stmt.setString( index++, dto.getAccidentReason() );
			stmt.setInt( 3, pk.getAccidentReasonId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccidentReasonsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ACCIDENT_REASONS table.
	 */
	public void delete(AccidentReasonsPk pk) throws AccidentReasonsDaoException
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
			stmt.setInt( 1, pk.getAccidentReasonId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccidentReasonsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ACCIDENT_REASONS table that matches the specified primary-key value.
	 */
	public AccidentReasons findByPrimaryKey(AccidentReasonsPk pk) throws AccidentReasonsDaoException
	{
		return findByPrimaryKey( pk.getAccidentReasonId() );
	}

	/** 
	 * Returns all rows from the ACCIDENT_REASONS table that match the criteria 'ACCIDENT_REASON_ID = :accidentReasonId'.
	 */
	public AccidentReasons findByPrimaryKey(int accidentReasonId) throws AccidentReasonsDaoException
	{
		AccidentReasons ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ACCIDENT_REASON_ID = ?", new Object[] {  new Integer(accidentReasonId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ACCIDENT_REASONS table that match the criteria ''.
	 */
	public AccidentReasons[] findAll() throws AccidentReasonsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ACCIDENT_REASON_ID", null );
	}

	/** 
	 * Returns all rows from the ACCIDENT_REASONS table that match the criteria 'ACCIDENT_REASON_ID = :accidentReasonId'.
	 */
	public AccidentReasons[] findWhereAccidentReasonIdEquals(int accidentReasonId) throws AccidentReasonsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ACCIDENT_REASON_ID = ? ORDER BY ACCIDENT_REASON_ID", new Object[] {  new Integer(accidentReasonId) } );
	}

	/** 
	 * Returns all rows from the ACCIDENT_REASONS table that match the criteria 'ACCIDENT_REASON = :accidentReason'.
	 */
	public AccidentReasons[] findWhereAccidentReasonEquals(String accidentReason) throws AccidentReasonsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ACCIDENT_REASON = ? ORDER BY ACCIDENT_REASON", new Object[] { accidentReason } );
	}

	/**
	 * Method 'AccidentReasonsDaoImpl'
	 * 
	 */
	public AccidentReasonsDaoImpl()
	{
	}

	/**
	 * Method 'AccidentReasonsDaoImpl'
	 * 
	 * @param userConn
	 */
	public AccidentReasonsDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.ACCIDENT_REASONS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected AccidentReasons fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			AccidentReasons dto = new AccidentReasons();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected AccidentReasons[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			AccidentReasons dto = new AccidentReasons();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		AccidentReasons ret[] = new AccidentReasons[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(AccidentReasons dto, ResultSet rs) throws SQLException
	{
		dto.setAccidentReasonId( rs.getInt( COLUMN_ACCIDENT_REASON_ID ) );
		dto.setAccidentReason( rs.getString( COLUMN_ACCIDENT_REASON ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(AccidentReasons dto)
	{
	}

	/** 
	 * Returns all rows from the ACCIDENT_REASONS table that match the specified arbitrary SQL statement
	 */
	public AccidentReasons[] findByDynamicSelect(String sql, Object[] sqlParams) throws AccidentReasonsDaoException
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
			throw new AccidentReasonsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ACCIDENT_REASONS table that match the specified arbitrary SQL statement
	 */
	public AccidentReasons[] findByDynamicWhere(String sql, Object[] sqlParams) throws AccidentReasonsDaoException
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
			throw new AccidentReasonsDaoException( "Exception: " + _e.getMessage(), _e );
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
