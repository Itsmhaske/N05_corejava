package org.tnsif.accessspecifierdemo;
import org.tnsif.accesspecifier.bank;

public class bankexecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b=new bank();
		b.bankName="SBI";
		b.displaypublic();
		/* pinNo and display private() method are private 
		 * so we can't access into another class and 
		 * another package,only we can access private 
		 * data member inside the same class*/
		//b.pinNo;
		//b.displayprivate();
		/* account NO and displayDefault() method are default that's why 
		 * we are not able to access into another package*/
         //b.accountNo;
		//b.displayDefault();	}

}
}