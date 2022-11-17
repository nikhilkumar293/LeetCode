package easy;

public class Remove_duplicate_from_array {
	 public static int removeDuplicates(int[] nums) {
	        int count=0;
	        for(int i=0,j=1;j<nums.length;){
	            if(nums[i]!=nums[j]){
	                i++;
	                nums[i]=nums[j];
	            }
	            j++;
	            count=i;
	        }
	        return count+1;
	        
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]= {1,1,1,2,3,3};
		int k=removeDuplicates(n);
		System.out.println(k);

	}

}
