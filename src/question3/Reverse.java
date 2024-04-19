package question3;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number ");
		int a=sc.nextInt();
		
		int r=0;
		while(a!=0) {
			int digit= a%10;
			r=digit+r*10;
			a=a/10;
		}
		sc.close();
		System.out.print(r);
	}
	}