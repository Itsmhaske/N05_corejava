package org.tnsif.CheckExeption;
/*
 * Program to demonstrate custom Exception
 * to use customExecption extends Exception class(parent)
 */
public class logincredintial extends Exception
{
	private String str;

	public logincredintial(String str) {
		super();
		this.str = str;
	}

	//tostring method
	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
	
}
