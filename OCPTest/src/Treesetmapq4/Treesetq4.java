package Treesetmapq4;


import java.util.Set;
import java.util.TreeSet;

public class Treesetq4 {
public static void main(String[] args) {

	Set<Employee>employee=new TreeSet<>();
	Employee e3=new Employee("Aman","Bhopal");
	Employee e4=new Employee("Aditya","Chennai");
	Employee e1=new Employee("Apurv","Indore");
	Employee e2=new Employee("Apurv","Indore");
	Employee e5=new Employee("bob","Delhi");
	
	employee.add(e1);
	employee.add(e2);
	employee.add(e3);
	employee.add(e4);
	employee.add(e5);
	System.out.println(employee);
	for (Employee employee2 : employee) {
		System.out.println(employee2);
	}
	
}
	
	
	
}
