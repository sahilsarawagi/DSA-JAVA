package String;
// Make a new String, with no 'a' in that from given.
public class Stream {
    public static void main(String[] args) {
        StringBuilder ans= new StringBuilder("");
        String given ="hsjkajieb";
//        makingNewString(ans,given);
//        System.out.println(makingNewStringWithReturn(given));
//        System.out.println(skippingWholeMobileString("jskldjmobilelsnfdlsn"));
        System.out.println(skippingWholeMobNotMobileString("jskldjmobelsnfdlsn"));

    }
    public static void makingNewString(StringBuilder ans, String given){
        if (given.isEmpty()){
            System.out.println(ans);
            return;
        }
        if (given.charAt(0) == 'a') {
            makingNewString(ans,given.substring(1));
        }else {
            ans.append(given.charAt(0));
             makingNewString(ans,given.substring(1));
        }
    }
    public static String makingNewStringWithReturn( String given){
        if (given.isEmpty()){
            return "";
        }
        if (given.charAt(0) == 'a') {
            return makingNewStringWithReturn(given.substring(1));
        }else {
             return given.charAt(0) + makingNewStringWithReturn(given.substring(1));
        }
    }
    public static String skippingWholeMobileString( String given){
        if (given.isEmpty()){
            return "";
        }
        if (given.startsWith("mobile")) {
            return skippingWholeMobileString(given.substring(6));
        }else {
             return given.charAt(0) + skippingWholeMobileString(given.substring(1));
        }
    }
    public static String skippingWholeMobNotMobileString( String given){
        if (given.isEmpty()){
            return "";
        }
        if (!given.startsWith("mobile")&&given.startsWith("mob")) {
            return skippingWholeMobNotMobileString(given.substring(3));
        }else {
             return given.charAt(0) + skippingWholeMobNotMobileString(given.substring(1));
        }
    }
}
