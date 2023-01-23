class Solution {
    public static void lowerBound(int []nums,int target,int []ans){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)>>1;
            if(nums[mid]==target){
                ans[0]=mid;
                // search left side to find the first occurrence
                high=mid-1;
            }
            else if(nums[mid]<target)   low=mid+1;
            else high=mid-1;
        }
    }
    public static void higherBound(int []nums,int target,int []ans){
        int low=0,high=nums.length-1;
        while(low<=high){
            int mid=(low+high)>>1;
            if(nums[mid]==target){
                ans[1]=mid;
                //search right side to find the last occurrence
                low=mid+1;
            }
            else if(nums[mid]<target)   low=mid+1;
            else high=mid-1;
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int []ans=new int[2];
        Arrays.fill(ans,-1);
        lowerBound(nums,target,ans);
        higherBound(nums,target,ans);
        return ans;
    }
}
