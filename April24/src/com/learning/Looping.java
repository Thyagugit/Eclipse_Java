package com.learning;

public class Looping {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
      Looping ll = new Looping();
//      ll.addition_of_n_numbers();
      ll.find_common_divisors(100,120);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
  }

  private void find_common_divisors(int no1, int no2) {
      // TODO Auto-generated method stub
      int div = 2; 
      while(div<no2)
      {
        if(no1%div==0 && no2%div==0)
        {
          System.out.println(div);
        }
        div = div +1; 
      }
      
    }
  

  private void addition_of_n_numbers() {
  
    // TODO Auto-generated method stub
    int box = 0;
    int no = 1;
    while(no)
    
  }

  private void print_11111() {
    // TODO Auto-generated method stub
    int no = 1;
    while(no<=5)
    {
      System.out.print(1+"");
    no = no+1;
    }
  }

}