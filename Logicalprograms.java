class Logicalprograms
{
public static void main(String[] args)
{
Logicalprograms lp = new Logicalprograms();
lp.find_divisors(10);
//lp.find_count_of_divisors(int no);
//lp.find_prime(131);
//lp.find_multiples(2);
}
void find_multiples(int no1)
{
int no2 = 1; 
while(no2<=5)
{
System.out.println(no2 + " * 2 = "+ (no2 * no1));
no2 = no2 +1; 
}

}

void find_prime(int no)
{
int div = 2; 
int count = 0; 
while(div<no)
{
    if(no%div == 0)
    {
    System.out.println(div);
    count = count + 1; 
    }
    div = div +1; 
 }
System.out.println("No. of divisors is "+ count);
if(count==0)
    {
        System.out.println("Given number is Prime Number");
    }
else
    {
        System.out.println("Given number is Not Prime Number");
    }
}

void find_divisors(int no)
{
int div = 2; 
int count=0;
while(div<=no)
{
if(no%div==0)
{
System.out.println(div);
count=count+1;
}
div = div +1; 
}
System.out.println("No.Of.divisors is"+count);

}
}

