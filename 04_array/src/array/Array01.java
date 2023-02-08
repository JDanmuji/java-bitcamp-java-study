package array;

public class Array01 {
	
	public static void main(String[] args) {
		int[] ar;
		ar = new int[5];
		
		System.out.println("배열명 ar = " + ar);
	
		ar[0] = 25;
		ar[1] = 37;
		ar[2] = 55;
		ar[3] = 42;
		ar[4] = 30;
		
		for(int i = 0; i < ar.length; i++) {
			
			System.out.println("ar[" + i + "] :" + ar[i]);
			
		}
		
		System.out.println();

		for(int i = ar.length-1; 0 <= i; i--) {
			
			System.out.println("ar[" + i + "] :" + ar[i]);
			
		}
	
		System.out.println();
	
		for(int i = 0; i < ar.length; i++) {
		
			if(ar[i]%2 != 0) {
				System.out.println("ar[" + i + "] :" + ar[i]);	
			}
			
			
		}
		

		System.out.println();
	
		for(int i = 0; i < ar.length; i++) {
		
			if(ar[i]%2 != 0) {
				System.out.println("ar[" + i + "] :" + ar[i]);
			}
		}
		
		for(int data : ar) {
			
		}
	
	}
}	
