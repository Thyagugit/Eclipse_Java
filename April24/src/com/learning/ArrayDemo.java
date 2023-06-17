package com.learning;


import java.util.Scanner;


public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayDemo ad = new ArrayDemo();
//		    ad.Learn_array();
//		    ad.Find_Reverse();
//		    ad.calculate_percentage();
//		    ad.find_highest();
		 
		 int[] marks = {92,78,89,99,96};
			ad.find_second_biggest(marks);
			
		    
		    

		  }



//		  private void Learn_array() {
//		    // TODO Auto-generated method stub
//		    int[] nandhini = {87,90,100,67,56,65};
//		    int i = 0; 
//		    while(i<nandhini.length)
//
//		    	
//		   
//		    {
//			    	if(nandhini[i]==100)
//
//
//		     System.out.println(nandhini[i]);
//				    i++;
//
//		    }
//		    
//		   
//	}
		  
		  
		  
//		  private void Find_Reverse() {
//			  
//			 int [] nandhini = {87,90,100,67,56,65};
//			 int i = nandhini.length-1;
//			 while (i>=0)
//			 {
//			  System.out.println(nandhini[i]);
//			  i--;
//			  
//			  
//			  
//		  }
//
//}
		  
//	               private void calculate_percentage() {
//		            // TODO Auto-generated method stub
//	            	   Scanner sc = new Scanner(System.in);
//	            	   System.out.println("How many Subjects");
//	            	   int sub_count = sc.nextInt();
//	            	   int[] marks = new int [sub_count];
//	            	   int total=0;
//	            	   int i=0;
//	            	   while(i<marks.length)
//	            	   {
//	            		   System.out.println("Enter Mark");
//	            		   marks[i] = sc.nextInt();
//	            		   total = total + marks[i];
//	            		   i++;
	            		   
//	            		   
//	            	   }
//	            	    System.out.println("your total is"+ total);
//	            	    float percentage = total/sub_count;
//	            	    System.out.println(percentage);
//		
//	                  }
//	               
	               
	               
	               
//	               private void find_highest() {
//	           		// TODO Auto-generated method stub
//	            	   int[] marks = {96,78,89,99,92};
//	            	   String[] sub = {"Tamil","English","Maths","Science","Social"};
//	            	   
//	            	   int index_h  =  0;
//	            	   int index_l =  0;
//	            	   
//	            	   int highest = marks[0];      
//	            	   
//	            	   int lowest = marks[0];      
//	            	   int i = 0;
//	            	   
//	            	   while(i<marks.length)
//	            	   {
//	            		   if (marks[i]>highest)
//	            		   {
//	            			   highest = marks[i];
//	            			   index_h = i;
//	            			   
//	            			   
//	            			   
//	            		   }
//	            		   
//	            		   
//	            		   if (marks[i]<lowest)
//	            		   {
//	            			   lowest = marks[i];
//	            			   index_l= i;
//	            			   
//	            		   }
//	            		   i++;
//	            			   
//	            		   
//	            		   
//	            			   
//	            	   }
//	            	   System.out.println("Highest mark is " + highest+"from"+ sub[index_h]);
//	           		   System.out.println("Lowest mark is " + lowest + "from" + sub[index_l]);
//	           		   
//	               
//	               
//	               }
//		  
	
	
        private void find_second_biggest(int[] marks) {
		
		// TODO Auto-generated method stub
		    int big=0, sbig =0;
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
