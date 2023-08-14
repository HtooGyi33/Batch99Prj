package SampleProgram;

import java.util.Arrays;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {-4, 18, 7, 8, 62, 65, 8263, 862};
		Arrays.sort(A);
		
		System.out.println(Arrays.toString(A));
		int index = Arrays.binarySearch(A, 18);
		
		if (index < 0){
			System.out.println("Index not found");
		}
		else {
			System.out.println(A[index] +" is found at index " + index);
		}
		
		int B[] = Arrays.copyOf(A, A.length);
		
		System.out.println(Arrays.toString(B));
		Arrays.fill(B,B.length-1, B.length ,90);
		
		System.out.println(Arrays.toString(B));
		boolean equal = Arrays.equals(A,B);
		
		if(equal) {
			System.out.println("Equal");
		}
		else {
			System.out.println("Not equal");
		}
		
		
	}
	
}
