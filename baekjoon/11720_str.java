package str;

import java.util.Scanner;

public class Str_11720 {

	public static void main(String[] args) {
		String s;
		int sum, len;
		Scanner sc = new Scanner(System.in);

		len = sc.nextInt();
		s = sc.next();
		sum = 0;
		
		for (int i = 0; i < len; i++)
			sum += atoi(s.charAt(i));
		
		System.out.println(sum);
	}
	
	private static int atoi(char c) {
		int n;
	
		n = (int)c - 48;
		return n;
	}
}
