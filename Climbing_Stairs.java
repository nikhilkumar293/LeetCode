package easy;
class climb{
	public int climbStairs(int n) {
        int a=1;
            int b=2;
            int sum=0;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        for(int i=3;i<=n;i++){
            
            sum=a+b;
            a=b;
            b=sum;
        }
        return sum;
    }
}
public class Climbing_Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		climb cb=new climb();
		int sum=cb.climbStairs(6);
		System.out.println(sum);

	}

}
