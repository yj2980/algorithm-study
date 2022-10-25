// k번 a배열을 회전

class Solution {
    public int[] solution(int[] A, int K) {
        int tmp = 0;

        for(int i = 0; i < K; i++)
        {
            tmp = A[A.length - 1];
            for (int j = A.length - 1; j >= 1; j--)
                A[j] = A[j - 1];
            A[0] = tmp;
        }
        return A;
    }
}