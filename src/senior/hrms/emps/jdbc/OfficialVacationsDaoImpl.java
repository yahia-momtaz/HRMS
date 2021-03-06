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

public class OfficialVacationsDaoImpl extends AbstractDAO implements OfficialVacationsDao
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
	protected final String SQL_SELECT = "SELECT OFFICIAL_VACATION_ID, OFFICIAL_VACATION_NAME, DESCRIPTION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( OFFICIAL_VACATION_ID, OFFICIAL_VACATION_NAME, DESCRIPTION ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET OFFICIAL_VACATION_ID = ?, OFFICIAL_VACATION_NAME = ?, DESCRIPTION = ? WHERE OFFICIAL_VACATION_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE OFFICIAL_VACATION_ID = ?";

	/** 
	 * Index of column OFFICIAL_VACATION_ID
	 */
	protected static final int COLUMN_OFFICIAL_VACATION_ID = 1;

	/** 
	 * Index of column OFFICIAL_VACATION_NAME
	 */
	protected static final int COLUMN_OFFICIAL_VACATION_NAME = 2;

	/** 
	 * Index of column DESCRIPTION
	 */
	protected static final int COLUMN_DESCRIPTION = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column OFFICIAL_VACATION_ID
	 */
	protected static final int PK_COLUMN_OFFICIAL_VACATION_ID = 1;

	/** 
	 * Inserts a new row in the OFFICIAL_VACATIONS table.
	 */
	public OfficialVacationsPk insert(OfficialVacations dto) throws OfficialVacationsDaoException
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
			stmt.setInt( index++, dto.getOfficialVacationId() );
			stmt.setString( index++, dto.getOfficialVacationName() );
			stmt.setString( index++, dto.getDescription() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new OfficialVacationsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the OFFICIAL_VACATIONS table.
	 */
	public void update(OfficialVacationsPk pk, OfficialVacations dto) throws OfficialVacationsDaoException
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
			stmt.setInt( index++, dto.getOfficialVacationId() );
			stmt.setString( index++, dto.getOfficialVacationName() );
			stmt.setString( index++, dto.getDescription() );
			stmt.setInt( 4, pk.getOfficialVacationId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new OfficialVacationsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the OFFICIAL_VACATIONS table.
	 */
	public void delete(OfficialVacationsPk pk) throws OfficialVacationsDaoException
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
			stmt.setInt( 1, pk.getOfficialVacationId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new OfficialVacationsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the OFFICIAL_VACATIONS table that matches the specified primary-key value.
	 */
	public OfficialVacations findByPrimaryKey(OfficialVacationsPk pk) throws OfficialVacationsDaoException
	{
		return findByPrimaryKey( pk.getOfficialVacationId() );
	}

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS table that match the criteria 'OFFICIAL_VACATION_ID = :officialVacationId'.
	 */
	public OfficialVacations findByPrimaryKey(int officialVacationId) throws OfficialVacationsDaoException
	{
		OfficialVacations ret[] = findByDynamicSelect( SQL_SELECT + " WHERE OFFICIAL_VACATION_ID = ?", new Object[] {  new Integer(officialVacationId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS table that match the criteria ''.
	 */
	public OfficialVacations[] findAll() throws OfficialVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY OFFICIAL_VACATION_ID", null );
	}

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS table that match the criteria 'OFFICIAL_VACATION_ID = :officialVacationId'.
	 */
	public OfficialVacations[] findWhereOfficialVacationIdEquals(int officialVacationId) throws OfficialVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OFFICIAL_VACATION_ID = ? ORDER BY OFFICIAL_VACATION_ID", new Object[] {  new Integer(officialVacationId) } );
	}

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS table that match the criteria 'OFFICIAL_VACATION_NAME = :officialVacationName'.
	 */
	public OfficialVacations[] findWhereOfficialVacationNameEquals(String officialVacationName) throws OfficialVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE OFFICIAL_VACATION_NAME = ? ORDER BY OFFICIAL_VACATION_NAME", new Object[] { officialVacationName } );
	}

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS table that match the criteria 'DESCRIPTION = :description'.
	 */
	public OfficialVacations[] findWhereDescriptionEquals(String description) throws OfficialVacationsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DESCRIPTION = ? ORDER BY DESCRIPTION", new Object[] { description } );
	}

	/**
	 * Method 'OfficialVacationsDaoImpl'
	 * 
	 */
	public OfficialVacationsDaoImpl()
	{
	}

	/**
	 * Method 'OfficialVacationsDaoImpl'
	 * 
	 * @param userConn
	 */
	public OfficialVacationsDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.OFFICIAL_VACATIONS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected OfficialVacations fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			OfficialVacations dto = new OfficialVacations();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected OfficialVacations[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			OfficialVacations dto = new OfficialVacations();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		OfficialVacations ret[] = new OfficialVacations[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(OfficialVacations dto, ResultSet rs) throws SQLException
	{
		dto.setOfficialVacationId( rs.getInt( COLUMN_OFFICIAL_VACATION_ID ) );
		dto.setOfficialVacationName( rs.getString( COLUMN_OFFICIAL_VACATION_NAME ) );
		dto.setDescription( rs.getString( COLUMN_DESCRIPTION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(OfficialVacations dto)
	{
	}

	/** 
	 * Returns all rows from the OFFICIAL_VACATIONS table that match the specified arbitrary SQL statement
	 */
	public OfficialVacations[] findByDynamicSelect(String sql, Object[] sqlParams) throws OfficialVacationsDaoException
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
			throw new OfficialVacationsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the OFFICIAL_VACATIONS table that match the specified arbitrary SQL statement
	 */
	public OfficialVacations[] findByDynamicWhere(String sql, Object[] sqlParams) throws OfficialVacationsDaoException
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
			throw new OfficialVacationsDaoException( "Exception: " + _e.getMessage(), _e );
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
