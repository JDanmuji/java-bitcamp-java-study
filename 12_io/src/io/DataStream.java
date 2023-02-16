package io;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStream {

	
	public static void main(String[] args) {
	
		try {
			
		
			FileOutputStream fos = new FileOutputStream("result.txt");
			DataOutputStream dos = new DataOutputStream(fos);
		
			
			dos.writeUTF("홍길동");
			dos.writeInt(25);
			dos.writeDouble(185.3);
		
			dos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
