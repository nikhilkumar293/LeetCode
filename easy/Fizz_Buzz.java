class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> f=new ArrayList<>();
        f.add("1");
        for(int i=2;i<=n;i++){
          if(i%3==0&&i%5==0){
              f.add("FizzBuzz");
          }
          else if(i%3==0){
              f.add("Fizz");
          }
          else if(i%5==0){
              f.add("Buzz");
          }
          else{  
              f.add(String.valueOf(i));
          }
        }
        return f;
    }
}
