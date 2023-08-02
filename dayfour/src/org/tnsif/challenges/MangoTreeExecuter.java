package org.tnsif.challenges;

import java.util.Scanner;

/*pratik is so much interesting in gardening and hence he plants more tress 
 * in his gardern. he plants tress in rectangular fasion with order of rows and 
 * coloumns an numbers the tress row wise order.
 * he planted the mango tree only in the 1st row 1st column and last colmns.
 * so,given the tree no. and rows and colomns
 *  your task is to find out 
 * wherther the given tree is mango tre or not
 * input n=5(no. of rows and colomns)
 * t=11(tree no.)*/
public class  MangoTreeExecuter{
	static void   isMangoTree(int n, int t)
	{
		if(t%n==0||t%n==1||t<=n)
		{
			System.out.println("mango tree");
		
		}
		else
		{
			System.out.println(" not a mango tree");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value of n and t");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);

	}

}
