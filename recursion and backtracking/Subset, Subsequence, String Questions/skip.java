public class skip {
    public static void main(String[] args) {
        String str="baccad";
        System.out.println(fun2("",str));
    }
    static void fun(String p,String s){
        if (s.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=s.charAt(0);
        if (ch=='f'){
            fun(p,s.substring(1));
        }
        else {
            fun(p+ch,s.substring(1));
        }
    }
    static String fun2(String p,String s){
        if (s.isEmpty()) {
            return p;
        }
        char ch=s.charAt(0);
        if (ch=='a'){
            return fun2(p,s.substring(1));
        }
        else {
            return ch + fun2(p,s.substring(1));
        }
    }
}
