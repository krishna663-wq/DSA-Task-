class Solution {
    public int[] constructDistancedSequence(int n) {
        int len = 2 * n - 1;
        int[] result = new int[len];
        boolean[] used = new boolean[n + 1];
        backtrack(result, used, 0, n);
        return result;
    }

    private boolean backtrack(int[] result, boolean[] used, int index, int n) {
        if (index == result.length) return true;
        if (result[index] != 0) return backtrack(result, used, index + 1, n);

        for (int num = n; num >= 1; num--) {
            if (used[num]) continue;
            int secondIndex = (num == 1) ? index : index + num;
            if (secondIndex < result.length && result[secondIndex] == 0) {
                result[index] = result[secondIndex] = num;
                used[num] = true;
                if (backtrack(result, used, index + 1, n)) return true;
                result[index] = result[secondIndex] = 0;
                used[num] = false;
            }
        }
        return false;
    }
}
