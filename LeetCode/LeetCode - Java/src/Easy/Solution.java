package Easy;

import java.util.HashSet;
class Solution {
    public boolean checkValid(int[][] matrix) {
        int size = matrix.length;
        for (int i = 0; i < size; i++) {
            HashSet<Integer> row = new HashSet<>();
            HashSet<Integer> col = new HashSet<>();
            for (int j = 0; j < size; j++) {
                if ( ! row.add(matrix[i][j]) ) return false;
                if ( ! col.add(matrix[j][i]) ) return false;
            }
        }
        return true;
    }
}