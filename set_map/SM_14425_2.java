package set_map;
/*
 * hashMap 사용하기
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class sm_14425_2 {

	public static void main(String[] args){
		int N, M, cnt;
      
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        
        N = sc.nextInt();
        M = sc.nextInt();
        cnt = 0;
        
        for (int i = 0; i < N; i++) 
            map.put(sc.next(), 0);
        
        for (int i = 0; i < M; i++) 
            if (map.containsKey(sc.next())) 
            	cnt++;
        System.out.println(cnt);
        
	}

}
