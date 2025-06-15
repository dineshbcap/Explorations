package basic_example;

import java.util.Scanner;

public class Welcome extends AbstractClass{

	int a;
	long myNum = 15000000000l;
	double test = 2.78;
	public static void main(String[] args) {
		char ascii = 65;
		System.out.println("Welcome: " +ascii);
		char continues;
		Scanner scan = new Scanner(System.in);
		do{
			System.out.println("Enter option:: \n\n");
			continues = scan.nextLine().charAt(0);
		}while(continues!='y');
		System.out.println("Over");
		
//		
//		
//		for(int i=0; i<5;i++){
//			for(int j=0; j<10;j++){
//				if(j==2){
//					continue;
//				}
//				System.out.println("J::: "+ j);
//			}
//			System.out.println("i::"+ i);
//		}
//		System.out.println("Over");
		
		Welcome w = new Welcome();
		w.test(5,5);
		w.test(5f,5);
		w.test(5,5.5f);
	}
	
	public void test(int a,int b){
		System.out.println("int int ::" + a + " ::: "+b);
	}
	
	public void test(float a,int b){
		System.out.println("float int ::" + a + " ::: "+b);
	}
	
	public void test(int a,float b){
		System.out.println("int float ::" + a + " ::: "+b);
	}
	
	public void test1(float a,int b){
		
		System.out.println("Got it::: "+ a);
		System.out.println("Got it::: "+ b);
		
		int source[] = new int[]{2,3};
		int source1[] = new int[12];
//		source1 = source;
		
		System.arraycopy(source, 0, source1, 0, source.length);
		source1[2] = 4;
		System.out.println(source1);
		int j = 6;
		
		System.out.println(j++);
		System.out.println(j);
		
		System.out.println(++j);
		System.out.println(j);
		
		for(int i=0; i<5; ++i){
			System.out.println(i);
		}
		
		System.out.println("Sample:: "+ (int)test);
		System.out.println("\nWelcome\rJava");
		System.out.println("Welcome\nJava");
		
		
		
		
	}

	@Override
	void tryCallMe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void tryCallMe1() {
		System.out.println(NUMBERS.ONE);
		// TODO Auto-generated method stub
		
	}

}


enum NUMBERS{
	ONE,
	TWO,
	THREE
}
