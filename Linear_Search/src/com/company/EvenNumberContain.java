package com.company;

public class EvenNumberContain {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        int ans= EvenNumberContains(nums);
        System.out.println(ans);
    }

    static int EvenNumberContains(int[] nums) {
        int count=0;
        int even=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; nums[i] >0 ; j++) {
                nums[i]=nums[i]/10;
                count++;
            }
            if (count%2==0){
                even++;
            }
            count=0;
        }
        return even;
    }
}
