package com.anupam.xmlapi.sax;

import java.io.*;

import org.xml.sax.*;
import org.xml.sax.helpers.*;
import javax.xml.parsers.*;

public class CustomerListHandler extends DefaultHandler {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser saxParser = factory.newSAXParser();
			
			DefaultHandler bcHandler = new CustomerListHandler();
			
			saxParser.parse(new File("customerList2.xml"), bcHandler);
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private boolean inPhoneNumber;
	private boolean inName;
	
	public void startDocument() throws SAXException{
		System.out.println("\n----------------------");
		System.out.println("List contain folowing customers: ");
		System.out.println("---------------------");
	}
	
	public void endDocument() throws SAXException{
		System.out.println("--------END----------");
	}

	@Override
	public void startElement(String nameSpaceURI, String localName, String qualifiedName,
			Attributes attrs) throws SAXException {
		// TODO Auto-generated method stub
		
		if(qualifiedName.equals("customer")){
			if(attrs!=null){
				for (int i = 0; i < attrs.getLength(); i++) {
					System.out.println("Customer Id :"
							+ attrs.getValue(i));
				}
			}
		}else if(qualifiedName.equals("name")){
			inName = true; inPhoneNumber = false;
		}else if(qualifiedName.equals("phoneNumber")){
			inName = false; inPhoneNumber = true;
		}
	}

	@Override
	public void characters(char[] ch, int offset, int len)
			throws SAXException {
		// TODO Auto-generated method stub
		String s = new String(ch, offset, len);
		if(inName){
			System.out.println("Name : "+s);
		}else if(inPhoneNumber){
			System.out.println("Phone Number : "+s);
		}
	}

	@Override
	public void endElement(String nameSpaceURI, String localName, String qualifiedName)
			throws SAXException {
		// TODO Auto-generated method stub
		if(qualifiedName.equals("customer")){
			System.out.println();
		}
		inName = false;
		inPhoneNumber = false;
	}	

}
