import java.util.ArrayList;

public class target_num {
    public static void main(String[] args) {
        tn("",4);
        System.out.println(tn2("",4));

    }
    static void tn(String p,int t){
        if (t==0){
            System.out.println(p);
            return;
        }
        for (int i=1;i<=t;i++){
            tn(p+i,t-i);
        }
    }

    static ArrayList<String > tn2(String p, int t){
        if (t==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        for (int i=1;i<=t;i++){
            list.addAll(tn2(p+i,t-i));
        }
        return list;
    }
}
