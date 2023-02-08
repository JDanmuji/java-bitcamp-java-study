package operator;

import java.util.Random;
import java.util.Scanner;

/*
[문제] 주사위 게임 - 난수
2개의 주사위를 던져서 큰값을 가진 주사위가 승이다.
주사위 값의 합도 출력하시오

[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 승
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 승
-----------------------------
주사위1 : 3   주사위2 :3
무승부
*/

public class Dice extends Operator01 {

	static String dice_1_name = "주사위 1";
	static String dice_2_name = "주사위 2";
			
	
	public static void main(String[] args) {
		int dice_1, dice_2 = 0;
		
		Scanner scan = new Scanner(System.in);
		 
		while(true) {
 
			if (scan.nextLine() != null) {
 
				dice_1 = random_dice();
				dice_2 = random_dice();
					
				print(dice_1, dice_2);	
 
			} 
 
		}
		
	}
	
	//(int) (Math.random() * (y-x+1) + x);
	public static int random_dice() {
		int dice_num = 0;
		
		Random random = new Random();
		
		dice_num = (int) (Math.random() * (5-1+1) + 1);

		return dice_num;
	}
	
	public static void print(int dice_1, int dice_2) {
		int dice_sum = dice_1+dice_2;
		
		System.out.print( dice_1_name + " : " + dice_1 + "\t");
		System.out.println( dice_2_name + " : " + dice_2 + "\t");
		
		if (dice_1 > dice_2) {
			System.out.println( dice_1_name + " 승 " + dice_sum);	
		} else if (dice_1 < dice_2) {
			System.out.println( dice_2_name + " 승 " + dice_sum);
		} else {
			System.out.println("무승부" + dice_sum);
		}
		
		System.out.println("주사위 값 합계 : " + dice_sum);
		System.out.println("---------------------------------------");
	}
}
