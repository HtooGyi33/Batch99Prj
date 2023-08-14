package SampleProgram;

import java.util.Arrays;

public class Shorthigh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Total = 0;
		int Stu_Height[] = {175,167,160,164,183,187,188,179,176,175,169,175,176,178,165};
		for(int i = 0 ; i < Stu_Height.length; i++) {
			Total = Total + Stu_Height[i];
		}
		System.out.println(Total);
		double avg = Total/ Stu_Height.length;
		System.out.println(avg);
		int underavg = 0;
		int aboveavg = 0;
		for(int i = 0 ; i < Stu_Height.length; i++) {
			if(Stu_Height[i] < avg) {
				underavg = underavg +1;
			}
			else {
				aboveavg = aboveavg +1;
			}
		}
		System.out.println("Number of candidates above average: " + aboveavg);
		System.out.println("Number of candidates under average: " + underavg);
		Arrays.sort(Stu_Height);
		System.out.println(Arrays.toString(Stu_Height));
		System.out.println("Shortest Height in the survey: " + Stu_Height[0]);
		System.out.println("Tallest Height in the survey: " + Stu_Height[Stu_Height.length-1]);
	}
}
