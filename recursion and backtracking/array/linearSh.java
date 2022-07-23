import java.util.ArrayList;

public class linearSh {
    static int ans=0;
    public static void main(String[] args) {
        int a[]={1,2,5,6,6,8,10};
        r(a,0,8);
        int asw=r2(a,0,8);
        System.out.println(ans+asw);
        findall(a,0,6);
        System.out.println(list);

        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> lt2=findall2(a,0,6, list2);
//        ArrayList<Integer> list2=findall2(a,0,6, new ArrayList<>()); // can also write this
        System.out.println(lt2+" "+list2);// list2 that is being created is modified and stored in lt2 therefore both are same
    }

    static void r(int a[],int i,int t){
        if (i== a.length-1)
            return;
        if (a[i]==t)
            ans=i;
        r(a, i+1, t);
    }
    static int r2(int a[],int i, int t){
        if (i==-1)
            return -1;
        if (a[i]==t)
            return i;
        else
            return r2(a, i+1, t);
    }

    static ArrayList<Integer> list=new ArrayList<>();
    static void findall(int a[],int i, int t){
        if (i==a.length)
            return;
        if (a[i]==t)
            list.add(i);

        findall(a, i+1, t);
    }
    static ArrayList<Integer> findall2(int a[],int i, int t,ArrayList<Integer> list){
        if (i==a.length)
            return list;
        if (a[i]==t)
            list.add(i);

        return findall2(a, i+1, t,list);
    }
}
