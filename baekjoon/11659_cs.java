package cumulative_sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class CS_11659 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		StringBuilder sb = new StringBuilder();
		StringTokenizer str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		str = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(str.nextToken());
		int M = Integer.parseInt(str.nextToken());
		
		int[] numA = new int[N + 1];
		
		//인자 저장 
		str = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++)
			numA[i] = numA[i - 1] + Integer.parseInt(str.nextToken());
		
		//배열 주소로 출력
		for (int i = 0; i < M; i++)
		{
			int answer = 0;
			str = new StringTokenizer(br.readLine());
			
			int k = Integer.parseInt(str.nextToken());
			int z = Integer.parseInt(str.nextToken());
			answer = numA[z] - numA[k - 1];
			 
			sb.append(answer + "\n");
		}
		bw.write(sb.toString());

		
	
		br.close();
		bw.flush();
		bw.close();
	}
}
