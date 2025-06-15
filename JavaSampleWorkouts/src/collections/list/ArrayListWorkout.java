package collections.list;

import java.util.ArrayList;
import java.util.Collection;

/*
 * Array list work out  
 */
public class ArrayListWorkout {

	public static void main(String[] args) {
		System.out.println("Array list Exploration startted");
		//Simple Array list object creation with generic
		ArrayList<String> sampleArrListObj = new ArrayList<String>();
		//Adding some String objects
		sampleArrListObj.add("India");
		sampleArrListObj.add("USA");
		sampleArrListObj.add("USA");
		
		//Will remove first occurrence of the object 
		sampleArrListObj.remove("USA");
		System.out.println(sampleArrListObj);
		
		//Adding object by index based. But, wont override value. Will shift content right
		sampleArrListObj.add(1,"Singapore_will_be_replaced_by_set");
		
		//Will override index content
		sampleArrListObj.set(1,"Singapore");
		//Will allow duplicates
		sampleArrListObj.add("India");
		
		//Since we used generic as String, wont allow other data type to insert
		//sampleArrListObj.add(1);
		System.out.println(sampleArrListObj);
		
		//remove all using collection object
		Collection<String> dup = new ArrayList<String>();
		dup.add("India");
		sampleArrListObj.removeAll(dup);
		
		//remove if introduced in java 8
		sampleArrListObj.removeIf(n->(n.charAt(0)=='U'));
		System.out.println(sampleArrListObj);
		
		
		
	}

}
