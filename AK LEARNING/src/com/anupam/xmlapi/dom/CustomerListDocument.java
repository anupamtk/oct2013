package com.anupam.xmlapi.dom;

import javax.xml.parsers.*;

import java.io.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class CustomerListDocument {

	/**
	 * @param args
	 * @throws IOException
	 * @throws SAXException
	 */
	public static void main(String[] args) throws SAXException, IOException {
		// TODO Auto-generated method stub
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		// dbFactory.setValidating(true);
		// dbFactory.setNamespaceAware(true);
		try {
			DocumentBuilder docBuilder = dbFactory.newDocumentBuilder(); // This
																			// is
																			// DOM
																			// Parser
			Document document = docBuilder.parse("customerlist.xml");
			CustomerListDocument clDoc = new CustomerListDocument();
			clDoc.createNode(document);
			clDoc.parseNode(document);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void parseNode(Node node) throws IOException {

		NodeList nodes = null;
		if (node.getNodeType() == node.DOCUMENT_NODE) {
			System.out.println("\n ---------------------");
			System.out.println("List contain folowing customers: ");
			System.out.println("---------------------");

			nodes = node.getChildNodes();
			if (nodes != null) {
				for (int i = 0; i < nodes.getLength(); i++) {
					parseNode(nodes.item(i));
				}
			}
		} else if (node.getNodeType() == node.ELEMENT_NODE) {
			NamedNodeMap attrs = node.getAttributes();
			for (int i = 0; i < attrs.getLength(); i++) {
				System.out.println("\nCustomer Id :"
						+ attrs.item(i).getNodeValue());
			}

			if (node.getNodeName().equals("name"))
				System.out.print("Name : ");
			else if (node.getNodeName().equals("address"))
				System.out.print("Address : ");

			nodes = node.getChildNodes();
			if (nodes != null) {
				for (int i = 0; i < nodes.getLength(); i++) {
					parseNode(nodes.item(i));
				}
			}
		} else if (node.getNodeType() == node.TEXT_NODE) {
			// The value of empty text nodes varies between 1 & 2 empty spaces,
			// therefore, ensure they don't print
			if (node.getNodeValue().length() > 3)
				System.out.println(node.getNodeValue());

		}
	}
	
	public void createNode(Document document){
		
		//create new node at the end of the document
		Node rootNode = document.getDocumentElement();
		
		//need to be of type Element to allow adding attributes
		Element newCustomerNode = document.createElement("customer");
		newCustomerNode.setAttribute("customerID", "asan003");
		
		Node newNameNode = document.createElement("name");
		Text newTextNode = document.createTextNode("Anupam Kumar");
		newNameNode.appendChild(newTextNode);
		
		Node newAddressNode = document.createElement("address");
		Text addressTextNode = document.createTextNode("3G23 Warje Pune 411052");
		newAddressNode.appendChild(addressTextNode);
		
		newCustomerNode.appendChild(newNameNode);
		newCustomerNode.appendChild(newAddressNode);
		rootNode.appendChild(newCustomerNode);
		
	}
}
