package practice.collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	List<String> mylist=new ArrayList<>();
	mylist.add("java8");
	mylist.add("Hibernate");
	mylist.add("SpringBoot");
	mylist.add("Jdbc");
	
	System.out.println(mylist);
	int x=Collections.binarySearch(mylist, "java8");
	System.out.println(x);
	System.out.println("Binary Serach----------");
	int y=Collections.binarySearch(mylist, "Hibernate");
	System.out.println(y);
	Collections.reverse(mylist);
	System.out.println(mylist);
	Collections.shuffle(mylist);
	System.out.println(mylist);
	Collections.swap(mylist, 2, 3);
	System.out.println(mylist);
	
	
}
}
