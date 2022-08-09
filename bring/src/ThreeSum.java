import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
        public static List<List<Integer>> threeSum(int[] arr) {
            int sum = Integer.MAX_VALUE;
            int i= 0;
            int left,right,target;
            Arrays.sort(arr);
            List<List<Integer>> li = new ArrayList<>();
            if (arr.length<3 ){
                return li;
            }
            for (int j = 0; j < arr.length-2 ; j++) {
                    left =j+1;
                    right = arr.length-1;
                    target = -arr[j];
                while (left<right){
                    if (arr[left]+arr[right]==target){
                        li.add(new ArrayList<Integer>());
                        li.get(i).add(arr[0]);
                        li.get(i).add(arr[left]);
                        li.get(i).add(arr[right]);
                        i++;
                    }
                    if (arr[left]+arr[right]>target){
                        right--;
                    }else {
                        left++;
                    }
                }
            }
            return li;
        }
    }

