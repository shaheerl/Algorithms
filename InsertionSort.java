public class InsertionSort{

     public static void main(String []args){
         int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
         insertionSort(a);
         printArray(a);
     }
     
     /*
     *  Worst Case Complexity: O(n^2)
     *
     */
     public static void insertionSort(int[] array){
         for(int i = 1; i < array.length; i++){         // iterate through array
             int current = array[i];                    // set a var to current int in the array
             int j = i - 1;                             // set a var to previous int in the array
             while(j >= 0 && array[j] > current){       // while j > 0 and the ints visited beforehand are greater than the current int
                 array[j + 1] = array[j];               // set the current int in the array to the previous value
                 j--;                                   // decrement j by 1
             }
             array[j + 1] = current;                    // once the while loop is no longer true, set the array[j + 1] element value to the current value
         }
     }
     
     public static void printArray(int[] array){
         for(int i = 0; i < array.length; i++){
             System.out.print(array[i] + " ");
         }
     }
}
