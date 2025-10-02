public class EvenDigits{
  public static void main(String[] args) {
      int[]arr={12,333,2,1234};
      System.out.println(findnos(arr));

  }
  static int findnos(int[] nums){
    int count=0;
    for(int num:nums){
      if(even(num)){
         count++;
      }
    }
    return count;
  }
  static boolean even(int num){
    int nod=digits(num);
    if(nod%2==0){
      return true;
    }
    return false;
  }
  
  
  static int digits(int num){
    int count=0;
    while(num>0){
      count++;
      num=num/10;
     
    }
    return count;
  }
  
}
