package class__;

class Fruit {
	private String pum = "";
	private	int jan = 0;
	private	int feb = 0;
	private	int mar = 0;
	private	int tot = 0;
	private static int sumJan = 0;
	private	static int sumFeb = 0;
	private	static int sumMar = 0;
	
	public Fruit(String p, int j, int f, int m) {
		this.pum = p;
		this.jan = j;
		this.feb = f;
		this.mar = m;
	}
	
	public void calcTot() {
		tot  = (jan + feb + mar);
	}

	public void display() {
		System.out.print(pum + "\t");
		System.out.print(jan + "\t");
		System.out.print(feb + "\t");
		System.out.print(mar + "\t");
		System.out.print(tot + "\t");
		System.out.println();
		
		sumJan += jan;
		sumFeb += feb;
		sumMar += mar;
		
	}
	
	public static void output() {
		
		System.out.println("-----------------------------------");
		
		System.out.print("\t"+sumJan + "\t" +sumFeb + "\t" +sumMar + "\t" );
	}

	
	
}

public class FruitMain {
	
	public static void main(String[] args) {
		Fruit[] fruit = new Fruit[3];
		
		fruit[0] = new Fruit("사과", 100, 80, 75);
		fruit[0].calcTot();
		fruit[1] = new Fruit("포도", 30, 25, 10);
		fruit[1].calcTot();
		fruit[2] = new Fruit("딸기", 25, 30, 90);
		fruit[2].calcTot();
		
		System.out.println("-----------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-----------------------------------");
		
		for (int i = 0; i < fruit.length; i++) {
			fruit[i].display();		
		}
		
		Fruit.output();
		
		
		
	}
}

/*
 * 과일 판매량 구하기
월별 매출합계도 구하시오

클래스 : Fruit
필드 : pum, jan, feb, mar, tot
sumJan, sumFeb, sumMar

스캐너 x

생성자(품명, 1월, 2월, 3월)
calcTot()
display()
public static void output()

클래스 : FruitMain

[실행결과]
---------------------------------
PUM      JAN   FEB   MAR      TOT
---------------------------------
사과    100    80    75     255
포도     30    25    10     xxx
딸기     25    30    90     xxx
---------------------------------
        xxx   xxx   xxx            output()로 처리
 * */
