
//program to demonstrate encapsulation
/*encapsulation acheive the data hiding using private access*/
//driver class
package org.tnsif.encapsulation;

public class encapsulationdemo {

	public static void main(String[] args) {
		HDFC h=new HDFC();
        h.setAccountNo(1234567788899L);
        h.setAccountType("current Account");
        h.setCvvNo(233);
        h.setPinNo(1221);
        //accessing and printing all the private members
        System.out.println(h.getAccountNo());
        System.out.println(h.getAccountType());
        System.out.println(h.getCvvNo());
        System.out.println(h.getPinNo());
	}

}
