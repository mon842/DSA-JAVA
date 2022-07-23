import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int a[]={1,5,9,7,8,4,3};
        swapX(a,1,4);
        System.out.println(Arrays.toString(a));
    }
    static void swapX(int[] a, int x,int y){
        a[y]=a[x]+a[y];
        a[x]=a[y]-a[x];
        a[y]=a[y]-a[x];
    }
}
