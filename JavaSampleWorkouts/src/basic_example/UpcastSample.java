package basic_example;

public class UpcastSample {
	UpcastSample(){
		
	}
	
	UpcastSample(int a){
		
	}
	
	public static void main(String arg[]){
		UpcastSample up1 = new SubClass();
		up1.upcastMethod();
		
		SubClass sc1 = new SubClass();
		sc1.subClassMethod();
		sc1.upcastMethod();
		
		
		//SubClass sc2 = (SubClass) new UpcastSample();
		//sc2.subClassMethod();
		//sc2.upcastMethod();
		
		
		
	}
	
	void upcastMethod(){
		System.out.println("Upcast method in upcastSample class");
		throw new ArithmeticException();
	}
	
	void upcastMethod1(){
		System.out.println("Upcast method in upcastSample class");
	}
}

class SubClass extends UpcastSample{
	
	
	
	/*public static void main(String arg[]){
		UpcastSample up2 = new SubClass();
		up2.upcastMethod();
		up2.upcastMethod1();
		
		
		SubClass sc3 = (SubClass)up2;
		sc3.subClassMethod();
		sc3.upcastMethod();
		
		
	}*/
	/*void tt(){
		System.out.println(ab);
		ab = ab +100;
	}*/
	
	
	void subClassMethod(){
		System.out.println("Sub Class Method");
	}
	
	void upcastMethod(){
		System.out.println("Upcast Method in sub class");
	}
}

abstract class Bike{
	int ab = 10;
}
