package array;

import java.util.Scanner;

public class OccuranceInArray {

	public static void main(String[] args) {
		int arr[] = new int[]{2,3,3,5,7,8};
		int count =0;
		
		int len = arr.length;
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = read.nextInt();
		
		for(int i =0; i<len; i++){
			
			if(arr[i]==num){
				count++;
			}
			
		}
		
		System.out.println("Occurance: "+ count);
		
		
		
	}

}
