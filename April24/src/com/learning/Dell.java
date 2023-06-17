package com.learning;

public class Dell extends Laptop {

 public static void main (String[]args)	 {
		Dell dell = new Dell();
		dell.browse();
		dell.touch_screen();
		System.out.println(dell.harddisk);
		
		

	}


        void touch_screen()
        {
         System.out.println("Touch Screen");
        }
        
}