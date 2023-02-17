package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.xml.crypto.Data;

public class ObjectMain {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		PersonDTO dto = new PersonDTO("홍길동", 25, 185.3);
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("result2.txt"));
		oos.writeObject(dto);
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("result2.txt"));
		PersonDTO data = (PersonDTO) ois.readObject();
		
		System.out.println(data.getName());
		System.out.println(data.getAge());
		System.out.println(data.getHeight());
		
		ois.close();
	}
}
