package SungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.naming.Binding;


//String 내림차순
class DescendingObj implements Comparator<SungJukDTO> {

	@Override
	public int compare(SungJukDTO o1, SungJukDTO o2) {
		return o2.getName().compareTo(o1.getName());
	}

}

//Integer 오름차순
class AscendingObj implements Comparator<SungJukDTO> {

	@Override
	public int compare(SungJukDTO o1, SungJukDTO o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

public class SungJukSort implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		int sort_num = 0;
		SungJukList sungJuckList = new SungJukList();
		DescendingObj descending = new DescendingObj();
		AscendingObj ascendingObj = new AscendingObj();
	
		System.out.println("오름차순(1), 내림차순(2) : ");
		sort_num = scan.nextInt();
		
		if (sort_num == 1) {

		    Collections.sort(arrayList, ascendingObj);
			sungJuckList.execute(arrayList);
		} else {
			Collections.sort(arrayList, descending);
			sungJuckList.execute(arrayList);
		}
		


		
	}

}
