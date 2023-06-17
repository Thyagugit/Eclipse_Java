package com.learning;

public class EShowRoom {
	static                                                                      int price ;
	int discount ;
	                                                                                                                                                       
	EShowRoom()
	{
	 System.out.println("Welcome to our EShowRoom");
	}

	public EShowRoom(int price, int discount) {
		
		// TODO Auto-generated constructor stub
		this.price = price;
		this.discount = discount;
		
		System.out.println("Price of "+price);
		System.out.println("Discount of "+discount);
		
		
	}
	
  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EShowRoom tv = new EShowRoom(30000,10);                                 ;
		EShowRoom fridge = new EShowRoom();
		EShowRoom wm = new EShowRoom();
		EShowRoom ac = new EShowRoom(25000,5);
		ac.buy();
		tv.buy();
		
		
		
		
	}
	private void buy() {
		System.out.println(price);
		System.out.println(discount);
	}
	
    
	
}
