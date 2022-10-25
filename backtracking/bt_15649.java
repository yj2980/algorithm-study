package backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bt_15649 {
	private static boolean visited[];
	private static int N,M;
	static int[] graph;
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		StringTokenizer str;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		str = new StringTokenizer(br.readLine());
		N = Integer.parseInt(str.nextToken());  
		M = Integer.parseInt(str.nextToken());  
		
		graph = new int[M];
		visited = new boolean[N];
		
		recursion(0);
		br.close();
	}
	private static void recursion(int v){
        if (v == M) { 
            for (int i = 0; i < M; i++) 
                System.out.print(graph[i] + " ");
            System.out.print("\n");
            return ;
        }

        for (int i = 0; i < N; i++) { 
            if (!visited[i]) {
            	graph[v] = i + 1;
                visited[i] = true; 
                recursion(v); 
                visited[i] = false;
            }
        }
    }
}
