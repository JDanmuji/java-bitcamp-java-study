package SungJuk;

import java.util.ArrayList;
import java.util.Scanner;


public class SungJukService {
	private ArrayList<SungJukDTO> arrayList = new ArrayList<SungJukDTO>();
	
	
	public void menu() {
		Scanner scan = new Scanner(System.in);
		SungJuk sj = null;
		int num;
		
		while (true) {
			System.out.println();
			System.out.println("******************");
			System.out.println("\t1. 입력");
			System.out.println("\t2. 출력");
			System.out.println("\t3. 수정");
			System.out.println("\t4. 삭제");
			System.out.println("\t5. 정렬");
			System.out.println("\t6. 끝");
			System.out.println("******************");
			
			System.out.println(" 번호 : ");
			num = scan.nextInt();
	
			
			if (num == 6) break;
			
			if (num == 1) {
				sj = new SungJukInsert();
					
			} else if (num == 2) {
				sj = new SungJukList();
					
			} else if (num == 3) {
				sj = new SungJukUpdate();
					
			} else if (num == 4) {
				sj = new SungJukDelete();
					
			} else if (num == 5) {
				sj = new SungJukSort();
					
			}
			
			sj.execute(arrayList);
		}
	}
}
