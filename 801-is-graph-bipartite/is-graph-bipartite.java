class Solution {
    public static boolean isBipartite(ArrayList<Edge>[] newgraph){
        int color[] = new int[newgraph.length];
        for(int i=0; i<newgraph.length; i++){
            color[i] = -1;
        }
        
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<newgraph.length; i++){
            if(color[i] == -1){
                q.add(i);
                color[i] = 0; 

                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0; j<newgraph[curr].size(); j++){
                        Edge e = newgraph[curr].get(j);
                        
                        if(color[e.dest] == -1){
                            int nextcol = color[curr] == 0 ? 1 : 0;
                            color[e.dest] = nextcol;
                            q.add(e.dest);
                        }
                        else if(color[e.dest] == color[curr]){   
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    static class Edge{
        int src;
        int dest;

        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public boolean isBipartite(int[][] graph) {
        ArrayList<Edge>[] newgraph = new ArrayList[graph.length];

        for(int i=0; i<newgraph.length; i++){
            newgraph[i] = new ArrayList<>();    
        }
        
        for(int i=0; i<graph.length; i++){
            for(int j=0; j<graph[i].length; j++){
                newgraph[i].add(new Edge(i, graph[i][j]));
            }
        }

        return isBipartite(newgraph);
    }
}