package String;

import java.util.ArrayList;

public class MakingSubseq {
    public static void main(String[] args) {
        System.out.println(subseqWithReturn("","abcd"));
    }
    public static void subseq(String ans, String given){
        if (given.isEmpty()){
            System.out.println(ans);
            return;
        }
            subseq(ans+given.charAt(0),given.substring(1));
            subseq(ans,given.substring(1));

    }
    public static ArrayList<String> subseqWithReturn(String ans, String given){
        if (given.isEmpty()){
            ArrayList<String> li = new ArrayList<>();
            li.add(ans);
            return li;
        }
            ArrayList<String> left = subseqWithReturn(ans+given.charAt(0),given.substring(1));
            ArrayList<String> right = subseqWithReturn(ans,given.substring(1));

            left.addAll(right);
            return left;
    }
    public static ArrayList<String> subseqWithReturnSecondApproach(String ans, String given,ArrayList<String> li){
        if (given.isEmpty()){
            li.add(ans);
            return li;
        }
             subseqWithReturnSecondApproach(ans+given.charAt(0),given.substring(1),li);
             subseqWithReturnSecondApproach(ans,given.substring(1),li);

            return li;
    }
    public static void subseqAscii(String ans, String given){
        if (given.isEmpty()){
            System.out.println(ans);
            return;
        }
        subseq((ans+(int)(given.charAt(0))),given.substring(1));
        subseq(ans,given.substring(1));

    }
}
