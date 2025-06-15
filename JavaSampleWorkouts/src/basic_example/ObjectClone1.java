package basic_example;

public class ObjectClone1 implements Cloneable{
	int test = 10;
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
	
	public static void main(String ar[]) throws CloneNotSupportedException{
		ObjectClone1 ob1 = new ObjectClone1();
		ob1.test = 20;	
		ObjectClone1 ob2 = (ObjectClone1) ob1.clone();
		
		ob1.test =5;
		System.out.println(ob1.test);
		System.out.println(ob2.test);
	}
}
