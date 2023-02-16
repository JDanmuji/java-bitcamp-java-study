package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	private int x, y, result = 0;
	
	public void input() {

		Scanner scan  = new Scanner(System.in);
		System.out.print("x 입력 : ");
		x = scan.nextInt();
		System.out.print("y 입력 : ");
		y = scan.nextInt();
		
	}
	
	public void output() {
		
		if(y >= 0) {
				
			for (int i = 0; i < y;  i++) {
				
				result = result * x;
			}
			
			System.out.println(x + "의 " + y + "승은 " + result);

		} else {
			
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		ExceptionMain2 em2 = new ExceptionMain2();
		
		em2.input();
		em2.output();
	
		

		
		
		
	}

}

/*
 * 
 * [문제] 제곱 연산
- x의 y승을 처리 한다.
- for 문을 이용해서 처리한다.

[실행결과]
x 입력 : 2
y 입력 : 10         input()
----------------------------------
2의 10승은 xxx        output()
 * 
 * 
 */

