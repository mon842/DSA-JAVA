import java.util.*;

public class mergesortinplace{
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
        msip(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }

    static void msip(int a[],int s,int e) {
        if (e-s == 1) {
            return;
        }
        int mid = (s+e)/ 2;

        msip(a, s, mid); // will store a copy of sub array from 0 to mid in left from a
        msip(a, mid, e);

        merge(a, s, mid, e);
    }

    private static void merge(int a[],int s,int m,int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0; // k is the pointer
        while (i < m && j < e) {
            if (a[i] < a[j]) {
                mix[k] = a[i];
                i++;
            } else {
                mix[k] = a[j];
                j++;
            }
            k++;
        }
        // after the smaller array finishes merging then remaining element of the larger
        // array will be place at the last
        // copy the remaining elements
        while (i < m) {
            mix[k] = a[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = a[j];
            j++;
            k++;
        }
        for (int l=0;l<mix.length;l++){
            a[s+l]=mix[l];
        }

    }

}