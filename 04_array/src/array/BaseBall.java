package array;

import java.util.Scanner;

public class BaseBall {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] com = new int[3];
		int[] user = new int[3];
		
		boolean check = true; 
		boolean yn = true;
		
		String user_value = "";
		String user_yn = "";
		
		int strike = 0;
		int ball = 0;
		
		
		while (yn) {
			
			System.out.print("게임을 실행하시겠습니까?(Y/N) : ");
			user_yn = scan.next();
			
			if (user_yn.equals("y") || user_yn.equals("Y")) {
				yn = true;
			} else if (user_yn.equals("n") || user_yn.equals("N")) {
				yn = false;
			} else {
				continue;
			}
			
			
			if (yn) {
				
				System.out.println("게임을 시작합니다.");
	
				while(check) {
				
					user_value = scan.next();
					
					for (int i = 0; i <  com.length; i++) {
						
						com[i] = (int) (Math.random()*9+1);
						
						for (int j = 0; j < i ; j++) {
						
							if (com[i] == com[j]) {
								i--;
								break;
							} 
						}
					}
								
					
//					for(int data : com) {
//						System.out.print(data + " ");
//					}
					
					for (int i = 0; i < user_value.length(); i++) {
						user[i] = Integer.parseInt(Character.toString(user_value.charAt(i)));
					}
					
					
					for (int i = 0; i <  com.length; i++) {

						for (int j = 0; j < i; j++) {
							
							if (com[i] == user[j]) {
								strike++;
							} else {
								ball++;
							}
							
						}
					
					}
					
//					for (int i = 0; i <  com.length; i++) {
//
//						if (com[i] == user[i]) {
//							strike++;
//						} else {
//							ball++;
//						}	
//					
//					}
					
					System.out.print(strike + "스트라이크 ");
					System.out.println(ball + "볼");
					
					if (strike == 3) {
						yn = false;
						check = false;
						System.out.println("프로그램을 종료합니다.");
						break;
					} else {
						strike = 0;
						ball = 0;
					}
					
				}
							
				
			} else {
				
				System.out.println("프로그램을 종료합니다.");
				check = false;
				yn = false;
			}
		
		}
		
		
		
	}
}


/*
[문제] 야구게임
크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
발생한 수를 맞추는 게임
중복은 제거한다

[실행결과]
게임을 실행하시겠습니까(Y/N) : w
게임을 실행하시겠습니까(Y/N) : u
게임을 실행하시겠습니까(Y/N) : y

게임을 시작합니다

숫자입력 : 123
0스트라이크 0볼

숫자입력 : 567
0스트라이크 2볼

숫자입력 : 758
1스트라이크 2볼
...

숫자입력 : 785
3스트라이크 0볼

프로그램을 종료합니다.
*/