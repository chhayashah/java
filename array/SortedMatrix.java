public class SortedMatrix {

    public static boolean stairecaseSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {

            
        }
        System.out.println("key not found");
        return false;
    }

    int matrix[][] = {{10,20,20,40},{15,25,25,45},{27,29,37,48},{32,22,29,50}};
        int key=33;
        stairecaseSearch(matrix,key);
      

    
