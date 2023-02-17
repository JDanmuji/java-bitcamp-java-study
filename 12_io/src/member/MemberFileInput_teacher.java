package member;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

import io.PersonDTO;

public class MemberFileInput_teacher implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		
		
		ObjectInputStream ois;
		
		
		try {
			ois = new ObjectInputStream(new FileInputStream("member_info_save.txt"));
			
			while(true) {
				try {
					
					MemberDTO data = (MemberDTO) ois.readObject();
					arrayList.add(data);
					
				} catch(EOFException e) {
					break;
				}
			}
			
			ois.close();
			System.out.println("파일에 읽기 완료");

			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}  catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		
	
	
	}

}
