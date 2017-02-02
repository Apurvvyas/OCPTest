package HashSetMapQ3;

import java.util.HashSet;
import java.util.Set;

public class Hashsetex {
public static void main(String[] args) {
	Set<String>fruits=new HashSet<>();
	fruits.add("apple");
	fruits.add("mango");
	fruits.add("Orange");
	fruits.add("Orange");
	
	for(String fs: fruits){
		System.out.println(fs);
	}
    
	
	Employee e1 = new Employee("Apurv","Palasia");
	Employee e2 = new Employee("Apurv","Tilak Nagar");
	Employee e3 = new Employee("Aman","Anarpurna");
	Employee e4 = new Employee("Atul","Old Palasia");
	Employee e5 = new Employee("Apurv","Palasia");

	
	Set<Employee> hashset = new HashSet<>();
	hashset.add(e1);
	hashset.add(e2);
	hashset.add(e3);
	hashset.add(e4);
	hashset.add(e5);
	for (Employee employee : hashset) {
		System.out.println(employee);
	}
	
	
	
	
}

}
