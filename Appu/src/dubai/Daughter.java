package dubai;
import thanjavur.Father;

public class Daughter extends Father{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Daughter d = new Daughter();
		d.Share_assets();
//		d.yeild();
		int father_amount= d.getAmount();
		System.out.println(father_amount);		
		
	}

}
