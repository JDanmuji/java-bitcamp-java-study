package inheritance;

public class ChildMain extends Super{
	private String name;
	private int age;
	
	
	ChildMain() {
		System.out.println("Child 기본 생성자");
	}
	

	ChildMain(String n, int a, double w, double h) {
		super(w, h);
		
		this.name = n; // 자신의 클래스의 값
		this.age = a;
	//	this.weight = w; // 부모 클래스의 참조값
	//	this.height = h;
	}
	
	
	public void disp() {
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	public void test() {
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		ChildMain aa = new ChildMain("홍길동", 12, 11, 23);
		
		
	}
	
	
}

