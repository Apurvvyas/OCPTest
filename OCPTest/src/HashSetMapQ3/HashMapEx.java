package HashSetMapQ3;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
public static void main(String[] args) {
	
	Employee e1 = new Employee("Apurv","Palasia");
	Employee e2 = new Employee("Apurv","Tilak Nagar");
	Employee e3 = new Employee("Aman","Anarpurna");
	Employee e4 = new Employee("Atul","Old Palasia");
	Employee e5 = new Employee("Apurv","Palasia");
	
	Map<Employee,Integer> emp = new HashMap<>();
	emp.put(e1,1);
	emp.put(e2,2);
	emp.put(e3,3);
	emp.put(e4,5);
	emp.put(e5,5);
	
	System.out.println(emp);
	/*for(Map.Entry<Employee, Integer>entry:emp.entrySet()){
		System.out.println(entry.getValue());
		System.out.println(entry.getKey());
	}*/
	}
	
}

