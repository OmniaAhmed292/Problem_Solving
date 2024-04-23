//https://leetcode.com/problems/minimum-height-trees/description/
public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if (n == 1) {
            res.add(0);
            return res;
        }
        List<Set<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new HashSet<>());
        }
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // if the node has only one neighbor, it is a leaf
            if (adj.get(i).size() == 1) {
                leaves.add(i);
            }
        }
        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            // remove the current leaves along with the edges
            for (int leaf : leaves) {
                int neighbor = adj.get(leaf).iterator().next();
                adj.get(neighbor).remove(leaf);
                // if the neighbor becomes a leaf, add it to the newLeaves
                if (adj.get(neighbor).size() == 1) {
                    newLeaves.add(neighbor);
                }
            }
            // update the leaves
            leaves = newLeaves;
        }
        return leaves;
     }
