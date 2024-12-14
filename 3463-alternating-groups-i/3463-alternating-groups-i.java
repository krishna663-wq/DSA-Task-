class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int prev = colors[(i - 1 + n) % n]; // Left tile (circular)
            int curr = colors[i];              // Current tile
            int next = colors[(i + 1) % n];    // Right tile (circular)
            
            if (prev != curr && curr != next) {
                count++;
            }
        }
        return count;
    }
}
