package while_;

import java.util.Scanner;

public class NumberGame {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int com, user, count = 0;
		
		
		
		boolean check = true;
		String y_n = "y";
		
	
		
	    while (check) {
	    	
	    	com = (int) (Math.random()*100 + 1);
	    	System.out.println(com);
	    	count = 0;
	    	
			while (check) {

		    	System.out.print("숫자 입력 : ");
				user = scan.nextInt();
				
					
				if (com > user) {
		    		System.out.println(user + "보다 큰 숫자 입니다.");
		    	} else if (com < user) {
		    		System.out.println(user + "보다 작은 숫자 입니다.");	
		    	} else { 
		    		check = false;
		    	}
					count++;
		    }
			
			System.out.println("딩동뎅..." + count + "번만에 맞추셨습니다.");
    		System.out.print("한번 더?(y/n) : ");
			y_n = scan.next();
			
			if (y_n.equals("N") || y_n.equals("n")) {
				break;
			}
			
			check = true;
    		
	    
	    }
	    
	   // System.out.println("딩동뎅..." + count + "번만에 맞추셨습니다.");
	}

}

/*
[문제] 숫자 맞추기 게임
- 컴퓨터가 1 ~ 100사이의 난수를 발생하면, 발생한 난수를 맞추는 게임
- 몇 번만에 맟주었는지 출력한다.

[실행결과]
1 ~ 100사이의 숫자를 맞추세요 (70)

숫자 입력 : 50
50보다 큰 숫자입니다.

숫자 입력 : 85
85보다 작은 숫자입니다.

~~~

숫자 입력 : 70
딩동뎅...x번만에 맞추셨습니다.

*/