package recursiveCall;
/*
 * 하노이탑 
 * 시간 제한 1초 : System.out.println을 사용하는 것보다 
 * Bufferedwriter(printf) & BufferedReader(scanner)를 쓰는것이 속도 측면에서 더 효율적
 * why? 입력된 데이터가 바로 전달되지 않고 버퍼를 거쳐 전달되므로 데이터 처리 효율성을 높이기 떄문에 많은 양의 데이터를 처리할 때 유리
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class RC_11729 {
	
	static StringBuilder sb = new StringBuilder(); //총 옮긴 횟수를 먼저 출력하기 위해 사용
	static int cnt = 0;
	
	private static void hanoi(int N, int start, int to, int via) throws IOException
	{
		cnt++;
		if (N == 1)
		{
			sb.append(start+ " "+ to + "\n");
			return;
		}
		hanoi(N-1, start, via, to);
		sb.append(start+ " "+ to + "\n");
		hanoi(N-1, via, to, start);
		
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		int num;
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		num = Integer.parseInt(bf.readLine());  //readLine()시 리턴값을 String으로 고정되기 때문에 형변환 필수

		hanoi(num, 1,3,2);
		bw.write(cnt+"\n");
		bw.write(sb.toString());
		
		bf.close();
		bw.flush();
		bw.close();
	}
}