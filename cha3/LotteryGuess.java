import java.util.*;


public class LotteryGuess{
	public static void main(String[] args) {
		int[] nums =new int[49];

		for(int i=0;i<49;i++){
			nums[i] = i+1;
		}

		int[] guess =new int[6];
		int n = nums.length;
		for(int i=0;i<6;i++){
			int r =(int) (n*Math.random());
			guess[i] = nums[r];
			nums[r] = nums[n-1];
			n = n-1;
		}
		Arrays.sort(guess);
		System.out.println(Arrays.toString(guess));
	}
} 