import java.util.ArrayList;
import java.util.*;

public class arrayList1 {
    public static void main(String[] args) {
        // this list will never be full
        ArrayList<Integer> list=new ArrayList<Integer>(10);

        // initial capacity doesn't mean that only items can be added .. we can add more than 10 items
        list.add(12);
        list.add(4);
        list.add(3);
        list.add(1);
        list.add(2);
//        adding items in list .... and addAll(source) will add all the items from other list
        ArrayList<Integer> sec_list = new ArrayList<Integer>();
        sec_list = (ArrayList<Integer>)list.clone();// copies all elements from list to sec_list
        System.out.println(sec_list.equals(list)); // checks if both the lists are same or not
        // Displaying the other linked list
        System.out.println("Second ArrayList is: "
                + sec_list);
        System.out.println(list.contains(2));// checks whether 2 is there in list or not
        list.clear();// empties all the element from list
        sec_list.forEach((n) -> System.out.println(n)); // like a for loop it prints all the elements of list
        System.out.println(list);
        System.out.println(sec_list.indexOf(1));// prints the index of '1'
        System.out.println(sec_list.toString());// converts to string and then prints it
        System.out.println(sec_list.get(0));// prints the element at that index
        Collections.sort(sec_list);
        System.out.println(sec_list);
        sec_list.set(1,32);
        sec_list.remove(0);
        System.out.println(sec_list);

//        or 2nd method

        List<String> original
                = Arrays.asList(
                "GeeksForGeeks",
                "A Computer Science",
                "Portal");

        List<String> cloned_list
                = new ArrayList<String>();

        // Cloning a list
        cloned_list.addAll(original);

        System.out.println(cloned_list);


    }
}
