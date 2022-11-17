package easy;
import java.util.*;
public class Remove_element {
	   public static int removeElement(int[] nums, int val) {
	        int j =0;
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]!=val){
	                nums[j++]=nums[i];
	            }
	        }
	        for(j=0;j<nums.length;j++){
	            System.out.print(nums[j]);
	        }
	        return j;
	    }

		public static void main(String[] args) {
			int k[]={0,1,2,2,3,0,2,2};
			int val=removeElement(k,0);
		}
	}

