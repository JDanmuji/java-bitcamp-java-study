package member;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MemberFileOutput implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) throws IOException {
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("member_info_save.txt"));
		oos.writeObject(arrayList);
		oos.close();
		
	}

}
