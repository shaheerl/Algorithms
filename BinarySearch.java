public class BinarySearch{

     public static void main(String []args){
         int[] array = {1, 2, 3, 4, 6, 8, 20, 32, 37, 45, 46, 47, 48, 91, 1232, 1285, 2001};
         System.out.println(binarySearch(array, 1000));
     }
     
     /*
     *  Return the index of an element in a sorted array
     *  Return -1 if it was not found
     *  Worst Case Complexity: O(log(n))
     *
     */
     public static int binarySearch(int[] array, int key){
         int left = 0;                                          // the current left index of the array
         int right = array.length - 1;                          // the current last index of the array
         
         while(right > left){                                   // until the left and right indexes are on the same index or the left has surpassed the right 
             int mid = (int)Math.floor( (left + right) / 2);    // set mid to the middle of the array
             if(key <= array[mid]){                             // if key is less than or equal to the element in the middle
                 right = mid;                                   // dividing array in half from the right
             }
             else{
                 left = mid + 1;                                // dividing array in half from the left 
             }
         }
         if(key == array[left]){                                // if the key matches the left index element value
             return left;                                       // return the index
         }
         return -1;                                         
     }
}
