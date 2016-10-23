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

public class MissionTypesDaoImpl extends AbstractDAO implements MissionTypesDao
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
	protected final String SQL_SELECT = "SELECT MISSION_TYPE_ID, MISSION_TYPE_NAME FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( MISSION_TYPE_ID, MISSION_TYPE_NAME ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET MISSION_TYPE_ID = ?, MISSION_TYPE_NAME = ? WHERE MISSION_TYPE_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE MISSION_TYPE_ID = ?";

	/** 
	 * Index of column MISSION_TYPE_ID
	 */
	protected static final int COLUMN_MISSION_TYPE_ID = 1;

	/** 
	 * Index of column MISSION_TYPE_NAME
	 */
	protected static final int COLUMN_MISSION_TYPE_NAME = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column MISSION_TYPE_ID
	 */
	protected static final int PK_COLUMN_MISSION_TYPE_ID = 1;

	/** 
	 * Inserts a new row in the MISSION_TYPES table.
	 */
	public MissionTypesPk insert(MissionTypes dto) throws MissionTypesDaoException
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
			stmt.setInt( index++, dto.getMissionTypeId() );
			stmt.setString( index++, dto.getMissionTypeName() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MissionTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the MISSION_TYPES table.
	 */
	public void update(MissionTypesPk pk, MissionTypes dto) throws MissionTypesDaoException
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
			stmt.setInt( index++, dto.getMissionTypeId() );
			stmt.setString( index++, dto.getMissionTypeName() );
			stmt.setInt( 3, pk.getMissionTypeId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MissionTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the MISSION_TYPES table.
	 */
	public void delete(MissionTypesPk pk) throws MissionTypesDaoException
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
			stmt.setInt( 1, pk.getMissionTypeId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new MissionTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the MISSION_TYPES table that matches the specified primary-key value.
	 */
	public MissionTypes findByPrimaryKey(MissionTypesPk pk) throws MissionTypesDaoException
	{
		return findByPrimaryKey( pk.getMissionTypeId() );
	}

	/** 
	 * Returns all rows from the MISSION_TYPES table that match the criteria 'MISSION_TYPE_ID = :missionTypeId'.
	 */
	public MissionTypes findByPrimaryKey(int missionTypeId) throws MissionTypesDaoException
	{
		MissionTypes ret[] = findByDynamicSelect( SQL_SELECT + " WHERE MISSION_TYPE_ID = ?", new Object[] {  new Integer(missionTypeId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the MISSION_TYPES table that match the criteria ''.
	 */
	public MissionTypes[] findAll() throws MissionTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY MISSION_TYPE_ID", null );
	}

	/** 
	 * Returns all rows from the MISSION_TYPES table that match the criteria 'MISSION_TYPE_ID = :missionTypeId'.
	 */
	public MissionTypes[] findWhereMissionTypeIdEquals(int missionTypeId) throws MissionTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MISSION_TYPE_ID = ? ORDER BY MISSION_TYPE_ID", new Object[] {  new Integer(missionTypeId) } );
	}

	/** 
	 * Returns all rows from the MISSION_TYPES table that match the criteria 'MISSION_TYPE_NAME = :missionTypeName'.
	 */
	public MissionTypes[] findWhereMissionTypeNameEquals(String missionTypeName) throws MissionTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE MISSION_TYPE_NAME = ? ORDER BY MISSION_TYPE_NAME", new Object[] { missionTypeName } );
	}

	/**
	 * Method 'MissionTypesDaoImpl'
	 * 
	 */
	public MissionTypesDaoImpl()
	{
	}

	/**
	 * Method 'MissionTypesDaoImpl'
	 * 
	 * @param userConn
	 */
	public MissionTypesDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.MISSION_TYPES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected MissionTypes fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			MissionTypes dto = new MissionTypes();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected MissionTypes[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			MissionTypes dto = new MissionTypes();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		MissionTypes ret[] = new MissionTypes[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(MissionTypes dto, ResultSet rs) throws SQLException
	{
		dto.setMissionTypeId( rs.getInt( COLUMN_MISSION_TYPE_ID ) );
		dto.setMissionTypeName( rs.getString( COLUMN_MISSION_TYPE_NAME ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(MissionTypes dto)
	{
	}

	/** 
	 * Returns all rows from the MISSION_TYPES table that match the specified arbitrary SQL statement
	 */
	public MissionTypes[] findByDynamicSelect(String sql, Object[] sqlParams) throws MissionTypesDaoException
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
			throw new MissionTypesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the MISSION_TYPES table that match the specified arbitrary SQL statement
	 */
	public MissionTypes[] findByDynamicWhere(String sql, Object[] sqlParams) throws MissionTypesDaoException
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
			throw new MissionTypesDaoException( "Exception: " + _e.getMessage(), _e );
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
