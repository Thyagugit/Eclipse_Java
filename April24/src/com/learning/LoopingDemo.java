package com.learning;

public class LoopingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoopingDemo ld = new LoopingDemo();
		ld.swap(10,100);

	}


	private void swap(int no1, int no2) {
	    // TODO Auto-generated method stub
	    System.out.println("Before Swapping"); 
	    System.out.println(no1+" and "+no2);
	    no1 = no1 + no2; //no1 = 110;
	    no2 = no1 - no2; //no2 = 10; 
	    no1 = no1 - no2; //no1 = 100; 
	    System.out.println("After Swapping"); 
	    System.out.println(no1+" and "+no2);
	
	
	
	
	
	
	
	
	
}
	}	
