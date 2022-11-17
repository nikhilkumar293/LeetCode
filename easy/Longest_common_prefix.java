package easy;
import java.util.*;
public class Longest_common_prefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution s=new solution();
		String[] str= {"flower","flower","flight"};
		
		System.out.println(s.prefix(str));

	}
}
	class solution{
		public String prefix(String[]str) {
			String prefix=str[0];
			if(str.length==0)return "";
			for(int i=1;i<str.length;i++) {
				while(str[i].indexOf(prefix)!=0) {
					prefix=prefix.substring(0,prefix.length()-1);
				}
			}
			return prefix;
		}
	}


