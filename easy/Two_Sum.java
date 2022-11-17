package easy;
import java.util.*;
import java.lang.*;
public class Two_Sum {
	public static void main(String[]args) {
		Solution1 s=new Solution1();
		int []nums= {2,7,11,15};
		int target=9;
        
		System.out.println(s.twoSum(nums, target));
	}

}
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}
