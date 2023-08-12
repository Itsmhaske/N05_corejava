package org.tnsif.CheckExeption;
import java.io.FileInputStream;

public class CheckExeption {

	public static void main(String[] args) {
		try {
		FileInputStream f = new FileInputStream("C:\\Users\\prati\\OneDrive\\Documents\\intership .pdf");
		System.out.println("File is Exists!!!!");
		}
		catch(Exception e)
		{
			System.out.println("Exception Hnadled"+e);
		}
	}

}