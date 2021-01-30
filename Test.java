/*
Answer Q1
Name: Md Naimul Islam
ID: 2014000000038

OUTPUT:
01764118433
*/

class Boom {
	private int age;
	private String phoneNumber;
	Boom(int age, String phone){
		this.age = age;
		phoneNumber = phone;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
}

public class Test {
	public static void main(String[] args) {
		Boom b = new Boom(26, "01764118433");
		System.out.println(b.getPhoneNumber());
	}
}