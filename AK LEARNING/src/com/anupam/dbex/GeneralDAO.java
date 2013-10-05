package com.anupam.dbex;

import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import com.anupam.dbex.DatabaseEnum;

/**
 * 
 * Description: : This class basically to Populate the dynamic records into to
 * MsAccess database
 * 
 * @author : Anupam
 * @version : 1.0
 */

public class GeneralDAO {

	private static GeneralDAO GeneralDAO = new GeneralDAO();

	private GeneralDAO() {
	}

	public static GeneralDAO getInstance() {
		return GeneralDAO;
	}

	/**
	 * 
	 * description: This method basically use to store the all datas in MS
	 * Access Table
	 * 
	 * @param TableName
	 *            , Date object, Seller Id, Seller Name, Seller Email
	 * 
	 * @sample {@code GeneralDAO.insert();}
	 */

	public void insert(String tableName, Date d, String sellerOId,
			String sellerName, String sellerEmail) {

		Connection con = null;
		PreparedStatement prepStmt = null;
		try {

			// Load Type 1 = JDBC-ODBC bridge
			Class.forName(DatabaseEnum.Driver_Type);

			// get the connection from MsAccess DataBase
			con = DriverManager.getConnection(DatabaseEnum.dseboxConnectionUrl
					+ DatabaseEnum.userName + DatabaseEnum.password);

			// Create new Statement from connection
			Statement st = con.createStatement();

			boolean table = false;

			/*
			 * This interface is implemented by JDBC driver writers in order to
			 * provide information about the underlying Database capabilities
			 * and the JDBC driver capabilities taken together.
			 */

			DatabaseMetaData dbmd = con.getMetaData();
			String[] types = { "TABLE" };
			ResultSet resultSet = dbmd.getTables(null, null, "%", types);

			while (resultSet.next()) {

				// If Table is already exist,then it won't create any new
				// table
				if (tableName.equalsIgnoreCase(resultSet
						.getString("TABLE_NAME"))) {
					table = true;
					break;
				}

			}
			int count = 0;

			// if table is false ,then call the CREATE_QUERY

			if (!table) {
				// Create a new table
				count = st
						.executeUpdate("CREATE TABLE "
								+ tableName
								+ "(CeationDate VARCHAR(120) not null PRIMARY Key, SellerId VARCHAR(120), SellerName VARCHAR(120),SellerEmail VARCHAR(120))");
				
				con.commit();

			}

			// Call the prepareStatement

			prepStmt = con
					.prepareStatement("insert into "
							+ tableName
							+ "(CeationDate,SellerId,SellerName,SellerEmail) values(?,?,?,?)");

			prepStmt.setString(1, d.toString());
			prepStmt.setString(2, sellerOId);
			prepStmt.setString(3, sellerName);
			prepStmt.setString(4, sellerEmail);
			prepStmt.executeUpdate();
			st.close();
			con.close();

			System.out
					.println("Dynamic Records are inserted successfully in to Ms Access DB!");
			System.out
					.println("Note: Ms Access Database location is : F:\\Eclipse\\Database\\DBTest.mdb  \nAnd table name : "
							+ tableName);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out
					.println("Error Inserting records into to DB . Pls close the Existing table and try again");

		}

	}

	/**
	 * 
	 * description: This method basically use to retrieve all records
	 * 
	 * @param TableName
	 * 
	 * @sample {@code GeneralDAO.insert();}
	 */

	public void select(String tableName) {

		Connection con = null;
		PreparedStatement prepStmt = null;
		try {
			Class.forName(DatabaseEnum.Driver_Type);
			con = DriverManager.getConnection(DatabaseEnum.dseboxConnectionUrl
			+ DatabaseEnum.userName + DatabaseEnum.password);

			Statement st = con.createStatement();
			boolean table = false;

			/*
			 * This interface is implemented by JDBC driver writers in order to
			 * provide information about the underlying Database capabilities
			 * and the JDBC driver capabilities taken together.
			 */

			DatabaseMetaData dbmd = con.getMetaData();
			String[] types = { "TABLE" };
			ResultSet resultSet = dbmd.getTables(null, null, "%", types);

			while (resultSet.next()) {
				if (tableName.equalsIgnoreCase(resultSet.getString("TABLE_NAME"))) {
					table = true;
					break;
				}

			}

			if (table) {
				// Call the prepareStatement
				prepStmt = con.prepareStatement("select * from "
								+ tableName);
				ResultSet rs = prepStmt.executeQuery();
				
				System.out.println("Creation_date\tSeller_id\tSeller_name\tSeller_email");
				while (rs.next()) {
					System.out.print(rs.getDate(1)+ "\t");
					System.out.print(rs.getString(2)+ "\t");
					System.out.print(rs.getString(3)+ "\t");
					System.out.println(rs.getString(4));
				}
				
				
				st.close();
				con.close();
				
			}else{
				System.out.println("Table "+tableName+" does not exists !!");
			}

		} catch (ClassNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (SQLException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();
			System.out.println("Error Inserting records into to DB . Pls close the Existing table and try again");

		}

		}
}