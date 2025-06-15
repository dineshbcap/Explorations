package basic_example;

public class StringCompareToExample {

	public static void main(String arg[]) {
		System.out.println("Welcome To String Compare To Program");
		String name[] = new String[]{"Seenu", "Dinesh", "Geetha", "Sangeetha", "Abi"};
		
		for(int outerCount=0; outerCount<name.length; outerCount++){
			for(int innerCount=0; innerCount<name.length; innerCount++){
				if(name[outerCount].compareTo(name[innerCount])<0){
					String temp = name[outerCount];
					name[outerCount] = name[innerCount];
					name[innerCount] = temp;
				}
			}
		}
		
		for(int counter=0; counter<name.length; counter++){
			System.out.println(name[counter]);
		}

	}

}
