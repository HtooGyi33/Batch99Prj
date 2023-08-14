package SampleProgram;

import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of rectangle: ");
		double length = sc.nextDouble();
		
		System.out.println();
		
		System.out.print("Enter the height of rectangle: ");
		double height = sc.nextDouble();
		
		System.out.println("Area of the rectangle: " + area(length, height) + " square units");
		System.out.println("Perimeter of the rectangle: "+ perimeter(length, height) + " units");
		
	}
	
	public static double perimeter(double length , double height) {
		double peri = (length * 2)+(height * 2);
		return peri;
	}
	
	public static double area(double length , double height) {
		double area = length * height;
		return area;
	}

}
