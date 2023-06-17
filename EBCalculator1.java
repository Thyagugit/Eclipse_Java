class EBCalculator
{ 
public static void main(String[] args)
{
EBCalculator reader = new EBCalculator();
int bill = reader.calculate_units();
System.out.println("A"+ bill);
int amount=500;
int balance= amount-bill;
System.out.println(balance);
//reader.pay(amount,bill);

}
void pay(int amount, int bill)
{
System.out.println("b" + (amount-bill));
}

int calculate_units()
{
int units = 150;
int price = 2;
System.out.println("c" + units*price);
return units*price;
}
}
