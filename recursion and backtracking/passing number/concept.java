public class concept {
    public static void main(String[] args) {
        r(3);
    }
    static void r(int n){
        if (n==0)
            return;
        System.out.println(n);
//        r(n--);// will pass the value of n first and then substract it will 1
        r(--n);// will substract it will 1  first and then  pass the value of n
    }
}
