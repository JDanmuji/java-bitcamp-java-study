package for_;

import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int coin = scan.nextInt();
		
		
		for (int i = 300; i < coin; i+=300) {
			
			int com = (int) (Math.random()*3);
			System.out.println("가위(1), 바위(2), 보자기(3) 번호 입력 : " );
			int game = scan.nextInt();
			boolean check = true;
			
			System.out.println("컴퓨터 : " + com);
			System.out.println("나 : " + game);
			
			if(com == game) {
				System.out.println("You Draw!!");
			} else {
				
				switch(com) {
				case 1 : check = game == 2 ? true : false;
					break;
				case 2 : check = game == 3 ? true : false;
					break;
				case 3 : check = game == 1 ? true : false;
					break;
				}
				
				if (check) {
					System.out.println("You Win!!");
				} else {
					System.out.println("You Lose!!");
				}
				
				
			}
			
			
		}
		
		

	}
}

/*
[문제] 가위, 바위, 보 게임
- 가위(1), 바위(2), 보자기(3) 지정한다.
- 컴퓨터(com)는 1 ~ 3까지 난수로 나온다
- 1게임당 300원으로 한다.

[실행결과]
insert coin : 1000

가위(1), 바위(2), 보(3) 중 번호 입력 : 3 (user, 사용자)
컴퓨터 : 바위   나 : 보자기
You Win!!

가위(1),바위(2),보(3) 중 번호 입력 : 1 (user)
컴퓨터 : 가위   나 : 가위
You Draw!!

가위(1),바위(2),보(3) 중 번호 입력 : 3 (user)
컴퓨터 : 가위   나 : 보자기
You Lose!!
*/