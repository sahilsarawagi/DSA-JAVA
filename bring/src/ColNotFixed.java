public class ColNotFixed {
    public static void main(String[] args) {
        int[][] multiarraycoloum = {{1, 2},
                {16, 24, 32, 4},
                {19, 52, 34, 876, 68}};       // we can have different no. of column


        for (int row = 0; row < multiarraycoloum.length; row++) {
            // for each coloum in every row
            for (int col = 0; col < multiarraycoloum[row].length; col++) {
                System.out.print(multiarraycoloum[row][col] + " ");
            }
            System.out.println();
        }
    };
}
