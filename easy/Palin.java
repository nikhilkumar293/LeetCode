package easy;
import java.util.*;
public class Palin{
	public static void main(String[]args) {
		int n=97;
		palin(n);
	}
	public static void palin(int n) { 
		int m=0;
		m=n;
		int r=0,rev=0;
		while(n!=0) {
			r=n%10;
			n=n/10;
			rev=rev*10+r;
		}
		if(m==rev) {
			System.out.println(rev);
		}
		else {
			int sum=m+rev;
			palin(sum);
		}
		
	}
}