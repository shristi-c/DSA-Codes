public class Evendig{
  public static void main(String[] args) {
      int[]arr={12,333,2,1234,21,1,1234};

      //System.out.println(findnos(arr));         //to find number of even digits
      System.out.println(digits2(-554626));      //to find number of digits

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
  static int digits2(int num){
    if(num<0){
      num=num*-1;                                  //for negative numbers
    }
    return (int)(Math.log10(num))+1;           //finding number of digits by using log function     //for binary numbers choose log2 instead of log10
  }
  
  static int digits(int num){
    int count=0;
    while(num>0){
      count++;
      num /= 10;
    }
    return count;
  }
}
