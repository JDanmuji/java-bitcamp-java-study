package member;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



//이름으로 오름차순
class AscendingObj implements Comparator<MemberDTO> {

	@Override
	public int compare(MemberDTO o1, MemberDTO o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

public class MemberNameAsc implements Member {

	
	public void menu(ArrayList<MemberDTO> arrayList) {
		AscendingObj ascendingObj = new AscendingObj();
		MemberPrint memberPrint = new MemberPrint();
		
		Collections.sort(arrayList, ascendingObj);
		memberPrint.execute(arrayList);
	}
	
	
	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		System.out.println();
		this.menu(arrayList);
	}
	
	
	
	

}
