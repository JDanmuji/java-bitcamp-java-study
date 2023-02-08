package array;

import java.util.Scanner;

public class Lotto_auto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		boolean check = true;
		int temp = 0;
		int money = 0;
		
		
		Scanner scan = new Scanner(System.in);
		
		money = scan.nextInt();
		
		
		for (int k=1; k < (money/1000)+1; k++) {
		
				for (int i = 0; i <  lotto.length; i++) {
			
					lotto[i] = (int) (Math.random()*45)+1;
					//System.out.print(lotto[i] + " ");
			
					for (int j = 0; j < i ; j++) {
				
						if (lotto[i] == lotto[j]) {
							i--;
							break;
						} 
					}
			
			}
		

			for (int i=0; i < lotto.length-1; i++) {
			
				for (int j=i+1; j < lotto.length; j++) {
					
					if (lotto[i] > lotto[j]) {
						temp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = temp;
					}
				
				}
			}
		
		
			for (int data : lotto) {
				System.out.print(String.format("%5d", data));
			}
			
			System.out.println();
		
			if (k%5 == 0 ) {
				System.out.println();
			}
		}
		
		
	}
}

/*
[문제] 로또 - 자동
- 크기가 6개인 배열 생성
- 1 ~ 45 사이의 난수 발생
- 숫자는 오름차순하여 출력 (Selection Sort)
- 출력시 자리수는 5자리로 지정
- 중복 숫자가 나오면 안된다
- 1000원당 1줄이 나온다 
- 5줄마다 줄바꿈

[실행결과]
현금 입력 : 7000
    2    4   19   39   43   44
   22   26   33   38   39   42
    5    6    8   25   35   45
    3   14   23   30   34   35
   18   20   25   27   32   37
   
    1   16   32   34   41   42
    5    6   18   30   33   44
    
*/