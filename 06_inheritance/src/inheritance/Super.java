package inheritance;

public class Super extends Object {

	protected double weight, height;
	
	public static void main(String[] args) {

		Super aa = new ChildMain();
		aa.test();
		
	}
	
	
	Super() {
		System.out.println("Super 기본 생성자");
	}

	Super(double w, double h) {
		this.weight = w;
		this.height = h;
	}
	
	public void disp() {
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	
	public void test() {
		System.out.println("Super");
	}
}
