package basic_example;

public class String_Method_Examples {

	public static void main(String[] args) {
		String sampleString = "I am doing good am today";
		
		// Index '0' based
		System.out.println(sampleString.indexOf('a'));
		// Will look for search string after specified index
		System.out.println(sampleString.indexOf('a', 10));
		// Will return the staring first letter starting index
		System.out.println(sampleString.indexOf("go"));
		
		// To get the sub-string based on starts and end(n-1) index
		System.out.println(sampleString.substring(2,4));
		
	}

}
