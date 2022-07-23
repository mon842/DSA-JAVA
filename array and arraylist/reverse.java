import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int a[]={1,5,9,7,2,8,4,3};
        rev(a);
        System.out.println(Arrays.toString(a));
    }
    static void rev(int[] a){
        int y=a.length-1;
        for (int i = 0; i < a.length/2; i++) {
            a[y]=a[i]+a[y];
            a[i]=a[y]-a[i];
            a[y]=a[y]-a[i];
            y--;
        }
    }
}
