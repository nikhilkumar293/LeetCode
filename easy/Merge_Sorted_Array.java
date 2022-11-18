package easy;

public class Merge_Sorted_Array {


	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       
        for (int i = m+n-1, a = m-1, b = n-1; b>=0; i--) {
		if (a >= 0 && nums1[a] > nums2[b]) nums1[i] = nums1[a--]; 
		else nums1[i] = nums2[b--];
	}
        for(int i=0;i<nums1.length;i++){
            System.out.print(nums1[i]+" ");
        }
	}

		// Driver code
		public static void main(String args[])
		{
			int n[] = { 1 ,2, 3, 0,0,0};
			int n1[] = { 2,5, 6};
			int m=3,n2=3;
			merge(n,m,n1,n2);
			

		}
	}
	


