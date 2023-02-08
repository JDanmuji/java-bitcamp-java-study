package array;

import java.util.Scanner;

public class MultiArray05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String user_name = "";
		int cnt = 0;
		int subjectCnt = 0;

		
		System.out.print("인원수 : ");
		cnt = scan.nextInt();
		
		
		String[] name = new String[cnt];
		String[][] subject = new String[cnt][];
		int[][] jumsu = new int[cnt][];
		double[] arg = new double[cnt];

		
		
		for (int i=0; i < name.length; i++) {
			
			System.out.print("이름 입력 : ");
			name[i] = scan.next();
		
			
			System.out.print("과목 수 입력 : ");
			subjectCnt = scan.nextInt();
			
			
			subject[i] = new String[subjectCnt];
			jumsu[i] = new int[subjectCnt+1];
			
			for (int j=0; j < subjectCnt; j++) {
				System.out.print("과목명 입력 : ");
				subject[i][j] = scan.next();
			}
			 
			for (int k=0; k < subject[i].length; k++) {
				System.out.print( subject[i][k] + " 점수 입력 : ");
				jumsu[i][k] = scan.nextInt();
			}
			
			System.out.println("------------------------------------------------------");
		}
		
		
		
		int jumsu_sum = 0;
		
		//총점, 평균, 학점 계산
		for(int i = 0; i < jumsu.length; i++) {

			for (int j = 0; j < jumsu[i].length; j++) {
				
				if (j != jumsu[i].length-1) {
					
					jumsu_sum += jumsu[i][j];
					
				} else {
					
					jumsu[i][j] = jumsu_sum;
					
					arg[i] =  ((double) jumsu_sum/subjectCnt);
					
					
					jumsu_sum = 0;
				}
			}	
		}
		
		
		for(int i = 0; i < subject.length; i++) {

			System.out.print("이름\t");

			for (int j = 0; j < subject[i].length; j++) {
				
				System.out.print(subject[i][j] + "\t");	
			}
			
			
			System.out.print("총점\t");
			System.out.print("평균\t");
			
			System.out.println();
			
			System.out.print(name[i] + "\t");
			
			for (int k = 0; k < jumsu[i].length; k++) {
				
				System.out.print(jumsu[i][k] + "\t");
				
			}	
			System.out.print(String.format("%.2f", arg[i]) + "\t");
			
			System.out.println();
			
			System.out.println("------------------------------------------------------");
		}
		
		
		
		
		
		
	
		
		
		
	}
	
//
//	
//	인원수를 입력하여 인원수만큼 데이터를 입력받고 총점과 평균을 구하시오
//	평균은 소수이하 2째자리까지 출력
//
//	[실행결과]
//	인원수 : 2 (cnt)
//
//	이름입력 : 홍길동 (name)
//	과목수 입력 : 2   (subjectCnt)
//	과목명 입력 : 국어 (subject)
//	과목명 입력 : 영어
//	국어 점수 입력 : 95 (jumsu)
//	영어 점수 입력 : 100
//	---------------------
//	이름입력 : 이기자
//	과목수 입력 : 3
//	과목명 입력 : 국어
//	과목명 입력 : 영어
//	과목명 입력 : 과학
//	국어 점수 입력 : 95
//	영어 점수 입력 : 100
//	과학 점수 입력 : 90
//	---------------------
//
//	이름     국어     영어   총점     평균
//	홍길동    95     100   xxx     xx.xx
//
//	이름      국어  영어   과학    총점      평균
//	이기자   95   100   90    xxx      xx.xx
	
	
}
