package SampleProgram;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hahaobj = new Scanner(System.in);
		System.out.println("Enter the radius of the circle");
		double userinputradius = hahaobj.nextDouble();
		System.out.println("Radius of thew circle: "+ userinputradius);
		double area = 3.14 * (userinputradius * userinputradius);
		System.out.println("Area of the circle is "+ area);
	}

}
