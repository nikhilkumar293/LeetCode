class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        int i=0;
        while(i<operations.length){
            if(operations[i].charAt(0)=='-'||operations[i].charAt(2)=='-'){
                x=x-1;
            }
            else{
                x=x+1;
            }
            i++;
    
        }
        return x;
    }
}
