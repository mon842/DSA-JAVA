//function calling another function and the body of both the functions are totally same

public class main {
    public static void main(String[] args) {
        print1(1);
    }

    static void print1(int n){
        System.out.println("1");
        print2(2);
    }
    static void print2(int n){
        System.out.println("2");
        print3(3);
    }
    static void print3(int n){
        System.out.println("3");
        print4(4);
    }
    static void print4(int n){
        System.out.println("4");
        print5(5);
    }
    // function doesn't remain the same here
    static void print5(int n){
        System.out.println("5");
    }
}

//when the function is not finished executing it will remain in stack
//when the function is finished executing and the

