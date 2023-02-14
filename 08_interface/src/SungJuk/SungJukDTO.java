package SungJuk;

public class SungJukDTO {
	private int no = 0;
	private String name = null;
	private int kr = 0;
	private int eng = 0;
	private int math = 0;
	private double tot = 0.0;
	private double avg = 0.0;
	
	
	public SungJukDTO(int no, String name, int kr, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kr = kr;
		this.eng = eng;
		this.math = math;	
	}
	 
	public void calu() {
		this.tot = (kr + eng + math);
		this.avg = ((double) kr + eng + math/3);
		
	}
	

	public int getNo() {
		return no;
	}



	public void setNo(int no) {
		this.no = no;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getKr() {
		return kr;
	}



	public void setKr(int kr) {
		this.kr = kr;
	}



	public int getEng() {
		return eng;
	}



	public void setEng(int eng) {
		this.eng = eng;
	}



	public int getMath() {
		return math;
	}



	public void setMath(int math) {
		this.math = math;
	}

	
	public double getTot() {
		return tot;
	}

	
	public void setTot(int tot) {
		this.tot = tot;
	}

	
	public double getAvg() {
		return avg;
	}

	
	public void setAvg(int avg) {
		this.avg = avg;
	}

	
	@Override
	public String toString() {
		return no+"\t"+name+"\t"+kr+"\t"+eng+"\t"+math+"\t"+tot+"\t"+avg;
	}
	




	
	
}
