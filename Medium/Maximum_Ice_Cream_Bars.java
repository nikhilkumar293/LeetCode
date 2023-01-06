package Medium;
import java.util.*;
public class Maximum_Ice_Cream_Bars {
	public int maxIceCream(int[] costs, int coins) {
        int count=0;

        Arrays.sort(costs);
        for(int i=0;i<costs.length;i++){
            if(coins>=costs[i]){
                coins=coins-costs[i];
                count++;
            }
        }
        return count;
    }
}
