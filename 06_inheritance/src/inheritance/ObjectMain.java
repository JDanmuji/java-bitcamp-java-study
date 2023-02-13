package inheritance;

class Test { 
	
}

class Sample {
	
	@Override
	public String toString() {
		return getClass() + "개바부";	
	}
	
}

class Exam {
	private String name = "홍길동";
	private int age =  25;
	
	@Override
	public String toString() {
		return name + "\t" + age;
	}
}

public class ObjectMain {

	
	public static void main(String[] args) {
		Test t = new Test();
		
		System.out.println("객체 t = " + t); //클래스명@16진수
		System.out.println("객체 t = " + t.toString());
		System.out.println("객체 t = " + t.hashCode());
		
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s.toString());
		
		System.out.println();

		Exam e = new Exam();
		System.out.println("객체 e = " + e.toString());
		
		String aa = "apple";
		System.out.println("객체 aa = " + aa); //문자열
		System.out.println("객체 aa = " + aa.toString());
		
		// 아래의 hascode 값을 믿으면 안된다. 문자열은 무한대기 때문에 int 형으로 표현할 수 없다.
		System.out.println("객체 aa = " + aa.hashCode());

		
		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb==cc : " + (bb==cc)); //주소(참조값) 비교 false
		System.out.println("bb.equals(cc) : " + bb.equals(cc)); // 문자열 비교 true
		
		
		// Object 클래스의 비교와 String의 비교는 서로 다르다.
		// Object 클래스의 경우 == , equals 둘 다 참조값 비교
		Object dd = new Object();
		Object ee = new Object();
		System.out.println("dd==ee : " + (dd==ee)); //주소(참조값) 비교 false
		System.out.println("dd.equals(ee) : " + dd.equals(ee));  //주소(참조값) 비교 false
		System.out.println();
		
		Object ff = new String("apple");
		Object gg = new String("apple");
		System.out.println("ff==gg : " + (ff==gg)); //주소(참조값) 비교 false
		System.out.println("ff.equals(gg) : " + ff.equals(gg));  //문자열 비교 true
		System.out.println();
	}
}



