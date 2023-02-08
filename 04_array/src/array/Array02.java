package array;

public class Array02 {
	
	public static void main(String[] args) {
		String[] ar = {"호랑이", "사자", "코끼리","기린", "긴팔원숭이", "하이애나", "뱀", "고릴라"};
		
		for(int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
			System.out.println(ar[i].length());
			System.out.println(ar[i].charAt(0));
			System.out.println(ar[i].charAt(ar[i].length()-1));
		}
		
		for(String data : ar) {
			System.out.println(data);
		}
	}
}
