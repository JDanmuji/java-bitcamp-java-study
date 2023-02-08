package array;

import java.util.Scanner;

public class Array03 {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size = 0;
		int[] ar;
		int sum = 0;
		
		System.out.print("배열 크기 입력 : ");
		size = scan.nextInt();
		
		ar = new int[size];
		
		
		for(int i = 0; i < ar.length; i++) {
			System.out.print("ar[" + i + "] 입력 : " );
			ar[i] = scan.nextInt();
		}
		
		int max = ar[0];
		int min = ar[0];
		
		for (int j = 0; j <ar.length; j++) {

			if (ar[j] > max) {
				max = ar[j];
			}
			
			if (min > ar[j]) {
				min = ar[j];
			}

		}
		
		for(int data : ar) {
			System.out.print(data + "\t");
			sum = sum + data;
		}
		
		System.out.println();
		System.out.println("합 = " + sum);
		System.out.println("제일 큰 값 = " + max);
		System.out.println("제일 작은 값 = " + min);
		
	}
}
