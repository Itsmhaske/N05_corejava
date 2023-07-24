package org.tnsif.looping;
import java.util.Scanner;
public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		do {
             System.out.println("value of n is: " +n);
             n++;
	}while(n<14);

}
}