package easy;

public class Power_of_2 {
	public boolean isPowerOfTwo(int n) {
	    int i=1;
	    if(n==1){
	        return true;
	    } 
	    if(n<1){
	        return false;
	    }
	        while(Math.pow(2,i)<=n){
	            if(n-Math.pow(2,i)==0){
	                return true;
	            }
	            else{
	                
	                i++;
	            }
	             
	        }
	       
	        return false;
	    }
}
