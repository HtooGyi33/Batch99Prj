package SampleProgram;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hahaobj = new Scanner(System.in);
		System.out.println("Enter the width of the rectangle");
		double width = hahaobj.nextDouble();
		System.out.println("Enter the length of the rectangle");
		double length = hahaobj.nextDouble();
		double area = (width * length);
		System.out.println("Area of the rectangle is "+ area);
	}
}