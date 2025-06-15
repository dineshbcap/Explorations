package basic_example;

public class CanNotCreateProgramWithoutMain {
	//if there is no public keyword/ static missing/ return type except void/ main method name change/ argument except String array, 
	// we will end up with error => Error: Main method not found in class
	public static void main(String argument[]){
		System.out.println("Welcome");
		System.out.println(main(10));
	}
	
	//we can overload main method with no above mentioned restriction
	public static int main(int a){
		System.out.println("Welcome from main with int type argument");
		return a;
	}

}
