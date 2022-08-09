import java.util.Arrays;
import java.util.Scanner;

public class Matrix_2D_array {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */

        int [][] arr= new int[3][];    // It is not mandatory to provide the value of column, because it could be of any size

        // 2nd method to define array
        int [][] multiarray={   {1,2,993},
                                {16,24,32},
                                {19,52,34}  };
        int [][] multiarraycoloum={     {1,2},
                                        {16,24,32,4},
                                        {19,52,34,876,68}  };       // we can have different no. of column

        // Input
         int[][] ar= new int[3][3];
        Scanner in= new Scanner(System.in);
        //  ar.length -> this is going to give me length of rows, which is 3 in this case
        for (int row=0; row<ar.length; row++){
                // for each coloum in every row
                for (int col=0; col< ar[row].length;col++){
                        ar[row][col]= in.nextInt();
                }
        }

        for (int row=0; row<ar.length; row++){
                // for each coloum in every row
                for (int col=0; col< ar[row].length;col++){
                    System.out.print(ar[row][col] + " ");
                }
            System.out.println();
        }
        System.out.println();
        // OR

        for (int row=0; row<ar.length; row++){
            System.out.println(Arrays.toString(ar[row]));
        }
        System.out.println();
        // OR
        for (int[] a: ar){      // THe datatype of every element in array is itself array, that's why we used int[] (which is datatype of a)
            System.out.println(Arrays.toString(a));   // Using enhanced for loop
        }


    }
}
