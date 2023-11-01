package Interview;

public class UniquePaths {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        if(obstacleGrid[0][0]==1)
        {
            System.out.println(0);
            return;
        }

        int[][] output =  new int[obstacleGrid.length][obstacleGrid[0].length];
        //first column
        output[0][0]=0;
        for(int i=1;i<obstacleGrid[0].length;i++)
        {
            output[0][i] = obstacleGrid[0][i]==0?1:0;
        }
        //first row
        for(int i=1;i<obstacleGrid.length;i++)
        {
            output[i][0] = obstacleGrid[i][0]==0?1:0;
        }
        for(int i=1;i<obstacleGrid.length;i++)
        {
            for(int j=1;j<obstacleGrid[0].length;j++)
            {
                if(obstacleGrid[i][j]==0)
                  output[i][j]=output[i-1][j]+output[i][j-1];
            }
        }
        System.out.println(output[output.length-1][output[0].length-1]);


    }
}
