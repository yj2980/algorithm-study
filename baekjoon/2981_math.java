package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Math_2981 {
	static int max = 100;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String[] args) {
		int n, m;
		int [] numA;
		int cnt = 0;
		int result = 0;
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		numA = new int[n];
		for (int i = 0; i < n; i++)
		{
			numA[i] = sc.nextInt();
			func(numA[i]);
		}
	//	for (int i = 0; i < list.size(); i++)
//			System.out.println(list.get(i));
		for (int i = 0; i < n; i++)
		{
			cnt = 0;
			for (int k = n; k < list.size(); k++)
			{
				if (list.get(i) == list.get(k))
					cnt++;
			}
			if (cnt == n - 1)
			{
				result = list.get(i);
				break;
			}
		}
		Arrays.sort(numA);
		//while (numA[0] > result)
		//{
		//	System.out.print(result + " ");
		//	result += result;
		//}
		
		
	}
	public static void func (int num)
	{
		for (int i = 2; i <= num; i++)
			if (num % i == 0)
				list.add(i);
	}
}
