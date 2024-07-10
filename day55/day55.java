package day55;

import java.util.*;

/**
 * day55
 */
public class day55 {
    public static class Edge{
        int src;
        int dest;

        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i<graph.length; i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void bfs(ArrayList<Edge> graph[], int V, boolean visited[], int start){
        Queue<Integer> q = new LinkedList<>();

        q.add(start);

        while(!q.isEmpty()){
            int curr = q.remove();
            if(visited[curr] == false){ //if visited is true then it's all ready printed but if it is then we 
                System.out.print(curr + " "); //print the vertice
                visited[curr] = true; //set vertice track to true
                for(int j = 0; j< graph[curr].size(); j++){ //add the neighbouring elements of that vertice to queue
                    q.add(graph[curr].get(j).dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[], boolean visited[], int curr){
        System.out.print(curr + " ");
        visited[curr] = true;
        for(int i = 0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            if(visited[e.dest] == false){
                dfs(graph, visited, e.dest);
            }
        }
        
    }
    public static void main(String[] args) {
        int V = 7;

        /*

            1 ---- 3
           /       | \ 
          0        |  5 --- 6
           \       | /
            2 ---- 4

        */

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        boolean visited[] = new boolean[V]; // to set a track of visited elements
        for(int i = 0; i<visited.length; i++) {
            if(visited[i] == false){
                dfs(graph, visited, i);
            }
        }
        // dfs(graph, visited, 0);
    }
}