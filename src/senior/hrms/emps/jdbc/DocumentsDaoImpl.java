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

public class DocumentsDaoImpl extends AbstractDAO implements DocumentsDao
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
	protected final String SQL_SELECT = "SELECT DOCUMENT_ID, DOCUMENT_NAME, DOCUMENT_DESCRIPTION FROM " + getTableName() + "";

	/** 
	 * Finder methods will pass this value to the JDBC setMaxRows method
	 */
	protected int maxRows;

	/** 
	 * SQL INSERT statement for this table
	 */
	protected final String SQL_INSERT = "INSERT INTO " + getTableName() + " ( DOCUMENT_ID, DOCUMENT_NAME, DOCUMENT_DESCRIPTION ) VALUES ( ?, ?, ? )";

	/** 
	 * SQL UPDATE statement for this table
	 */
	protected final String SQL_UPDATE = "UPDATE " + getTableName() + " SET DOCUMENT_ID = ?, DOCUMENT_NAME = ?, DOCUMENT_DESCRIPTION = ? WHERE DOCUMENT_ID = ?";

	/** 
	 * SQL DELETE statement for this table
	 */
	protected final String SQL_DELETE = "DELETE FROM " + getTableName() + " WHERE DOCUMENT_ID = ?";

	/** 
	 * Index of column DOCUMENT_ID
	 */
	protected static final int COLUMN_DOCUMENT_ID = 1;

	/** 
	 * Index of column DOCUMENT_NAME
	 */
	protected static final int COLUMN_DOCUMENT_NAME = 2;

	/** 
	 * Index of column DOCUMENT_DESCRIPTION
	 */
	protected static final int COLUMN_DOCUMENT_DESCRIPTION = 3;

	/** 
	 * Number of columns
	 */
	protected static final int NUMBER_OF_COLUMNS = 3;

	/** 
	 * Index of primary-key column DOCUMENT_ID
	 */
	protected static final int PK_COLUMN_DOCUMENT_ID = 1;

	/** 
	 * Inserts a new row in the DOCUMENTS table.
	 */
	public DocumentsPk insert(Documents dto) throws DocumentsDaoException
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
			stmt.setInt( index++, dto.getDocumentId() );
			stmt.setString( index++, dto.getDocumentName() );
			stmt.setString( index++, dto.getDocumentDescription() );
			System.out.println( "Executing " + SQL_INSERT + " with DTO: " + dto );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
			reset(dto);
			return dto.createPk();
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DocumentsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Updates a single row in the DOCUMENTS table.
	 */
	public void update(DocumentsPk pk, Documents dto) throws DocumentsDaoException
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
			stmt.setInt( index++, dto.getDocumentId() );
			stmt.setString( index++, dto.getDocumentName() );
			stmt.setString( index++, dto.getDocumentDescription() );
			stmt.setInt( 4, pk.getDocumentId() );
			int rows = stmt.executeUpdate();
			reset(dto);
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DocumentsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Deletes a single row in the DOCUMENTS table.
	 */
	public void delete(DocumentsPk pk) throws DocumentsDaoException
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
			stmt.setInt( 1, pk.getDocumentId() );
			int rows = stmt.executeUpdate();
			long t2 = System.currentTimeMillis();
			System.out.println( rows + " rows affected (" + (t2-t1) + " ms)" );
		}
		catch (Exception _e) {
			_e.printStackTrace();
			throw new DocumentsDaoException( "Exception: " + _e.getMessage(), _e );
		}
		finally {
			ResourceManager.close(stmt);
			if (!isConnSupplied) {
				ResourceManager.close(conn);
			}
		
		}
		
	}

	/** 
	 * Returns the rows from the DOCUMENTS table that matches the specified primary-key value.
	 */
	public Documents findByPrimaryKey(DocumentsPk pk) throws DocumentsDaoException
	{
		return findByPrimaryKey( pk.getDocumentId() );
	}

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria 'DOCUMENT_ID = :documentId'.
	 */
	public Documents findByPrimaryKey(int documentId) throws DocumentsDaoException
	{
		Documents ret[] = findByDynamicSelect( SQL_SELECT + " WHERE DOCUMENT_ID = ?", new Object[] {  new Integer(documentId) } );
		return ret.length==0 ? null : ret[0];
	}

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria ''.
	 */
	public Documents[] findAll() throws DocumentsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " ORDER BY DOCUMENT_ID", null );
	}

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria 'DOCUMENT_ID = :documentId'.
	 */
	public Documents[] findWhereDocumentIdEquals(int documentId) throws DocumentsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DOCUMENT_ID = ? ORDER BY DOCUMENT_ID", new Object[] {  new Integer(documentId) } );
	}

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria 'DOCUMENT_NAME = :documentName'.
	 */
	public Documents[] findWhereDocumentNameEquals(String documentName) throws DocumentsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DOCUMENT_NAME = ? ORDER BY DOCUMENT_NAME", new Object[] { documentName } );
	}

	/** 
	 * Returns all rows from the DOCUMENTS table that match the criteria 'DOCUMENT_DESCRIPTION = :documentDescription'.
	 */
	public Documents[] findWhereDocumentDescriptionEquals(String documentDescription) throws DocumentsDaoException
	{
		return findByDynamicSelect( SQL_SELECT + " WHERE DOCUMENT_DESCRIPTION = ? ORDER BY DOCUMENT_DESCRIPTION", new Object[] { documentDescription } );
	}

	/**
	 * Method 'DocumentsDaoImpl'
	 * 
	 */
	public DocumentsDaoImpl()
	{
	}

	/**
	 * Method 'DocumentsDaoImpl'
	 * 
	 * @param userConn
	 */
	public DocumentsDaoImpl(final java.sql.Connection userConn)
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
		return "HRMS.DOCUMENTS";
	}

	/** 
	 * Fetches a single row from the result set
	 */
	protected Documents fetchSingleResult(ResultSet rs) throws SQLException
	{
		if (rs.next()) {
			Documents dto = new Documents();
			populateDto( dto, rs);
			return dto;
		} else {
			return null;
		}
		
	}

	/** 
	 * Fetches multiple rows from the result set
	 */
	protected Documents[] fetchMultiResults(ResultSet rs) throws SQLException
	{
		Collection resultList = new ArrayList();
		while (rs.next()) {
			Documents dto = new Documents();
			populateDto( dto, rs);
			resultList.add( dto );
		}
		
		Documents ret[] = new Documents[ resultList.size() ];
		resultList.toArray( ret );
		return ret;
	}

	/** 
	 * Populates a DTO with data from a ResultSet
	 */
	protected void populateDto(Documents dto, ResultSet rs) throws SQLException
	{
		dto.setDocumentId( rs.getInt( COLUMN_DOCUMENT_ID ) );
		dto.setDocumentName( rs.getString( COLUMN_DOCUMENT_NAME ) );
		dto.setDocumentDescription( rs.getString( COLUMN_DOCUMENT_DESCRIPTION ) );
	}

	/** 
	 * Resets the modified attributes in the DTO
	 */
	protected void reset(Documents dto)
	{
	}

	/** 
	 * Returns all rows from the DOCUMENTS table that match the specified arbitrary SQL statement
	 */
	public Documents[] findByDynamicSelect(String sql, Object[] sqlParams) throws DocumentsDaoException
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
			throw new DocumentsDaoException( "Exception: " + _e.getMessage(), _e );
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
	 * Returns all rows from the DOCUMENTS table that match the specified arbitrary SQL statement
	 */
	public Documents[] findByDynamicWhere(String sql, Object[] sqlParams) throws DocumentsDaoException
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
			throw new DocumentsDaoException( "Exception: " + _e.getMessage(), _e );
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