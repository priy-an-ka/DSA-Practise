package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NoOfConnectedComponents {
    public static void connectedComponents(int arr[][], int v)
    {
        List<ArrayList> adj= new ArrayList<>();
        int[] visited = new int[v+1];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> vertex;
        int count=0, reached=0;
        for(int i=0;i<=v;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<arr.length;i++)
        {
            int source=arr[i][0];
            int end=arr[i][1];
            if(end==0)
                continue;
            vertex = adj.get(source);
            vertex.add(end);
        }

        for(int j=1;j<=v;j++)
        {
            if(visited[j]==1)
                continue;
            queue.add(j);
            visited[j]=1;
            int flag=0;
            while(!queue.isEmpty())
            {
                reached = queue.poll();
               // System.out.println(reached);
                for(int i=0;i<adj.get(reached).size();i++){
                    int node = (int) adj.get(reached).get(i);
                    if(visited[node]!=1){
                        visited[node]=1;
                        queue.add(node);
                        flag=1;
                    }

                }
            }
            if(flag==1 || adj.get(reached).size()==0)
              count++;
        }
        System.out.println(count);


    }

    public static void main(String[] args) {
        int arr[][] = {{1,2},{2,3},{2,1},{3,2},
                       {4,5},{5,0},{6,0},
                {7,8},{8,7},{8,9},{9,8},{10,6}} ;
        int v=10; //total no of vertices
        connectedComponents(arr,v);
    }
}
