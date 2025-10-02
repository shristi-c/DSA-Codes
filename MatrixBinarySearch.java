
import java.util.Arrays;

public class MatrixBinarySearch{
  public static void main(String[] args) {
      int [] [] arr={
          {1,2,3,4},
          {10,11,12,13},
          {20,25,30,31},
          {40,45,60,69},

      };
      int target=12;
     
      System.out.println(Arrays.toString(search(arr, target)));

  }

  static int[] search(int[][]arr,int target){
    int r=0;
    int c=arr.length-1;
    
    while(r<arr.length && c>=0){
      if (arr[r][c]== target) {
        return new int[]{r, c};
          
      }

      else if(arr[r][c]<target){
        r++;
      }
      else{
        c--;
      }
    }
    return new int []{-1,-1};
  }
}