public class facRec {
    public static void main(String[] args) {
        int a=rec(3);
        System.out.println(a);
    }
    static int rec(int n){
        if (n==1)
            return n;
        return rec(n-1)*n;
    }
}
