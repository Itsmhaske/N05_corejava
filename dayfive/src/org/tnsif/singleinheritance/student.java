package org.tnsif.singleinheritance;

public class student extends citizen {
	//private data members
	private int rollno;
	private String collegeName;
	public student() {
		//super()=it called to parent class default constructor
	
		super();
	
	System.out.println("child class default constructor");

}
	public student(String city, int pincode, long aadharNo, long contactNo,int rollno,String collegeName) {
		super(city, pincode, aadharNo, contactNo);
		this.rollno=rollno;
		this.collegeName=collegeName;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	@Override
	public String toString() {
		return "student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
}
