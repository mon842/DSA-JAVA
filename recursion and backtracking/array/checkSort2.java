public class checkSort2 {
    public static void main(String[] args) {
        int a[]={1,2,5,5,6,8,10};
        boolean ans=r(a,0);
        System.out.println(ans);
    }
    static boolean r(int a[],int i){
        if (i== a.length-1)
            return true;
        return a[i]<=a[i+1] && r(a,i+1);
    }
}
