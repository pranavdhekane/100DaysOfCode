package day56;
import java.util.*;
public class day56 {
    static public class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i = 0; i< graph.length; i++){
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
    public static void printAllPaths(ArrayList<Edge> graph[], boolean vis[], int start, int target, String path) {
        if(start == target){
            System.out.println(path);
            return;
        }

        for(int i = 0; i< graph[start].size(); i++){
            Edge e = graph[start].get(i);
            if(!vis[e.dest]){
                vis[start] = true;
                printAllPaths(graph, vis, e.dest, target, path+e.dest);
                vis[start] = false;
            }
        }
    }
    
    public static void main(String[] args) {
        int V = 7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);
        boolean vis[] = new boolean[V];

        printAllPaths(graph, vis, 0, 5, "0");
    }
}
