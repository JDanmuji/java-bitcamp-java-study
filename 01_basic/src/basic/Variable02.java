package basic;

class Test {
	int a = 10;
	static int b = 20;
	static String str;
}
   
public class Variable02 {
	
	int a = 0; //필드, 전역변수
	
	public static void main(String[] args) {
		int a = 5; // 지역변수 (local Variable), 가비지 값을 가지고 잇다.
		Variable02 v2 = new Variable02();
		
		System.out.println("지역변수 a = " + a);
		
		System.out.println("필드 a = " + v2.a);	
		
		
		Test t1 = new Test();
		
		System.out.println(t1.a);
		System.out.println(Test.b);
		System.out.println(Test.str);
		
	}
}
