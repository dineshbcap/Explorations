
public class ObjectClone implements Cloneable{
	int test = 10;
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
	}  
	
	public static void main(String ar[]) throws CloneNotSupportedException{
		ObjectClone ob1 = new ObjectClone();
		ob1.test = 20;	
		ObjectClone ob2 = (ObjectClone) ob1.clone();
		
		ob1.test =5;
		System.out.println(ob1.test);
		System.out.println(ob2.test);
	}
}
