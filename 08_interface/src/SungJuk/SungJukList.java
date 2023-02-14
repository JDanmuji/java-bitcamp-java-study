package SungJuk;

import java.util.ArrayList;

public class SungJukList implements SungJuk{

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		
		System.out.println();
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t총점\t평균");
		
		for (SungJukDTO sungJukDTO : arrayList) {
			System.out.println(sungJukDTO); //to String 사용
		}
		
	}

}
