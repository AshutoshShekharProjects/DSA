import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Dijkstras {
    static class Edge{
        int src;
        int dest;
        int wt;
        Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }
    public static void generateGraph(ArrayList<Edge>[] graph){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,1,2));
        graph[0].add(new Edge(0,2,4));
        graph[1].add(new Edge(1,3,7));
        graph[1].add(new Edge(1,2,1));
        graph[2].add(new Edge(2,4,3));
        graph[3].add(new Edge(3,5,1));
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,5));
    }
    public static void bfs(ArrayList<Edge>[] graph, boolean[] visied, int start){
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!visied[curr]){
                System.out.print(curr+" ");
                visied[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    static class Pair implements Comparable<Pair>{
        int node;
        int dist;
        Pair(int n, int d){
            this.node=n;
            this.dist=d;
        }
        @Override
        public int compareTo(Pair p2){
            return this.dist-p2.dist;
        }
    }
    public static void dijkstras(ArrayList<Edge>[] graph, int src, int V){
        PriorityQueue<Pair> pq= new PriorityQueue<>();
        boolean[] visited=new boolean[graph.length];
        int[] dist= new int[V];
        for(int i=1; i<V; i++){
            if(i!=src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }
        pq.add(new Pair(0,0) );
        while(!pq.isEmpty()){
            Pair curr=pq.remove();//shortest
            if(!visited[curr.node]){
                visited[curr.node]=true;
            }
            for(int i=0;i<graph[curr.node].size();i++){
                Edge e=graph[curr.node].get(i);
                int u=e.src;
                int v=e.dest;
                if(dist[u]+e.wt<dist[v]){
                    dist[v]=dist[u]+e.wt;
                    pq.add(new Pair(v,dist[v]));
                }
            }
        }
        for(int i=0;i<V;i++){
            System.out.print(dist[i]+" ");
        }
    }
    public static void main(String[] args){
        int V=6;
        ArrayList<Edge>[] graph=new ArrayList[V];
        generateGraph(graph);
        boolean[] visited=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                bfs(graph, visited, i);
            }
        }
        System.out.println();
        dijkstras(graph,0,V);
    }
}
