import java.util.*;
public class quicksort {
    public static void main(String[] args) {
        int[] arr = { 20, 1, 2,  14, 15, 16, 17, 9, 10, 21, 3, 4, 5,11, 12, 13, 18, 19, 6, 7, 8};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void sort(int num[], int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int s = lo;
        int e = hi;
        int mid = s + (e - s) / 2;
        int pivot = num[mid];
        if (s <= e) {
            while (num[s] < pivot)
                s++;
            while (num[e] > pivot)
                e--;
            if (s <= e) {
                int temp = num[e];
                num[e] = num[s];
                num[s] = temp;
                s++;
                e--;
            }
        }
        sort(num, lo, e);
        sort(num, s, hi);
    }
}