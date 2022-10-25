package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Number_Place_2580 {
	static int N = 9;
	static int[][] num;
	static boolean[] visited = new boolean[N + 1];
	static int cnt = 0;
	
	private static void isVisited(int n)
	{
		visited[n] = true;
	}
	//박스 
	private static void box_place(int k)
	{
		for(int i = 0; i < 3; i++)
		{
			
		}
	}
	// 가로 또는 세로 중 하나만 남은 경우
	private static void place_cr(int k)
	{
		// 가로 또는 세로 중 하나만 남은 경우
		for (int i = 0; i < N; i++)
		{
			if (num[k][i] == 0 || num[i][k] == 0)
			{
				cnt++;
				if (num[k][i] == num[i][k])
					cnt--;
			}
		}
		//빈 숫자 확인
		for (int i = 0; i < N; i++)
		{
			if (cnt == 1 && num[k][i] == 0)
			{
				switch(num[k][i])
				{
					case 1 : visited[1] = true; break;
					case 2 : visited[2] = true; break;
					case 3 : visited[3] = true; break;
					case 4 : visited[4] = true; break;
					case 5 : visited[5] = true; break;
					case 6 : visited[6] = true; break;
					case 7 : visited[7] = true; break;
					case 8 : visited[8] = true; break;
					case 9 : visited[9] = true; break;
				}
			}
			else if (cnt == 1 && num[i][k] == 0)
			{
				switch(num[k][i])
				{
					case 1 : visited[1] = true; break;
					case 2 : visited[2] = true; break;
					case 3 : visited[3] = true; break;
					case 4 : visited[4] = true; break;
					case 5 : visited[5] = true; break;
					case 6 : visited[6] = true; break;
					case 7 : visited[7] = true; break;
					case 8 : visited[8] = true; break;
					case 9 : visited[9] = true; break;
				}
			}
		}
		for (int i = 0; i < N; i++)
		{
			if (!visited[i + 1])
			{
				if (num[k][i] == 0)
					num[k][i] = i + 1;
				else if (num[i][k] == 0)
					num[i][k] = i + 1;
			}
		}
		cnt = 0;
		for (int i = 0; i < N; i++)
		{
			visited[i + 1] = false;
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		StringTokenizer str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 

		num = new int [N][N];
		for (int i = 0; i < N; i++)
		{
			str = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++)
				num[i][j] = Integer.parseInt(str.nextToken());
		}
		for (int i = 0; i < N; i++)
			place_cr(i);
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(num[i][j] + " ");
			}
			System.out.print("\n");
		}
			
	}

}


/*
 * 1. 가로 또는 세로 중 하나만 남은 경우
 * 2. 가로 세로 모두 하나 남은 경우 ? 
 * 3. 3 * 3 에서 하나만 남은 경우
 */
