public class sumDigit {
    public static void main(String[] args) {
        int a=rec(134);
        System.out.println(a);
    }
    static int rec(int n){
        if (n==0)
            return 0;
        return (n%10)+rec(n/10);
    }
}
