import java.util.ArrayList;

public class maze {
    public static void main(String[] args) {
//        System.out.println(m(3,3));
        m2("",3,3);
//        System.out.println(m3("",3,3));
    }
    static int m(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int cr=m(r-1,c);
        int cc=m(r,c-1);
        return cc+cr;
    }
    static void m2(String p, int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if ( c!=1){
            m2(p+'H',r,c-1);
        }
        if ( r!=1){
            m2(p+'V',r-1,c);
        }
        if ( c!=1 && r!=1){
            m2(p+'V',r-1,c-1);
        }
    }

    static ArrayList<String> m3(String p, int r, int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if ( c!=1){
            list.addAll(m3(p+'R',r,c-1));
        }
        if ( r!=1){
            list.addAll(m3(p+'D',r-1,c));
        }
        return list;
    }
}
