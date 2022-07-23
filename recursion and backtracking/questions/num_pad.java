import java.util.ArrayList;

public class num_pad {
    public static void main(String[] args) {
        pad("","18");
        ArrayList<String> list2 =pad2("","18");
        System.out.println(list2);
        System.out.println(padc("","18"));
    }
    static void pad(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit= up.charAt(0) - '0'; // will convert '2' to 2 .... character to integer
        for (int i=(digit-1)*3; i<(digit*3);i++){
            char ch=(char)(i+'a');
            pad(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> pad2(String p, String up){
        if (up.isEmpty()){
            ArrayList<String> list =new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list =new ArrayList<>();
        int digit= up.charAt(0) - '0'; // will convert '2' to 2 .... character to integer
        for (int i=(digit-1)*3; i<(digit*3);i++){
            char ch=(char)(i+'a');
            list.addAll(pad2(p+ch,up.substring(1)));
        }
        return list;
    }
    static int padc(String p,String up){
        if (up.isEmpty()){
            return 1;
        }
        int c=0;
        int digit= up.charAt(0) - '0'; // will convert '2' to 2 .... character to integer
        for (int i=(digit-1)*3; i<(digit*3);i++){
            char ch=(char)(i+'a');
            c=c+padc(p+ch,up.substring(1));
        }
        return c;
    }
}
