package org.tnsif.looping;

import java.util.Scanner;

public class LeftTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows=s.nextInt();
		s.close();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print("*");
		}
		System.out.println();   
	}

}
}
