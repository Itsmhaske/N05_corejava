package org.tnsif.hirerchicalinheritance;

public class tiramisu extends android{



	private int version;
	

	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public tiramisu(String brand, String slottype ,int version) {
		super(brand, slottype);
		this.version=version;
	}


	@Override
	public String toString() {
		return "Tiramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}
	

}
