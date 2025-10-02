public class Sum_of_digits{
  public static void main(String[] args) {
   int ans=sum(2345);
      System.out.println(ans);
  }


static int sum(int n){
  if(n==0){
    return 0;
  }
  return (n%10)+sum(n/10);
}
}