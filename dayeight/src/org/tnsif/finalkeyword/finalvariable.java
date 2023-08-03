package org.tnsif.finalkeyword;
//program to demonstraete on final keyword with variable
public class finalvariable {
	//The blank final field NUM may not have been initialized
	//final int NUM;
	final float SALARY=78000.67f;
	public void print()
	{
		/*we cant change the value of final variable*/
		//SALARY=890000.56f;
		System.out.println("salary is: " +SALARY);
	}

}
