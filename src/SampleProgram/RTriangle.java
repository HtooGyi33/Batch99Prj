package SampleProgram;

import java.util.Arrays;
import java.util.Scanner;

public class RTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner hahaobj = new Scanner(System.in);
		double sides[] = new double[3];
		
		System.out.println("Enter the first side");
		sides[0] = hahaobj.nextDouble();
		
		System.out.println("Enter the seond side");
		sides[1] = hahaobj.nextDouble();
		
		System.out.println("Enter the third side");
		sides[2] = hahaobj.nextDouble();
		
		Arrays.sort(sides);
		System.out.println(Arrays.toString(sides));
		
		double lhs = ((sides[0] * sides[0])+(sides[1]*sides[1]));
		double rhs = (sides[2]*sides[2]);
		
		if(lhs == rhs) {
			System.out.println("This is a right angle triangle");
		}
		else {
			System.out.println("This is not a right angle triangle");
		}
	}

}
