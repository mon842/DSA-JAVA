import java.util.Arrays;

public class reference {
    public static void main(String[] args) {
        int a[]={1,2,4,5,6,7};
        System.out.println(Arrays.toString(a));
        change(a);
        System.out.println(Arrays.toString(a));
    }
    static void change(int arr[]){
        arr[0]=0;
    }
}
/*
in java when array is passed it automatically passes the reference of the array works like a pointer
the changes are being done in the real array... through its address
 */