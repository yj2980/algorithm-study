package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class stack_1918 {

	private static int precedence(char op)
	{
		switch(op)
		{
		case '(' : case ')' : return 0;
		case '+' : case '-' : return 1;
		case '*' : case '/' : return 2;
		}
		return -1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Stack<String> stack = new Stack<>();
		String str = br.readLine();
		char op;
		
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) >= 65 && str.charAt(i) <= 90)
			{
				System.out.print(String.valueOf(str.charAt(i)));
				continue;
			}
			else if (str.charAt(i) == '(')
				stack.push(String.valueOf(str.charAt(i)));
			else if (str.charAt(i) == ')')
			{
				while (!stack.isEmpty())
				{
					op = stack.pop().charAt(0);
					if (op == '(') break;
					else 
						System.out.print(op);
				}
			}
			else if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '/' || str.charAt(i) == '*')
			{
				while(!stack.isEmpty())
				{
					op = stack.peek().charAt(0);
					if (precedence(str.charAt(i)) <= precedence(op))
					{
						System.out.print(op);
						stack.pop();
					}
					else break;
				}	
				stack.push(String.valueOf(str.charAt(i)));
			 }
		}
		while (!stack.isEmpty())
			System.out.print(stack.pop());
	}
}
