package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.Buffer;

public class ByteStream2 {

	public static void main(String[] args) {
		
		try {
			
			File file  = new File("data.txt");
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			
			int size = (int) file.length(); //파일 읽기
			byte[] b = new byte[size];
			
			bis.read(b, 0, size);
			
		
			System.out.println(new String(b));
			
			bis.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}
}
