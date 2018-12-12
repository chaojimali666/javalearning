import java.util.*;

public class YoungTriangle{
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Input the length about the triangle:");
		int num = in.nextInt();
		int[][] tran = new int[num][];
		// give the space the array will use
		for(int i=0;i<num;i++){
			tran[i] = new int[i+1];
		}

		for(int i=0;i< tran.length;i++){
			int lottery = 1;
			tran[i][0] = lottery;
			for(int j=1;j<tran[i].length ;j++){
				lottery = lottery*(i-j+1)/(j);
				tran[i][j] = lottery;
			}
		}
		System.out.println(Arrays.deepToString(tran));
	}
}