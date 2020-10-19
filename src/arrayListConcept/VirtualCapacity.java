package arrayListConcept;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {

		ArrayList<Object> ar = new ArrayList<Object>(20);
		
		System.out.println(ar.size());// physical capacity is 0 
		// virtual capacity is 10 but not visible
		// we can increase virtual capacity of ArrayLis--> new ArrayList<Object>(20);
		
		ar.add(100);
		System.out.println(ar.size()); //PC (Physical Capacity)= 1
		
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		
	}

}
