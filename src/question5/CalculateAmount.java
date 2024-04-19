package question5;

import java.util.Scanner;

public class CalculateAmount {
	
	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int p=sc.nextInt();
		
		if(p<500) {
			System.out.println("There is No Discount(Purches RS-500+)");
		}else if(p>=500 && p<1000) {
			int Discount=p*10/100;
			int Finnal=p-Discount;
			System.out.println("You Got 10% Offer");
			System.out.print("Final Amount is RS-"+Finnal);
		}else if(p>=1000) {
			int Discount=p*20/100;
			int Finnal=p-Discount;
			System.out.println("You Got 20% Offer");
			System.out.print("Final Amount is RS-"+Finnal);
		}
		sc.close();
	}
}