package inheritance;

enum Color { //상수들의 집합체
	RED, GREEN, BLUE
}

class Final {
	
	public final String FRUIT = "사과";
	public final String FRUIT2;
	
	public static final String ANIMAL = "기린";
	public static final String ANIMAL2;
	
//	public static final int RED = 0;
//	public static final int GREEN = 0;
//	public static final int BLUE = 0;
//	
	static {
		System.out.println("static 초기화 영역");
		ANIMAL2 = "코끼리";
	}
	
	Final() {
		System.out.println("기본 생성자");
		FRUIT2 = "딸기";
	}
}



public class FinalMain {
	
	public static void main(String[] args) throws Exception {
		final int A = 10; //상수
		//a = 20;
		System.out.println("A = " + A);
		
		final int B;
		B= 30;
		System.out.println("B = " + B);
	
		Final fin = new Final();
		System.out.println("FRUIT = " + fin.FRUIT);
		
		System.out.println("ANIMAL = " + Final.ANIMAL);
		System.out.println("ANIMAL = " + Final.ANIMAL2);
		System.out.println();
		
		System.out.println(Color.RED);
		System.out.println(Color.RED.ordinal());
		
		for(Color col : Color.values()) {
			System.out.println(col + "\t" + col.ordinal());
		}
	}
	
}
