import java.util.Arrays;

public class twoD {
    public static void main(String[] args) {
        int a[][]=new int[2][];
        int b[][]={
                {1,2},
                {4,5,6},
                {7,8,9,10}
        };

        // prints every element wise
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {// taking the length of the every column as length of every column is diff
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        // it prints column wise
        for (int i = 0; i < b.length; i++) {
            System.out.println(Arrays.toString(b[i]));
        }
        for (int[] i: b) {
            System.out.println(Arrays.toString(i));
        }
    }
}
