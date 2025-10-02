
import java.util.Arrays;

public class Search2DArray{
  public static void main(String[]args){
    int[][] arr={
          {1,43,23},
          {21,78,-2},
          {31,2,43}
};
int target=21;
int[] ans=search(arr,target);
System.out.println(Arrays.toString(ans));

  }
  static int[] search(int[][]arr,int target){
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++)
      if(arr[i][j]== target){
        return new int[] {i,j};

      }
    }
   return new int[] {-1,-1};
  }
}