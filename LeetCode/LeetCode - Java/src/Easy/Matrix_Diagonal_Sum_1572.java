package Easy;

class Matrix_Diagonal_Sum_1572 {
    public int diagonalSum(int[][] mat) {
        int size = mat.length;
        int sum = 0;
        for ( int i = 0 ; i < size ; i++ ) {
            sum += mat[i][i] + mat[0][size - 1 - i];
        }
        if ( size % 2 != 0 ) {
            sum -= mat[size/2][size/2];
        }
        return sum;
    }
}
