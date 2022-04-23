class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list= new ArrayList<>();
        if(matrix.length==0){
            return list;
        }
        int rowBegin=0;
        int rowEnd= matrix.length-1;
        int colBegin= 0;
        int colEnd= matrix[0].length-1;
        
        
       
        while(rowBegin<= rowEnd && colBegin<= colEnd){
         
            // printing 1,2,3
            for(int i= colBegin; i<=colEnd; i++){
                list.add(matrix[rowBegin][i]);
            }
            
            //moving downward
            rowBegin++;
            
            //printing last element of 1st row that is we are printing 6 and than travsing to downward
            for(int i= rowBegin; i<=rowEnd; i++){
                list.add(matrix[i][colEnd]);
            }
           
            //know for traversing towards left side
            colEnd--;
            
            //traversing towards left side of in last row
            if(rowBegin<=rowEnd){
                for(int i= colEnd; i>=colBegin; i--){
                    list.add(matrix[rowEnd][i]);
                } 
            }
            
            //than traversing upward from last row
            rowEnd--;
            
            // traversing to right side again
            if(colBegin<=colEnd){
                for(int i=rowEnd; i>=rowBegin; i--){
                    list.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return list;
    }
}