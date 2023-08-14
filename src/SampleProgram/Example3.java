package SampleProgram;

import java.util.Scanner;

public class Example3 {
	
	int a,b;
	
	public Example3(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Example3 m1 = new Example3(37, 98);
		Example3 m2 = new Example3(99, 68);
		
		System.out.println("Before swapping objects m1 and m2, a of m1 = "+ m1.a + ", b of m1 = "+ m1.b);
		System.out.println("Before swapping objects m1 and m2, a of m2 = "+ m2.a + ", b of m2 = "+ m2.b);
		
		System.out.println();
		
		swap(m1,m2);
		System.out.println();
		
		System.out.println("After swapping objects m1 and m2, a of m1 = "+ m1.a + ", b of m1 = "+ m1.b);
		System.out.println("After swapping objects m1 and m2, a of m2 = "+ m2.a + ", b of m2 = "+ m2.b);
		
		System.out.println();

	}
	
	public static void swap(Example3 n, Example3 o) {
		int temp = n.a;
		n.a = o.a;
		o.a = temp;
		
		int temp1 = n.b;
		n.b = o.b;
		o.b = temp1;
		
		System.out.println("After swapping objects m1 and m2 as n and o, a of n = "+ n.a + ", b of n = "+ n.b);
		System.out.println("After swapping objects m1 and m2 as n and o, a of o = "+ o.a + ", b of o = "+ o.b);
		
	}
}
