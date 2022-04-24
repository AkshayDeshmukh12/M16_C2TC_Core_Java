package com.mm16;

class Student {
	private int sId;
	private String sName;
	private String sAddress;
	private String sGender;
	private long sMobileNo;

	// for accessing private variable from other class we are taking 
	// support of getter-setter method's. 
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public String getsGender() {
		return sGender;
	}
	public void setsGender(String sGender) {
		this.sGender = sGender;
	}
	public long getsMobileNo() {
		return sMobileNo;
	}
	public void setsMobileNo(long sMobileNo) {
		this.sMobileNo = sMobileNo;
	}


}

public class Encap {

public static void main(String[] args) {
	// creating object for Student class
	Student s= new Student();
	// all field of student class are private , so we are setting 
	// values to those variable using public setter method
	s.setsId(12);
	s.setsName("Akshay Deshmukh");
	s.setsAddress("Aurangabad, MH");
	s.setsGender("Male");
	s.setsMobileNo(9146873588L);

	// Reading those value using getter methods
	int id= s.getsId();
	String name = s.getsName();
	String address= s.getsAddress();
	String gender= s.getsGender();
	long mobile= s.getsMobileNo();

    // printing values using S.o.p
	System.out.println("===Student Details Are===");
	System.out.println("Student Id: \t"+id);
	System.out.println("Student Name: \t"+name);
	System.out.println("Student Address: \t"+address);
	System.out.println("Student Gender:\t"+gender);
	System.out.println("Student Mobile No: \t"+mobile);
}

}
