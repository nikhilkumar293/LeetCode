class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length*2;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            if(i<nums.length){arr[i]=nums[i];}
            else{
                System.out.println(i);
                arr[i]=nums[i-nums.length];
            }
            
        }
        return arr;
    }
}
