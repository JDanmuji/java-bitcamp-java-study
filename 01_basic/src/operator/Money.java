package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {
	
	
	static int money = 5378;
	

	static String kor_1000 = "천원";
	static String kor_100 = "백원";
	static String kor_10 = "십원";
	static String kor_1 = "일원";
	

	public static void main(String[] args) {
		DecimalFormat format = new DecimalFormat("#,###");
		
		
		Scanner scan = new Scanner(System.in);
		
		
		
		money = scan.nextInt();
		
		
		System.out.println("현금 : " + format.format(money) + "원");
	
		
		print(kor_1000, 1000);
		print(kor_100, 100);
		print(kor_10, 10);
		print(kor_1, 1);
		

	}	
	
	//현금 교환
	public static int moneyChange(int money_num) {
	
		int num = money/money_num; 
		
		money = money%money_num;		
		
		return num;
	}
	
	//출력
	public static void print(String kor_money , int money) {

		
		System.out.println(kor_money + " : " + moneyChange(money) + "개");
		
	}
	
	
	
	
}

/*
 * [문제] 현금 5378원 있습니다.
 * 
 * 현금 5378원 
 * 천원 5장 백원 3개 십원 7개 일원 8개
 */