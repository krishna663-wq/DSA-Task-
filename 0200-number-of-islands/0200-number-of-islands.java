class Solution {

    private boolean isValid(int i,int j,int m,int n,char[][] grid){
        return i>=0 && i<m && j>=0 && j<n && grid[i][j] == '1';
    }
    private void numIslandsRec(int i,int j,int m,int n,char[][] grid){
        grid[i][j] = '0';
        
        if(isValid(i+1,j,m,n,grid)){
            numIslandsRec(i+1,j,m,n,grid);
        }
        if(isValid(i-1,j,m,n,grid)){
            numIslandsRec(i-1,j,m,n,grid);
        }
        if(isValid(i,j+1,m,n,grid)){
            numIslandsRec(i,j+1,m,n,grid);
        }
        if(isValid(i,j-1,m,n,grid)){
            numIslandsRec(i,j-1,m,n,grid);
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans= 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    numIslandsRec(i,j,m,n,grid);
                }
            }
        }
        return ans;
    }
}