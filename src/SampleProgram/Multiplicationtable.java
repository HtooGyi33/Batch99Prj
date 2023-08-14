package SampleProgram;

import java.util.Scanner;

public class Multiplicationtable {
	static int index = 0;
	static int bound = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter the index for Ali");
		index = obj.nextInt();
		
		System.out.print("Enter the bound for Ali");
		bound = obj.nextInt();
		
		System.out.println();
		
		Ali();
	}
	public static void Ali() {
		for(int i = 1; i<=bound; i++) {
			System.out.println(index + " x " + i + " = " + (index*i));
		}
	}
}
