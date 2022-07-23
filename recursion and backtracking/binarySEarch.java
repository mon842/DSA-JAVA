public class binarySEarch {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,25,66,88};
        int a=search(arr,2,0, arr.length-1);
        System.out.println(a);
    }
    static int search(int[] arr, int target, int s, int e){
        if (s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if (arr[m]==target){
            return m;
        }

        if (target < arr[m]) {
            return search(arr, target, s, m-1);
        }
        return search(arr, target,m+1,e);
    }
}
//how to understand variable
//variables :
//    1) arguments
//    2) return type
//    3) body

//binary search:
//1) comparing the middle value : time complexity will be O(1) constant
//2) dividing the array in 2 parts
// recurence relation : f(n)= O(1)+f(n/2)
//
//
//types of recurence relation:
//1) linear recurence relation: linear search, fibo
//2) divide and conqure recurence relation : binary search



//make sure return a function call of the return type