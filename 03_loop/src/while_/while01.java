package while_;

public class while01 {

	public static void main(String[] args) {
		
		int a = 0;
		
		while (a < 10) {
			a++;
			System.out.println(a + " ");
		}
		System.out.println();
		
		a = 0;
		
		while (true) {
			a++;
			System.out.println(a + " ");
			
			if (a >= 10) break;
		}
	}
}
