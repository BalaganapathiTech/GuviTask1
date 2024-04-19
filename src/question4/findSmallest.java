package question4;

import java.util.Scanner;

public class findSmallest {
 
	static int arr[]= new int[3];
	static int smallest() {
			
		int i;
		int min=arr[0];
		
		for(i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
		}
			return min;
		}
	
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			for (int i = 0; i < arr.length; i++) {
				System.out.print("Enter number " + (i + 1) + ": ");
				arr[i] = sc.nextInt();
			}
			sc.close();
			System.out.println("The Smallest number is: "+smallest());
		}	
	}