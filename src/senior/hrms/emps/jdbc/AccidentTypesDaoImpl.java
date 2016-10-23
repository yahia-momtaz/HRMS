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

public class AccidentTypesDaoImpl extends AbstractDAO implements AccidentTypesDao
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
	protected final String SQL_SELECT = "SELECT ACCIDENT_TYPE_ID, ACCIDENT_TYPE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ACCIDENT_TYPE_ID, ACCIDENT_TYPE ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ACCIDENT_TYPE_ID = ?, ACCIDENT_TYPE = ? WHERE ACCIDENT_TYPE_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ACCIDENT_TYPE_ID = ?";

	/** 
	 * Index of column ACCIDENT_TYPE_ID
	 */
	protected static final int COLUMN_ACCIDENT_TYPE_ID = 1;

	/** 
	 * Index of column ACCIDENT_TYPE
	 */
	protected static final int COLUMN_ACCIDENT_TYPE = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column ACCIDENT_TYPE_ID
	 */
	protected static final int PK_COLUMN_ACCIDENT_TYPE_ID = 1;

	/** 
	 * Inserts a new row in the ACCIDENT_TYPES table.
	 */
	public AccidentTypesPk insert(AccidentTypes dto) throws AccidentTypesDaoException
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
			stmt.setInt( index++, dto.getAccidentTypeId() );
			stmt.setString( index++, dto.getAccidentType() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccidentTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ACCIDENT_TYPES table.
	 */
	public void update(AccidentTypesPk pk, AccidentTypes dto) throws AccidentTypesDaoException
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
			stmt.setInt( index++, dto.getAccidentTypeId() );
			stmt.setString( index++, dto.getAccidentType() );
			stmt.setInt( 3, pk.getAccidentTypeId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccidentTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ACCIDENT_TYPES table.
	 */
	public void delete(AccidentTypesPk pk) throws AccidentTypesDaoException
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
			stmt.setInt( 1, pk.getAccidentTypeId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new AccidentTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ACCIDENT_TYPES table that matches the specified primary-key value.
	 */
	public AccidentTypes findByPrimaryKey(AccidentTypesPk pk) throws AccidentTypesDaoException
	{
		return findByPrimaryKey( pk.getAccidentTypeId() );
	}

	/** 
	 * Returns all rows from the ACCIDENT_TYPES table that match the criteria 'ACCIDENT_TYPE_ID = :accidentTypeId'.
	 */
	public AccidentTypes findByPrimaryKey(int accidentTypeId) throws AccidentTypesDaoException
	{
		AccidentTypes ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ACCIDENT_TYPE_ID = ?", new Object[] {  new Integer(accidentTypeId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ACCIDENT_TYPES table that match the criteria ''.
	 */
	public AccidentTypes[] findAll() throws AccidentTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ACCIDENT_TYPE_ID", null );
	}

	/** 
	 * Returns all rows from the ACCIDENT_TYPES table that match the criteria 'ACCIDENT_TYPE_ID = :accidentTypeId'.
	 */
	public AccidentTypes[] findWhereAccidentTypeIdEquals(int accidentTypeId) throws AccidentTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ACCIDENT_TYPE_ID = ? ORDER BY ACCIDENT_TYPE_ID", new Object[] {  new Integer(accidentTypeId) } );
	}

	/** 
	 * Returns all rows from the ACCIDENT_TYPES table that match the criteria 'ACCIDENT_TYPE = :accidentType'.
	 */
	public AccidentTypes[] findWhereAccidentTypeEquals(String accidentType) throws AccidentTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ACCIDENT_TYPE = ? ORDER BY ACCIDENT_TYPE", new Object[] { accidentType } );
	}

	/**
	 * Method 'AccidentTypesDaoImpl'
	 * 
	 */
	public AccidentTypesDaoImpl()
	{
	}

	/**
	 * Method 'AccidentTypesDaoImpl'
	 * 
	 * @param userConn
	 */
	public AccidentTypesDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.ACCIDENT_TYPES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected AccidentTypes fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			AccidentTypes dto = new AccidentTypes();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected AccidentTypes[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			AccidentTypes dto = new AccidentTypes();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		AccidentTypes ret[] = new AccidentTypes[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(AccidentTypes dto, ResultSet rs) throws SQLException
	{
		dto.setAccidentTypeId( rs.getInt( COLUMN_ACCIDENT_TYPE_ID ) );
		dto.setAccidentType( rs.getString( COLUMN_ACCIDENT_TYPE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(AccidentTypes dto)
	{
	}

	/** 
	 * Returns all rows from the ACCIDENT_TYPES table that match the specified arbitrary SQL statement
	 */
	public AccidentTypes[] findByDynamicSelect(String sql, Object[] sqlParams) throws AccidentTypesDaoException
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
			throw new AccidentTypesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ACCIDENT_TYPES table that match the specified arbitrary SQL statement
	 */
	public AccidentTypes[] findByDynamicWhere(String sql, Object[] sqlParams) throws AccidentTypesDaoException
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
			throw new AccidentTypesDaoException( "Exception: " + _e.getMessage(), _e );
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
