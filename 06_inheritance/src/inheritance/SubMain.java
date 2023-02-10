package inheritance;


//자식 클래스는 부모 클래스의 모든 것들을 사용한다.
// 자식 클래스는 메모리 생성할 때, 부모 클래스도 같이 생성시켜버린다.
// 부모 기본생성자 생성
// class 안에 생성자가 없을 때, 기본 생성자는 자동 호출

//Override 
// 자식이 우선권을 갖는다.
public class SubMain extends Super{
	private String name;
	private int age;
	

	SubMain() {
		System.out.println("SubMain 기본 생성자");
	}
	
	
	SubMain(String n, int a, double w, double h) {
		this.name = n; // 자신의 클래스의 값
		this.age = a;
		this.weight = w; // 부모 클래스의 참조값
		this.height = h;
	}
	

	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		super.disp();
	}
	
	public void test() {
		System.out.println("SuperMain");
	}
	
	public static void main(String[] args) {
//		SubMain aa = new SubMain("홍길동",  25, 73.5, 182.6);
//		
//		//aa.disp();
//		System.out.println("-----------------------------");
//		aa.output();
//		
//		Super bb = new SubMain("코난" , 3 , 53.5, 156.6);
//		
//		//bb.output(); //error
//		bb.disp();
		

	
		
	}
}
