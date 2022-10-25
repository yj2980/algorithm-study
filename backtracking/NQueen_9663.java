package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NQueen_9663 {
	static int cnt, N;
	static int[] col;
	
	private static void nQueen(int r)
	{
		if (r == N)
		{
			cnt++;
			return;
		}
		
		for (int i = 0; i < N; i++)
		{
			col[r] = i;
			if (isPossible(r))
				nQueen(r + 1);
		}
	}
	private static boolean isPossible(int range)
	{
		for (int i = 0; i < range; i++)
		{
			if (col[range] == col[i])
				return false;
			if (Math.abs(range - i) == Math.abs(col[i] - col[range]))
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		N = Integer.parseInt(br.readLine());  
		
		col = new int[N];
		nQueen(0);
		System.out.println(cnt);
		br.close();
	}
}
