package exhaustive_search;

public class DFS_recursive_call {
	 //각 노드가 방문된 정보를 1차원 배열 자료형으로 표현
    public static boolean [] visited = new boolean[9];
    // 각 노드가 연결된 정보를 2차원 배열 자료형으로 표현
    public static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    
	public static void main(String[] args) {
		dfs(1);
	}
	
	public static void dfs(int v){
        // 현재 노드 방문 처리
    	visited[v] = true;
        // 방문 노드 출력
    	System.out.print(v + "");
        // 인접 노드 탐색
        for (int i : graph[v]){
            // 방문하지 않은 인접 노드 중 가장 작은 노드를 스택에 넣기
        	if (visited[i]==false){
            	dfs(i);
            }
        }
    }

}
