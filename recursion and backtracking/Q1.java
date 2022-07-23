public class Q1 {
    public static void main(String[] args) {
//        rec(5);
//        recrev(5);
        recboth(5);
    }

//    static void rec(int n){
//        if (n==0) {
//
//            return;
//        }
//        System.out.println(n);
//        rec(n-1);
//    }
//    static void recrev(int n){
//        if (n==0) {
//
//            return;
//        }
//        recrev(n-1);
//        System.out.println(n);
//    }
    static void recboth(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        recboth(n-1);
        System.out.println(n);
    }
}
