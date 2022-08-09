import java.util.Arrays;

public class Q_reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(arr));
        reverse(arr,0,9);
        System.out.println(Arrays.toString(arr));
    }

     static void reverse(int[] arr, int start , int end) {
//         int ends= end/2;
//        if (end%2!=0){
//             ends = ends+1;
//        }
         for (int i = start; end>start; i++) {
             int temp = arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;

         }
    }
}
