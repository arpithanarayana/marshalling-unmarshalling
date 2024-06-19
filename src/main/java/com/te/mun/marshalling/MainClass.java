package com.te.mun.marshalling;

public class MainClass {
	public static void main(String[] args) {
		// Marshalling
		Mobile mobile = new Mobile("oneplus","silver",35000.00);
		JAXB_class jaxb_class = new JAXB_class();
		jaxb_class.convertObjectToXml(mobile);
		
		// Unmarshalling
		Mobile mobile2 = jaxb_class.convertXmlToObject();
		if(mobile2!=null) {
			System.out.println("name : " + mobile2.getName());
			System.out.println("color: " + mobile2.getColor());
			System.out.println("price: " + mobile2.getPrice());
		}
	}

}
