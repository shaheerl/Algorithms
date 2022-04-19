public class Power{

     public static void main(String []args){
         System.out.println(power(2,4));
     }
     
     /*
     *  Return x^y
     *  Worst Case Complexity: O(log(n))
     *
     */
     public static int power(int x, double y) {
         int result = 1;                            // set the result to be returned to 1 initially
         while(y > 0){                              // while the exponent is greater than 0
             if(y % 2 != 0){                        // if the exponent is odd
                 result = result * x;               // multiply the result by the base
             }
                                                    // regardless of if the result calculations occur, the next two lines are calculated
             y = Math.floor(y/2);                   // divide the exponent by 2 and round down
             x = x*x;                               // square the base 
         }
         return result;                             // return the result
     }
}
