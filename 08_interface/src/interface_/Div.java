package interface_;

import java.util.Scanner;

public class Div implements Compute{
	private int x,y;
	
	public Div() {
		
		
		System.out.println(" x 입력 : ");
		x = scan.nextInt();
		System.out.println(" y 입력 : ");
		y = scan.nextInt();
		
	}
	
	
	@Override
	public void disp() {
		System.out.println(String.format("%.2f", (double)(x/y)) ); 
	}


}
