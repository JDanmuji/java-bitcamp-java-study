package array;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6];
		boolean check = true;
		int temp = 0;
		
		
		
		
		while(check) {
			
			check = false;
		
			for (int i = 0; i <  lotto.length; i++) {
				lotto[i] = (int) (Math.random()*45)+1;
			//	System.out.print(lotto[i] + " ");
			}
				
			//System.out.println();
			
			for (int i = 0; i <  lotto.length; i++) {
		
				for (int j = 0; j < i ; j++) {
				
					if (lotto[i] == lotto[j]) {
						check = true;
						break;
					} 
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
		
		
		for(int i = 0; i <  lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
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

[실행결과]
    2    4   19   39   43   44
    
*/