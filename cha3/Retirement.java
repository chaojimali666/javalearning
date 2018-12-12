import java.util.*;

public class Retirement{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("What is your goal?");
		long goal  = (long) in.nextInt();

		System.out.println("What is your payment?");
		int payment  = (int) in.nextInt();

		System.out.println("What is the rate?");
		int rate = (int) in.nextInt();
		double balance = 0;
		int year=0;
		String ans;
		do{
			balance += payment;
			double interest = balance * rate/100;
			balance += interest;
			year++;
			System.out.println(balance);
			System.out.println("Are you ready to retire? N/Y");

			ans = in.next();
		}
		while(ans.equals("N"));

		String con = String.format("You have worked %d year and you have %f",year,balance);
		System.out.println(con);

		int[] small = {1,2,3,4,5};
		int[] big = small;
		big[0] = 100;
		System.out.println(small[0]);



	}
}