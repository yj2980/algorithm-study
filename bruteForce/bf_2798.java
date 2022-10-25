package bruteForce;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 블랙잭
 */
public class bf_2798 {
	static int N, M;
	private static int search_num(ArrayList<Integer> arr)
	{
		int sum = 0, result = 0;

		for (int i = 0; i < N; i++)
			for (int j = i + 1; j < N; j++)
				for (int z = j + 1; z < N; z++)
				{
					sum = arr.get(i) + arr.get(j) + arr.get(z);
					if (sum > result && M >= sum)
						result = sum;
					sum = 0;
				}
		return result;
	}
	
	public static void main(String[] args){
		ArrayList<Integer> ary = new ArrayList<Integer>();
		Scanner sc = new Scanner (System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		
		for (int i = 0; i < N; i++)
			ary.add(sc.nextInt());
		
		System.out.println(search_num(ary));
	}
}
