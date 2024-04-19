package question6;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int n=sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                if (j > i) {
                    System.out.print(j);
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
        sc.close();
    }	
}
// hello