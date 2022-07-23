public class fibonacci {
    public static void main(String[] args) {
        int a=fibo(4);
        System.out.println(a);
    }
    static int fibo(int n){
        //base class
        if (n == 0 || n==1) {
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}


//how to understand and approach a problem
//1) identify if you can break the problem into smaller portions
//2) write the recursion relation
//3) draw the recursive tree
//4) about the tree
//    a) see the flow of function, how they are getting into stack
//    b) identify and focus on right tree calls and left tree calls
//    c) draw on paper
//    d) use debug pointer
//5) see how the values and what type of values are returned each step
//see where the two function will come out off. at the end you will come out of the main function
