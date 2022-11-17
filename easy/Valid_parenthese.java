package easy;
import java.lang.*;
import java.util.Stack;
class valid{
	public boolean vp(String s) {
		Stack<Character>s1=new Stack<Character>();
        for(char c:s.toCharArray()){
            if(c=='('){
                s1.push(')');
            }
            else if(c=='{') {
            	s1.push('}');
            }
            else if(c=='[') {
            	s1.push(']');
            }
            else if(s1.isEmpty()||s1.pop()!=c) {
            	return false;
            }
            
        }
        return s1.isEmpty();
	
		
	
}
}

public class Valid_parenthese {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String s="{[]}";
			valid p=new valid();
			System.out.println(p.vp(s));

		}

	}

