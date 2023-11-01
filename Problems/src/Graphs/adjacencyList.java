package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class adjacencyList {

    public static void adjacencyList(int[][] edges, int v, int e){
        List<ArrayList> adj = new ArrayList<>(v);
        for (int i=0; i<v; i++)
            adj.add(new ArrayList<>());
        ArrayList<Integer> edge;
        for(int i=0;i<e;i++)
        {
            int start = edges[i][0];
            int end= edges[i][1];
            edge=adj.get(start);
            edge.add(end);
        }
        System.out.println(adj);

    }

    public static void main(String[] args) {

        int v = 5;
        int e = 7;

        int[][] edges = {{0,1},{0,4},{4,1},{4,3},{1,3},{1,2},{3,2}};
        adjacencyList(edges,v, e);

//        0 -> {1, 3}
//        1 -> {2}
//        3 -> {2}


    }

}

