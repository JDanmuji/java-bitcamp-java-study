package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat nf = new NumberFormat(); - error 추상 클래스라 생성이 안됨
		
		//Sub class 이용해서 생성
		NumberFormat nf_class = new DecimalFormat("#,###.##원");
		//3자리마다 , 를 찍고 소수 이하 3째자리까지 출력
		System.out.println(nf_class.format(123456789.456789));
		System.out.println(nf_class.format(123456789));
		System.out.println();
		
		//Sub class 이용해서 생성
		NumberFormat nf_class2 = new DecimalFormat("#,###.00원");
		//3자리마다 , 를 찍고 소수 이하 3째자리까지 출력
		System.out.println(nf_class2.format(123456789.456789));
		System.out.println(nf_class2.format(123456789));
		System.out.println();
		//메서드 이용해서 생성
//		NumberFormat nf_method = NumberFormat.getInstance();
		NumberFormat nf_method = NumberFormat.getCurrencyInstance(Locale.US);
		nf_method.setMaximumFractionDigits(2);
		nf_method.setMinimumFractionDigits(2);
		System.out.println(nf_method.format(123456789.456789));
		System.out.println(nf_method.format(123456789));
		System.out.println();
		
	}
}
