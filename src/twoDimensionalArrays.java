public class twoDimensionalArrays {

    int MOVIES = 5; //rows
    int REVIEWERS = 10; //columns

    int [][] grid = new int[REVIEWERS][MOVIES];

    public twoDimensionalArrays(){


        for(int i = 0; i < REVIEWERS; i++)
        {
            for(int j = 0; j < MOVIES; j++)
            {
                grid [i][j] = 1;
                System.out.printf("%8d", grid[i][j]);
            }

            System.out.println();
        }

    }

    public int get(int reviewer, int movie)
    {

        int value = grid[reviewer][movie];

        return value;

    }

    public int countAbove(int value)
    {

        int totalCount = 0;
        for(int i = 0; i<value; i++)
        {
            for(int j = 0; j<MOVIES; j++)
            {
                totalCount += grid[i-1][j];
            }
        }

        return totalCount;

    }

    public static void main(String[] args) {


    }

}
