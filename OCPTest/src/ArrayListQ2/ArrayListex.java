package ArrayListQ2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListex {

	public static void main(String[] args) {
		List<String> list1= new ArrayList<>();
		list1.add("red");
		list1.add("yellow");
		list1.add("green");
		list1.add("purple");
		list1.remove(2);
		Collections.sort(list1);
		
		
		for (String string : list1) {
			System.out.println(string);
		}
		//Integer
		List<Integer> list2= new ArrayList<>();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list2.add(4);
		list2.remove(2);
		Collections.sort(list2);
		for (String string : list1) {
			System.out.println(string);
		}
		
	Student s1 = new Student("abc","Apurv");
	Student s2 = new Student("aaac","Amey");
	Student s3 = new Student("abc","pankaj");
	Student s4 = new Student("abc","Raahul");
	Student s5 = new Student("abcd","Amar");
	
	
	
	
	List<Student> student= new ArrayList<>();
	student.add(s1);
	student.add(s2);
	student.add(s3);
	student.add(s4);
	student.add(s5);
	Collections.sort(student);
	
		
		
		
		
		
		
		
	}
	
	
}
