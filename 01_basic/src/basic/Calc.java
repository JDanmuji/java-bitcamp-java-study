package basic;

import java.text.DecimalFormat;
/*
 
[문제] 320(a), 258(b)를 변수에 저장하여 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오.
단, 소수이하 2째자리까지 출력하시오

[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = x.xx

*/

public class Calc {
	
	static int sum = 0;
	static int sub = 0;
	static int mul = 0;
	static double div = 0.0;
	static int a = 0;
	static int b = 0;
	
	public static void main(String[] args) {
		
		a = 320;
		b = 258;
		
		Calculator();
		print();
	}
	
	//계산 
	public static void Calculator() {

		//덧셈
		sum = a + b;
		//뺄셈
		sub = a - b;
		//곱셈
		mul = a * b;
		//나눗셈
		div = (double)a / (double)b;
		
	}
	
	//출력
	public static void print() {
		
		//소숫점 둘 째자리까지 출력
		DecimalFormat format = new DecimalFormat("#.##");
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + mul);
		System.out.println(a + " / " + b + " = " + format.format(div));
		
	}
	
	

}
