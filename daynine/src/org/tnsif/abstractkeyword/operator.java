package org.tnsif.abstractkeyword;

public abstract class operator 
{
	//abstract method
	abstract void operation();
	abstract void multiplication();
	//concrete method
	void print(int a,int b)
	{
		System.out.println(a+b);
	}

}
