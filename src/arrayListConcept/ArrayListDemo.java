package arrayListConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {

	public static void main(String[] args) {

		// default class
		// dynamic array

		int i[] = new int[4];
		i[0] = 100;
		// i[4] = 400;
		// System.out.println(i[0]);
		// System.out.println(i[4]);// java.lang.ArrayIndexOutOfBoundsException

		// default generic:

		ArrayList<Object> ar = new ArrayList<Object>();

		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add('t');
		ar.add(12.33);
		ar.add(true);
		System.out.println(ar);

		System.out.println(ar.get(2));
		System.out.println(ar.size());
		
		//list with other collection:
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(numbers);

		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("Java","Python","Ruby","Perl"));
	
		System.out.println(names);
		System.out.println(names.size());
	
	
	}

}
