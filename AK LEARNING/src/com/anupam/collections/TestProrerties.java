package com.anupam.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProrerties {
	
	public static void main( String[] args )
    {
		Properties testProp = new Properties();
		try {
			testProp.load(new FileInputStream(".//src//com//anupam//collections//config.properties"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//get the property value and print it out
	    System.out.println(testProp.getProperty("name"));
	    System.out.println(testProp.getProperty("lastname"));
    
	    Properties prop = new Properties();
		 
    	try {
    		//set the properties value
    		prop.setProperty("database", "localhost");
    		prop.setProperty("dbuser", testProp.getProperty("name"));
    		prop.setProperty("dbpassword", "password");
 
    		//save properties to project root folder
    		prop.store(new FileOutputStream(".//src//com//anupam//collections//config1.properties"), null);
    		System.out.println("program ends");
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }
    }
	
}
