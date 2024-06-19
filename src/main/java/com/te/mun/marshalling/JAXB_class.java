package com.te.mun.marshalling;

import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXB_class {

	// Marshalling
	public void convertObjectToXml(Mobile mobile) {

		try {
			JAXBContext context = JAXBContext.newInstance(Mobile.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(marshaller.JAXB_FORMATTED_OUTPUT, true);
			marshaller.marshal(mobile, new File("src/main/java/data/file/datafile.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// unMarshalling
	public Mobile convertXmlToObject() {
		Mobile obj = null;

		try {
			JAXBContext context = JAXBContext.newInstance(Mobile.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
		obj = (Mobile) unmarshaller.unmarshal(new File("src/main/java/data/file/datafile.xml"));
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}
