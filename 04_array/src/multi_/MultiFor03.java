package multi_;

public class MultiFor03 {

	public static void main(String[] args) {
	
		int count = 1;
		
		for (int j=1; j <10; j++) {
			
			for (int i=2; i < 10; i++) {
				
				
				for (int k=1; k < 10; k++) {
				
					System.out.print( i + "*" + j + "="  +  i*k + "   ");
					if(k%3 == 0) {
						System.out.println();	
						break;
					}
					
					
				
				}
				
				continue;
				
				
			
			}
			System.out.println();	
		}
	
	}
}
