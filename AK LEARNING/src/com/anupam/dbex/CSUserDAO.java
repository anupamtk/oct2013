package com.anupam.dbex;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Timestamp;

/**
 * Title: CSUserDAO Description: This class basically to insert the dynamic
 * records into to OracleDB
 * 
 * @author Anupam
 */

public class CSUserDAO {

	// singleton
	private static CSUserDAO s_instance = new CSUserDAO();

	// singleton
	public static CSUserDAO getInstance() {
		return s_instance;
	}

	// singleton
	private CSUserDAO() {
	}

	/**
	 * 
	 * description: This method basically to insert the dynamic records into to
	 * MsAccess DB
	 * 
	 * @param long user_id, String user_name, String password, Timestamp crDate,
	 *        Timestamp mDate
	 * 
	 * @sample {@code CSUserDAO.insert();}
	 */

	public void insert(long user_id, String user_name, String password,
			Timestamp crDate, Timestamp mDate) {
		
		Connection con = null;
		PreparedStatement prepStmt = null;
		try {

			// Load Type 4 JDBC Driver ( Native-protocol/all-Java driver )
			Class.forName(DatabaseEnum.Driver_Type);

			// get the connection from MSAccess staging DB
			con = DriverManager.getConnection(DatabaseEnum.dseboxConnectionUrl
					+ DatabaseEnum.userName + DatabaseEnum.password);

			// Create new Statement from connection
			Statement st = con.createStatement();

			// Call the prepareStatement
			prepStmt = con.prepareStatement(DBQuery.INSERT_QUERY);
			prepStmt.setLong(1, user_id);
			prepStmt.setString(2, user_name);
			prepStmt.setString(3, password);
			prepStmt.setTimestamp(4, crDate);
			prepStmt.setTimestamp(5, mDate);
			prepStmt.executeUpdate();

			// close the statement
			st.close();

			// close the connection
			con.close();

			System.out
					.println("Scenario completed - 1 record inserted into CS_TRNG_CREATE_DATA_DETAIL");

		} catch (ClassNotFoundException e) {
			System.out
					.println("ClassNotFoundException : Type 4 JDBC Driver is not found "
							+ e.getMessage());

		}

		catch (SQLException e) {
			System.out
					.println("SQLException : Error getting while insert the records in to OracleDB table. "
							+ e.getMessage());

		}

	}
	
	

}
