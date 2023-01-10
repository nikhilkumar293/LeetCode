package easy;

public class Power_of_3 {
	int i=1;
    public  boolean isPowerOfThree(int n) {
    if(n==1){
        return true;
    } 
    if(n<3){
        return false;
    }
        while(Math.pow(3,i)<=n){
            if(n-Math.pow(3,i)==0){
                return true;
            }
            else{
                
                i++;
            }
             
        }
       
        return false;
    }
}
