package org.tnsif.exception;
/*
 * Program to demonstrate custom Exception
 * to use customExecption extends Exception class(parent)
 */
public class ArithmaticException extends Exception
{
	private String str;

	public ArithmaticException(String str) {
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