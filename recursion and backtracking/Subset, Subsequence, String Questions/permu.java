public class permu {
    public static void main(String[] args) {
        p1("","abc");
        int pc=count("","abc");
        System.out.println(pc);
    }
    static void p1(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for (int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            p1(f+ch+s,up.substring(1));
        }
    }
    static int count(String p,String up){
        if (up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int c=0;
        for (int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            c= c+ count(f+ch+s,up.substring(1));
        }
        return c;
    }
}
