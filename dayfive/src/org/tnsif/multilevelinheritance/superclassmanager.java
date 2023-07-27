package org.tnsif.multilevelinheritance;

public class superclassmanager {
private String deptname;
private String name;
private int empid;
public superclassmanager() {
	

}
public superclassmanager(String deptname, String name, int empid) {
	super();
	this.deptname = deptname;
	this.name = name;
	this.empid = empid;
}

@Override
public String toString() {
	return "superclassmanager [deptname=" + deptname + ", name=" + name + ", empid=" + empid + ", getDeptname()="
			+ getDeptname() + ", getName()=" + getName() + ", getEmpid()=" + getEmpid() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}

}