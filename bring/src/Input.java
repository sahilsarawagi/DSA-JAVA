import java.util.Arrays;
import java.util.Scanner;

public class Input  {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=6;
        arr[1]=67;
        arr[2]=65;
        arr[3]=66;
        arr[4]=64;
        System.out.println(arr[2]);

        for (int i=0; i<arr.length; i++){
            arr[i]= in.nextInt();
        }
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        for (int j : arr) {             // this is enhanced for loop to print array
            System.out.print(j + " ");  // Here j represents element of array
        }

        // Array of object
        String[] str = new String[5];
        for (int i=0; i<str.length; i++){
            str[i]= in.next();
        }
        for (int i=0; i<str.length; i++){
            System.out.print(str[i]+ " ");
        }
        // modify str
        str[2]="Baba";
        System.out.println();
        System.out.println(Arrays.toString(str));

    }
}
