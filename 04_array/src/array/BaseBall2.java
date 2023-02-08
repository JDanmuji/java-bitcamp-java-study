package array;

import java.util.Scanner;

public class BaseBall2 {

	
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
		
		do {
			System.out.print("게임을 실행하시겠습니까?(Y/N) : ");
			user_yn = scan.next();
			
		} while(!user_yn.equals("y") && !user_yn.equals("Y") && !user_yn.equals("n") && !user_yn.equals("N"));
		
		
		if(user_yn.equals("y") || !user_yn.equals("Y")) {
			
			for(int i =0; i < com.length; i++) {
				com[i] = (int) Math.random()*9+1;
				
				for(int j =0; j < i; j++ ) {
					if(com[i] == com[j]) {
						i--; 
						break;
						
						
					}
				}
				

			}
			
			
			System.out.println(com[0] + " " + com[1]+ com[2]);
			
			while(true) {
				System.out.println();
				System.out.print("숫자 입력 : ");
				user_value = scan.next();
				
				user[0] = user_value.charAt(0)-48;
				user[1] = user_value.charAt(1)-48;
				user[2] = user_value.charAt(2)-48;
				
				System.out.println(user[0] + " "+ user[1] + " " + user[2] + " ");
				
				for(int i=0; i< com.length; i++) {
					for(int j =0; j < user.length; j++) {
						
						if(com[i] == user[j]) {
							if(i == j) strike++;
							else ball++;
						}
					}
				}
					
				
				System.out.println(strike + "스트라이크\t" +  ball + "보");
				
				if(strike == 3) {
					System.out.println("정답");
					break;
				}
					
					
			}
					
		} else {
			System.out.println("프로그램을 종료하니다.");
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