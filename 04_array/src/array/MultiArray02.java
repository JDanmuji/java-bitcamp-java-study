package array;

public class MultiArray02 {

	public static void main(String[] args) {
		int[][] ar = new int[10][10];
		int num = 0;
		
//		for(int i = 0; i < ar.length; i++) {
//			for(int j=0; j < ar[i].length; j++) {
//				num++;
//				ar[i][j] = num;
//			}
//
//		}
		
		
//		for(int i = 0; i < ar.length; i++) {
//			
//			
//			for(int j=0; j < ar[i].length; j++) {
//				num++;	
//				ar[j][i] = num;
//			}
//			
//			
//		}
		
		
		for(int i=ar.length-1; 0 <= i; i--) {
			
			
			for(int j=ar[i].length-1; 0 <= j; j--) {
				num++;	
				ar[i][j] = num;
			}
			
			
		}
		
		
		
		for(int i = 0; i < ar.length; i++) {
			
			for(int j=0; j < ar[i].length; j++) {
				
				System.out.print(String.format("%4d", ar[i][j]) + " ");
			
			
				
				
			}
			System.out.println();
		
		}
	}
	

}
