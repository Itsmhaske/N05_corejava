package org.tnsif.abstractkeyword;

public abstract class abstractclassexecuter {

	public static void main(String[] args) {
		/* we cannot create an object for an abstract class*/
		//operator o=new operator();
		addition a=new addition();
		a.print(10,20);
		a.operation();

	}

}
