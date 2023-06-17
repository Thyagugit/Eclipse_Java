package com.learning;
import java.util.Scanner;


public class Simplecal {

	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	       Scanner sc = new Scanner(System.in);
	       System.out.println("Enter your 1st number : ");
	       int one = sc.nextInt();
	       System.out.println("Enter your 2nd number : ");
	       int two = sc.nextInt();
	       System.out.println("Given 1st value is "+ one);
	       System.out.println("Given 2nd  value is "+ two);
	       System.out.println( "select your operator"    +    "  +,   -, *, / " );
	       char op = sc.next().charAt(0);
	       System.out.println("Given operator is " + op);
	       if (op=='+')
	       {
	      System.out.println( " Add two values = "+ (one+two) ); 
	       }
	       else if(op=='-')
	       {
	       
	       System.out.println ( " Sub two values =" + (one-two) );

	       }
	       else if (op=='*')
	       {
	           System.out.println  ( " Multiple two values = "  +  (one*two));
	          

	       }
	       else if (op=='/')
	       {
	           System.out.println   ( " Multiple two values = "  +  (one/two));
	 
	       }
	       
	       {
	       System.out.println(" Do you want proceed  " +  " [yes or No] ");	       
      
	       String proceed = sc.next();
	       System.out.println("proceed = "+ proceed);
	       
	       
	       
	       
	       
	       
	       }
	    		   
	       
	       
	       
	  }
}
	       
    
	       
	       
	       
	       
	       
	       
	       
	       
	
	  

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		   
    	  
       

	
	
	
	
       
       
       
     
    	   
    	   
    	   
       

       


	


