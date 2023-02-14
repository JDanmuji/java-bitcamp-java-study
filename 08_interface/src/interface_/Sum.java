package interface_;

import java.util.Scanner;

public class Sum implements Compute{
	private int x,y;
	
	public Sum() {
		
		
		System.out.println(" x 입력 : ");
		x = scan.nextInt();
		System.out.println(" y 입력 : ");
		y = scan.nextInt();
		
	}
	
	@Override
	public void disp() {
		System.out.println(x + y); 
	}

}
