import java.util.*;



public class GroupAnagram{
  public static void main(String[] args){
    List<String> list = List.of("eat", "tea", "tan", "ate", "nat", "bat", "gun", "nug");
    GroupAnagram ga = new GroupAnagram();
    System.out.println(ga.groupAnag(list.toArray(new String[0])));

  }

  public List<List<String>> groupAnag(String [] strs){
    Map <String, List<String>> map = new HashMap<>();
    for(String s: strs){
      char [] arr= s.toCharArray();
      Arrays.sort(arr);
      String key= new String(arr);
      map.computeIfAbsent(key,  k-> new ArrayList<>()).add(s);    
    }
     return new ArrayList<>(map.values());
  }
}