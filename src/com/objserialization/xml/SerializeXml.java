package com.objserialization.xml;

import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class SerializeXml {

	public static void main(String[] args) {
       
		Student obj = new Student();
       obj.setRollno(83);
       obj.setSname("NJS");
       
       try {
		XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream("Student.xml")));
		x.writeObject(obj);
		x.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}

	}

}
