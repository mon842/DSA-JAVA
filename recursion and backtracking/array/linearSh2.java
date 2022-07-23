public class linearSh2 {
    public static void main(String[] args) {
        int a[]={1,2,5,5,6,8,10};
        boolean ans=r(a,0,8);
        System.out.println(ans);
    }
    static boolean r(int a[],int i,int t){
        if (i== a.length-1)
            return false;
        return a[i]==t || r(a,i+1,t);
    }

}
