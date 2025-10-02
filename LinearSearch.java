public class LinearSearch{
  public static void main(String[] args) {
    int[] arr={12,45,67,8,91,24};
    int target=12;
    int ans=search(arr,target);
      System.out.println(ans);
  }
  //for searching an element one by one in the array
  static int search(int [] arr, int target){
   if(arr.length==0){                                     //if the array is empty
    return -1;
   }
   for(int i=0;i<arr.length;i++)
   {
    int element=arr[i];
    if(element==target){
      return i;                                               //returns the index of the target
    }
   }// if the target not found in the array 
   return -1;
  }
  
  
  }

