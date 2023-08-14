package SampleProgram;

import java.util.Scanner;

public class hmminsec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		int hour;
		int min;
		int sec;
		
		boolean flag = true;
		
		do {
			
		
		
			System.out.println("Enter hour");
			hour = sc.nextInt();
		
			System.out.println("Enter minute");
			min = sc.nextInt();
		
			System.out.println("Enter second");
			sec = sc.nextInt();
		
			if((hour>12)||(min>60)||(sec>60)){
				System.out.println("Enter the format (12:59:59)");
				flag = false;
			}
			else {
				long tsec = hms_to_secs(hour,min,sec);
				System.out.println(tsec + " secs");
			}
		
		}
		while(!flag);
			
		
	}
	
	public static long hms_to_secs(int hour, int min, int sec) {
		
		hour = hour * 3600;
		min = min * 60;
		long tsec = hour + min + sec;
		
		
		
		return tsec;
		
	}

}
