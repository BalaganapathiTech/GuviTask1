package question1;

import java.util.Scanner;

public class PrintNumbers {

	public static void main(String[] args) {
       
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting number");
		int n=sc.nextInt();
		
		System.out.println("Enter the Ending number");
		int m=sc.nextInt();
		
		for(int i=n;i<=m;i++) {
			System.out.print(i+"-");
		}
		
	sc.close();	
	}

}
