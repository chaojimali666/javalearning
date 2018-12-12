import java.math.*;
import java.util.*;
public class BigIntegerTest{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String good = "Y";
		
		while(good.equals("Y")){
			System.out.println("Input your base figure:");
			int num = in.nextInt();
			System.out.println("How many numbers do you want to pick:");
			int vari = in.nextInt();
			BigInteger a = BigInteger.valueOf(1);
			for(int i=1;i<=vari;i++){
				a = a.multiply(BigInteger.valueOf((num-i + 1))).divide(BigInteger.valueOf(i));
			}
			System.out.println(a);
			System.out.println("Do you want to continue? Y/N");
			good = in.next() ;
		}
	}
}