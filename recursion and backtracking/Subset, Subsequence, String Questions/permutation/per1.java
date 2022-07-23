public class per1 {
    public static void main(String[] args) {
        permu(" ","abc");
    }
    static void permu(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch= up.charAt(0);
        for (int i=0;i<=p.length();i++){

            String f1=p.substring(0,i);
            String f2=p.substring(i,p.length());
            permu(f1+ch+f2,up.substring(1));
        }
    }
}
