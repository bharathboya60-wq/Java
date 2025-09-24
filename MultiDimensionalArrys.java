// AR[row][column]

public class MultiDimensionalArrys {
    public static void main(String[] args) {
        int ma[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
        // System.out.println(ma[1][1]);
        for(int i = 0; i<ma.length; i++)
        {
            for(int j = 0; j< ma[0].length; j++)
            {
                System.out.println(ma[i][j]);
            }
        }
    }
    
}
