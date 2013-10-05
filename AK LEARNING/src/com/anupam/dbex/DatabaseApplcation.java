package com.anupam.dbex;

public class DatabaseApplcation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long currentSystemTime = System.currentTimeMillis();
		java.sql.Timestamp crDate = new java.sql.Timestamp(currentSystemTime);

//		CSUserDAO.getInstance().insert(1, "aktk", "PaSs", crDate, crDate);
		GeneralDAO.getInstance().insert("TEST_3", crDate, "A7", "Anupam7"+currentSystemTime, "a@p.m");
		GeneralDAO.getInstance().select("TEST_3");

	}

}
