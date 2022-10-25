package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class sort_1427 {
	static int N = 10;
	static int L;
	
	private static Integer[] func(Integer num)
	{
		Integer[] tmpA;
		
		tmpA = new Integer[N];
		while (num > 0) {
			tmpA[L] = num % 10;
			num /= 10;
			L++;
		}
		
		return tmpA;
	}
	public static void main(String[] args) {
		Integer[] numA;
		Integer num;
		Scanner sc = new Scanner(System.in);

		num = sc.nextInt();
		numA = Arrays.copyOf(func(num), L);
		Arrays.sort(numA,Collections.reverseOrder());
		
		for(int z = 0; z < numA.length; z++)
			System.out.print(numA[z]);
	}
}
