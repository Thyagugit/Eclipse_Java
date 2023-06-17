package thanjavur;

public class Son extends Father{
	int age = 45;
	public static void main (String[]args)
	{
		Son son = new Son();
		son.Share_assets();
		son.yeild();
	    int father_amount= son.getAmount();
		System.out.println( "before"+father_amount);
		son.setAmount(110000000);
		father_amount= son.getAmount();
		System.out.println("after"+father_amount);
		System.out.println(son.age);
		Father f = new Father();
		System.out.println(f.age);
	    son.work();
	}
	void work()
	{
//	 System.out.println(this.age);
//	 System.out.println(super.age);
	}

}

