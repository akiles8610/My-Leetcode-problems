class Solution {
    public void setZeroes(int[][] matrix) {
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0)
                count++;
            }
        }
        int k=0;
        int arr[]=new int[count];
        int arr1[]=new int[count];
        for(int i=0;i<matrix.length;i++){
            
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    arr[k]=i;
                    arr1[k]=j;
                    k++;
                }
                
            }
        }
        for(int i=0;i<count;i++){
            int row=arr[i];
            int col=arr1[i];
            for(int j=0;j<matrix[0].length;j++){
                matrix[row][j]=0;
            }
            for(int l=0;l<matrix.length;l++){
                matrix[l][col]=0;
            }
        }
        
    }
}