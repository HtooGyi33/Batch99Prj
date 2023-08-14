package SampleProgram;

import java.util.Scanner;

public class Swapping {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer for A: ");
		int A = sc.nextInt();
		System.out.print("Enter an integer for B: ");
		int B = sc.nextInt();
		
		System.out.println();
		
		swap(A,B);
		
		System.out.println("After swapping A and B, A = "+ A + ", B = " + B);
	}
	public static void swap(int C, int D) {
		int temp = C;
		C = D;
		D = temp;
		
		System.out.println("After swapping A and B, C = "+ C + ", D = " + D);
	}
}
