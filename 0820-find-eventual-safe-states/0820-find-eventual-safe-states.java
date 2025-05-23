class Solution {
    public boolean dfs(int node, boolean[] visited, boolean[] dfsVisited, List<List<Integer>> graph, boolean[] inCycle) {
        visited[node] = true;
        dfsVisited[node] = true;

        for (int neighbor : graph.get(node)) {
            if (!visited[neighbor]) {
                if (dfs(neighbor, visited, dfsVisited, graph, inCycle)) {
                    inCycle[node] = true;
                    return true;
                }
            } else if (dfsVisited[neighbor]) {
                inCycle[node] = true;
                return true;
            }
        }

        dfsVisited[node] = false;
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] visited = new boolean[n];
        boolean[] dfsVisited = new boolean[n];
        boolean[] inCycle = new boolean[n];
        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
            for (int j : graph[i]) {
                adj.get(i).add(j);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, visited, dfsVisited, adj, inCycle);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!inCycle[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
