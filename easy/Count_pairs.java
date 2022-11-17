package easy;

import java.util.Scanner;
public class Count_pairs {
	public static void main(String[]args)
	{   Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int p=0;
		while(p!=t) {
		int n=sc.nextInt();
		int A[]= new int[n];
		for(int i=0;i<n;i++) {
			A[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		System.out.println(count(A,n,x));
		p++;
		}
	}
	
	public static int count(int A[], int n, int K)
    {
		int count = 0;
		 
	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	           if(A[i]==A[j]) {
	            // if pair sum is divisible
	            if ((i+1)% K == 0 || (j+1)%K==0)
	            
	                // Increment count
	                count++;
	        }
	        }
	    }
	 
	    return count;

}
}
