package SampleProgram;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the character: ");
		char symbol = sc.next().charAt(0);
		
		System.out.print("Enter the column number: ");
		int col = sc.nextInt();
		
		System.out.print("Enter the row number: ");
		int row = sc.nextInt();
		display(symbol,col,row);
	}
	
	public static void display(char sym , int col, int row) {
		for(int i = 1 ; i <= row; i++) {
			for(int j = 1 ; j <= col ; j++) {
				System.out.print(sym + " ");
			}
			System.out.println();
		}
	}

}
