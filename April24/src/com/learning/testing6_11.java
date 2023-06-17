package com.learning;
public class testing6_11 {
	  int roll;
	  String name;
	  int j;
	  boolean b;
	  static String school = "Payilgham";

	  public testing6_11(int roll_no, String namesss) {
	    // TODO Auto-generated constructor stub
	    this.roll=roll_no;
	    this.name= namesss;
	  }

	  public testing6_11(int roll) {
	    // TODO Auto-generated constructor stub
	    this.roll= roll;
	  }

	  public testing6_11(int i, String string, int j) {
	    // TODO Auto-generated constructor stub
	    this.roll=i;
	    this.name= string;
	    this.j =j;
	    }
	  
	  public testing6_11() //default constructor
	  {
	    // TODO Auto-generated constructor stub
	    System.out.println("Welcome to Payilagham");
	  }
	  


	public testing6_11(int i, String string, int j2, boolean b) {
		// TODO Auto-generated constructor stub
		this.roll=i;
		this.name= string;
		this.j=j2;
		this.b=b;
	}

	public static void main(String[] args) {
	    // TODO Auto-generated method stub
	    testing6_11 t6Obj = new testing6_11(1,"Thiyaghu");// parameterized constructor calling
	    testing6_11 t6Obj2 = new testing6_11(2,"Hema");
	    testing6_11 t6Obj3 = new testing6_11(3,"Stalin");
	    testing6_11 t6Obj4 = new testing6_11(); //non parameterized constructor calling
	    testing6_11 t6Obj5 = new testing6_11(5,"xyz",50);
	    testing6_11 t6Obj6 = new testing6_11(5,"Appu",60,true);

	    
	     t6Obj.student();
	     t6Obj2.student();
	     t6Obj3.student();
	     t6Obj4.student();
	     t6Obj5.student();
	     t6Obj6.student();
	  }
	  private void student() {
	    // TODO Auto-generated method stub
	  
	    System.out.println(school);
	    System.out.println("The student roll " +roll);
	    System.out.println("The student roll " +name);
	    System.out.println("testing for 4th argument ");
	    System.out.println("new value "+j);
	    System.out.println("new second value "+b);


	  }

	}
