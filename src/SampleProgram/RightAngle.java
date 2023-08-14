package SampleProgram;

import java.util.Scanner;

public class RightAngle {
	static double first;
	static double second;
	static double third;
	static double allangle;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hahaobj = new Scanner(System.in);

		System.out.println("Enter the first angle of the triangle");
		first = hahaobj.nextDouble();
		System.out.println("Enter the second angle of the triangle");
		second = hahaobj.nextDouble();
		System.out.println("Enter the third angle of the triangle");
		third = hahaobj.nextDouble();


		if((first==90)||(second==90)||(third==90)) {
			System.out.println("This triangle is a right angle triangle.");
		}
		else {
			System.out.println("This triangle is not a right angle triangle.");
		}
			
	}

}
