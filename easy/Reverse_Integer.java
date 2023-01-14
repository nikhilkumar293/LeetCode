class Solution {
    int rev=0,r=0,m=0;
    public int reverse(int x) {    
        if(x==0){
            return rev;
        }
        else{
        r=x%10;
        m=x/10;
        if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && r > 7)) return rev=0;
        if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && r < -8))return rev=0;
        rev=rev*10+r;
        System.out.println(rev);
        reverse(m);
        }
       
        return rev;
    }
}
