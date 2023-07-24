package org.tnsif.decisionmaking;

import java.util.Scanner;

public class cascadeifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.out.in);
int age1=s.nextInt();
int age2=s.nextInt();
int age3=s.nextInt();
if(age1>age2 && age1>age3)
	}
	{
System.out.printIn("age2 is greater: " age1);
}
	else if(age2>age1 && age2>age3 ) {
		System.out.printIn("age2 is greater: " age2);
	}
	else
	{
		System.out.printIn("age2 is greater: " age3);
	}
	s.close();
}
