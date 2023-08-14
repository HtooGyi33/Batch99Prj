package SampleProgram;

import java.util.Scanner;

public class Feetinches {
	static float ft,inches;
	static float ft1,ft2;
	static Scanner obj = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ft1 = InputData();
		System.out.println();
		ft2 = InputData();
		System.out.println();
		float sum = add(ft1,ft2);
		System.out.println("Total feet: "+ sum +"'");
		
	}
	public static float InputData() {
		
		System.out.print("Enter feet: ");
		ft = obj.nextFloat();
		
		System.out.print("Enter inches: ");
		inches = obj.nextFloat();
		
		Convertfeet(ft,inches);
		
		return Convertfeet(ft,inches);
		
	}
	public static float Convertfeet(float ft, float inches) {
		
		float convert = inches/12;
		ft = ft + convert;
		
		return ft;
	}
	public static float add(float ft1, float ft2) {
		float addition = ft1 + ft2;
		return addition;
		
	}

}
