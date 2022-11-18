package easy;

public class Search_Insert_Position {
	    public static int searchInsert(int[] nums, int target) {
	        int first=0;
	        int last=nums.length-1;
	        int mid=0;
	        if(target<=nums[first]){
	            return first;
	        }
	        if(target>=nums[last]){
	            return last+1;
	        }
	        while(first<last){
	            mid=(first+last)/2;
	            if(nums[mid]<target){
	                first=mid+1;
	            }
	            if(nums[mid]>target) {
	                last=mid-1;
	            }   
	        }
	        System.out.println(mid);
	        return mid;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []n= {1,3,5,6};
		int t=5;
		int k=searchInsert(n,t);
		


	}

}
