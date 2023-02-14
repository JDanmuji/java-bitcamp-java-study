package SungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		int no = 0;
		String name = null;
		int kr = 0;
		int eng = 0;
		int math = 0;
		boolean check = false;
		
		System.out.println();
	
		
		System.out.print("번호 입력 : ");
		no = scan.nextInt();
		
		System.out.print("이름 입력 : ");
		name = scan.next();
		
		System.out.print("국어 입력 : ");
		kr = scan.nextInt();
		
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		
		System.out.print("수학 입력 : ");
		math = scan.nextInt();
		
		for (SungJukDTO sungJukDTO : arrayList) {
			
			if (sungJukDTO.getNo() == no) {
				System.out.println("같은 번호가 존재합니다.");
				check = true;
				break;
			}
			
		}
		
		if (!check) {
			SungJukDTO sungJukDTO = new SungJukDTO(no, name, kr, eng, math);
			sungJukDTO.calu();
			
			arrayList.add(sungJukDTO);
			System.out.println("입력되었습니다.");
		}
	
	}
	
	

}
