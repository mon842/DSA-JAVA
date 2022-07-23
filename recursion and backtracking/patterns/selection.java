public class selection {
    public static void main(String[] args) {
        int a[]={5,3,78,5};
        swap(a,a.length,0,0);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    static void swap(int a[],int i,int j,int m) {
        if (i==0)
            return;
        if (j<i){
            if (a[j]>a[m])
                swap(a,i,j+1,j);
            else
                swap(a,i,j+1,m);
        }
        else{
            int t=a[i-1];
            a[i-1]=a[m];
            a[m]=t;
            swap(a,i-1,0,0);
        }
    }
}
