package Graphs;


import java.util.ArrayList;
import java.util.List;

public class dfs {
    public static void printDFS(List<ArrayList>adj, int[] visited, int start)
    {
        if(visited[start]==1)
            return;
        visited[start]=1;
        System.out.println(start);
        for(int i=0;i<adj.get(start).size();i++)
        {
            printDFS(adj, visited, (Integer) adj.get(start).get(i));
        }
    }
    public static void dfs(int[][] arr, int nodes, int start)
    {
        List<ArrayList> adj = new ArrayList<>();
        ArrayList vertices;
        int[] visited = new int[nodes];
        for(int i=0;i<nodes;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                int u = arr[i][0];
                int v = arr[i][1];
                vertices = adj.get(u);
                vertices.add(v);
            }

        }
        printDFS(adj, visited, start);

    }
    public static void main(String[] args) {
        //   graph = {0: [1, 2], 1: [2], 2: [3], 3: [1, 2]}

        int arr[][] = {{0,1},{0,2},{1,2},{2,3},{3,1},{3,2}} ;
        int v=4; //total no of vertices
        int start=0; // 0 indexed
        dfs(arr,v, start);
    }
}