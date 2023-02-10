package class__;

public class StringMain {

	public static void main(String[] args) {
		String a = "apple"; //literal 생성
		String b = "apple";
		
		if (a == b) {
			System.out.println("a와 b의 참조값은 같다.");	
		} else {
			System.out.println("a와 b의 참조값은 다르다.");
		}
		
		if (a.equals(b)) {
			System.out.println("a와 b의 문자열은 같다.");
		} else {
			System.out.println("a와 b의 참조값은 다르다.");
		}
		
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		
		
		if (c == d) {
			System.out.println("c와 d의 참조값은 같다.");	
		} else {
			System.out.println("c와 d의 참조값은 다르다.");
		}
		
		if (c.equals(d)) {
			System.out.println("c와 d의 문자열은 같다.");
		} else {
			System.out.println("c와 d의 참조값은 다르다.");
		}
		
		String e = "오늘 날짜는 " + 2023 + 2 + 10;
		
		System.out.println(e);
		
		//문자열은 편집이 안된다. -> 메모리에 4번의 생성이 일어남.
		// 메모리 1  오늘 날짜는 
		// 메모리 2  오늘 날짜는 2023
		// 메모리 3  오늘 날짜는 20232
		// 메모리 4  오늘 날짜는 2023210

		System.out.println("문자열의 크기 = " + e.length());
		
		for(int i = 0; i < e.length(); i++) {
			System.out.println(i + " : " +  e.charAt(i));
		}
		
		System.out.println("부분 문자열 추출 = " + e.substring(7));
		System.out.println("부분 문자열 추출 = " + e.substring(7, 11));
		
		System.out.println("대문자 변경 = " +  "Hello".toUpperCase());
		System.out.println("소문자 변경 = " +  "Hello".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜"));
		System.out.println("문자열 검색 = " + e.indexOf("날짜"));
		System.out.println("문자열 검색 = " + e.indexOf("개바부")); // -1
		
		System.out.println("문자열 치환 = " + e.replace("냠냠", "일자"));
		
		
	}
}
