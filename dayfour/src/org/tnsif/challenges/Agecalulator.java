/* ask the  user for thetre birth year input it as  two digits (02) and for the courent year in coded as two digits(22).
 * write a program user courent age in years */
package org.tnsif.challenges;

import java.util.Scanner;

public class Agecalulator {
	
	public static void age( int birth ,int curnt){
		if(birth < curnt )
		{
			System.out.println(curnt-birth);
			
		}
		else
		{
			System.out.println("the age is "+((100-birth)+curnt));
		}
	}

	public static void main(String[] args) {
		System.out.println(" Eneter the birth year and current year");
		Scanner s= new Scanner(System.in);
		int birth = s.nextInt();
		int curnt = s.nextInt();
		age(birth,curnt);

	}

}