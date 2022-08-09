import java.util.ArrayList;
import java.util.Scanner;

public class MultiD_ArrayList {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        ArrayList<ArrayList<Integer>> li =new ArrayList<>();
        // Intilization
        for (int i = 0; i < 3; i++) {
            li.add(new ArrayList<Integer>());
        }
        // Add element
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                li.get(i).add(in.nextInt());
            }
        }
        // Printing
        System.out.println(li);

    }
}
