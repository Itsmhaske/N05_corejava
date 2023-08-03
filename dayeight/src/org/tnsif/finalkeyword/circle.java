package org.tnsif.finalkeyword;

public class circle extends shape{
	final float area=34.64f;
	//cannot override the final method from shape
	/*void printshapetype()
	{
		System.out.println(area : +"sq.cm");
	}*/
	public void printshapetype(float area) {
		System.out.println(area  +"sq.cm");
	}

}
