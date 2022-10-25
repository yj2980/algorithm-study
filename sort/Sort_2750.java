package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class sort_2750 {

	public static void main(String[] args) {
		int[] numA;
		Scanner sc = new Scanner(System.in);
		
		numA = new int[sc.nextInt()];
		for (int i = 0; i < numA.length; i++)
			numA[i] = sc.nextInt();
		Arrays.sort(numA);
		for (int i = 0; i < numA.length; i++)
			System.out.println(numA[i]);
	}
}
