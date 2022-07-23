import java.util.*;

public class mergesort {
    public static void main(String[] args) {

        int a[] = {
                3,
                4,
                2,
                1,
                8,
                5,
                9
        };
        int[] ans = ms(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] ms(int a[]) {
        if (a.length == 1) {
            return a;
        }
        int mid = a.length / 2;

        int left[] = ms(Arrays.copyOfRange(a, 0, mid)); // will store a copy of sub array from 0 to mid in left from a
        int right[] = ms(Arrays.copyOfRange(a, mid, a.length));

        return merge(left, right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0; // k is the pointer
        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // after the smaller array finishes merging then remaining element of the larger
        // array will be place at the last
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

}