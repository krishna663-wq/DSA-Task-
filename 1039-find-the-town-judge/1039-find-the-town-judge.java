class Solution {
    public int findJudge(int n, int[][] trust) {
        List<Integer> data = new ArrayList<>(Collections.nCopies(n + 1, 0));
        for(int[] x : trust){
            data.set(x[0],data.get(x[0]) - 1);
            data.set(x[1],data.get(x[1]) + 1);
        }
        for(int i=1;i<=n;i++){
            if(data.get(i)==n-1){
                return i;
            }
        }
        return -1;
    }
}
