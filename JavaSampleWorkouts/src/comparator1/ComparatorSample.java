package comparator1;

import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class ComparatorSample implements Comparator<String>{
	@Test
	public static void main(String ar[])throws IOException{
		HashSet<User> names = new HashSet<User>();
		names.add(new User("dinesh8", 1));
		names.add(new User("dinesh7", 2));
		names.add(new User("dinesh4", 3));
		names.add(new User("dinesh3", 5));
		names.add(new User("dinesh1", 4));
		
		HashSet<String> names1 = new HashSet<String>();
		names1.add("dinesh3");
		names1.add("dinesh2");
		names1.add("dinesh1");
		
		ArrayList al = new ArrayList(names1);
		Collections.sort(al);
		
		for (Object object : al) {
			System.out.println(((User)object).name);
			System.out.println(((User)object).no);
		}
		
		System.out.println(al);
	}

	/*@Override
	public int compare(Object o1, Object o2) {
		User u1 = (User)o1;
		User u2 = (User)o2;
		//return u1.name.toLowerCase().compareTo(u2.name.toLowerCase());
		
		return o1.toString().toLowerCase().compareTo(o2.toString().toLowerCase());
	}*/

	@Override
	public int compare(String o1, String o2) {
		return o1.toString().toLowerCase().compareTo(o2.toString().toLowerCase());
	}
	
	
	
	
	
}

class User {
	String name;
	int no;
	public User(String name, int no){
		this.name = name;
		this.no = no;
	}
}

class Comp implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		User u1 = (User)o1;
		User u2 = (User)o2;
		return u1.name.toLowerCase().compareTo(u2.name.toLowerCase());
	}
}