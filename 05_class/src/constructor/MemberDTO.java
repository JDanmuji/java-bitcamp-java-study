package constructor;

public class MemberDTO {
//DTO : Data Transfer Object (1인분 클래스)
//VO : Value Object
	private String name;
	private int age;
	private String phone;
	private String address;
	//생성자를 통해서 데이터 4개를 받아온다.
	
	public MemberDTO(String n, int a, String p, String addr) {
		this.name = n;
		this.age = a;
		this.phone = p;
		this.address = addr;
	}
	




	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}