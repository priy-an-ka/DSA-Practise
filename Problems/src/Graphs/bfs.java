package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs {
    public static void bfs(int arr[][], int v, int start)
    {
        List<ArrayList> adj= new ArrayList<>();
        int[] visited = new int[v];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> vertex;
        for(int i=0;i<v;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++)
        {
            int source=arr[i][0];
            int end=arr[i][1];
            vertex = adj.get(source);
            vertex.add(end);
        }
        queue.add(start);
        visited[start]=1;
        while(!queue.isEmpty())
        {
            int reached = queue.poll();
            System.out.println(reached);
            for(int i=0;i<adj.get(reached).size();i++){
                int node = (int) adj.get(reached).get(i);
                if(visited[node]!=1){
                    visited[node]=1;
                    queue.add(node);
                }

            }
        }

    }

    public static void main(String[] args) {
        //   graph = {0: [1, 2], 1: [2], 2: [3], 3: [1, 2]}

        int arr[][] = {{0,1},{0,2},{1,2},{2,3},{3,1},{3,2}} ;
        int v=4; //total no of vertices
        int start=0; // 0 indexed
        bfs(arr,v, start);

    }

}

