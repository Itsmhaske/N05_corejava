/* program to demonstrate paremeterized constructor*/
package org.tnsif.classandobject;

public class citizen {
	//data members
	String citizenType;
	long aadharNo;
	String gender;
	String city;
	citizen()
	{
		System.out.println("Demonstration on default constructor");
	}
	public citizen(String citizenType,long aadharNo, String gender,String city)
	super();
	this.citizenType=citizenType;
	this.aadharNo=aadharNo;
	this.gender=gender;
	this.city=city;
	

}
	@Override
	public String toString() {
		return "citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + "]";
	}

}