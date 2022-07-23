import java.util.ArrayList;

public class superset {
    public static void main(String[] args) {
        String s="dsa";
//        subSeq(s,"");
//        subSeqASCII(s,"");
        System.out.println(subSeqlstascci(s,""));
    }
    static void subSeq(String up, String p){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSeq(up.substring(1),p+ch);
        subSeq(up.substring(1),p);
    }
    static ArrayList<String> subSeqlst(String up, String p){
        if (up.isEmpty()) {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left= subSeqlst(up.substring(1),p+ch);
        ArrayList<String> right=subSeqlst(up.substring(1),p);
        left.addAll(right);
        return left;

    }
    static void subSeqASCII(String up, String p){
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subSeqASCII(up.substring(1),p+ch);
        subSeqASCII(up.substring(1),p);
        subSeqASCII(up.substring(1),p+(ch+0));
    }
    static ArrayList<String> subSeqlstascci(String up, String p){
        if (up.isEmpty()) {
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> first= subSeqlstascci(up.substring(1),p+ch);
        ArrayList<String> second=subSeqlstascci(up.substring(1),p);
        ArrayList<String> third=subSeqlstascci(up.substring(1),p+(ch+0));
        first.addAll(second);
        first.addAll(third);
        return first;

    }
}
