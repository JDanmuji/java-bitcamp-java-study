package basic;

import java.text.DecimalFormat;
import java.lang.Math;

/*
 * 
[문제] 성적계산
이름(name)이 L이고 국어점수(kr) 85점, 영어(eng) 점수 78점, 수학(math) 점수 100점일 때 총점(tot)과 평균(avg)을 구하시오. 

단, 평균은 소수 이하 2째 자리까지 출력하시오.

총점 = 국어점수 + 영어점수 + 수학점수
평균 = 총점 / 과목수

[실행결과]
*** L 성적표 ***
국어		영어		수학		총점		평균
85		78		100		xxx		xx.xxx

*/

public class SunJuk {
	
	static String name = "";
	static int kr = 0;
	static int eng = 0;
	static int math = 0;
	static int tot = 0;
	static double avg = 0.0;

	public static void main(String[] args) {
		
		kr = 85;
		eng = 78;
		math = 100;
		
		Calculator(kr, eng, math);
		print();
		
	}
	
	//계산 
	public static void Calculator(int kr, int eng, int math) {
		
		tot = kr + eng + math;
		avg = (double)tot/3;
		
	}
	
	//출력
	public static void print() {
		
		String tab = "\t";

		//소숫점 둘 째자리까지 출력
		DecimalFormat format = new DecimalFormat("#.##");
		
		System.out.println("*** 성적표 ***");
		
		System.out.print("국어" + tab);
		System.out.print("영어" + tab);
		System.out.print("수학" + tab);
		System.out.print("총점" + tab);
		System.out.println("평균" + tab);
		
		System.out.print(kr + tab);
		System.out.print(eng + tab);
		System.out.print(math + tab);
		System.out.print(tot + tab);
		System.out.print(format.format(avg) + tab);
		
	}
	
	
	
	

}
