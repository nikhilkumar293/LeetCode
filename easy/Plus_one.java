package easy;

public class Plus_one {
	    public static int[] plusOne(int[] digits) {
	        int count=0;
	        for(int i=0;i<digits.length;i++){
	            if(digits[i]==9){
	                count++;
	            }
	        }
	        if(count==digits.length){
	            int n[]=new int[digits.length+1];
	            n[0]=1;
	            for(int i=1;i<n.length;i++){
	                n[i]=0;
	            }
	            return n;
	        }
	        else{
	            int last=digits.length-1;
	            int change=0;
	            while(change<1&&last>=0){
	                if(digits[last]<9){
	                    digits[last]+=1;
	                    change++;
	                }
	                else{
	                    digits[last]=0;
	                    last--;
	                }
	            }
	        }
	        return digits;
	       
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d[]= {1,2,3,4};
		int k[]=plusOne(d);
		for(int i=0;i<k.length;i++) {
			System.out.print(k[i]+" ");
		}
		

	}

}
