class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int heavy=0,bulky=0;
         long v = (long)length * (long)width * (long)height;
        if(length>=Math.pow(10,4)||width>=Math.pow(10,4)||height>=Math.pow(10,4)||mass>=Math.pow(10,4)){
           bulky=1;
         }
        if(v>=Math.pow(10,9)){
            bulky=1;
        }
        if(mass>=100){
            heavy=1;
        }
        if(heavy==1&&bulky==1){
           return "Both";         
        }
        if(bulky==0&&heavy==0){
            return "Neither";
        }
        if(bulky==1&&heavy==0){
            return "Bulky";
        }
        if(bulky==0&&heavy==1){
            return "Heavy";
        }
        return "1";
    }
}
