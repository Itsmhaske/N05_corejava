package org.tnsif.decisionmaking;

import java.util.Scanner;

public class nestedifelse {

	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int age=s.nextInt();
		int weight=s.nextInt();
		if(age>=12)
		{
		
			if(weight>=40)
			{
				System.out.println("eligibale for bujee jumping");
				if(weight>110)
				{
					System.out.println("extra ropes will be added");
				}
			}
			else
			{
				System.out.println("not eligible");
			}
		}
		
		else
		{
			System.out.printLn("not eligibale");
		}
		s.close();

}
