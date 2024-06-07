public class SprialMetrix {
    
      
      
        

    int startCol=0;
    int endRow=matrix.length-1;
 
    

            for(int j=startCol;j<=endCol;j

            // right
        for(int i=startRow+1;i<=endRow;i++){
        System.out.pri 

        for(int j=endCol-1;j>=startCol;j--){
            if(startRow==endRow){
        

    
rint(matrix[endRow][ 
        // left
        for(int i=endRow-1;i>=startRow+1;i--){
            if(startCol==endCol){
                break;
            }
            System.out.print(matrix[i][startCol]+" ");
        }
        startCol++;
        startRow++;
        endCol--;
        endRow--;

    }
    System.out.println();
}


public static void main(String[] args){
 int matrix[][] ={{1,2,3,4},
                        {5,6,7,8},{9,10,11,12},{13,14,15,16}};
                        printSprial(matrix);
}
}
