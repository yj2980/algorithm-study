public static void main(String[] args){	
	boolean[] ary = new boolean[10001];	
 
	for (int i = 1; i < 100001; i++){
		int n = div(i);
		
		if(n < 10001){	
			ary[n] = true;
		}
	}
}
 
public static int div(int num){
	int sum = num;
    
	while(num != 0){
		sum = sum + (num % 10); 
		num = num/10;	
	}
	return sum;
}