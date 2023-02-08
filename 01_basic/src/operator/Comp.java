package operator;

public class Comp {

	/*
	[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

	[실행결과]
	B → b         e → E
	
	*/
	public static void main(String[] args) {
		char ch = 'k'; // 69
		//char ch = 'e'; //101
		char change = 'a';
		
		if(ch > 90) {
			change = (char) ((int)ch-32);
		} else {
			change = (char) ((int)ch+32);
		}

		System.out.println(ch + " -> " + change);
		
	}
}
