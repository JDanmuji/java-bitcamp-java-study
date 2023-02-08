package while_;

public class DoWhile {
	
	public static void main(String[] args) {
		int a = 0;
		
		do {
			a++;
			System.out.println(a + " ");
		} while (a<10);
		System.out.println();
		
		char ch = 'A';
		do {
			ch++;
			System.out.println(ch + " ");
		} while (ch<'Z');
	}

}
