package com.anupam.dbex;

/**
 * @author Anupam
 */

public class DBQuery {

	public static final String INSERT_QUERY = "insert into " +
			"STORAGE_USER(USER_ID,USER_NAME,STORAGE_PASSWORD_KEY," +
			"CREATION_DATE,LAST_MODIFIED_DATE) values(?,?,?,?,?)";

	public static final String INSERT_QUERY_1 = "insert into " +
			"CS_TRNG_CREATE_DATA_DETAIL(CS_TRNG_CREATE_DATA_DETAIL_ID," +
			"CS_TRNG_MODULE_ID,CS_TRNG_SCENARIO_ID,EBAY_MEMBER_ID," +
			"EBAY_MEMBER_PASSWORD,CREATION_DATE,LAST_MODIFIED_DATE) " +
			"values(CS_TRNG_CREATE_DATA_DETAIL_SEQ.nextVal,?,?,?,?,?,?)";

	public static final String SELECT_QUERY = "Select * from CS_TRNG_CREATE_DATA_DETAIL";

}
