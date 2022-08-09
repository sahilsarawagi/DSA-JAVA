import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(10);
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        List.add(7);
        List.add(8);
        List.add(9);
        List.add(10);
        List.add(11);
        System.out.println(List);
        List.set(0,55);
        List.remove(4);
        System.out.println(List);
        System.out.println(List.contains(5));


        // using loops
        ArrayList<Integer> li = new ArrayList<>(2);
        Scanner in= new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
                li.add(in.nextInt());

        }

        for (int i = 0; i < 5; i++) {
            System.out.println(li.get(i));   // use get to get the value by index
        }

    }
}
