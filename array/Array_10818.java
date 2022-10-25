package array;
import java.util.Arrays;
import java.util.Scanner;

public class Array_10818 {

	public static void main(String[] args) {
		int []numA;
		int n;
		
		Scanner sc = new Scanner(System.in);
		
		numA = new int[sc.nextInt()];
		
		for (int i = 0; i < numA.length; i++)
		{
			n = sc.nextInt();
			if (n > 0 && n < 1000000)
				numA[i] = n;
		}
		Arrays.sort(numA);
		System.out.print(numA[0] + " " + numA[numA.length -1]);	
	}

}
