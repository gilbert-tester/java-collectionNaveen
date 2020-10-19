package arrayListConcept;

import java.util.ArrayList;

public class GenericArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> markList = new ArrayList<Integer>();
		
		markList.add(100);
		//markList.add(12.43); you can not add Double value in generic Integer arrayList
		
		ArrayList<Double> arD = new ArrayList<Double>();
			
		arD.add(75.50);
	//	arD.add(100); //not possible integer in Double
	
		
		ArrayList<String> studentNames = new ArrayList<String>();
		
		
		studentNames.add("Tom");
		
		
		
	}

}
