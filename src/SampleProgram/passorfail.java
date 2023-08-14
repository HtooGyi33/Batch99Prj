package SampleProgram;

import java.util.Scanner;

public class passorfail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int TotalStudents = 5;
		String Stuname[] = new String[TotalStudents];
		int mark[] = new int[5];
		for(int i = 0; i< TotalStudents; i++) {
			System.out.println("Enter Student" + i +"'s name");
			Stuname[i] = sc.nextLine();
			sc.nextLine();
			System.out.println("Enter Student" + i +"'s mark");
			mark[i] = sc.nextInt();
		}
		for(int j = 0; j< TotalStudents; j++) {
			System.out.println("Student name: "+ Stuname[j]);
			if(mark[j] > 50){
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
		}
	}

}
