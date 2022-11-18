package easy;

public class Ugly_number {
	    public static boolean isUgly(int n) {
	    	System.out.println(n); 
	    	if(n<1){
	            return false;
	        }
	    	 if(n==1)return true;

	        
	        if(n%2==0){
	                isUgly(n/2);
	                
	            }
	        else if(n%3==0){
	            isUgly(n/3);
	        }
	        else if(n%5==0){
	            isUgly(n/5);
	        }
	        
	        return false;
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean k=isUgly(4);
		System.out.println(k);

	}

}
