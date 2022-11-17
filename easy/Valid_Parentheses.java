package easy;
import java.lang.*;

class parentheses{
	public boolean parent(String s) {
		if(s.length()%2!=0) {
			return false;
		}
		char c[]=new char[s.length()];
		int ob=0,cb=0,osb=0,csb=0,ocb=0,ccb=0,sum=0;
		for(int i=0;i<s.length();i++) {
			c[i]=s.charAt(i);
			if(c[i]=='(') {
				ob++;
			}
			if(c[i]==')') {
				cb++;
			}
			if(c[i]=='[') {
				osb++;
			}
			if(c[i]==']') {
				csb++;
			}
			if(c[i]=='{') {
				ocb++;
			}
			if(c[i]=='}') {
				ccb++;
			}
		}
		
		if(ob==cb&&osb==csb&&ocb==ccb) {
		return true;}
		return false;
	}
}


public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="(){";
		parentheses p=new parentheses();
		System.out.println( p.parent(s));

	}

}
