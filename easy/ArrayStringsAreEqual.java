package easy;

import java.util.Arrays;

public class ArrayStringsAreEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word1[]= {"ab","c"};
		String word2[]={"a","bc"};
		leet lt=new leet();
		System.out.println(lt.arrayequals(word1, word2));
		

	}
}
	class leet{
		public boolean arrayequals(String word1[],String word2[]) {
			StringBuilder w1=new StringBuilder();
			for(String s:word1) {
			w1.append(s);}
			StringBuilder w2=new StringBuilder();
			for(String s1:word2) {
			w2.append(s1);}
			
			if(w1.compareTo(w2)==0) {
				return true;
			}
			else {
			
			return false;
			}
		}
	}

