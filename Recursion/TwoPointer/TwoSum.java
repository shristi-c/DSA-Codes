import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum{
  public static void main(String[] args) {
    int[]arr={6,7,9,2,15};
    int target=9;
    arr=twosum(arr,target);
     System.out.println(Arrays.toString(arr));
  }

  static int[] twosum(int[] arr, int target){
    Map<Integer,Integer> seen = new HashMap<> ();
    for(int i=0;i<arr.length;i++){
      int complement=target- arr[i];
      if(seen.containsKey(complement)){
        return new int[]{seen.get(complement),i};
      }
      seen.put(arr[i],i);

    }
   throw new IllegalArgumentException("no solution");
  }
}