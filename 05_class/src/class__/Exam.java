package class__;

import java.util.Scanner;

public class Exam {
	private String name = null;
	private String dap = null;
	private char[] ox = null;

	private int score = 0;
	private final String JUNG = "11111"; //상수화
	Scanner scan = new Scanner(System.in);
	
	public Exam() {
		System.out.println("이름 입력 : ");
		name = scan.next();
		System.out.println("답 입력 : ");
		dap = scan.next();
	}

	public void compare() {
		ox = new char[5];
		
		for (int i = 0; i < 5; i++) {
			
			if (dap.charAt(i) == JUNG.charAt(i)) {
				this.ox[i] = 'O'; 
				score += 20;
			} else {
				ox[i] = 'X';
			}
			
				
		}
		
	
		
	
	}
	
	
	public String getName() {
		return name;
	}

	public char[] getOx() {
		// TODO Auto-generated method stub
		return ox;
	}


	public int getScore() {
		return score;
	}

	
	
	
	
}
