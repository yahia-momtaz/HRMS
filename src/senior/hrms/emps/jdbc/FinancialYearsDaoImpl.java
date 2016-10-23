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

public class FinancialYearsDaoImpl extends AbstractDAO implements FinancialYearsDao
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
	protected final String SQL_SELECT = "SELECT FINANCIAL_YEAR_ID, FINANCIAL_YEAR_TITLE, DATE_FROM, DATE_TO FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( FINANCIAL_YEAR_ID, FINANCIAL_YEAR_TITLE, DATE_FROM, DATE_TO ) VALUES ( ?, ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET FINANCIAL_YEAR_ID = ?, FINANCIAL_YEAR_TITLE = ?, DATE_FROM = ?, DATE_TO = ? WHERE FINANCIAL_YEAR_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE FINANCIAL_YEAR_ID = ?";

	/** 
	 * Index of column FINANCIAL_YEAR_ID
	 */
	protected static final int COLUMN_FINANCIAL_YEAR_ID = 1;

	/** 
	 * Index of column FINANCIAL_YEAR_TITLE
	 */
	protected static final int COLUMN_FINANCIAL_YEAR_TITLE = 2;

	/** 
	 * Index of column DATE_FROM
	 */
	protected static final int COLUMN_DATE_FROM = 3;

	/** 
	 * Index of column DATE_TO
	 */
	protected static final int COLUMN_DATE_TO = 4;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 4;

	/** 
	 * Index of primary-key column FINANCIAL_YEAR_ID
	 */
	protected static final int PK_COLUMN_FINANCIAL_YEAR_ID = 1;

	/** 
	 * Inserts a new row in the FINANCIAL_YEARS table.
	 */
	public FinancialYearsPk insert(FinancialYears dto) throws FinancialYearsDaoException
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
			stmt.setInt( index++, dto.getFinancialYearId() );
			stmt.setString( index++, dto.getFinancialYearTitle() );
			stmt.setTimestamp(index++, dto.getDateFrom()==null ? null : new java.sql.Timestamp( dto.getDateFrom().getTime() ) );
			stmt.setTimestamp(index++, dto.getDateTo()==null ? null : new java.sql.Timestamp( dto.getDateTo().getTime() ) );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FinancialYearsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the FINANCIAL_YEARS table.
	 */
	public void update(FinancialYearsPk pk, FinancialYears dto) throws FinancialYearsDaoException
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
			stmt.setInt( index++, dto.getFinancialYearId() );
			stmt.setString( index++, dto.getFinancialYearTitle() );
			stmt.setTimestamp(index++, dto.getDateFrom()==null ? null : new java.sql.Timestamp( dto.getDateFrom().getTime() ) );
			stmt.setTimestamp(index++, dto.getDateTo()==null ? null : new java.sql.Timestamp( dto.getDateTo().getTime() ) );
			stmt.setInt( 5, pk.getFinancialYearId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FinancialYearsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the FINANCIAL_YEARS table.
	 */
	public void delete(FinancialYearsPk pk) throws FinancialYearsDaoException
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
			stmt.setInt( 1, pk.getFinancialYearId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new FinancialYearsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the FINANCIAL_YEARS table that matches the specified primary-key value.
	 */
	public FinancialYears findByPrimaryKey(FinancialYearsPk pk) throws FinancialYearsDaoException
	{
		return findByPrimaryKey( pk.getFinancialYearId() );
	}

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public FinancialYears findByPrimaryKey(int financialYearId) throws FinancialYearsDaoException
	{
		FinancialYears ret[] = findByDynamicSelect( SQL_SELECT + " WHERE FINANCIAL_YEAR_ID = ?", new Object[] {  new Integer(financialYearId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria ''.
	 */
	public FinancialYears[] findAll() throws FinancialYearsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY FINANCIAL_YEAR_ID", null );
	}

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'FINANCIAL_YEAR_ID = :financialYearId'.
	 */
	public FinancialYears[] findWhereFinancialYearIdEquals(int financialYearId) throws FinancialYearsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FINANCIAL_YEAR_ID = ? ORDER BY FINANCIAL_YEAR_ID", new Object[] {  new Integer(financialYearId) } );
	}

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'FINANCIAL_YEAR_TITLE = :financialYearTitle'.
	 */
	public FinancialYears[] findWhereFinancialYearTitleEquals(String financialYearTitle) throws FinancialYearsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE FINANCIAL_YEAR_TITLE = ? ORDER BY FINANCIAL_YEAR_TITLE", new Object[] { financialYearTitle } );
	}

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'DATE_FROM = :dateFrom'.
	 */
	public FinancialYears[] findWhereDateFromEquals(Date dateFrom) throws FinancialYearsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DATE_FROM = ? ORDER BY DATE_FROM", new Object[] { dateFrom==null ? null : new java.sql.Timestamp( dateFrom.getTime() ) } );
	}

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the criteria 'DATE_TO = :dateTo'.
	 */
	public FinancialYears[] findWhereDateToEquals(Date dateTo) throws FinancialYearsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DATE_TO = ? ORDER BY DATE_TO", new Object[] { dateTo==null ? null : new java.sql.Timestamp( dateTo.getTime() ) } );
	}

	/**
	 * Method 'FinancialYearsDaoImpl'
	 * 
	 */
	public FinancialYearsDaoImpl()
	{
	}

	/**
	 * Method 'FinancialYearsDaoImpl'
	 * 
	 * @param userConn
	 */
	public FinancialYearsDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.FINANCIAL_YEARS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected FinancialYears fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			FinancialYears dto = new FinancialYears();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected FinancialYears[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			FinancialYears dto = new FinancialYears();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		FinancialYears ret[] = new FinancialYears[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(FinancialYears dto, ResultSet rs) throws SQLException
	{
		dto.setFinancialYearId( rs.getInt( COLUMN_FINANCIAL_YEAR_ID ) );
		dto.setFinancialYearTitle( rs.getString( COLUMN_FINANCIAL_YEAR_TITLE ) );
		dto.setDateFrom( rs.getTimestamp(COLUMN_DATE_FROM ) );
		dto.setDateTo( rs.getTimestamp(COLUMN_DATE_TO ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(FinancialYears dto)
	{
	}

	/** 
	 * Returns all rows from the FINANCIAL_YEARS table that match the specified arbitrary SQL statement
	 */
	public FinancialYears[] findByDynamicSelect(String sql, Object[] sqlParams) throws FinancialYearsDaoException
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
			throw new FinancialYearsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the FINANCIAL_YEARS table that match the specified arbitrary SQL statement
	 */
	public FinancialYears[] findByDynamicWhere(String sql, Object[] sqlParams) throws FinancialYearsDaoException
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
			throw new FinancialYearsDaoException( "Exception: " + _e.getMessage(), _e );
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