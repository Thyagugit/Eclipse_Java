package thanjavur;

public class Father {
	int age = 75;
	private int amount = 100000000;
	private int amount2 = 1234;
	public void setAmount (int amount) {
	if(amount>100000000)
		this.amount = amount;
	}
	public void setAmount2 (int amount2) {
		this.amount2 = amount2;
	}
		
	public int getAmount() {
		return amount;
	}
	public int getAmount2() {
		return amount2; 
	}
	void yeild()
	{
	 System.out.println("yield paddy");
	
	}
	protected void Share_assets()
	{
		System.out.println("Sharing assets");
	}

}
