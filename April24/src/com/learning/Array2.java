package com.learning;


public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Array2 ad = new Array2();
		
		
		int[] marks = {-92,-78,-89,-99,-96};
		ad.find_second_biggest(marks);
		
		

	}

	private void find_second_biggest(int[] marks) {
		
		// TODO Auto-generated method stub
		int big=-2147483648, sbig =-2147483648;
		int i=0;
		while(i<marks.length)
		
		if(marks[i]>big)
		{
			sbig = big;
			big = marks[i];
		}
		else if(marks[i]>sbig)
		{
			sbig = marks[i];
		}
		
		
		i++;
		
		{
			System.out.println("Highest mark is"+big );
			System.out.println("Second marks is"+ sbig);
		}
		
	}

}
