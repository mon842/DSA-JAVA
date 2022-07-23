public class NoSteps {
    static int c=0;
    static void rec(int n){
        if (n==0)
            return;
        if (n%2==0) {
            rec(n / 2);
            c++;
        }
        else {
            rec(n - 1);
            c++;
        }
    }
    public static void main(String[] args) {
        rec(7);
        System.out.println(c);
    }
}
