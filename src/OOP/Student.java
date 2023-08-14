package OOP;

import java.util.Scanner;

public class Student {
	
	String name;
	int Age;
	
	public Student() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter student name");
		name = obj.nextLine();
		System.out.println("Enter student age");
		Age = obj.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentone = new Student();
		
		System.out.println(studentone.name);
		System.out.println(studentone.Age);
	}

}
