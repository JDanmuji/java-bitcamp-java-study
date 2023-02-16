package collection;

import static java.lang.System.out;

import java.util.Iterator;
import java.util.Vector;


public class VectorMain {

	
	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		System.out.println("벡터 크기 = " + v.size()); // 0
		System.out.println("벡터 용량 = " + v.capacity()); // 기본용량 10, 10개씩 증가
		System.out.println();
		
		System.out.println("항목추가");
		
		for(int i = 0; i < 10; i++) {
			v.add(i+1 + "");
			System.out.print(v.get(i) + "\t");
		}
		
		System.out.println("항목 1개 추가");
		v.addElement(5+""); //중복허용
		System.out.println("벡터 크기 = " + v.size()); // 0
		System.out.println("벡터 용량 = " + v.capacity()); // 기본용량 10, 10개씩 증가
		System.out.println();
		
		for(int i = 0; i < v.size(); i++) {
			//v.add(i + "");
			System.out.print(v.get(i) + "\t");
		}
		
		System.out.println();
		System.out.println("마지막 항목 제거");
		
		v.remove(v.lastIndexOf(v.lastElement()));
		
		Iterator<String> it = v.iterator();
		
		while(it.hasNext()) {
		    
			System.out.print(it.next() + "\t");
		}
		
		System.out.println();
		
	}
}
