// Given an integer square (n by n) matrix, return its transpose. A transpose of a matrix switches the row and column indices. That is, for every r and c, matrix[r][c] = matrix[c][r].

// Constraints

// n ≤ 100
// Example 1
// Input
// matrix = [
//     [1, 2, 3],
//     [4, 5, 6],
//     [7, 8, 9]
// ]
// Output
// [
//     [1, 4, 7],
//     [2, 5, 8],
//     [3, 6, 9]
// ]


class Solution {
    public static void swap(int[][] matrix,int iterI,int iterJ){
        int temp=matrix[iterI][iterJ];
        matrix[iterI][iterJ]=matrix[iterJ][iterI];
        matrix[iterJ][iterI]=temp;
    }
    public int[][] solve(int[][] matrix) {
        if(matrix.length==0){
            return new int[][]{};
        }
        int col=matrix[0].length;
        int res[][]=new int[col][col];
        for(int iterI=0;iterI<col;iterI++){
            for(int iterJ=iterI+1;iterJ<col;iterJ++){
                // matrix[iterI][iterJ]=matrix[iterJ][iterI];
                swap(matrix,iterI,iterJ);
            }
        }
        return matrix;
    }
}
//Transpose of a Matrix in 14ms in java — faster than 98.65%
