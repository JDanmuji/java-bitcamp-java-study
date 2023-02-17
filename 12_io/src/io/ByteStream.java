package io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.Buffer;

public class ByteStream {

	public static void main(String[] args) throws IOException {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(new File("data.txt")));
		
		int data;
		
		//마지막 결과값은 null이 아닌 -1로 처리
		while ( (data = bis.read()) != -1 ) {
			System.out.print(data);
		}

		//1310 '개행문자[Enter]'
		// [Enter] -> 1. 다음줄 \n, 2.맨앞\r  두 가지 동작이 같이 일어나기 때문에 13, 10이 발생
		
		
		System.out.println();
	}
}
