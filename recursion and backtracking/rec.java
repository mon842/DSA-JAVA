public class rec {
    public static void main(String[] args) {
        print(1);
    }
    static int print(int n){
        if (n==5){             //base condition where the recurssion stops making call
            System.out.println(n);
            return n;
        }
        System.out.println(n);
        // this is called tail recursion
        // this is the last step of the recursive function
        return print(n+1);
    }
}

// calling the same function but every time it takes seperate memory for it
//if there is no base condition then it call itself again and again, and it will keep taking memory and at
//one time memory of computer will exceed and program will crash- stackoverflow error


//why recurssion is used ?
//it helps us to solve complecated problems in a simpler way
//i can solve recursion soln into iteration
// space complexity is not constant because of recursive calls
//helps us in breaking down bigger problems into smaller problems

//recursion tree
//
//        main()
//        print1(1)
//        print2(2)
//        print3(3)
//        print4(4)
//        print5(5)