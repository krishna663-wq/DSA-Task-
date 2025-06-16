class Solution {
    private boolean isValid(int i,int j,int n,int m,char[][] grid){
        return i>=0 && i<n && j>=0 && j<m && grid[i][j] == '1';
    }

    private void numIslandsRec(int i,int j,int n,int m,char[][] grid){
        grid[i][j] = '0';

        if(isValid(i+1,j,n,m,grid)){
            numIslandsRec(i+1,j,n,m,grid);
        }
        if(isValid(i,j+1,n,m,grid)){
            numIslandsRec(i,j+1,n,m,grid);
        }
        if(isValid(i-1,j,n,m,grid)){
            numIslandsRec(i-1,j,n,m,grid);
        }
        if(isValid(i,j-1,n,m,grid)){
            numIslandsRec(i,j-1,n,m,grid);
        }
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    numIslandsRec(i,j,n,m,grid);
                }
            }
            
        }
        return ans;
    }
}