public class SearchInRange{
  public static void main(String[]args){    
          int []arr={23,3,55,15,90};
          int target=3;
          System.out.println(search(arr,target,0,3));              


  }
   static int search(int [] arr, int target,int start,int end){
   if(arr.length==0){                                     //if the array is empty
    return -1;
   }
   for(int i=start;i<=end;i++)
   {
    int element=arr[i];
    if(element==target){
      return i;                                               //returns the index of the target
    }
   }// if the target not found in the array 
   return -1;
  }
}