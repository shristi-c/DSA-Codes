import java.util.*;
public class PresentInString{
public static void main(String[]args){
  String name="shristi";
  char target='t';
  System.out.println(display(name,target));
  }


  static boolean display(String str, char target){
    if(str.length()==0){
      return false;
    } 
    for(int i=0;i<str.length();i++){
      if(target==str.charAt(i)){
        return true;
      }
    }
    return false;
    }

}