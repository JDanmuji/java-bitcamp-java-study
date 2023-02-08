package operator;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

/*
[문제] 월급 계산 프로그램 - 조건 연산자
이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오
단 합계가 5,000,000원 이상이면 3%
       3,000,000원 이상이면 2%
       아니면 1%
       
합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원

*/

public class Salary {

	static String name = "";
	static String rank = "";
	static int normal_pay = 0;
	static int extra_pay = 0;
	static int sum_pay = 0;
	static int tax = 0;
	static double tax_per = 0;
	static int salary = 0;
	
	
	public static void main(String[] args) {	
		input();
		calu();
		print();
	}
	
	public static void input() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = scan.nextLine();
		System.out.print("직급 입력 : ");
		rank = scan.nextLine();
		System.out.print("기본급 입력 : ");
		normal_pay = scan.nextInt();
		System.out.print("수당 입력 : ");
		extra_pay = scan.nextInt();
		

	}
	
	
	public static void calu() {

		sum_pay = normal_pay+extra_pay;
		
		tax = (int) (sum_pay * tax_per_calu());

		salary = sum_pay - tax;
		

	}
	
	
	public static void print() {
		DecimalFormat format = new DecimalFormat("#,###원");
		
		System.out.println("-------" + name + " " +  rank + " 월급" + "-------");
		
		System.out.println("기본급 : " + format.format(normal_pay));
		System.out.println("수당 : " + format.format(extra_pay));
		System.out.println("합계 : " + format.format(sum_pay));
		System.out.println("세금 : " + format.format(tax));
		System.out.println("월급 : " + format.format(salary));
	}
	
	public static double tax_per_calu() {
		double tax_per = 0;
		
		if (sum_pay >= 5000000) {
			tax_per = 0.03;
		} else if (sum_pay >= 3000000) {
			tax_per = 0.02;
		} else {
			tax_per = 0.01;
		}
		
		return tax_per;
	}
	


}

