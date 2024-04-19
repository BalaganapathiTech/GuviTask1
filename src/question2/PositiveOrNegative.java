package question2;

import java.util.Scanner;

public class PositiveOrNegative {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to Find the answer::");
		int n=sc.nextInt();
		
	
		if(n>=0) {
			System.out.println(n+" is Positive Number");
		}else {
			System.out.println(n+" is Negotive number");
		}
		sc.close();
	}
     
}