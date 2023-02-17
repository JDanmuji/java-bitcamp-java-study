package member;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import io.PersonDTO;

public class MemberFileInput implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("member_info_save.txt"));
		
		ArrayList<MemberDTO> data = (ArrayList<MemberDTO>) ois.readObject();
		
		arrayList.clear();
		
		System.out.println("이름\t나이\t전화번호\t주소");
		
		for (MemberDTO memberDTO : data) {
			System.out.print(memberDTO.getName() + "\t");
			System.out.print(memberDTO.getAge() + "\t");
			System.out.print(memberDTO.getPhone() + "\t");
			System.out.print(memberDTO.getAddress() + "\t");
			System.out.println();
			

			arrayList.add(memberDTO);
		}
		
		
		
	
		
		ois.close();
	
	}

}
