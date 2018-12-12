import java.util.*;
import java.math.*;
public class Switchtry{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Input your choice(1,2,3,4)");

		int input = in.nextInt();

		switch(input){
			case 1:
			    System.out.println("clever");
			    break;
			case 2:
			    System.out.println("brave");
			    break;
			case 3:
			    System.out.println("hardworking");
			    break;
			case 4:
				System.out.println("understanding");
				break;
			default:
			    System.out.println("More info");
			    break;
		}

		System.out.println("big data show");

		BigInteger a = BigInteger.valueOf(100);
		BigInteger b = a.add(BigInteger.valueOf( 2));
		System.out .println(b); 
	}
}