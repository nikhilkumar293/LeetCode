package easy;

	import java.lang.*;

	class parentheses1{
		public boolean parent(String s) {
			if(s.length()%2!=0) {
				return false;
			}
			for(int i=0;i<s.length();i+=2) {
				if(s.charAt(i)=='(') {
					if(s.charAt(i+1)==')') {
						return true;
					}
				}
				if(s.charAt(i)=='{') {
					if(s.charAt(i+1)=='}') {
						return true;
					}
				}
				if(s.charAt(i)=='[') {
					if(s.charAt(i+1)==']') {
						return true;
					}
				}
			}
			return false;
	}
	}

	public class Valid_parenthese_ordered {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s="(){}";
			parentheses1 p=new parentheses1();
			System.out.println( p.parent(s));

		}

	}

	

