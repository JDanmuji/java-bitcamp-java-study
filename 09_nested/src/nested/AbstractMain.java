package nested;

public class AbstractMain extends AbstractTest {


	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		
		AbstractTest at = new AbstractTest() { // 익명 inner 클래스
			public void setName(String name) { //구현, 일회용 사용
				this.name = name;
				
			}
		};
		
		InterA in = new InterA() { // new는 InterA 인터페이스가 아니다.
	
			public void aa() {}
			public void bb() {}
			
		};
	}

}
