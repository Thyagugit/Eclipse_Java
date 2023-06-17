package oops2;

public class Myself {
	int doorno = 7;
	String city = "chennai";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Myself pa = new Myself();
        pa.send_letter();
        pa.receive_letter();
        
	}
        void send_letter()
        {
        	System.out.println(doorno);
        	System.out.println(city);
        }
        void receive_letter()
        {
        	System.out.println(doorno);
        	System.out.println(city);
        }
  
}
