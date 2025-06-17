class Solution {
    private boolean isValid(int i,int j,int p,int q,char[][] grid){
        return i>=0 && i<p && j>=0 && j<q  && grid[i][j] == '1';
    }
    private void numIslandsRec(int i,int j,int p,int q,char[][] grid){
        grid[i][j] = '0';
        if(isValid(i+1,j,p,q,grid)){
            numIslandsRec(i+1,j,p,q,grid);        
        }
        if(isValid(i-1,j,p,q,grid)){
            numIslandsRec(i-1,j,p,q,grid);        
        }
        if(isValid(i,j+1,p,q,grid)){
            numIslandsRec(i,j+1,p,q,grid);        
        }
        if(isValid(i,j-1,p,q,grid)){
            numIslandsRec(i,j-1,p,q,grid);        
        }
    }
    public int numIslands(char[][] grid) {
        int p = grid.length;
        int q = grid[0].length;
        int ans = 0;
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                if(grid[i][j]=='1'){
                    ans++;
                    numIslandsRec(i,j,p,q,grid);
                }
            }
        }
        return ans;
    }
}