package set_map;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class sm_1620 {
	
	/* 계속 한번씩 비교해 검사해서 시간 초과가 뜨는 것 같음 
	 * -> map 저장 시 string 배열 하나 만들어서 같이 저장 후 k,v 값 따로 찾기 
	// hashmap에 value 로 key 찾기
	public static <K, V>K getKey(Map<K, V> map, V value)
	{
		for (K key : map.keySet())
		{
			if (value.equals(map.get(key)))
				return key;
		}
		return null;
	}
	*/
	private static int stoi(String nextToken) {
		return Integer.parseInt(nextToken);
	}
	public static void main(String[] args) throws IOException {
		int N, M;
		String str;
		String dict[];
		Map<String, Integer> hashMap = new HashMap<>();
	
		StringBuilder sb;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token= new StringTokenizer(bf.readLine());
		N = stoi(token.nextToken()); 
		M = stoi(token.nextToken()); 
		dict= new String[N + 1];
		for (int i = 1; i <= N; i++)
		{
			str = bf.readLine();
			hashMap.put(str, i);
			dict[i] = str;
		}
		sb = new StringBuilder();
		for (int i = 0; i < M; i++)
		{
			str = bf.readLine();
			if (str.charAt(0) <= 57)
				sb.append(dict[Integer.parseInt(str)] + "\n");
			else
				sb.append(hashMap.get(str) + "\n");
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
		bf.close();
	}	   
}
