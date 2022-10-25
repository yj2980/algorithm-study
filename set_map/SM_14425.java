package set_map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class sm_14425 {
	
	private static int compare(String[] cp1, String target)
	{
		for (int i = 0; i < cp1.length; i++)
			if (cp1[i].equals(target))
				return 1;
		return 0;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int N, M, result;
		String[] strA;
		
		StringTokenizer str;
		StringBuilder sb = new StringBuilder();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		result = 0;
		str = new StringTokenizer(bf.readLine());
	
		N = Integer.parseInt(str.nextToken());
		M = Integer.parseInt(str.nextToken());
		
		strA = new String[N];
		for (int i = 0; i < N; i++)
			strA[i] = bf.readLine();

		for (int i = 0; i < M; i++)
			result += compare(strA, bf.readLine());

		sb.append(result);
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		bf.close();
	}
}
