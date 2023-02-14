package SungJuk;

import java.util.ArrayList;

public class SungJukDelete implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
	
		boolean check = false;
		int no = 0;
		
		
		System.out.println();
		System.out.print("번호 입력 : ");
		
		no = scan.nextInt();
		
		for (int i = 0; i < arrayList.size(); i++) {
		
				
			if (arrayList.get(i).getNo() == no) {
				
				System.out.println(arrayList.get(i).toString());

				arrayList.remove(i);
				
				System.out.println("삭제되었습니다.");
				check = true;
				break;
				
			}
			
			
		}
		
		if (!check) {
			System.out.println("잘못된 번호입니다.");
		}
		
		
		
	}

	
}
