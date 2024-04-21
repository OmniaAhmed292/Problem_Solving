//https://leetcode.com/problems/find-if-path-exists-in-graph/description/
public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean [] visted = new boolean[n];
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for(int i = 0; i < n; i++){
            graph.add(new ArrayList<>());
        }
        for(int [] edge : edges){
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visted[source] = true;
        while(!queue.isEmpty()){
            int current = queue.poll();
            if(current == destination){
                return true;
            }
            for(int neighbor : graph.get(current)){
                if(!visted[neighbor]){
                    visted[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
        return false;
        
    }
