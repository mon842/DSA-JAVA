public class bubble {
    public static void main(String[] args) {
        int a[]={5,7,1,2};
        swap(a,a.length-1,0);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    static void swap(int a[],int i,int j){
        if (i==0)
            return;
        if (i>j){
            if (a[j]>a[j+1]){
                int t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
            swap(a,i,j+1);
        }
        else {
            swap(a,i-1,0);
        }
    }
}
