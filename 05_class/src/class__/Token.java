package class__;

import java.util.StringTokenizer;

public class Token {

	public static void main(String[] args) {
		String str = "학원,집,게임방";
		
		StringTokenizer st = new StringTokenizer(str, ",");
		
		System.out.println(st.countTokens());
		
		while (st.hasMoreTokens()) { //토큰 있다. (True), 없다. (false)
			
			System.out.println(st.nextToken()); //토큰 꺼내고 다음 토큰으로 이동
			
		}
		
		System.out.println("---------------------------------------");
		
		String[] ar = str.split(",");
		
		for (String data : ar) {
			System.out.println(data);
		}
				
	}
}