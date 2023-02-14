package interface_;

import java.awt.Menu;

public class ComputMain {

	public static void main(String[] args) {
		ComputeService computeService = new ComputeService();
		computeService.menu();
		
		System.out.println("프로그램을 종료합니다.");
	}
}
