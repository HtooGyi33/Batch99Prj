package SampleProgram;

import java.util.Scanner;

public class RespondingCalculator {
	static int numbers;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner req = new Scanner(System.in);
		numbers = 1;
		double numbersarr[] = new double[numbers];
		boolean flag = false;
		for(int i = 0; i <= numbers; i++) {
			numbersarr[i] = req.nextDouble();
			String sign = req.nextLine();
			if(sign == "=") {
				flag = true;
			}
			else if(sign == "+") {
				flag = false;
			}
			numbers = numbers + 1;
		}
	}
}
