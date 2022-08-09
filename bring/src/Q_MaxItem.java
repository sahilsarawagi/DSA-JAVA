public class Q_MaxItem {
    public static void main(String[] args) {
        int[] arr = { 54 ,69,47,4,6,3,8,5,5,6,48,59,25};
        System.out.println(maximum(arr));
    }

     static int maximum(int[] arr) {
        int max= arr[0]; ;
         for (int i = 0; i < arr.length ; i++) {
             if (arr[i]>max){
                 max= arr[i];
             }

         }

         return max;
    }
}
