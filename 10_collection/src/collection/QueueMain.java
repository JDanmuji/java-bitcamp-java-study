package collection;


import static java.lang.System.out;

import java.util.LinkedList;

public class QueueMain {

	
	public static void main(String[] args) {
		String[] item = {"소나타", "쏘렌토", "제네시스" };
		LinkedList<String> q =  new LinkedList<String>();
		
		for (String n : item) {
			q.offer(n);
		}
		
		out.println("q의 크기 : " +  q.size());
		
		String data = "";
		
		while((data= q.poll()) != null) {
			out.println(data+ "삭제!");
			out.println("q의 크기" + q.size() + "\t");
		}
		
		
	}
}
