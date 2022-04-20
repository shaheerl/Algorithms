public class GreatestCommonDenominator{

     public static void main(String []args){
        System.out.println(GCD(20, 12));
     }
     
     /*
     *  Return the greatest common denominator from m and n
     *  Worst case complexity: O(log(m))
     */
     public static int GCD(int m, int n){
         int x = m;
         int y = n;
         while(y > 0){
             int xnew = y;
             int ynew = x % y;
             x = xnew;
             y = ynew;
         }
         return x;
     }
}
