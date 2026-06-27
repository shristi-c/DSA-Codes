public class Triangle{
  public static void main(String[]args){
  
   Tri2(4,0);

  }

   static void Tri(int r,int c){
    if(r==0){
      return;
    }
    if(c<r){
      System.out.print("*");
      Tri(r,c+1);

    }
    else{
      System.out.println();
      Tri(r-1,0);
    }
  }

  static void Tri2(int r, int c){
    if(r==0){
      return;
    }
    if(c<r){
      Tri2(r,c+1);
      System.out.print("*");
      

    }
    else{
      Tri2(r-1,0);
      System.out.println();
      
    }
  }
}