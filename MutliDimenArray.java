import java.util.Arrays;

public class MultiDimenArray{
    public static void main(String[] args) throws InterruptedException{
        // Multi Dimensional arrays
        int[][] mat = new int[2][3];

        mat[0][1] = 5;

        System.out.println(mat[0][1]);
        System.out.println(mat[0][0]);
        // System.out.println(mat[0][5]);
        int[][] mat2 = {
            {1,2,3},
            {4,5,6}
        };
        System.out.println(mat2[0][1]);

        System.out.println(Arrays.toString(mat));
        System.out.println(Arrays.deeptoString(mat2));

        //jagged arrays
        int[][] mat3 = new int[2][];

        System.out.println(mat3[0]);
        mat3[0] = new int[] {7,8,9,10};
        System.out.println(Arrays.toString(mat3[0]));
        System.out.println(mat3.length); // number of rows
        System.out.println(mat[0].length); // number of columns
    }
}