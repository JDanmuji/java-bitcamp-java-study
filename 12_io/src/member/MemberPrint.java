package member;

import java.util.ArrayList;



public class MemberPrint implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		System.out.println();
		
		
		System.out.println("이름\t나이\t전화번호\t주소");
		
		for (MemberDTO memberDTO : arrayList) {
			System.out.println(memberDTO); //toString 사용
		}
		
		
	}

}
