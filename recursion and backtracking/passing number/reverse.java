public class reverse {
//    static int sum=0;
//    static void r1(int n) {
//        if (n == 0) {
//            return;
//        }
//        int rev = n % 10;
//        sum = sum * 10 + rev;
//        r(n / 10);
//    }

    public static void main(String[] args) {
        int a=r2(12345);

//        System.out.println(sum);
        System.out.print(a);
    }
    static int r2(int n){
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits){
        if (n%10 ==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+ helper(n/10,digits-1);
    }

//    static int r3(int n,int l){
//        if (n==0)
//            return n;
//        return (n%10)*(int)Math.pow(10,l)+r(n/10,--l);
//    }


}
