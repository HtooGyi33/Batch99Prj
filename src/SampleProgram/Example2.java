package SampleProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		double Avg = 0;
		double Sum = 0;
		int AboveAvg = 0;
		int BelowAvg = 0;
		
		System.out.print("How many day's temperature? ");
		int index = obj.nextInt();
		double Temp[] = new double[index];
		
		for (int i = 0 ; i < Temp.length;i++) {
				System.out.print("Day "+ (i+1) +"'s temperature: " );
				Temp[i] = obj.nextDouble();
		}
		
		for (int i = 0 ; i < Temp.length;i++) {
			Sum = Sum + Temp[i];
		}
		
		Avg = Sum/Temp.length;
		
		System.out.println();
		System.out.println("Avaerage Temp: "+ Avg);
		System.out.println();
		
		for (int i = 0 ; i < Temp.length;i++) {
			if(Temp[i] > Avg){
				AboveAvg++;
			}
			else {
				BelowAvg++;
			}
		}
		
		System.out.println(AboveAvg + " days were above average.");
		System.out.println(BelowAvg + " days were below average.");
		
		System.out.println();
		System.out.println("Temperatures: " + Arrays.toString(Temp));
		Arrays.sort(Temp);
		System.out.println();
		System.out.println("Sorted temperatures: " + Arrays.toString(Temp));
		System.out.println();
		
		double Coldest = Temp[0];
		double SecColdest = Temp[1];
		double Hottest = Temp[Temp.length - 1];
		double SecHottest = Temp[Temp.length - 2];
		
		System.out.println("Two coldest days: " + Coldest + ", " +  SecColdest);
		System.out.println("Two hottest days: " + Hottest + ", " +  SecHottest);
		System.out.println();
		System.out.println("******************************************************");
		System.out.println();
		System.out.print("How many day's temperature? ");
		int index1 = obj.nextInt();
		double Temp1[] = new double[index1];
		
		for (int i = 0 ; i < Temp1.length;i++) {
				System.out.print("Day "+ (i+1) +"'s temperature: " );
				Temp1[i] = obj.nextDouble();
		}
		Arrays.sort(Temp1);
		System.out.println();
		System.out.println(Arrays.toString(Temp1));
		
		boolean equals = Arrays.equals(Temp, Temp1);
		System.out.println();
		if(equals) {
			System.out.println("First Array and Second Array's indexes are equal.");
		}
		else {
			System.out.println("First Array and Second Array's indexes are not equal.");
		}
		System.out.println();
		Arrays.fill(Temp1, 200);
		System.out.println(Arrays.toString(Temp1));
		
		
		
		
	}
}
