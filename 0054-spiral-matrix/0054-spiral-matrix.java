class Solution {
    public List spiralOrder(int[][] matrix) {
        ArrayList arr = new ArrayList<>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int rowStart = 0;
        int rowEnd = rows-1;
        int colStart = 0;
        int colEnd = cols-1;
        int d = 0; 
        while(rowStart<=rowEnd && colStart<=colEnd){
            if(d == 0){
                for(int i=colStart; i<=colEnd; i++){
                    arr.add(matrix[rowStart][i]);
                }
                rowStart++;
            }
            
            if(d == 1){
                for(int i=rowStart; i<=rowEnd; i++){
                    arr.add(matrix[i][colEnd]);
                }
                colEnd--;
            }
            
            if(d == 2){
                for(int i=colEnd; i>=colStart; i--){
                    arr.add(matrix[rowEnd][i]);
                }
                rowEnd--;
            }
            
            if(d == 3){
                for(int i=rowEnd; i>=rowStart; i--){
                    arr.add(matrix[i][colStart]);
                }
                colStart++;
            }
            
            d = (d+1) % 4;
            
        }
        
        return arr;
        
    }
}