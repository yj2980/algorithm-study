package bruteForce;

/*
 * 덩치 순위 구하기 
 * k번 / (x,y),(k,j)일 때, x > k && y > j 이면 k = k + 1이  
 * 
 * 55 185
58 183
88 186
60 175
46 155
 */
import java.util.Scanner;

public class bf_7568 {

	private static void compare(int ary[][])
	{
		int rank = 1;
		
		for (int i = 0; i < ary.length; i++)
		{
			rank = 1;
			for (int j = 0; j < ary.length; j++)
			{
				if (i == j) continue;
				if (ary[i][0] < ary[j][0] && ary[i][1] < ary[j][1])
					rank ++;
			}
			System.out.print(rank + " ");
		}
	}
	
	public static void main(String[] args) {
		int[][] table;
		Scanner sc = new Scanner(System.in);
		
		table = new int [sc.nextInt()][2];

		for (int i = 0; i < table.length; i++)
		{
			table[i][0] = sc.nextInt();
			table[i][1] = sc.nextInt();
		}
		compare(table);
	}
}
