package member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;



public class MemberService {

private ArrayList<MemberDTO> arrayList = new ArrayList<MemberDTO>();
	
	
	public void menu() throws IOException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		Member member = null;
		int num;
		
		while (true) {
			System.out.println();
			System.out.println("******************");
			System.out.println("\t1. 등록");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 핸드폰 검색");
			System.out.println("\t4. 이름으로 오름차순");
			System.out.println("\t5. 파일 저장");
			System.out.println("\t6. 파일 읽기");
			System.out.println("\t7. 끝");
			System.out.println("******************");
			
			System.out.println(" 번호 : ");
			num = scan.nextInt();
	
			
			if (num == 7) break;
			
			if (num == 1) {
				member = new MemberInsert();
					
			} else if (num == 2) {
				member = new MemberPrint();
					
			} else if (num == 3) {
				member = new MemberPhoneSearch();
					
			} else if (num == 4) {
				member = new MemberNameAsc();
					
			} else if (num == 5) {
				member = new MemberFileOutput();
					
			} else if (num == 6) {
				member = new MemberFileInput();
					
			}
			
			
			member.execute(arrayList);
		}
	}

}

