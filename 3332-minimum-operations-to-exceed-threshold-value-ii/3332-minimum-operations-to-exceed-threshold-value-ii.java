class Solution {
    public int minOperations(int[] nums, int k) {
        int op = 0;
        PriorityQueue<Long> min = new PriorityQueue<>();
        for (int i : nums)
            min.add((long)i);
        
        while (!min.isEmpty()) {
            if (min.peek() >= k)
                return op;

            if (min.size() < 2)
                break;
            long a = min.poll();
            long b = min.poll();
            long val = (Math.min(a, b) * 2) + (Math.max(a, b));
            op++;
            min.add(val);
        }
       
        return op;
    }
}