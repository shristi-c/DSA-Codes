public class Rev2 {
   public static void main(String[] args) {
       System.out.println(rev(23456));
   }

  static int rev(int n){
    int digits=(int)(Math.log10(n))+1;
    return helper(n,digits);
  }

  static int helper(int n,int digits){

    if(n%10==n){
      return n;
    }
    int r=n%10;
    return r*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
  }
}
