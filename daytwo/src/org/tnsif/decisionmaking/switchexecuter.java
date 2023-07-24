package org.tnsif.decisionmaking;
import java.util.Scanner;
public class switchexecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int songno=s.nextInt();
		switch(songno)
		{
		   case 1:
		      System.out.println("perfect");
		      break;
		   case 2:
	      System.out.println("andhava");
	      break;
		    case 3:
	      System.out.println("chana mere ya");
	      break;
		    default:
		    
		      System.out.println("invalid input");
		}      
		      
	}

}
