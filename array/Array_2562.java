package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 */
public class Array_2562 {
	static int N = 9;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ary = new ArrayList<Integer>();

		for (int i = 0; i < N; i++)
			ary.add(sc.nextInt());
		
		System.out.println(Collections.max(ary)+ "\n" + (ary.indexOf(Collections.max(ary)) + 1));
	}

}
