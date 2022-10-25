package stack;
/*
 * push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class stack_10828 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());  
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i  < n; i++)
		{
			String qs = br.readLine();
			if (qs.contains("push"))
				stack.push(Integer.parseInt(qs.substring(5)));
			else if (qs.contains("pop"))
				if (stack.isEmpty())
					sb.append(-1 + "\n");
				else
					sb.append(stack.pop() + "\n");
			else if (qs.contains("size"))
				sb.append(stack.size() + "\n");
			else if (qs.contains("empty"))
				if (stack.isEmpty())
					sb.append(1 + "\n");
				else
					sb.append(0 + "\n");
			else if (qs.contains("top"))
				if (stack.isEmpty())
					sb.append(-1 + "\n");
				else 
					sb.append(stack.peek() + "\n");
		}
		
		bw.write(sb.toString());
		
		br.close();
		bw.flush();
		bw.close();
	}

}
