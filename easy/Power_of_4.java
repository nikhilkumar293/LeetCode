package easy;

public class Power_of_4 {
	public boolean isPowerOfFour(int n) {
	     int i=1;
	    if(n==1){
	        return true;
	    } 
	    if(n<1){
	        return false;
	    }
	        while(Math.pow(4,i)<=n){
	            if(n-Math.pow(4,i)==0){
	                return true;
	            }
	            else{
	                
	                i++;
	            }
	             
	        }
	       
	        return false;
	    }
}
