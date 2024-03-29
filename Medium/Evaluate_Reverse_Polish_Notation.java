//leetcode 150 problem.
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        String operator="*/+-";
        for(String s: tokens){
        if(operator.contains(s)&&!stack.isEmpty()){
           int op1=stack.pop();
           int op2=stack.pop();
           int ans=help(op2,s,op1);
           stack.push(ans);
        }
        else{
            stack.push(Integer.parseInt(s));
        }
        }
        return stack.pop();
    }
    public int help(int op2,String s,int op1){
        if(s.equals("+")) return op2+op1;
        else if(s.equals("-"))return op2-op1;
        else if(s.equals("*"))return op2*op1;
        return op2/op1;
    }
}
