package array;

public class Array05 {

	
	public static void main(String[] args) {
		char[] ar = new char[50];
		int[] count = new int[26];
		int[] count_tmp = new int[26];

		//ASCII Code A value
		int key = 65;
		
		//알파벳 random array 생성
		for (int i = 0; i < ar.length; i++) {
			ar[i] =  (char) ((Math.random() * 26) + 65);
		}
		
		//알파벳 random array 출력
		for (int j = 0; j < ar.length; j++) {
		
			System.out.print(ar[j] + "\t");
			
			if (j%10 == 9) {
				
				System.out.println();
				
			}
		}
		
		
		//count_tmp, A ~ Z ASCII array 생성
		for (int k = 0; k < count_tmp.length; k++) {
			
			count_tmp[k] = key;
			key++;
			
		}
		
		
		//알파벳 random 수 만큼(50)
		for (int m = 0; m < ar.length; m++) {
			
			// 알파벳 수 만큼(26)
			for (int n = 0; n < count.length; n++) {
				
				// 랜덤 표와 알파벳 A ~ Z ASCII array 비교 후 count array 에 순서대로 삽입
				if ((int)ar[m] == count_tmp[n]) {
					count[n] += 1;
				}
				
			}
		}
		
		
		// count array 출력
		for (int k = 0; k < count.length; k++) {
			
			System.out.println((char) count_tmp[k] + " : " + count[k]);
			
		}

		
		
		
		
	}
	
	
	
}

/*
 * [문제] 크기가 50개인 문자배열을 잡아서 65~90사이의 난수를 발생하여 저장 후 출력하시오
- 1줄에 10개씩 출력
- A의 개수? B의 개수? C의 개수? ~~~ Z의 개수 ?

[실행결과]
D F A G H I J K L T
O P W E R F V A S B
P Y R O L E E Z L I
F E U Z T U P P P A
S P G B F F O W J C

A : 2
B : 3
...
X : 0
Y : 1
Z : 0
 */
