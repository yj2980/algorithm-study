package recursiveCall;
/*
 * 팩토리얼
 */
import java.util.Scanner;


public class RC_10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(factorial(sc.nextInt()));
	}
	private static int factorial(int n)
	{
		if (n <= 1)
		{
			if (n == 0)
				return 1;
			return n;
		}
		else
			return factorial(n-1) * n;
	}

}
