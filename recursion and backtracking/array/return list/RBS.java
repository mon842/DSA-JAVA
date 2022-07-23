public class RBS {
    public static void main(String[] args) {
        int a[]={1,8,5,9,7,2};
        int ans=rbs(a,7,0,a.length);
        System.out.println(ans);
    }
    static int rbs(int a[],int t,int s,int e){
        if (s>e)
            return -1;
        int m=s+(e-s)/2;
        if (a[m]==t)
            return m;

        if (a[s]<a[m]){
            if (a[s]<=t && t<=a[m]){
                return rbs(a,t,s,m-1);
            }
            else {
                return rbs(a,t,m+1,e);
            }
        }
        if (a[e]>=t && t>=a[m]){
            return rbs(a,t,m+1,e);
        }
        return rbs(a,t,s,m-1);
    }
}
