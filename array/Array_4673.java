package array;
/*
 * 실수 : n번의 자릿수를 더해야 하는데 10의 자릿수까지만 생각하고 while문 안돌림 
 */

public class Array_4673 {

	public static void main(String[] args) {
		int cnt = 0;
	
		for (int j = 0; j < 10001; j++)
		{
			for (int i = 0; i < 10001; i++)
			{
				cnt = 0;
				if (j == d(i))
				{
					cnt = 1;
					break;
				}		
			}
			if (cnt == 0)
				System.out.println(j);
		}
	}
	private static int d(int n)
	{
		int result;
		
		result = n;
		while (n > 0){
            result += n%10;         
            n = n/10;                 
        }
		return result;
	}
}
