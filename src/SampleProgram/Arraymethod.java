package SampleProgram;

import java.util.Arrays;

public class Arraymethod {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4,5};
		count = A.length;
		int B[] = {15,2,32,4,5};
		Add(A,B);
	}
	public static void Add(int[] a, int[] b) {
		int C[] = new int[a.length];
		for(int i = 0; i < count; i++) {
			C[i] = a[i] + b[i];
		}
		Display(C);
	}
	
	public static void Display(int[] c) {
		for(int i = 0; i < count; i++) {
			System.out.print(c[i] + " ");
		}
	}
}