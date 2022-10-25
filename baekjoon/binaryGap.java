// you can also use imports, for example:
// import java.util.*;

class Solution {
    public int solution(int N) {
        int devN = N;
        int cnt, result;
        boolean p = false; 

        cnt = 0;
        result = 0;

        while (N >= 1)
        {
            devN = N % 2;
            if (devN == 1)
            {
                if (cnt >= 1)
                {
                    if (result < cnt)
                    {
                        result = cnt;
                        cnt = 0;
                    }
                }
                p = true;
            }
            else if (p)
                cnt++;
            N /= 2;
        }
        return result;
    }
}