package member;

import java.io.Serializable;

public class MemberDTO implements Serializable{
	private String name = null;
	private int age = 0;
	private String phone = null;
	private String address = null;
	
	public MemberDTO(String n, int a, String p, String addr) {
		super();
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
	

	@Override
	public String toString() {
		return name+"\t"+age+"\t"+phone+"\t"+ address;
	}

	
}
