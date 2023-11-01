package Interview;

import javafx.util.Pair;

import java.util.Stack;

public class floodFill {
    public static int[][] fillArray(int arr[][],int sr, int sc)
    {
        int output[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                output[i][j]=arr[i][j];
            }
        }
        int visited[][]=new int[arr.length][arr[0].length];
        Stack<Pair<Integer,Integer>> stack= new Stack<>();
        Pair p = new Pair(sr,sc);
        visited[sr][sc]=1;
        output[sr][sc]= arr[sr][sc]+ 1;
        stack.push(p);
        int row=0, col=0;
        while(!stack.isEmpty())
        {
//            arr[sr-1][sc]
//            arr[sr+1][sc]
//            arr[sr][sc-1]
//            arr[sr][sc+1]
              p = stack.pop();
              row= (int) p.getKey();
              col= (int) p.getValue();

              if (row>=1 && arr[row-1][col]>0 && visited[row-1][col]==0)
              {
                  visited[row-1][col]=1;
                  output[row-1][col]=output[row-1][col]+1;
                  p= new Pair(row-1,col);
                  stack.push(p);
              }
              if (row<arr.length-1 && arr[row+1][col]>0 && visited[row+1][col]==0)
              {
                    visited[row+1][col]=1;
                    output[row+1][col]= output[row+1][col+1];
                    p= new Pair(row+1,col);
                    stack.push(p);
              }
              if (col>=1 && arr[row][col-1]>0 && visited[row][col-1]==0)
              {
                    visited[row][col-1]=1;
                    output[row][col-1]=output[row][col-1]+1;
                    p= new Pair(row,col-1);
                    stack.push(p);
              }
              if (col<arr[0].length-1 && arr[row][col+1]>0 && visited[row][col+1]==0)
              {
                    visited[row][col+1]=1;
                    output[row][col+1]=output[row][col+1]+1;
                    p= new Pair(row,col+1);
                    stack.push(p);
              }

        }
        return output;

    }
    public static void main(String[] args) {

        int arr[][] = {{1,1,1},{1,1,0},{1,0,1}};
        int sr=1, sc=1;
        int output[][];
        output=fillArray(arr, sr,sc);
        for(int i=0;i<output.length;i++)
        {
            for(int j=0;j<output[i].length;j++)
            {
                System.out.print(output[i][j]);
            }
            System.out.println();
        }
    }
}
