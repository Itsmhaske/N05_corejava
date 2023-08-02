package org.tnsif.challenges;
/*there are n people standing in a circle waiting to be executed.
 * the counting out begins at some point in the circle 
 * and proxits around a circle in a fixed direction.
 * in each step a certion no of people are skip and next person is executed.
 * the elimination of proxits around the circle
 *  (which is becoming smaller and smaller as the executed pepole are removed)
 * until only last person remain who is given freedom
 * given the total no of person n and no k which indicate that k-1 person are
 *  skip and k th person is skilled in the circle
 *  the task is to choose the person in initial circle that survives */

import java.util.Scanner;

public class circlechallenge {
    public static int circle(int n, int k) {
        if (n == 1) {
            return 1;
        } else {
            return (circle(n - 1, k) + k - 1) % n + 1;
            /*n-1 surviving kth person killed k-1 is skiped out of n and n is the 
             there and +1 is starting position is 1*/
        }
    }
    public static void main(String[] args) {
    	System.out.println("Enter the n and k value");
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	int k=s.nextInt();
        //int n =11;
        //int k = 3;
        System.out.println("The chosen place is " + circle(n, k));
    }
}