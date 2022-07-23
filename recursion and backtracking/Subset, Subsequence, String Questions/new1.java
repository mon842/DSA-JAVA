import java.util.*;
public class new1 {

    public static void main(String[] args) {
        int a[]={1,4,3};
        List<List<Integer>> ans=add(a);
        for (List<Integer> list : ans){
            System.out.println(list);
        }


    }
    static List<List<Integer>> add(int a[]) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num:a){
            int n= outer.size();
            for (int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
