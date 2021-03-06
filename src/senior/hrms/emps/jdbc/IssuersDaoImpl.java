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

public class IssuersDaoImpl extends AbstractDAO implements IssuersDao
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
	protected final String SQL_SELECT = "SELECT ISSUER_ID, ISSUER_NAME FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( ISSUER_ID, ISSUER_NAME ) VALUES ( ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET ISSUER_ID = ?, ISSUER_NAME = ? WHERE ISSUER_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE ISSUER_ID = ?";

	/** 
	 * Index of column ISSUER_ID
	 */
	protected static final int COLUMN_ISSUER_ID = 1;

	/** 
	 * Index of column ISSUER_NAME
	 */
	protected static final int COLUMN_ISSUER_NAME = 2;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 2;

	/** 
	 * Index of primary-key column ISSUER_ID
	 */
	protected static final int PK_COLUMN_ISSUER_ID = 1;

	/** 
	 * Inserts a new row in the ISSUERS table.
	 */
	public IssuersPk insert(Issuers dto) throws IssuersDaoException
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
			stmt.setInt( index++, dto.getIssuerId() );
			stmt.setString( index++, dto.getIssuerName() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new IssuersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the ISSUERS table.
	 */
	public void update(IssuersPk pk, Issuers dto) throws IssuersDaoException
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
			stmt.setInt( index++, dto.getIssuerId() );
			stmt.setString( index++, dto.getIssuerName() );
			stmt.setInt( 3, pk.getIssuerId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new IssuersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the ISSUERS table.
	 */
	public void delete(IssuersPk pk) throws IssuersDaoException
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
			stmt.setInt( 1, pk.getIssuerId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new IssuersDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the ISSUERS table that matches the specified primary-key value.
	 */
	public Issuers findByPrimaryKey(IssuersPk pk) throws IssuersDaoException
	{
		return findByPrimaryKey( pk.getIssuerId() );
	}

	/** 
	 * Returns all rows from the ISSUERS table that match the criteria 'ISSUER_ID = :issuerId'.
	 */
	public Issuers findByPrimaryKey(int issuerId) throws IssuersDaoException
	{
		Issuers ret[] = findByDynamicSelect( SQL_SELECT + " WHERE ISSUER_ID = ?", new Object[] {  new Integer(issuerId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the ISSUERS table that match the criteria ''.
	 */
	public Issuers[] findAll() throws IssuersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY ISSUER_ID", null );
	}

	/** 
	 * Returns all rows from the ISSUERS table that match the criteria 'ISSUER_ID = :issuerId'.
	 */
	public Issuers[] findWhereIssuerIdEquals(int issuerId) throws IssuersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ISSUER_ID = ? ORDER BY ISSUER_ID", new Object[] {  new Integer(issuerId) } );
	}

	/** 
	 * Returns all rows from the ISSUERS table that match the criteria 'ISSUER_NAME = :issuerName'.
	 */
	public Issuers[] findWhereIssuerNameEquals(String issuerName) throws IssuersDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE ISSUER_NAME = ? ORDER BY ISSUER_NAME", new Object[] { issuerName } );
	}

	/**
	 * Method 'IssuersDaoImpl'
	 * 
	 */
	public IssuersDaoImpl()
	{
	}

	/**
	 * Method 'IssuersDaoImpl'
	 * 
	 * @param userConn
	 */
	public IssuersDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.ISSUERS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Issuers fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Issuers dto = new Issuers();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Issuers[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Issuers dto = new Issuers();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Issuers ret[] = new Issuers[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Issuers dto, ResultSet rs) throws SQLException
	{
		dto.setIssuerId( rs.getInt( COLUMN_ISSUER_ID ) );
		dto.setIssuerName( rs.getString( COLUMN_ISSUER_NAME ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Issuers dto)
	{
	}

	/** 
	 * Returns all rows from the ISSUERS table that match the specified arbitrary SQL statement
	 */
	public Issuers[] findByDynamicSelect(String sql, Object[] sqlParams) throws IssuersDaoException
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
			throw new IssuersDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the ISSUERS table that match the specified arbitrary SQL statement
	 */
	public Issuers[] findByDynamicWhere(String sql, Object[] sqlParams) throws IssuersDaoException
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
			throw new IssuersDaoException( "Exception: " + _e.getMessage(), _e );
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
