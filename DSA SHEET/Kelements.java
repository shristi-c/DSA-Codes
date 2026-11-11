
  import  java.util.*;
public class Kelements{
  public static void main(String[] args){
    int []nums={1,1,1,2,2,3,3,4,4,8};
    int k=3;
    Kelements ke=new Kelements();
    System.out.println(Arrays.toString(ke.topKFrequent(nums,k)));

  }
 @SuppressWarnings("unchecked")
public int[] topKFrequent(int[] nums, int k) {
    Map<Integer, Integer> freq = new HashMap<>();
    for (int n : nums) freq.merge(n, 1, Integer::sum);
    List<Integer>[] buckets = new List[nums.length + 1];
    for (Map.Entry<Integer, Integer> e : freq.entrySet()) {
        int f = e.getValue();
        if (buckets[f] == null) buckets[f] = new ArrayList<>();
        buckets[f].add(e.getKey());
    }
    int[] res = new int[k];
    int idx = 0;
    for (int f = buckets.length - 1; f >= 0 && idx < k; f--) {
        if (buckets[f] == null) continue;
        for (int num : buckets[f]) {
            res[idx++] = num;
            if (idx == k) break;
        }
    }
    return res;
}
}