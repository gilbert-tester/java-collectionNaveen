package arrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> studentList = new ArrayList<String>();

		studentList.add("Tom");
		studentList.add("Gilbert");
		studentList.add("Dipto");
		studentList.add("Lokkhi");

		// typical for loop;

		for (int i = 0; i < studentList.size(); i++) {
			System.out.println(studentList.get(i));
		}
		System.out.println("++++++++++++ \n");

		// for each loop

		for (String s : studentList) {
			System.out.println(s);
		}
		System.out.println("++++++++++++ \n");
		// JDK 1.8 - streams with Lambda:

		studentList.stream().forEach(modon -> System.out.println(modon));

		// iterator: iterator is a interface
		System.out.println("++++++++++++ \n");

		Iterator<String> it = studentList.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());

		}

	}

}
