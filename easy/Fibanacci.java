package recursion;
import java.util.*;
public class Fibanacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibo(8));

	}
	
	public static int fibo(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0 || n==1) {
			return n;
		}
		return fibo(n-1)+ fibo(n-2);
		
	}

}
