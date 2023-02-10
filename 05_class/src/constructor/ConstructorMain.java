package constructor;

public class ConstructorMain {
	private String name;
	private int age;
	
	public ConstructorMain() {
		System.out.println("default 생성자");
	}
	

	public ConstructorMain(String name) {
		System.out.println("생성자");
		this.name = name;
		//Overload된 다른 생성자를 호출할 수 있다.
	}
	
	public ConstructorMain(int age) {
		this("코난");		//Overload된 다른 생성자를 호출할 수 있다.
		System.out.println("age 처리 생성자");
		this.age = age;
	}
		
	public static void main(String[] args) {
		ConstructorMain aa = new ConstructorMain();
		
		System.out.println(aa.name);
		System.out.println(aa.age);
		System.out.println();
		
		ConstructorMain bb = new ConstructorMain("홍길동");
		
	}
}