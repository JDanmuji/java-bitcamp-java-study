package SungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public interface SungJuk {
	
	Scanner scan = new Scanner(System.in);

	public void execute(ArrayList<SungJukDTO> arrayList);
}
