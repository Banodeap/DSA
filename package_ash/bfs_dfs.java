package package_ash;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bfs_dfs {
    private LinkedList<Integer> a[];
    public bfs_dfs(int v){
        a=new LinkedList[v];
        for(int i=0;i<v;i++){
            a[i]=new LinkedList<Integer>();
        }
    }
    public void addEdge(int source,int destination){
        // if graph is undirected else if it is directed only from source to destination will be counted
        a[source].add(destination);
        a[destination].add(source);
    }
    public void bfs(int source,int destination){
        boolean visited[]=new boolean[a.length];
        Queue<Integer> q=new LinkedList<>();
        int parent[]=new int[a.length];
        q.add(source);
        visited[source]=true;
        parent[source]=-1;
        while(!q.isEmpty()){
            int cur=q.remove();
            System.out.println(cur+" ");
            for(int neighbour:a[cur]){
                if(!visited[neighbour]){
                    q.add(neighbour);
                    visited[neighbour]=true;
                    parent[neighbour]=cur;
                }
            }
        }
        int cur=destination;
        int distance=0;
//        while(parent[cur]!=-1){
//            System.out.println(cur+"->");
//            cur=parent[destination];
//            distance++;
//        }
//        System.out.println("Distance is "+cur);
    }
    void dfsutil(int source,boolean[] visited){
        visited[source]=true;
        System.out.println(source+" ");
        for(int i:a[source]){
            if(!visited[i]){
                dfsutil(i,visited);
            }
        }
    }
    void dfs(int source){
        boolean visited[]=new boolean[a.length];
        dfsutil(source,visited);
    }
    void dfsstack(int source){
        boolean visted[]=new boolean[a.length];
        visted[source]=true;
        Stack<Integer> s=new Stack<>();
        s.push(source);
        while(!s.isEmpty()){
            int cur=s.pop();
            for(int num:a[cur]){
                if(!visted[num]){
                    System.out.println(num+" ");
                    visted[num]=true;
                    s.push(num);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre no. of vertices and edges");
        int v=sc.nextInt();
        int e= sc.nextInt();
        bfs_dfs graph=new bfs_dfs(v);
        System.out.println("Entre "+e+" edge");
        for(int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();
            graph.addEdge(source,destination);
        }
        System.out.println("Entre source");
        int source=sc.nextInt();
        System.out.println("Entre destination");
        int destination=sc.nextInt();
        graph.bfs(source,destination);
        graph.dfs(source);
        graph.dfsstack(source);
    }
}
