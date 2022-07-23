import java.util.Arrays;

public class output {
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7};
        System.out.println(Arrays.toString(a));

        for (int i :a) {
            System.out.print(i+" ");
        }
        // strings are immutable in java
//        arrays are mutable in java
    }
}
