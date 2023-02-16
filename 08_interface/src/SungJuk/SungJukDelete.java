package SungJuk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SungJukDelete implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
	
		boolean check = false;
		String name = null;
		Arrays.asList(1, 2);
		
		System.out.println();
		System.out.print("삭제할 이름 입력 : ");
		
		 name = scan.next();
		
		 
		//for문 순회 중, 일부 요소가 탐색에서 누락, (조건식 사용하던 중 size가 실시간으로 반영으로 인한 문제)
		//높은 Index에서 낮은 Index 방향으로 순회로 코드 변경
		for (int i = arrayList.size()-1; -1 < i; i--) {
		
			if (name.equals(arrayList.get(i).getName())) {
				
				
				System.out.println(arrayList.get(i).toString());

				arrayList.remove(i);
				
				System.out.println("삭제되었습니다.");
				
				check = true;
				
			}
			
			
		}
		
		/*
		 * int count = 0;
		 * 
		 * for (SungJukDTO sungJukDTO : arrayList) {
		 * if(sungJukDTO.getName().equals(name)) { arrayList.remove(sungJukDTO);
		 * count++; } }
		 */
		
//		
//		Iterator<SungJukDTO> tr = arrayList.iterator();
//		
//		while(tr.hasNext()) {
//			SungJukDTO sungjukDTO  = tr.next();
//			
//			for (sungjukDTO.getName().equals(name)) {
//				it.remove();
//			}
//		}
//		
//		if (!check) {
//			System.out.println("회원의 정보가 없습니다.");
//		}
		
		
		
	}

	
}
