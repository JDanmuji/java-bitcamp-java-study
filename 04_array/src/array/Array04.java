package array;

import java.util.Scanner;

public class Array04 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean[] car_price = {false, false, false, false, false};
		
		
		int num = 1;
		int car_num = 1;
		
		System.out.println("주차장 관리 프로그램");
		System.out.println("**************************");
		System.out.println("\t1.입차");
		System.out.println("\t2.출차");
		System.out.println("\t3.리스트");
		System.out.println("\t4.입차");
		System.out.println("**************************");
		System.out.println("메뉴 : ");
		
		while(true) {
			
			num = scan.nextInt();
			
			System.out.println( num + "번인 경우");
			
			if(num == 1) {

				System.out.print("위치 입력 : ");
				car_num = scan.nextInt();
				
				System.out.print( car_num + "위치에 입차 /");
				
				if(car_price[car_num-1]) {
					System.out.println("이미 주차되어있습니다.");	
				} else {
					System.out.println("주차 되었습니다.");
					car_price[car_num-1] = true;
				}
				
			} else if (num == 2) {

				System.out.print("위치 입력 : ");
				car_num = scan.nextInt();
				
				System.out.print( car_num + "위치에 출차 /");
				
				if(car_price[car_num-1]) {
					System.out.println("출차 되었습니다.");	
					car_price[car_num-1] = false;
				} else {
					System.out.println("주차되어 있지 않습니다.");
				}
				
			} else if (num == 3) {
				for (int i = 0; i < car_price.length; i++) {
					System.out.println(i+1 + " 위치 : " + car_price[i]);
				}
			} else {
				System.out.print("종료되었습니다.");
				break;
			}
			
		}
		
		
	}
}


/*
[문제] 주차관리 프로그램

[실행결과]
주차장 관리 프로그램
**************
   1. 입차
   2. 출차
   3. 리스트
   4. 종료
**************
  메뉴 : 
  
1번인 경우
위치 입력 : 3
3위치에 입차 / 이미 주차되어있습니다

2번인 경우
위치 입력 : 4
4위치에 출차 / 주차되어 있지않습니다

3번인 경우
1위치 : true
2위치 : false
3위치 : true
4위치 : false
5위치 : false  
*/