// program to determine an Arithmatic operaters
package org.tns_operators;
import java.util.Scanner;
public class Arithmatic_operator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner (System .in);
		int num1=s.nextInt();
		int num2=s.nextInt();
System.out.println(num1+num2);
System.out.println(num1-num2);
System.out.println(num1*num2);
System.out.println(num1/num2);
System.out.println(num1%num2);
s.close();
	}

}
