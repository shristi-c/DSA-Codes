public class CountZeros {
  public static void main(String[] args) {
    int ans= count(3000600);
     System.out.println(ans);
  }  

  static int count(int n){
    return helper(n,0);
  }
  private static int helper(int n, int c){
    if(n==0){
      return c;
    }
    int r=n%10;
    if(r==0){
      return helper(n/10,c+1);
    }
    return helper(n/10,c);
  }
}
