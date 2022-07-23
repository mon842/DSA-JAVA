public class skip2 {
    public static void main(String[] args) {
        String str="fhappledig";
        String a=skipAppnotApple(str);
        System.out.println(a);
    }
//    static String fun(String s){
//        if (s.isEmpty()) {
//            return "";
//        }
//        char ch=s.charAt(0);
//        if (s.startsWith("app")){
//            return fun(s.substring(3));
//        }
//        else {
//            return ch+fun(s.substring(1));
//        }
//    }
    static String skipAppnotApple(String s){
        if (s.isEmpty()) {
            return "";
        }
        char ch=s.charAt(0);
        if (s.startsWith("app") && !s.startsWith("apple")){
            return skipAppnotApple(s.substring(3));
        }
        else {
            return ch+skipAppnotApple(s.substring(1));
        }
    }
}
