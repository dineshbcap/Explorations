package basic_example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class FileReadWriteExample {

	static int test;
	
	
	public void testVariableWithDefaultValue(){
		int a;
		System.out.println(a);
		
	}
	
	/**
	 * This is example program for file read and write 
	 * @param args => Mandatory argument expected by main method
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException {
//		String currentDir = System.getProperty("user.dir");
//		FileInputStream file = new FileInputStream(currentDir+"/src/resource/HugeFile.txt");
//		FileOutputStream outputFile = new FileOutputStream(currentDir+"/src/resource/HugeFile_Copy.txt");
//		@SuppressWarnings("resource")
//		Scanner scanner = new Scanner(file);
//		while(scanner.hasNextLine()){
//			String temp = scanner.nextLine();
//			System.out.println(temp);
////			outputFile.write(temp);
//		}
//		
//		
//		@SuppressWarnings("resource")
//		Scanner readInput = new Scanner(System.in);
//		System.out.println("Please enter name: \n");
//		String name = readInput.nextLine();
//		System.out.println(name);
//	
		
		
		System.out.println(test);
	}
}


