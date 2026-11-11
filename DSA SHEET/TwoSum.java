import java.util.HashMap;
import java.util.Map;

public class TwoSum {
  public static void main(String[] args) {
    int []nums={2,11,15,7};
    int target=9;
    TwoSum ts=new TwoSum();
    int []result=ts.twoSum(nums,target);
    System.out.println("Indices: "+result[0]+", "+result[1])
      
  }
  public int[] twoSum(int []nums, int target){
    Map<Integer, Integer> seen = new HashMap<>();
    for(int i=0; i<nums.length; i++){
      int complement= target-nums[i];
      if(seen.containsKey(complement)){
        return new int[]{seen.get(complement), i};
      }
      seen.put(nums[i],i);

    }
    throw new IllegalArgumentException("No two sum solution");

  }
  }

