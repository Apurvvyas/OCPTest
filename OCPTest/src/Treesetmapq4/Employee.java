package Treesetmapq4;

public class Employee implements Comparable<Employee> {
@Override
	public String toString() {
		return "Employee [name=" + name + ", address=" + address + "]";
	}

private String name;
private String address;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Employee(String name, String address) {
	super();
	this.name = name;
	this.address = address;
}
Employee(){}
@Override
public int compareTo(Employee o) {
	return this.getName().compareTo(o.getName());

}

}
