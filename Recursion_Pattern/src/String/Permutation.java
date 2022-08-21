package String;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutationReturn("","abcd"));
    }
    static void permutation(String ans, String given) {
        if (given.isEmpty()){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i <=ans.length(); i++) {
            String first = ans.substring(0,i);
            String last = ans.substring(i,ans.length());
            permutation(first+given.charAt(0)+last,given.substring(1));
        }
    }
    static ArrayList<String> permutationReturn(String ans, String given) {
        if (given.isEmpty()){
            ArrayList<String> value = new ArrayList<>();
            value.add(ans);
            return value;
        }
        ArrayList<String> allvalue =new ArrayList<>();
        for (int i = 0; i <=ans.length(); i++) {
            String first = ans.substring(0,i);
            String last = ans.substring(i,ans.length());
             allvalue.addAll(permutationReturn(first+given.charAt(0)+last,given.substring(1)));
        }
        return allvalue;
    }
}
