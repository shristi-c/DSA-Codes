
import java.util.HashSet;
import java.util.Set;

public class Duplicate{
  public static void main(String[] args) {
    int [] nums= {1,2,3,4,5,6,7,8,9,10,1};
    Duplicate s = new Duplicate();
    System.out.println(s.containsDuplicate(nums));
    
  }


  public boolean containsDuplicate(int [] nums){
    Set<Integer> seen= new HashSet<> ();
    for(int n : nums){
      if(!seen.add(n)){
        return true;
      }
    }
    return false;
    }

  }


  //by using contains 
  /* 
  
  
public boolean containsDuplicate(int[] nums) {
    Set<Integer> seen = new HashSet<>();

    for (int n : nums) {
        if (seen.contains(n)) {
            return true;
        }
        seen.add(n);
    }

    return false;
}
  
  
  */