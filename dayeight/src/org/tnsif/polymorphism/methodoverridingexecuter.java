package org.tnsif.polymorphism;

import java.util.Scanner;

class laptop{
	
	//String generation1,;
	void specification(String generation1,String generation2) {
		System.out.println("laptop:" +generation1);
	}
	public void specification(String generation12) {
		// TODO Auto-generated method stub
		
	}
	
}
class asus extends laptop{
	String generation2;
	 void specification(String generation2,String generation1) {
		 super.specification(generation1,generation2);
		 
		System.out.println("asus:" +generation2);
	}
	public void specification(String generation22) {
		// TODO Auto-generated method stub
		
	}
	
}
public class methodoverridingexecuter {

	public static void main(String[] args) {
		asus a=new asus();
		Scanner s=new Scanner(System.in);
		String generation1=s.nextLine();
		String generation2=s.nextLine();
		a.specification(generation2);
		
		

	}

}
