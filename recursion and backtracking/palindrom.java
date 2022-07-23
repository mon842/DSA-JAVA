public class palindrom {
    static int sum;
    static void rec(int n){
        if (n==0)
            return;
        int rem=n%10;
        sum=sum*10+rem;
        rec(n/10);
    }
    public static void main(String[] args) {
        rec(121);
        if (121==sum)
            System.out.println("palindrom");
        else
            System.out.println("not a palin");
    }
}
