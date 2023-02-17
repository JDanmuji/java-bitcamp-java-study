package SungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.naming.Binding;


//총점으로 내림차순
class DescendingObj implements Comparator<SungJukDTO> {

	@Override
	public int compare(SungJukDTO dto1, SungJukDTO dto2) {
		
		if (dto1.getTot() < dto2.getTot()) {
			return -1;
		} else if(dto1.getTot() > dto2.getTot()) {
			return 1;
		}  else {
			return 0;
		}
	}

}

//이름으로 오름차순
class AscendingObj implements Comparator<SungJukDTO> {

	@Override
	public int compare(SungJukDTO o1, SungJukDTO o2) {
		return o1.getName().compareTo(o2.getName());
	}

}




public class SungJukSort implements SungJuk {

	public void menu(ArrayList<SungJukDTO> arrayList) {
		int sort_num = 0;
		SungJukList sungJuckList = new SungJukList();
		DescendingObj descending = new DescendingObj();
		AscendingObj ascendingObj = new AscendingObj();
	
		while (true) {
			System.out.println("********************************");
			System.out.println("1. 총점으로 내림차순");
			System.out.println("2. 이름으로 오름차순");
			System.out.println("3. 이전메뉴");
			System.out.println("********************************");
			sort_num = scan.nextInt();
			
			if (sort_num ==3) break;
			
			if (sort_num == 1) {
				Collections.sort(arrayList, descending.reversed());
				sungJuckList.execute(arrayList);
			
			} else if (sort_num == 2){
				Collections.sort(arrayList, ascendingObj); 
				sungJuckList.execute(arrayList);
			} 
			
		}
	}
	
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		this.menu(arrayList);
		

		
	}

}
