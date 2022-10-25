package set_map;
/*
 * 이분탐색으로 문제를 풀어야함
 * 
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sm_10815 {
	private static int binarySerch(int[] cp1, int target) 
	{
		int start, mid, end;

		start = 0;
		end = cp1.length -1;
		mid = end / 2;
		
		while (end - start >= 0)
		{
			if (cp1[mid] == target)
				return 1;
			else if (cp1[mid] <= target)
				start = mid + 1;
			else 
				end = mid - 1;
			mid = (end + start) / 2;
		}
		return 0;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N, M;
		int [] sg;
		StringTokenizer str;
		StringBuilder sb;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(bf.readLine());
		sg = new int[N];
		
		str = new StringTokenizer(bf.readLine());
		for (int i = 0; i < N; i++)
			sg[i] = Integer.parseInt(str.nextToken());
		
		Arrays.sort(sg);
		
		M = Integer.parseInt(bf.readLine());
		
		sb = new StringBuilder();
		str = new StringTokenizer(bf.readLine());
		for (int i = 0; i < M; i++)
			sb.append(binarySerch(sg, Integer.parseInt(str.nextToken())) + " " );
		
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		bf.close();
	}
}
