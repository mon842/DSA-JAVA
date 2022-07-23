public class NoOFZero {
    static int c=0;
    static  void rec(int n){
        if(n==0)
            return;
        if (n%10==0)
            c++;

        rec(n/10);
    }
    public static void main(String[] args) {
        rec(1020);
        System.out.println(c);
    }
}
