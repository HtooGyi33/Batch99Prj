package SampleProgram;

import java.util.Scanner;
public class Method2 {
	public static boolean flag = false;
	public static char validation = 'N';
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		do {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first integer: ");
			int one  = sc.nextInt();
			System.out.println("Enter the second integer: ");
			int two  = sc.nextInt();
			
			calculation(one, two);
		}
		while(flag);
		
		System.out.println("End");
	}
	
	public static void calculation( int one , int two) {
		Scanner sc = new Scanner(System.in);
		char con;
		System.out.println("Enter the logic operator");
		con = sc.next().charAt(0);
		
		switch(con){
			case '+':
				System.out.println("Sum is "+ (one + two));
				break;
			case '-':
				System.out.println("Subtraction is "+ (one - two));
				break;
			case '*':
				System.out.println("Multiplication is "+ (one * two));
				break;
				
			default:
				System.out.println("Wrong input");
				flag = true;
				break;
		}
		System.out.println();
		sc.nextLine();
		System.out.print("Do you want to start again? (Y/N): ");
		validation = sc.next().charAt(0);
		if (validation == 'Y') {
			flag = true;
		}
		else {
			flag = false;
		}
	}
}
