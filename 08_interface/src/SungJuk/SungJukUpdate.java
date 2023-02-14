package SungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		int no = 0;
		String name_change = null;
		int kr_change = 0;
		int eng_change = 0;
		int math_change = 0;
		boolean check = false;
		
		System.out.println();
		System.out.print("번호 입력 : ")
		;
		no = scan.nextInt();
		
		for (int i = 0; i < arrayList.size(); i++) {
			
			if (arrayList.get(i).getNo() == no) {
				
				System.out.println(arrayList.get(i).toString());
				

				System.out.print("수정할 이름 입력 : ");
				name_change = scan.next();

				System.out.print("수정할 국어 입력 : ");
				kr_change = scan.nextInt();
				
				System.out.print("수정할 영어 입력 : ");
				eng_change = scan.nextInt();
				
				System.out.print("수정할 수학 입력 : ");
				math_change = scan.nextInt();
				
				arrayList.get(i).setName(name_change);
				arrayList.get(i).setKr(kr_change);
				arrayList.get(i).setEng(eng_change);
				arrayList.get(i).setMath(math_change);
				arrayList.get(i).calu();
				
				System.out.println("수정되었습니다.");
				check = true;
				break;
				
			} 
			
			
								
		}
		
		if (!check) {
			System.out.println("잘못된 번호입니다.");				
		}
		
		
		
	}

}
