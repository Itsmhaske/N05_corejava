//program to demonstrate on access specifier
package org.tnsif.accesspecifier;

public class bank {
    public String bankName;
    private int pinNo;
    long accountNo=342567889124L;
    public void displaypublic()
    {
    	System.out.println("Bank name is: "+bankName);
    }
    private void displayprivate() 
    {
    	System.out.println("pin No is: "+pinNo);
    }
    void displayDefault()
    {
    	System.out.println("Account No is: "+accountNo);
    }
}
