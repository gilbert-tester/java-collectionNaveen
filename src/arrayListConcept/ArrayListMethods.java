package arrayListConcept;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

	public static void main(String[] args) {

		ArrayList<String> ar1 = new ArrayList<String>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("JS");

		ArrayList<String> ar2 = new ArrayList<String>();

		ar2.add("Testing");
		ar2.add("Dev Ops");

		//ar1.addAll(ar2);
/*
		System.out.println(ar1);
		
		ar1.addAll(2,ar2);
		System.out.println(ar1);
		
		ar1.clear();
		
		System.out.println(ar1);
		*/
		
		ArrayList<String> cloneList = (ArrayList<String>)ar1.clone();
		System.out.println(cloneList);
		
		System.out.println(ar1.contains("Python"));
		System.out.println(ar1.indexOf("Ruby"));
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
		numbers.removeIf(num -> num % 2-1 == 0); //even number
		//numbers.removeIf(num -> num % 2 == 0); //odd number
		System.out.println(numbers);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
