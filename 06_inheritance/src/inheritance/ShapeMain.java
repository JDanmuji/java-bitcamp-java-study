package inheritance;

import java.util.Scanner;

class Shape {
	protected double area;
	protected Scanner scan = new Scanner(System.in);
	
	public Shape() {
		System.out.println("ShapeTest 기본 생성자");
	}
	
	public void calcArea() {
		System.out.println("도형을 계산합니다.");
	}
	
	public void dispArea() {
		System.out.println("도형을 출력합니다.");
	}
}

class Sam extends Shape {
	protected int base, height;
	
	public Sam() {
		System.out.println("Sam 기본 생성자");
		System.out.print("밑변 : " );
		base = scan.nextInt();
		System.out.print("높이 : " );
		height = scan.nextInt();
		
	}
	
	@Override
	public void calcArea() {
		area = base * height / 2.0;
	}
	
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 = " + area);
	}
}

class Sa extends Shape {
	protected int width, height;
	
	public Sa() {
		System.out.println("Sa 기본 생성자");
		System.out.print("밑변 : " );
		width = scan.nextInt();
		System.out.print("높이 : " );
		height = scan.nextInt();
		
	}
	
	@Override
	public void calcArea() {
		area = width * height;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = " + area);
	}
}

class Sadari extends Shape {
	protected int top, botton, height;
	
	public Sadari() {
		
		System.out.println("Sadari 기본 생성자");
		System.out.print("윗변 : " );
		top = scan.nextInt();
		System.out.print("밑변 : " );
		botton = scan.nextInt();
		System.out.print("높이 : " );
		height = scan.nextInt();
		
	}
	
	@Override
	public void calcArea() {
		area = ((top + botton) * height) / 2;
	}
	
	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 = " + area);
	}
}



public class ShapeMain {

	
	public static void main(String[] args) {
		Sam sam = new Sam();
		
		sam.calcArea();
		sam.dispArea();
		
		System.out.println();
		
		Sa sa = new Sa();
		
		sa.calcArea();
		sa.dispArea();
		
		System.out.println();
		
		Sadari sadari = new Sadari();
		
		sadari.calcArea();
		sadari.dispArea();
		
	}
}
