package easy;
import java.util.*;
public class Missing_Number {
	 public int missingNumber(int[] intArray) {
         Arrays.sort(intArray);
        for(int i=0;i<intArray.length;i++){
            if(i!=intArray[i]){
                return i;

            }
        }
        return intArray.length;
    }
}
