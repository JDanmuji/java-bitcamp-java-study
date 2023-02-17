package member;

import java.util.ArrayList;


public class MemberInsert implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		String name = null;
		int age = 0;
		String phone = null;
		String address = null;
		boolean check = false;
		
		System.out.println();
		
		System.out.print("회원의 이름 : ");
		name = scan.next();
		System.out.println();
		System.out.print("회원의 나이 : ");
		age = scan.nextInt();
		System.out.println();
		System.out.print("회원의 전화번호 : ");
		phone = scan.next();
		System.out.println();
		System.out.print("회원의 주소 : ");
		address = scan.next();

		System.out.println();
	
		for (MemberDTO memberDTO : arrayList) {
			
			if (memberDTO.getPhone().equals(phone)) {
				System.out.println("같은 전화번호가 존재합니다.");
				check = true;
				break;
			}
			
		}
		
		if (!check) {
			MemberDTO memberDTO = new MemberDTO(name, age, phone, address);
			
			arrayList.add(memberDTO);
			System.out.println("입력되었습니다.");
		}
		

		System.out.println();
	}

}
