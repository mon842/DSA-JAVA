import java.util.ArrayList;

public class relst {
    public static void main(String[] args) {
        int a[]={1,5,5,9,7,10};
        ArrayList<Integer> list = fndin(a,0,5);
        System.out.println(list);
    }
    static ArrayList<Integer> fndin(int a[],int i,int t){
        ArrayList<Integer> list= new ArrayList<>();
        if (i==a.length)
            return list;

        if (a[i]==t){
            list.add(i);// will contain answer of function call
        }
        ArrayList<Integer> ansFromBelowFunc= fndin(a,i+1,t);
        list.addAll(ansFromBelowFunc);
        return list;
    }
}

// here Array list won't be in the argument/ parameters but the return type will be Arraylist
// list variable will be in the body of the function ,
// list will be created again and again and to avoid return of empty list
//*** whenever function gets a value it adds it to list variable and the list keeps getting added

