package member;

import java.util.ArrayList;

public class MemberPhoneSearch implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		String phone_search = null;
		boolean check = false;
		
		System.out.println();
		
		System.out.print("검색할 회원의 전화번호 : ");
		phone_search = scan.next();
		
		for (MemberDTO memberDTO : arrayList) {
			
			if (memberDTO.getPhone().equals(phone_search)) {
				System.out.println(memberDTO);
				check = true;
				break;
			}
			
		}
		
		if(!check) {
			System.out.println("해당 전화번호를 가진 회원이 존재하지 않습니다.");
		}
		
	}

}
