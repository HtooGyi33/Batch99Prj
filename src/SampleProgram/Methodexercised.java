package SampleProgram;

import java.util.Scanner;

public class Methodexercised {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first number: ");
		int first = sc.nextInt();
		System.err.println();
		System.out.print("Enter the second number: ");
		int second = sc.nextInt();
		System.out.println();
		max(first , second);
		
		int maximumval = maxi(first , second);
		System.out.println(maximumval);
	}
	
	public static void max(int first , int second) {
		if (first > second) {
			System.out.println(first + " is maximum value");
		}
		else {
			System.out.println(second + " is maximum value");
		}
	}
	
	public static int maxi(int first , int second) {
		
		int max;
		
		if (first > second) {
			max = first;
		}
		else {
			max = second;
		}
		
		return max;
		
	}

}
