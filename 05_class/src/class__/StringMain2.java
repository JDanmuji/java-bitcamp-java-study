package class__;

import java.util.Scanner;

public class StringMain2 {

	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //입력받은 문자열
        String content = null;
        //입력받은 문자열 temp, (입력받은 문자열 - 바꿀 문자열)
        String content_tmp = null;
        //현재 문자열
        String content_before = null;
        //바꿀 문자열
        String content_after = null;
        //바꿀 문자열 위치
        int num = 0;
        //치환 횟수
        int cnt = 0;
        //바꿀 문자열 존재 여부
        int num_presence = 0;

        while (true) {

            System.out.print("문자열 입력 : ");
            content = scan.next();

            System.out.print("현재 문자열 입력 : ");
            content_before = scan.next();

            System.out.print("바꿀 문자열 입력 : ");
            content_after = scan.next();

            content_tmp = content;
            num_presence = content.toUpperCase().indexOf(content_before.toUpperCase());
            
            
            
            // 바꿀 문자열 존재 true
            if (num_presence > -1) {

                // 치환 count for 문
                for (int i = 0; i < content_tmp.length(); i++) {
                	
                	num = content_tmp.toUpperCase().indexOf(content_before.toUpperCase(), 0);
                    // 바꿀 문자열 위치 있을 시
                    if (num > -1) {
                                                            // (바꿀 문자열 위치+바꿀 문자열의 길이) , 맨 끝 문자열 
                        content_tmp = content_tmp.substring(num+content_before.length(), content_tmp.length());
                        cnt++;
                    }


                }   
                
                                            //정규식 (?i) : 대소문자 상관없이
                content = content.replaceAll("(?i)" + content_before , content_after);
                System.out.println(content);
                System.out.println(cnt + "번 치환");

                cnt = 0;

            // 바꿀 문자열 존재 false
            } else {

                if (content.length() < content_before.length()) {
                    System.out.println("입력한 문자열의 크기가 작습니다.");
                }

                System.out.println("치환 할 수 없습니다.");

//                System.exit(0);
                break;
            }

        }




    }

		
		

}



/*

치환하는 프로그램을 작성하시오 - indexOf(?, ?), replace()
String 클래스의 메소드를 이용하시오
대소문자 상관없이 개수를 계산하시오
[실행결과]
문자열 입력 : aabba
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환
문자열 입력 : aAbbA
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbba
1번 치환
문자열 입력 : aabbaa
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddbbdd
2번 치환
문자열 입력 : AAccaabbaaaaatt
현재 문자열 입력 : aa
바꿀 문자열 입력 : dd
ddccddbbddddatt
4개 치환
문자열 입력 : aabb
현재 문자열 입력 : aaaaa
바꿀 문자열 입력 : ddddd
입력한 문자열의 크기가 작습니다
치환 할 수 없습니다
 
 */
