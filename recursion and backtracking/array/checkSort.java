public class checkSort {
    static int flag=0;
    static void check(int[] arr,int i){
        if (i== arr.length-1)
            return;
        if (arr[i]>arr[i+1]){
            flag=1;
        }
        check(arr,i+1);
    }
    public static void main(String[] args) {
        int a[]={1,2,5,6,6,8,10};
        check(a,0);
        if (flag==0)
            System.out.println("sorted");
        else
            System.out.println("not sorted");
    }
}
