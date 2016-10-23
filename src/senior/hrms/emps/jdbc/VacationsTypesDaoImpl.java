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

public class VacationsTypesDaoImpl extends AbstractDAO implements VacationsTypesDao
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
	protected final String SQL_SELECT = "SELECT VACATION_TYPE_ID, VACATION_TYPE_NAME, VALUE_PERCENTAGE, NOTE FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( VACATION_TYPE_ID, VACATION_TYPE_NAME, VALUE_PERCENTAGE, NOTE ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET VACATION_TYPE_ID = ?, VACATION_TYPE_NAME = ?, VALUE_PERCENTAGE = ?, NOTE = ? WHERE VACATION_TYPE_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE VACATION_TYPE_ID = ?";

	/** 
	 * Index of column VACATION_TYPE_ID
	 */
	protected static final int COLUMN_VACATION_TYPE_ID = 1;

	/** 
	 * Index of column VACATION_TYPE_NAME
	 */
	protected static final int COLUMN_VACATION_TYPE_NAME = 2;

	/** 
	 * Index of column VALUE_PERCENTAGE
	 */
	protected static final int COLUMN_VALUE_PERCENTAGE = 3;

	/** 
	 * Index of column NOTE
	 */
	protected static final int COLUMN_NOTE = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column VACATION_TYPE_ID
	 */
	protected static final int PK_COLUMN_VACATION_TYPE_ID = 1;

	/** 
	 * Inserts a new row in the VACATIONS_TYPES table.
	 */
	public VacationsTypesPk insert(VacationsTypes dto) throws VacationsTypesDaoException
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
			stmt.setInt( index++, dto.getVacationTypeId() );
			stmt.setString( index++, dto.getVacationTypeName() );
			if (dto.isValuePercentageNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getValuePercentage() );
			}
		
			stmt.setString( index++, dto.getNote() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new VacationsTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the VACATIONS_TYPES table.
	 */
	public void update(VacationsTypesPk pk, VacationsTypes dto) throws VacationsTypesDaoException
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
			stmt.setInt( index++, dto.getVacationTypeId() );
			stmt.setString( index++, dto.getVacationTypeName() );
			if (dto.isValuePercentageNull()) {
				stmt.setNull( index++, java.sql.Types.INTEGER );
			} else {
				stmt.setInt( index++, dto.getValuePercentage() );
			}
		
			stmt.setString( index++, dto.getNote() );
			stmt.setInt( 5, pk.getVacationTypeId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new VacationsTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the VACATIONS_TYPES table.
	 */
	public void delete(VacationsTypesPk pk) throws VacationsTypesDaoException
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
			stmt.setInt( 1, pk.getVacationTypeId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new VacationsTypesDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the VACATIONS_TYPES table that matches the specified primary-key value.
	 */
	public VacationsTypes findByPrimaryKey(VacationsTypesPk pk) throws VacationsTypesDaoException
	{
		return findByPrimaryKey( pk.getVacationTypeId() );
	}

	/** 
	 * Returns all rows from the VACATIONS_TYPES table that match the criteria 'VACATION_TYPE_ID = :vacationTypeId'.
	 */
	public VacationsTypes findByPrimaryKey(int vacationTypeId) throws VacationsTypesDaoException
	{
		VacationsTypes ret[] = findByDynamicSelect( SQL_SELECT + " WHERE VACATION_TYPE_ID = ?", new Object[] {  new Integer(vacationTypeId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the VACATIONS_TYPES table that match the criteria ''.
	 */
	public VacationsTypes[] findAll() throws VacationsTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY VACATION_TYPE_ID", null );
	}

	/** 
	 * Returns all rows from the VACATIONS_TYPES table that match the criteria 'VACATION_TYPE_ID = :vacationTypeId'.
	 */
	public VacationsTypes[] findWhereVacationTypeIdEquals(int vacationTypeId) throws VacationsTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VACATION_TYPE_ID = ? ORDER BY VACATION_TYPE_ID", new Object[] {  new Integer(vacationTypeId) } );
	}

	/** 
	 * Returns all rows from the VACATIONS_TYPES table that match the criteria 'VACATION_TYPE_NAME = :vacationTypeName'.
	 */
	public VacationsTypes[] findWhereVacationTypeNameEquals(String vacationTypeName) throws VacationsTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VACATION_TYPE_NAME = ? ORDER BY VACATION_TYPE_NAME", new Object[] { vacationTypeName } );
	}

	/** 
	 * Returns all rows from the VACATIONS_TYPES table that match the criteria 'VALUE_PERCENTAGE = :valuePercentage'.
	 */
	public VacationsTypes[] findWhereValuePercentageEquals(int valuePercentage) throws VacationsTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE VALUE_PERCENTAGE = ? ORDER BY VALUE_PERCENTAGE", new Object[] {  new Integer(valuePercentage) } );
	}

	/** 
	 * Returns all rows from the VACATIONS_TYPES table that match the criteria 'NOTE = :note'.
	 */
	public VacationsTypes[] findWhereNoteEquals(String note) throws VacationsTypesDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE NOTE = ? ORDER BY NOTE", new Object[] { note } );
	}

	/**
	 * Method 'VacationsTypesDaoImpl'
	 * 
	 */
	public VacationsTypesDaoImpl()
	{
	}

	/**
	 * Method 'VacationsTypesDaoImpl'
	 * 
	 * @param userConn
	 */
	public VacationsTypesDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.VACATIONS_TYPES";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected VacationsTypes fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			VacationsTypes dto = new VacationsTypes();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected VacationsTypes[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			VacationsTypes dto = new VacationsTypes();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		VacationsTypes ret[] = new VacationsTypes[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(VacationsTypes dto, ResultSet rs) throws SQLException
	{
		dto.setVacationTypeId( rs.getInt( COLUMN_VACATION_TYPE_ID ) );
		dto.setVacationTypeName( rs.getString( COLUMN_VACATION_TYPE_NAME ) );
		dto.setValuePercentage( rs.getInt( COLUMN_VALUE_PERCENTAGE ) );
		if (rs.wasNull()) {
			dto.setValuePercentageNull( true );
		}
		
		dto.setNote( rs.getString( COLUMN_NOTE ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(VacationsTypes dto)
	{
	}

	/** 
	 * Returns all rows from the VACATIONS_TYPES table that match the specified arbitrary SQL statement
	 */
	public VacationsTypes[] findByDynamicSelect(String sql, Object[] sqlParams) throws VacationsTypesDaoException
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
			throw new VacationsTypesDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the VACATIONS_TYPES table that match the specified arbitrary SQL statement
	 */
	public VacationsTypes[] findByDynamicWhere(String sql, Object[] sqlParams) throws VacationsTypesDaoException
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
			throw new VacationsTypesDaoException( "Exception: " + _e.getMessage(), _e );
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
