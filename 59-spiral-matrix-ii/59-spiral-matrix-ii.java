class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];

        int rowBegin = 0;
        int rowEnd = ans.length - 1;
        int colBegin = 0;
        int colEnd = ans[0].length - 1;
        int num = 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {


            // printing 1,2,3
            for (int i = colBegin; i <= colEnd; i++) {
                ans[rowBegin][i] = num;
                num++;
            }

            //moving downward
            rowBegin++;

            //printing last element of 1st row that is we are printing 6 and than travsing to downward
            for (int i = rowBegin; i <= rowEnd; i++) {
//                list.add(matrix[i][colEnd]);
                ans[i][colEnd] = num;
                num++;
            }

            //know for traversing towards left side
            colEnd--;

            //traversing towards left side of in last row
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
//                    list.add(matrix[rowEnd][i]);
                    ans[rowEnd][i] = num;
                    num++;
                }
            }

            //than traversing upward from last row
            rowEnd--;

            // traversing to right side again
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
//                    list.add(matrix[i][colBegin]);
                    ans[i][colBegin] = num;
                    num++;
                }
            }
            colBegin++;
        }
        return ans;
    }
}