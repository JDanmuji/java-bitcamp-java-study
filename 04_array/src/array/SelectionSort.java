package array;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] ar = {32, 40, 25, 78, 56};
		int temp = 0;
		
		for (int i = 0; i<ar.length; i++) {
			System.out.println(String.format("%4d", ar[i]));
		}
		
		System.out.println();
		
		//정렬
		//오름차순(asc)
		//내림차순(desc)
		for (int i=0; i < ar.length-1; i++) {
			for (int j=i+1; j < ar.length; j++) {
				
				if (ar[i] > ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			
			}
		}
		
		for (int i = 0; i<ar.length; i++) {
			System.out.println(String.format("%4d", ar[i]));
		}
		
	}

}
