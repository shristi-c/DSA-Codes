
public class Profit{
  public static void main(String[]args){
   int[] arr={2,7,3,1,6};
  int ans=MaxProfit(arr);
  System.out.print(ans);
   
  }

  static int MaxProfit(int [] prices){
   int minPrice=Integer.MAX_VALUE;
   int maxProfit= 0;
   for(int price: prices){
    if(price<minPrice){
      minPrice=price;
    }
    else if(price-minPrice > maxProfit){
         maxProfit=price-minPrice;

    }
   }
    return maxProfit;
  }

}