package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetByIteration {
    public static void main(String[] args) {
        int[] arr = {1,2,2};
        List<List<Integer>> ans = subsetDuplicate(arr);
        System.out.println(ans);

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        System.out.println(outer);
        outer.add(new ArrayList<>());
        System.out.println(outer);
        for (int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal =  new ArrayList<>(outer.get(i));
                System.out.println(internal);
                internal.add(num);
                System.out.println(internal);
                outer.add(internal);
                System.out.println(outer);
            }
        }
        return outer;
    }


    // Making subset when the array has duplicate elements
    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);   // sorting the element so that duplicate element, will be adjacent
        List<List<Integer>> outer = new ArrayList<>();
        System.out.println(outer);
        outer.add(new ArrayList<>());
        System.out.println(outer);
        int start =0;
        int end =0;
        for (int i = 0; i < arr.length ; i++) {
            start = 0 ;
            if (i>0 && arr[i] == arr[i-1]){
                start = end +  1 ;
            }
            end = outer.size()-1;
            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> internal =  new ArrayList<>(outer.get(j));
                System.out.println(internal);
                internal.add(arr[i]);
                System.out.println(internal);
                outer.add(internal);
                System.out.println(outer);
            }
        }
        return outer;
    }
}
