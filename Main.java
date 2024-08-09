
/*given a 2d array of m rows and n columns
 write a program to print all elements in array using only one for loop..*/

public class Main {
        public static void main(String[] args) {
            int[][] array = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };
            
            int rows = array.length;
            int cols = array[0].length;
    
            // Use a single for loop to iterate over all elements
            for (int i = 0; i < rows * cols; i++) {
                // Convert the single index 'i' into row and column indices
                int row = i / cols;
                int col = i % cols;
    
                // Print the element at the calculated row and column
                System.out.print(array[row][col] + " ");
            }
        }
    }
    
