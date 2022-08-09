import java.util.Arrays;

public class Passing_in_function {
    public static void main(String[] args) {
        int[] arr= {1,5,9,7,3,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void change(int[] ar){
        ar[3]= 55;
    }
}
