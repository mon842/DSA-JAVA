public class pattern1 {
    public static void main(String[] args) {
        p(5,0);
        p2(5,0);
    }
    static void p(int n,int i){
        if (n==0)
            return;
        if (i!=n){
            System.out.print("*");
            p(n,++i);
        }
        else {
            System.out.println("");
            p(n-1,0);
        }
    }

    static void p2(int n,int i){
        if (n==0)
            return;
        if (i!=n){
            p2(n,++i);
            System.out.print("*");
        }
        else {
            p2(n-1,0);
            System.out.println("");

        }
    }
}
