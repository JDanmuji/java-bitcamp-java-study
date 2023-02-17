package member;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public interface Member {


	Scanner scan = new Scanner(System.in);

	public void execute(ArrayList<MemberDTO> arrayList) throws IOException, ClassNotFoundException;
}
