package com.anupam.dbex;

/**
 * Title: DatabaseEnum.java
 * 
 * @author Anupam
 * @version 1.1 Description: This class basically to keep JDBC connetivity
 */

public class DatabaseEnum {

	// Oracle Staging db connection URL ==> dsConnectionUrl
	// public static final String dsConnectionUrl =
	// "jdbc:oracle:thin:@s8i.vip.qa.ebay.com:1521:S8i";
//	public static final String dseboxConnectionUrl = "jdbc:oracle:thin:@trainsie.vip.qa.ebay.com:1521:TRAINSIE";
	

	// Username ==> staging_lookup_update_app
	// public static final String userName = "staging_lookup_update_app";

//	public static final String eboxcstraining_userName = "eboxcstrainingadmin_app";
	

	// password == staging_lookup_update_app
	// public static final String password = "staging_lookup_update_app";

//	public static final String eboxcstraining_password = "eboxcstrainingadmin_app";
	

	// Type 4 JDBC Driver ( Native-protocol/all-Java driver )

//	public static final String Driver_Type = "oracle.jdbc.driver.OracleDriver";
	
	
	/**
	 * Constants for MS Access database
	 */
	
	public static final String dseboxConnectionUrl = "jdbc:odbc:MyTestDS";
	public static final String userName = "";
	public static final String password = "";
	public static final String Driver_Type = "sun.jdbc.odbc.JdbcOdbcDriver";

}
