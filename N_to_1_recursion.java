public class N_to_1_recursion{
  public static void main(String[]args){
    fun(5);      //from 5 to 1
    funRev(8);  //from 1 to 8
  }
 static void fun(int n){
  if(n==0){

    return;
  }
  System.out.println(n);
  fun(n-1);
 }

 static void funRev(int n){
  if(n==0){
    return;
  }
  funRev(n-1);
  System.out.println(n);
 }


}