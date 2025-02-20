import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graphs {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    public static void generateGraph(ArrayList<Edge>[] graph){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2,2));
        graph[1].add(new Edge(1,2,10));
        graph[1].add(new Edge(1,3,0));
        graph[2].add(new Edge(2,0,2));
        graph[2].add(new Edge(2,1,10));
        graph[2].add(new Edge(2,3,-1));
        graph[3].add(new Edge(3,1,0));
        graph[3].add(new Edge(3,2,-1));
    }

    public static void generateGraph2(ArrayList<Edge>[] graph){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<Edge>();
        }
            graph[0].add(new Edge(0,1,1));
            graph[0].add(new Edge(0,2,1));
            graph[1].add(new Edge(1,0,1));
            graph[1].add(new Edge(1,3,1));
            graph[2].add(new Edge(2,0,1));
            graph[2].add(new Edge(2,4,1));
            graph[3].add(new Edge(3,1,1));
            graph[3].add(new Edge(3,4,1));
            graph[3].add(new Edge(3,5,1));
            graph[4].add(new Edge(4,2,1));
            graph[4].add(new Edge(4,3,1));
            graph[4].add(new Edge(4,5,1));
            graph[5].add(new Edge(5,3,1));
            graph[5].add(new Edge(5,4,1));
            graph[5].add(new Edge(5,6,1));
            graph[6].add(new Edge(6,5,1));
    }

    public static void generateGraph3(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0,2,1));
        graph[1].add(new Edge(1,0,1));
        graph[2].add(new Edge(2,3,1));
        graph[3].add(new Edge(3,0,1));
    }

    public static void generateGraph4(ArrayList<Edge>[] graph){
        for(int i=0;i< graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1,1));
        graph[0].add(new Edge(0, 4,1));
        graph[1].add(new Edge(1, 0,1));
        graph[1].add(new Edge(1, 2,1));
        graph[1].add(new Edge(1, 4,1));
        graph[2].add(new Edge(2, 1,1));
        graph[2].add(new Edge(2, 3,1));
        graph[3].add(new Edge(3, 2,1));
        graph[4].add(new Edge(4, 0,1));
        graph[4].add(new Edge(4, 5,1));
        graph[5].add(new Edge(5, 4,1));
    }

    static void createGraph(ArrayList<Edge> graph[]) {
        for(int i=0; i<graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3,1));
        graph[3].add(new Edge(3, 1,1));
        graph[4].add(new Edge(4, 0,1));
        graph[4].add(new Edge(4, 1,1));
        graph[5].add(new Edge(5, 0,1));
        graph[5].add(new Edge(5, 2,1));
    }

    public static void bfs(ArrayList<Edge>[] graph, boolean[] visited, int start){//O(V+E)
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
        System.out.println();
    }

    public static void printALlPaths(ArrayList<Edge>[] graph, boolean[] vis, int curr, int dest, String path){
        if(curr==dest){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                vis[curr]=true;
                printALlPaths(graph,vis,e.dest,dest,path+"->"+e.dest);
                vis[curr]=false;
            }
        }
    }

    public static boolean isCycle(ArrayList<Edge>[] graph, boolean[] vis, boolean[] stack, int curr){
        vis[curr]=true;
        stack[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            } else if(!vis[e.dest] && isCycle(graph,vis,stack,e.dest)) {
                return true;
            }
        }
        stack[curr]=false;
        return false;
    }

    public static void dfs(ArrayList<Edge>[] graph, int curr, boolean[] vis){
        if(vis[curr]){
            return;
        }
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis);
            }
        }
    }

    public static boolean isCycleUndirected(ArrayList<Edge> graph[], boolean vis[], int curr, int par){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(vis[e.dest] && e.dest!=par){
                return true;
            }
            else if(!vis[e.dest]){
                if(isCycleUndirected(graph,vis,e.dest,curr)){
                    return true;
                }
            }
        }
        return false;
    }

    public static void topologicalSortUtil(ArrayList<Edge>[] graph, boolean[] vis, int curr, Stack<Integer> stack){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e=graph[curr].get(i);
            if(!vis[e.dest]){
                topologicalSortUtil(graph,vis,e.dest,stack);
            }
        }
        stack.push(curr);
    }

    public static void topologicalSort(ArrayList<Edge>[] graph, int V){
        boolean[] vis=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                topologicalSortUtil(graph,vis,i,stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }

    public static void main(String[] args){
        /*
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];
        generateGraph(graph);
        for(int i=0;i<graph.length;i++){
            ArrayList<Edge> al=graph[i];
            for(int j=0;j<al.size();j++){
                Edge e=al.get(j);
                System.out.println("Neighbour of Edge "+i+": "+e.dest+", "+"Weight: "+e.wt);
            }
        }*/
        int V2=7;
        ArrayList<Edge>[] graph2=new ArrayList[V2];
        generateGraph2(graph2);
        boolean[] visited=new boolean[V2];

        for(int i=0;i<V2;i++){
            if(!visited[i]){
                bfs(graph2,visited,i);
            }
        }

        visited=new boolean[V2];
        for(int i=0;i<V2;i++){
            if(!visited[i]){
                dfs(graph2,i,visited);
            }
        }
        System.out.println();

        int src=0;
        int tar=5;
        String path="0";
        printALlPaths(graph2, new boolean[V2], src, tar, path);

        int V3=4;
        int c=0;
        boolean[] vis=new boolean[V3];
        boolean[] st=new boolean[V3];
        ArrayList<Edge>[] graph3=new ArrayList[V3];
        generateGraph3(graph3);
        for(int i=0;i<V3;i++){
            if(!vis[i]){
                boolean isCycle=isCycle(graph3,vis,st,0);
                if(isCycle){
                    c++;
                    System.out.println(isCycle);
                    break;
                }
            }
        }
        if(c==0){
            System.out.println("False");
        }

        int V4=6;
        ArrayList<Edge>[] graph4=new ArrayList[V4];
        generateGraph4(graph4);
        System.out.println(isCycleUndirected(graph4, new boolean[V4], 0, -1));

        int V = 6;
        ArrayList<Edge> graph5[] = new ArrayList[V];
        createGraph(graph5);
        topologicalSort(graph5,V);
    }
}
